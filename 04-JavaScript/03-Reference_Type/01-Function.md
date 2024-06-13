- [Function](#function)
    - [데이터 타입](#데이터-타입)
- [함수 정의](#함수-정의)
  - [함수 구조](#함수-구조)
  - [함수 정의 2가지 방법](#함수-정의-2가지-방법)
    - [선언식 (function declaration)](#선언식-function-declaration)
    - [표현식 (function expression)](#표현식-function-expression)
    - [함수 표현식 특징](#함수-표현식-특징)
- [매개변수](#매개변수)
  - [매개변수 정의 방법](#매개변수-정의-방법)
    - [1. 기본 함수 매개변수 (Default function parameter)](#1-기본-함수-매개변수-default-function-parameter)
    - [2. 나머지 매개변수 (Rest parameters)](#2-나머지-매개변수-rest-parameters)
    - [매개변수와 인자 개수가 불일치 할 때](#매개변수와-인자-개수가-불일치-할-때)
- [Spread syntax](#spread-syntax)
  - [`...` (Spread syntax)](#-spread-syntax)
    - [전개 구문](#전개-구문)
  - [전개 구문 활용처](#전개-구문-활용처)
    - [함수와의 사용](#함수와의-사용)
    - [객체와의 사용](#객체와의-사용)
    - [배열과의 사용](#배열과의-사용)
- [화살표 함수](#화살표-함수)
  - [화살표 함수 표현식 (Arrow Function Expressions)](#화살표-함수-표현식-arrow-function-expressions)
    - [화살표 함수 작성 과정](#화살표-함수-작성-과정)
    - [화살표 함수 심화](#화살표-함수-심화)

# Function
참조 자료형에 속하며 모든 함수는 Function object이다.

### 데이터 타입
참조 자료형 (Reference type)
- Objects (Object, Array, Function)
- 객체의 주소가 저장되는 자료형 (가변, 주소가 복사)

# 함수 정의
## 함수 구조
```js
function name ([param, [, param, [..., param]]]) {
  statements
  return value
}
```
- `function` 키워드
- 함수의 이름
- 함수의 매개변수
- 함수의 body를 구성하는 statements
- `return` 값이 없다면 `undefined`를 반환

## 함수 정의 2가지 방법
### 선언식 (function declaration)
```js
function funcName () {
  statements
}
```
```js
// 예시
function add (num1, num2) {
  return num1 + num2
}
add(1, 2) // 3
```
### 표현식 (function expression)
```js
const funcName = function () {
  statements
}
```
```js
// 예시
const sub = function (num1, num2) {
  return num1 - num2
}
sub(2, 1) // 1
```
### 함수 표현식 특징
- 함수 이름이 없는 '익명 함수'를 사용할 수 있음
- 선언식과 달리 표현식으로 정의한 함수는 호이스팅 되지 않으므로 함수를 정의하기 전에 먼저 사용할 수 없음
- **사용 권장**
```js
//  선언식
add(1, 2) // 3

function add (num1, num2) {
  return num1 + num2
}
```
```js
// 표현식
sub(2, 1)
// ReferenceError : Cannot access 'sub' before initialization

const sub = function (num1, num2) {
  return num1 - num2
}
```
# 매개변수
## 매개변수 정의 방법
### 1. 기본 함수 매개변수 (Default function parameter)
- 전달하는 인자가 없거나 `undefined`가 전달될 경우 이름 붙은 매개변수를 기본값으로 초기화
```js
const greeting = function (name = 'Anonymous') {
  return `Hi ${name}`
}
greeting() // Hi Anonymous
```

### 2. 나머지 매개변수 (Rest parameters)
- 임의의 수의 인자를 '배열'로 허용하여 가변 인자를 나타내는 방법
- 작성 규칙
  - 함수 정의 시 나머지 매개변수는 하나만 작성할 수 있음
  - 나머지 매개변수는 함수 정의에서 매개변수 마지막에 위치해야 함
```js
const myFunc = function (param1, param2, ...restPrams) {
  return [param1, param2, restPrams]
}
```
### 매개변수와 인자 개수가 불일치 할 때
- 매개변수 > 인자 개수
  - 누락된 인자는 `undefined`로 할당
```js
const threeArgs = function (param1, param2, param3) {
  return [param1, param2, param3]
}
threeArgs() // [undefined, undefined, undefined]
threeArgs(1) // [1, undefined, undefined]
threeArgs(2, 3) // [2, 3, undefined]
```
- 매개변수 < 인자 개수
  - 초과 입력한 인자는 사용하지 않음
```js
const noArgs = function () {
  return 0
}
noArgs(1, 2, 3) // 0

const twoArgs = function (param1, param2) {
  return [param1, param2]
}
twoArgs(1, 2, 3) // [1, 2]
```
# Spread syntax
## `...` (Spread syntax)
### 전개 구문
- 배열이나 문자열과 같이 반복 가능한 항목을 펼치는 것 (확장, 전개)
- 전개 대상에 따라 역할이 다름
> 배열이나 객체의 요소를 개별적인 값을 분리하거나 다른 배열이나 객체의 요소를 현재 배열이나 객체에 추가하는 등

## 전개 구문 활용처
### 함수와의 사용
1. 함수 호출 시 인자 확장
  ```js
  function myFunc(x, y, z) {
  return x + y + z
  }
  let numbers = [1, 2, 3]

  console.log(myFunc(...numbers)) // 6
  ```
2. 나머지 매개변수 (압축)
  ```js
  function myFunc2(x, y, ...restArgs) {
    return [x, y, restArgs]
  }
  console.log(myFunc2(1, 2, 3, 4, 5)) // [1, 2, [3, 4, 5]]
  console.log(myFunc2(1, 2)) // [1, 2, []]
  
  ```
### 객체와의 사용
(추가 예정)
### 배열과의 사용
(추가 예정)
# 화살표 함수
## 화살표 함수 표현식 (Arrow Function Expressions)
함수 표현식의 간결한 표현법
```js
const arrow = function (name) {
  return `hello, ${name}`
}
```
위 함수를 하기와 같이 변경할 수 있음
```js
const arrow = name => `hello, ${name}`
```
### 화살표 함수 작성 과정
1. `function` 키워드 제거 후 매개변수와 중괄호 사이에 화살표 `=>` 작성
2. 함수의 매개변수가 하나 뿐이라면, 매개변수의 `()` 제거 가능 (단, 생략하지 않는 것을 권장)
3. 함수 본문의 표현식이 한 줄이라면, `{}`와 `return` 제거 가능
```js
const arrow1 = function (name) {
  return `hello, ${name}`
}

const arrow2 = (name) => {return `hello, ${name}`}

const arrow3 = name => {return `hello, ${name}`}

const arrow4 = name => `hello, ${name}`
```

### 화살표 함수 심화
```js
// 1. 인자가 없다면 () or _ 로 표시 가능하다
const noArgs1 = () => 'No args'
const noArgs2 = _ => 'No args'

// 2-1. object를 return 한다면 return을 명시적으로 작성해야 함
const returnObject1 = () => { return { key: 'value' }}

// 2-2. return을 작성하지 않으려면 객체를 소괄호로 감싸야 함
const returnObject2 = () => ({ key: 'value' })
```