# Array
**Object**
- 키로 구분된 데이터 집합을 저장하는 자료형
**Array**
- 순서가 있는 데이터 집합을 저장하는 자료구조
### 배열 구조
- 대괄호 `[]`를 이용해 작성
- 요소 자료형: 제약 없음
- `length` 속성을 사용해 배열에 담긴 요소가 몇 개인지 알 수 있음
```js
const names = ['Alice', 'Bella', 'Cathy']
console.log(names[0]) // Alice
console.log(names.length) // 3
```
# 배열 메서드
### `push()`
배열 끝에 요소를 추가
```js
const name = ['Alice', 'Bella', 'Cathy']
names.push('Dan')
console.log(names) // ['Alice', 'Bella', 'Cathy', 'Dan']
```
### `pop()`
배열 끝 요소를 제거하고, 제거한 요소를 반환
```js
const names = ['Alice', 'Bella', 'Cathy']

console.log(names.pop()) // Dan
console.log(names) // ['Alice', 'Bella', 'Cathy']
```
### `unshift()`
배열 앞에 요소를 추가
```js
names.unshift('Eric')
console.log(names) // ['Eric', 'Alice', 'Bella', 'Cathy']
```
### `shift()`
배열 앞 요소를 제거하고, 제거한 요소를 반환
```js
console.log(names.shift()) // Eric
console.log(names) // ['Alice', 'Bella', 'Cathy']
```
# Array helper method
배열 조작을 보다 쉽게 수행할 수 있는 특별한 메서드 모음
- 배열의 각 요소를 순회하며 각 요소에 대해 함수(**콜백함수**)를 호출
- `forEach()` `map()` `filter()` `every()` `some()` `reduce()` 등
- 메서드 호출 시 인자로 함수(**콜백함수**)를 받는 것이 특징

### 콜백 함수(Callback function)
다른 함수에 인자로 전달되는 함수
- 외부 함수 내에서 호출되어 일종의 루틴이나 특정 작업을 진행
```js
const numbers1 = [1, 2, 3]
numbers1.forEach(function (num) {
    console.log(num ** 2)
})
// 1
// 4
// 9
```
```js
const numbers2 = [1, 2, 3]

const callBackFunction = function (num) {
    console.log(num ** 2)
}
numbers2.forEach(callBackFunction)
// 1
// 4
// 9
```
## `forEach()`
- 배열의 각 요소를 반복하며 모든 요소에 대해 함수를 호출
### `forEach` 구조
- `arr.forEach(callback(item[, index[, array]]))
- 콜백함수는 3가지 매개변수로 구성
  1. `item`: 처리할 배열의 요소
  2. `index`: 처리할 배열 요소의 인덱스 (선택 인자)
  3. `array`: `forEach`를 호출할 배열 (선택 인자)
- 반환 값: `undefined`
```js
const names = ['Alice', 'Bella', 'Cathy']

// 일반 함수 표기
names.forEach(function (name) {
    console.log(name)
})
// 화살표 함수 표기
names.forEach((name) => {
    console.log(name)
})
```
```js
const names = ['Alice', 'Bella', 'Cathy']

names.forEach(function (name, index, array) {
    console.log(`${name} / ${index} / ${array}`)
})
// Alice / 0 / Alice, Bella, Cathy
// Bella / 1 / Alice, Bella, Cathy
// Cathy / 2 / Alice, Bella, Cathy
```
## `map()`
배열의 모든 요소에 대해 함수를 호출하고, 반환 된 호출 결과 값을 모두 **새로운 배열을 반환**
### `map` 구조
`arr.map(callback(item[, index[, array]]))
- `forEach`의 매개 변수와 동일
- 반환 값
  - 배열의 각 요소에 대해 실행한 'callback의 결과를 모은 새로운 배열'
  - `forEach`와 동작 원리가 같지만 `map`은 새로운 배열을 반환함
```js
const newArr = array.map(function (item, index, array) {
    // do something
})
```
### `map` 예시
- 배열을 순회하며 각 객체의 name 속성 값을 추출하기
- `for - of`와 비교

```js
const persons = [
    { name: 'Alice', age: 20 }
    { name: 'Bella', age: 21 }
]
// for - of
let result1 = []
for (const person of persons) {
    result1.push(person.name)
}
console.log(resul1) // ['Alice', 'Belle']

// map
const result2 = persons.map(fuction (person) {
    return person.name
})
console.log(result2) // ['Alice', 'Bella']
```
### `map` 활용
```js
const names = ['Alice', 'Bella', 'Cathy']

const result3 = names.map(function (name) {
    return name.length
})

const result4 = names.map((name) => {
    return name.length
})

console.log(result3) // [5, 5, 5]
console.log(result4) // [5, 5, 5]
```

```js
const numbers = [1, 2, 3]

const doubleNumber = numbers.map((number) => {
    return number * 2
})

console.log(doubleNumber) [2, 4, 6]
```
### python에서의 map함수와 비교
```python
numbers = [1, 2, 3]

def square(num):
    return num ** 2

new_numbers = list(map(square, numbers))
```
- python `map`에 `square` 함수를 인자로 넘겨 `numbers` 배열의 각 요소를 `square`함수의 인자로 사용함

