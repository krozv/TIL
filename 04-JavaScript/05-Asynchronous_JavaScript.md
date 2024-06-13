- [비동기](#비동기)
  - [Synchronous(동기)](#synchronous동기)
  - [Asychronous(비동기)](#asychronous비동기)
    - [Asychronous 특징](#asychronous-특징)
- [JavaScript와 비동기](#javascript와-비동기)
    - [브라우저 환경에서의 JavaScript 비동기 처리 관련 요소](#브라우저-환경에서의-javascript-비동기-처리-관련-요소)
    - [브라우저 환경에서의 JavaScript 비동기 처리 동작 방식](#브라우저-환경에서의-javascript-비동기-처리-동작-방식)
    - [정리](#정리)
- [Ajax](#ajax)
  - [Axios](#axios)
    - [Ajax 정의](#ajax-정의)
    - [Ajax 목적](#ajax-목적)
  - [XMLHttpRequest(XHR) 객체](#xmlhttprequestxhr-객체)
    - [XMLHttpRequest 특징](#xmlhttprequest-특징)
    - [기존 기술과의 차이](#기존-기술과의-차이)
    - [이벤트 핸들러는 비동기 프로그래밍의 한 형태](#이벤트-핸들러는-비동기-프로그래밍의-한-형태)
- [Callback과 Promise](#callback과-promise)
  - [비동기 콜백](#비동기-콜백)
  - [프로미스](#프로미스)

# 비동기
## Synchronous(동기)
- 프로그램의 실행 흐름이 순차적으로 진행
- 하나의 작업이 완료된 후에 다음 작업이 실행되는 방식
- 예시
  - 메인 작업이 모두 수행되어야 마지막 작업이 수행됨
  - 함수의 작업이 완료될 때까지 기다렸다가 값을 반환해야 계속 진행 가능
## Asychronous(비동기)
- 프로그램의 실행 흐름이 순차적이지 않으며, 작업이 완료되기를 기다리지 않고 다음 작업이 실행되는 방식
- 작업의 완료 여부를 신경 쓰지 않고 동시에 다른 작업들을 수행할 수 있음
- 예시
  - 브라우저는 웹페이지를 먼저 처리되는 요소부터 그려 나가며 처리가 오래 걸리는 것들은 별도로 처리가 완료 되는대로 병렬적으로 진행
```js
const slowRequest = function (callBack) {
    console.log('1. 오래 걸리는 작업 시작...')
    setTimeout(function () {
        callBack()
    }, 3000)
}

const myCallBack = function () {
    console.log('2. 콜백함수 실행됨')
}

slowRequest(myCallBack)

console.log('3. 다른 작업 실행')

// 1. 오래 걸리는 작업 시작...
// 3. 다른 작업 실행
// 2. 콜백함수 실행됨
```
### Asychronous 특징
- 병렬적 수행
- 당장 처리를 완료할 수 없고 시간이 필요한 작업들은 별도로 요청을 보낸 뒤 응답이 빨리 오는 작업부터 처리
  
# JavaScript와 비동기
- Single Thread 언어, JavaScript
  - Thread란?
    - 작업을 처리할 때 실제로 작업을 수행하는 주체로, multi-thread라면 업무를 수행할 수 있는 주체가 여러 개라는 의미
- JavaScript는 한번에 여러 일을 수행할 수 없다.
  - JavaScript는 한번에 하나의 일만 수행할 수 있는 Single Thread 언어로 동시에 여러 작업을 처리할 수 없음
  - 즉, JavaScript는 하나의 작업을 요청한 순서대로 처리할 수 밖에 없음
- JavaScript Runtime
  - JavaScript가 동작할 수 있는 환경(Runtime)
  - JavaScript 자체는 Single Thread이므로 비동기 처리를 할 수 있도록 도와주는 환경이 필요
  - JavaScript에서 비동기와 관련된 작업은 브라우저 또는 Node와 같은 환경에서 처리
### 브라우저 환경에서의 JavaScript 비동기 처리 관련 요소
1. JavaScript Engine의 Call Stack
    - 요청이 들어올 때 마다 순차적으로 처리하는 Stack(LIFO)
    - 기본적인 JavaScript의 Single Thread 작업 처리
2. Web API
    - JavaScript 엔진이 아닌 브라우저에서 제공하는 runtime 환경
    - 시간이 소요되는 작업을 처리 (setTimeout, DOM Event, 비동기 요청 등)
3. Task Queue
    - 비동기 처리된 Callback 함수가 대기하는 Queue(FIFO)
4. Event Loop
    - 태스크(작업)가 들어오길 기다렸다가 태스트가 들어오면 이를 처리하고, 처리할 태스크가 없는 경우엔 잠드는, 끊임없는 돌아가는 자바스크립트 내 루프
    - Call Stack과 Task Queue를 지속적으로 모니터링
    - Call Stack이 비어 있는지 확인 후 비어 있다면 Task Queue에서 대기 중인 오래된 작업을 Call Stack으로 Push

### 브라우저 환경에서의 JavaScript 비동기 처리 동작 방식
1. 모든 작업은 Call Stack(LIFO)으로 들어간 후 처리된다.
2. 오래 걸리는 작업이 Call Stack으로 들어오면 Web API로 보내 별도로 처리하도록 한다.
3. Web API에서 처리가 끝난 작업들은 곧바로 Call Stack으로 들어가지 못하고 Task Queue(FIFO)에 순서대로 들어간다.
4. Event Loop가 Call Stack이 비어 있는 것을 계속 체크하고 Call Stack이 빈다면 Task Queue에서 가장 오래된(가장 먼저 처리되어 들어온) 작업을 Call Stack으로 보낸다.

### 정리
- JavaScript는 한 번에 하나의 작업을 수행하는 Single Thread 언어로 동기적 처리를 진행
- 하지만 브라우저 환경에서는 Web API에서 처리된 작업이 지속적으로 Task Queue를 거쳐 Event Loop에 의해 Call Stack에 들어와 순차적으로 실행됨으로써 비동기 작업이 가능한 환경이 됨
  
# Ajax
## Axios
- Asynchronous JavaScript and XML
- XMLHttpRequest 기술을 사용해 복잡하고 동적인 웹 페이지를 구성하는 프로그래밍 방식
### Ajax 정의
- 비동기적인 웹 애플리케이션 개발을 위한 기술
- 브라우저와 서버 간의 데이터를 비동기적으로 교환하는 기술
- Ajax를 사용하면 페이지 전체를 새로고침 하지 않고도 동적으로 데이터를 불러와 화면을 갱신할 수 있음
- Ajax의 x는 XML이라는 데이터 타입을 의미하긴 하지만, 요즘은 더 가벼운 용량과 JavaScript의 일부라는 장점 때문에 JSON을 많이 사용
### Ajax 목적
- 전체 페이지가 다시 로드되지 않고 HTML 페이지 일부 DOM만 업데이트
- 웹 페이지 일부가 다시 로드되는 동안에도 코드가 계속 실행되어, 비동기식으로 작업 할 수 있음
## XMLHttpRequest(XHR) 객체
- 서버와 상호작용할 때 사용하는 객체
- 페이지의 새로고침 없이도 데이터를 가져올 수 있음
### XMLHttpRequest 특징
- JavaScript를 사용하여 서버에 HTTP 요청을 할 수 있는 객체
- 브라우저와 서버 간의 네트워크 요청을 전송할 수 있음
- 사용자의 작업을 방해하지 않고 페이지의 일부를 업데이트할 수 있음
- 이름에 XML이라는 데이터 타입이 들어가긴 하지만 XML 뿐만 아니라 모든 종류의 데이터를 가져올 수 있음  
### 기존 기술과의 차이
**기존 방식**
1. 클라이언트(브라우저)에서 form을 채우고 이를 서버로 제출(submit)
2. 서버는 요청 내용에 따라 데이터 처리 후 새로운 웹페이지를 작성하여 응답으로 전달
    - 결과적으로 모든 요청에 따라 새로운 페이지를 응답 받기 때문에 계속해서 새로고침이 발생
    - 기존 페이지와 유사한 내용을 가지고 있는 경우 중복된 코드를 다시 전송받음으로써 대역폭을 낭비하게 되는 경우가 많음
**Ajax**
1. XHR 객체 생성 및 요청
2. 서버는 새로운 페이지를 응답으로 만들지 않고 필요한 부분에 대한 데이터만 처리 후 응답(JSON 및 기타 데이터)
    - 새로운 페이지를 받는 것이 아닌 필요한 부분의 데이터만 받아 기존 페이지의 일부를 수정(새로고침 X)
    - 서버에서 모두 처리되던 데이터 처리의 일부분이 이제는 클라이언트 쪽에서 처리되므로 교환되는 데이터량과 처리량이 줄어듦
### 이벤트 핸들러는 비동기 프로그래밍의 한 형태
- 이벤트가 발생할 때마다 호출되는 함수(콜백 함수)를 제공하는 것
- HTTP 요청은 응답이 올 때까지의 시간이 걸릴 수 있는 작업이라 비동기이며, 이벤트 핸들러를 XHR 객체에 연결해 요청이 진행 상태 및 최종 완료에 대한 응답을 받음
# Callback과 Promise
## 비동기 콜백
## 프로미스