# Template Syntax
- DOM을 기본 구성 요소 인스턴스의 데이터에 선언적으로 바인딩할 수 있는 HTML 기반 템플릿 구문을 사용
  - 선언전으로 바인딩: Vue Instance와 DOM을 연결
  - 템플릿 구문: 확장된 문법 제공
1. Text Interpolation
    ```html
    <p>Message: {{ msg }}</p>
    ```
    - 데이터 바인딩의 가장 기본적인 형태
    - 이중 중괄호 구문 (콧수염 구문)을 사용
    - 콧수염 구문을 해당 구성 요소 인스턴스의 msg 속성 값으로 대체
    - msg 속성이 변경될 때마다 업데이트 됨
2. Raw HTML
    ```html
    <div v-html="rawHtml"></div>
    ```
    ```js
    const rawHtml = ref('<span style="color:red">This should be red.</span>')
    ```
   - 콧수염 구문은 데이터를 일반 텍스트로 해석하기 때문에 실제 HTML을 출력하려면 v-html을 사용해야 함 
3. Attribute Bindings
   ```html
   <div v-bind:id="dynamicId"></div>
   ```
   ```js
   const dynamicId = ref('my-id')
   ```
   - 콧수염 구문은 HTML 속성 내에서 사용할 수 없기 때문에 `v-bind`를 사용
   - HTML id 속성 값을 vue의 `dynamicId` 속성과 동기화 되도록 함
   - 바인딩 값이 `null`이나 `undefined`인 경우 렌더링 요소에서 제거됨
4. JavaScript Expressions
    ``` html
    {{ number + 1 }}

    {{ ok ? 'YES' : 'NO' }}

    {{ message.splie('').reverse().join('') }}

    <div :id="`list-${id}`"></div>
    ```
    - Vue는 모든 데이터 바인딩 내에서 JavaScript 표현식의 모든 기능을 지원
    - Vue 템플릿에서 JavaScript 표현식을 사용할 수 있는 위치
      1. 콧수염 구문 내부
      2. 모든 directive의 속성 값("v-"로 시작하는 특수 속성)
## Expressions 주의사항
- 각 바인딩에는 하나의 단일 표현식만 포함될 수 있음
  - 표현식은 값으로 평가할 수 있는 코드 조각
  - `return` 뒤에 사용할 수 있는 코드여야 함
- 작동하지 않는 경우
  ```html
  dfdf
  ```
## Directive
- 'v-'접두사가 있는 특수 속성
### Directive 특징
- Directive의 속성 값은 단일 JavaScript 표현식이어야 함
# Dynamically data binding

## v-bind
- 하나 이상의 속성 또는 컴포넌트(Vue 인스턴스) 데이터를 표현식에 동적으로 바인딩
### v-bind 사용처
1. Attribute Bindings
   - HTML의 속성 값을 Vue의 상태 속성 값과 동기화 되도록 함
   - v-bind shorthand (약어)
     - `:`(colon)
     ```html
     
     ```
   - Dynamic attribute name (동적 인자 이름)
     - 대괄호`[]`로 감싸서,,, 
2. Class and Style Bindings
## Attribute Bindings
## Class and Style Bindings
# Event Handling
## v-on
# Form Input Bindings
## v-model
## v-model 활용