```js
const numbers = [1, 2, 3]

const callBackFunction = function (number) {
    return number ** 2
}
const newNumbers = numbers.map(callBackFunction)
```
- map 메서드에 `callBackFunc`함수를 인자로 넘겨 `numbers`배열의 각 요소를 `callBackFunc`함수의 인자로 사용하였음

### 배열 순회 총합
```js
const names = ['Alice', 'Bella', 'Cathy']

// for loop
for (let idx = 0; idx < names.length; idx++) {
    console.log(names[idx])
}

// for - of
for (const name of names) {
    console.log(name)
}

// forEach
names.forEach((name) => {
    console.log(name)
})
```
for loop
- 배열의 인덱스를 이용하여 각 요소에 접근
- `break`, `continue` 사용 가능

for - of
- 배열 요소에 바로 접근 가능
- `break`, `continue` 사용 가능

forEach(사용 권장)
- 간결하고 가독성이 높음
- callback 함수롤 이용하여 각 요소를 조작하기 용이
- `break`, `continue` 사용 불가능

### 기타 Array Helper Methods
- `filter`
  - 콜백 함수의 반환 값이 참인 요소들만 모아서 새로운 배열을 반환
- `find`
  - 콜백 함수의 반환 값이 참이면 해당 요소를 반환
- `some`
  - 배열의 요소 중 적어도 하나라도 콜백 함수를 통과하면 true를 반환하며 **즉시 배열 순회 중지**
  - 반면에 모두 통과하지 못하면 false를 반환
- `every`
  - 배열의 모든 요소가 콜백 함수를 통과하면 true를 반환
  - 반면에 하나라도 통과하지 못하면 **즉시 false를 반환하고 배열 순회 중지**
  
# 추가 배열 문법
### Array with '전개 구문'
- 배열 복사
```js
let parts = ['어깨', '무릎']
let lyrics = ['머리', ...parts, '발']

console.log(lyrics) // ['머리', '어깨', '무릎', '발']
```
# [참고]
## 콜백함수 구조를 사용하는 이유
### 1. 함수의 재사용성 측면
- 함수를 호출하는 코드에서 콜백 함수의 동작을 자유롭게 변경할 수 있음
- map 함수는 콜백 함수를 인자로 받아 배열의 각 요소를 순회하며 콜백 함수를 실행
- 콜백 함수는 각 요소를 변환하는 로직을 담당하므로, map 함수를 호출하는 코드는 간결하고 가독성이 높아짐
### 2. 비동기적 처리 측면
- `setTimeout` 함수는 콜백 함수를 인자로 받아 일정 시간이 지난 후에 실행됨
- `setTimeout` 함수는 비동기적으로 콜백 함수를 실행하므로, 다른 코도의 실행을 방해하지 않음
- 
```js
console.log('a')

setTimeout(() => {
    console.log('b')
}, 3000)

console.log('c')
// a
// c
// b
```
### forEach에서 break하는 대안
- `forEach`에서는 `break` 키워드를 사용할 수 없음
- 대신 `some`과 `every`의 특징을 활용해 마치 `break`를 사용하는 것처럼 활용할 수 있음
```js
// some 동작 예시
const array = [1, 2, 3, 4, 5]

const isEvenNumber = array.some(function (element) {
    return element % 2 == 0
})
console.log(isEvenNumber) // true

// every 동작 예시
const array = [1, 2, 3, 4, 5]

const isAllEvenNumber = array.every(function (element) {
    return element % 2 == 0
})

console.log(isAllEvenNumber) // false
```
- some을 활용한 예시
  - 콜백 함수가 true를 반환하면 즉시 순회를 중단하는 특징을 활용
```js
const names = ['Alice', 'Bella', 'Cathy']

names.some(function (name) {
    console.log(name) // Alice, Bella
    if (name == 'Bella') {
        return true
    }
    return false
})
```
- every를 활용한 예시
  - 콜백 함수가 false를 반환하면 즉시 순회를 중단하는 특징을 활용
```js
const names = ['Alice', 'Bella', 'Cathy']

names.every(function (name) {
    console.log(name) // Alice, Bella
    if (name == 'Bella') {
        return false
    }
    return true
})
```
## 배열은 객체다
- 배열도 키와 속성들을 담고 있는 참조 타입의 객체
- 배열의 요소를 대괄호 접근법을 사용해 접근하는 건 객체 문법과 같음
  - 배열의 키 = 숫자
- 숫자형 키를 사용함으로써 배열은 객체 기본 기능 이외에도 '순서가 있는 컬렉션'을 제어하게 해주는 특별한 메서드를 제공하는 것

- 배열은 인덱스를 키로 가지며 `length` 속성을 갖는 특수한 객체
  ```js
  const numbers = [1, 2, 3]
  console.log(Object.getOwnPropertyDesciptors(numbers))
  ```