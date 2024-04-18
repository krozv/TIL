- [Object](#object)
- [구조 및 속성](#구조-및-속성)
    - [객체 구조](#객체-구조)
    - [속성 참조](#속성-참조)
    - [`in` 연산자](#in-연산자)
- [객체와 함수](#객체와-함수)
  - [Method](#method)
- [this](#this)
  - [`this` keyword](#this-keyword)
    - [1. 단순 호출 시 `this`](#1-단순-호출-시-this)
    - [2. 메서드 호출 시 `this`](#2-메서드-호출-시-this)
    - [중첩된 함수에서의 this 문제점과 해결책](#중첩된-함수에서의-this-문제점과-해결책)
    - [javaScript - `this`](#javascript---this)
- [추가 객체 문법](#추가-객체-문법)
    - [1. 단축 속성](#1-단축-속성)
    - [2. 단축 메서드](#2-단축-메서드)
    - [3. 계산된 속성 (computed property name)](#3-계산된-속성-computed-property-name)
    - [4. 구조 분해 할당 (destructing assignment)](#4-구조-분해-할당-destructing-assignment)

# Object

키로 구분된 데이터 집합(data collection)을 저장하는 자료형

# 구조 및 속성

### 객체 구조

- 중괄호 `{}`를 이용해 작성
- 중괄호 안에는 key: value 쌍으로 구성된 속성(property)를 여러 개 작성 가능
- key는 문자형만 허용
- value는 모든 자료형 허용

```js
const user = {
  name: "Alice",
  "key with space": true,
  greeting: function () {
    return "hello";
  },
};
```

### 속성 참조

- 점(`.`, chaining operator) 또는 대괄호(`[]`)로 객체 요소 접근
- key 이름에 띄어쓰기 같은 구분자가 있으면 대괄호 접근만 가능

```js
const user = {
  name: "Alice",
  "key with space": true,
  greeting: function () {
    return "hello";
  },
};
// 조회
console.log(user.name); // Alice
console.log(user["key with space"]); // true

// 추가
user.address = "korea";
console.log(user); // {name: 'Alice, 'key with space': true, address: 'korea', greeting: f}

// 수정
user.name = "Bella";
console.log(user.name); // Bella

// 삭제
delete user.name;
console.log(user); // {'key with space': true, address: 'korea', greeting: f}
```

### `in` 연산자

- 속성이 객체에 존재하는지 여부를 확인

```js
console.log("greeting" in user); // true
console.log("country" in user); // false
```

# 객체와 함수

## Method

- 객체 속성에 정의된 함수
- `object.method()` 방식으로 호출
- 메서드는 객체를 '행동'할 수 있게 함

```js
console.log(user.greeting()); // hello
```

# this

## `this` keyword

- 함수나 메서드를 호출한 객체를 가리키는 키워드
- 함수 내에서 객체의 속성 및 메서드에 접근하기 위해 사용
- `this` 키워드를 사용해 객체에 대한 특정한 작업을 수행 할 수 있음

```js
const person = {
  name: 'Alice'.
  greeting: function () {
    return `Hello my name is ${this.name}`
  },
}

console.log(person.greeting()) // Hello my nams is Alice
```

> JavaScript에서 `this`는 함수를 **호출하는 방법**에 따라 가리키는 대상이 다름

|  호출 방법  |         대상         |
| :---------: | :------------------: |
|  단순 호출  |      전역 객체       |
| 메서드 호출 | 메서드를 호출한 객체 |

### 1. 단순 호출 시 `this`

가리키는 대상 => 전역 객체

```js
const myFunc = function () {
  return this;
};

console.log(myFunc()); // window
```

### 2. 메서드 호출 시 `this`

가리키는 대상 => 메서드를 호출한 객체

```js
const myObj = {
  data: 1,
  myFunc: function () {
    return this
  }
}
console.log(myObj.myFunc()) // myObj
```

### 중첩된 함수에서의 this 문제점과 해결책
```js
const myObj = {
  numbers: [1, 2, 3],
  myFunc: function () {
    this.numbers.forEach(function (number) {
      console.log(this) // window
    })
  }
}

console.log(myObj.myFunc())
```
`forEach`의 인자로 작성된 함수는 일반적인 함수 호출이므로 `this` = window 즉, 전역 객체를 가리킴

```js
const myObj = {
  numbers: [1, 2, 3],
  myFunc: function () {
    this.numbers.forEach((number) => {
      console.log(this) // myObj
    })
  }
}

console.log(myObj.myFunc())
```
화살표 함수는 자신만의 `this`를 가지지 않기 때문에, 외부 함수(myFunc)에서의 `this` 값을 가져옴 

### javaScript - `this`
- JavaScript의 함수는 호출할 때 `this`를 암묵적으로 전달 받음
- JavaScript에서 `this`는 함수가 호출되는 방식에 따라 결정되는 현재 객체를 나타냄
- Python의 `self`와 Java의 `this`가 선언 시 이미 값이 정해지는 것에 비해 JavaScript의 `this`는 **함수가 호출되기 전까지 값이 할당되지 않고 호출 시에 결정**됨 (동적 할당)
- `this`가 미리 정해지지 않고 호출 방식에 의해 결정
  - 장점: 함수(메서드)를 하나만 만들어 여러 객체에서 재사용할 수 있음
  - 단점: 유연성에 의해 실수 발생 가능성 존재
- 개발자는 `this`의 동작 방식을 충분히 이해하고 장점을 취하면서 실수를 피하는 데에 집중해야 함
  
# 추가 객체 문법
### 1. 단축 속성
- 키 이름과 값으로 쓰이는 변수의 이름이 같은 경우 단축 구문을 사용할 수 있음
```js
const name = 'Alice'
const age = 30

const user = {
  name: name,
  age: age,
}
```
```js
// 단축 구문
const name = 'Alice'
const age = 30

const user = {
  name,
  age,
}
```

### 2. 단축 메서드
- 메서드 선언 시 `function` 키워드 생략 가능
```js
const myObj = {
  myFunc: function () {
    return 'Hello'
  }
}
```
```js
// 단축 메서드
const myObj = {
  myFunc() {
    return 'Hello'
  }
}
```

### 3. 계산된 속성 (computed property name)
- 키가 대괄호 `[]`로 둘러싸여 있는 속성
- 고정된 값이 아닌 변수 값을 사용할 수 있음
```js
const project = prompt('물건 이름을 입력해주세요')
const prefix = 'my'
const suffix = 'property'

const bag = {
  [product]: 5,
  [prefix + suffix]: 'value',
}

console.log(bag) // {연필: 5, myproperty: 'value'}
```

### 4. 구조 분해 할당 (destructing assignment)
- 배열 또는 객체를 분해하여 객체 속성을 변수에 쉽게 할당할 수 있는 문법
```js
const userInfo
```