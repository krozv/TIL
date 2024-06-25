### JSX란?

```jsx
import React from 'react';
import ReactDOM from 'react-dom/client';
import reportWebVitals from './reportWebVitals';

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <h1>Hello, world!</h1>
);

reportWebVitals();

```
- JavaScript를 확장한 문법
- UI가 어떻게 생겨야 하는지 설명하기 위해 React와 함께 사용

### JSX에 표현식 포함하기

```jsx
const name = 'Josh Perez';
const element = <h1>Hello, {name}</h1>
```
- JSX의 중괄호 안에는 유효한 모든 JavaScript의 표현식을 넣을 수 있음

```jsx
import React from 'react';
import ReactDOM from 'react-dom/client';
import reportWebVitals from './reportWebVitals';

const name = 'krozv'

const element = <h1>Hello, {name}</h1>

function formatName(user) {
  return user.firstName + ' ' + user.lastName;
}

const user = {
  firstName: 'Harper',
  lastName: 'Perez'
}

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <h1>Hello, {formatName(user)}!</h1>
);

reportWebVitals();

```
- JSX 사용 시 자동 세미콜론 삽입을 피하기 위해서 괄호로 묶는 것을 추천
- render 함수 안에는 html 형식의 표현식이 들어가야함

```jsx
function getGreeting(user) {
  if (user) {
    return <h1>Hello, {formatName(user)}.</h1>
  }
  return <h1>Hello, Stranger.</h1>
}
const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  getGreeting(user)
);
```
- if 구문 및 for loop 안에 사용 가능
- 변수에 할당 가능
- 함수로부터 반환 가능

### JSX 속성
- 어트리뷰트에 따옴표를 이용해 문자열 리터럴 정의 가능
```jsx
const element = <a href="https://www.reactjs.org">link</a>

const root = ReactDOM.createRoot(document.getElementById('root'));

root.render(
    element
);
```

- 중괄호 사용하여 속성(attr)에 JavaScript 표현식을 삽입할 수 있음
- JSX는 HTML보다는 JavaScript에 가까우므로, camelCase 사용함
```jsx
const element = <img src={user.avatarUrl}></img>

const root = ReactDOM.createRoot(document.getElementById('root'));

root.render(
  element
);
```

### JSX로 자식 정의

```jsx
const element = (
  <div>
    <h1>Hello!</h1>
    <h2>Good to see you here.</h2>
  </div>
)

const root = ReactDOM.createRoot(document.getElementById('root'));

root.render(
  element
);
```

### JSX의 객체 표현
```jsx
const element = (
  <h1 className='greeting'>
    Hello, world!
  </h1>
)

const element = React.createElement(
  'h1',
  {className: 'greeting'},
  'Hello, world!'
)
```
- 두 element는 동일함
- `React.createElement()`는 아래와 같은 객체를 생성함
- 이와 같은 객체 = React 엘리먼트
- 화면에서 보고 싶은 것을 나타내는 표현
```jsx
const element = {
    type: 'h1',
    props: {
        className: 'greeting',
        children: 'Hello, world!'
    }
}
```