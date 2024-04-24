# 이벤트
웹에서의 이벤트
- 화면을 스크롤하는 것
- 버튼을 클릭했을 때 팝업 창이 출력되는 것
- 마우스 커서의 위치에 따라 드래그 앤 드롭하는 것
- 사용자의 키보드 입력 값에 따라 새로운 요소를 생성하는 것
웹에서의 모든 동작은 **이벤트 발생**과 함께 함
## 이벤트 객체
### event
- 무언가 일어났다는 신호, 사건
- 모든 DOM 요소는 이러한 event를 만들어 냄
### event object
- DOM에서 이벤트가 발생했을 때 생성되는 객체
- 이벤트 종류
  - mouse, input, keyword, touch
> DOM 요소는 event를 받고 받은 event를 처리할 수 있음
## event handler
- 이벤트가 발생했을 때 실행되는 함수
- 사용자의 행동에 어떻게 반응할지를 JavaScript 코드로 표현한 것
## `.addEventListener()`
- 대표적인 이벤트 핸들러 중 하나
- 특정 이벤트를 DOM 요소가 수신할 때마다 콜백 함수를 호출
```js
EventTarget.addEventListener(type, handler)
// EventTarget: DOM 요소
// type: 수신할 이벤트
// handler: 콜백 함수
```
- 대상에 특정 Event가 발생하면 지정한 이벤트를 받아 할 일을 등록한다
### addEventListener의 인자
- type
  - 수신할 이벤트 이름
  - 문자열로 작성 (ex. 'click)
- handler
  - 발생한 이벤트 객체를 수신하는 콜백 함수
  - 콜백 함수는 발생한 event object를 유일한 매개변수로 받음
### addEventListener 활용
- 버튼을 클릭하면 버튼 요소 출력하기
### addEventListener의 콜백 함수 특징
- 발생한 이벤트를 나타내는 event 객체를 유일한 매개변수로 받음
- 반환 값 없음
```js
const btn = 
```

## 버블링
### 버블링 개요
### 버블링 (Bubbling)
- 한 요소에 이벤트가 발생하면, 이 요소에 할당된 핸들러가 동작하고, 이어서 부모 요소의 핸들러가 동작하는 현상
- 가장 최상단의 조상 요소(document)를 만날 때까지 이 과정이 반복되면서 요소 각각에 할당된 핸들러가 동작
- 이벤트가 제일 깊은 곳에 있는 요소에서 시작해 부모 요소를 거슬러 올라가며 발생하는 것이 마치 물속 거품과 닮았기 때문
- 가장 안쪽의 `<p>` 요소를 클릭하면 p -> div -> form 순서로 3개의 이벤트 핸들러가 모두 동작

### 이벤트가 정확히 어디서 발생했는지 접근할 수 있는 방법
- `event.currentTarget`
  - 현재 요소
  - 항상 이벤트 핸들러가 연결된 요소만을 참조하는 속성
  - `this`와 같음
- `event.target`
  - 이벤트가 발생한 가장 안쪽의 요소(target)를 참조하는 속성
  - 실제 이벤트가 시작된 요소
  - 버블링이 진행 되어도 변하지 않음
  
### target & currentTarget 예시
- 세 요소 중 최상위 요소인 outerouter 요소에만 핸들러가 부착
- 각 요소를 클릭 했을 때 event의 target과 currentTarget의 차이 비교

### 캡처링(capturing)
이벤트가 하위 요소로 전파되는 단계

### 캡처링과 버블링
- 실제 이벤트가 발생한 지점(event.target)에서 실행된 후 다시 위로 전파
  - 이 과정에서 상위 요소에 할당된 이벤트 핸들러가 호출되는 것
- 캡처링은 실제 다루는 경우가 거의 없으므로 버블링에 집중하기
  
### 버블링 필요한 이유

# event handler 활용
## 1. 버튼을 클릭하면 숫자를 1씩 증가해서 출력하기

## 2. 사용자의 입력 값을 실시간으로 출력하기
```js
  const userInput = document.querySelector('#text-input')
  const pTag = document.querySelector('p')
  console.log(userInput.textContent)
  userInput.addEventListener('input', function (event) {
    pTag.textContent = event.currentTarget.value
  })
```
## 3. 사용자의 입력 값을 실시간으로 출력
- '+' 버튼을 클릭하면 출력한 값의 CSS 스타일을 변경하기
  
## 4. todo 프로그램 구현

## 5. 로또 번호 생성기 구현