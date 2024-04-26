# Frontend Development
## Client-side frameworks
- 클라이언트 측에서 UI와 상호작용을 개발하기 위해 사용되는 JavaScript 기반 프레임워크
### Frontend Development
- 웹사이트와 웹 애플리케이션의 사용자 인터페이스(UI)와 사용자 경험(UX)을 만들고 디자인하는 것
- HTML, CSS, JavaScript 등을 활용하여 사용자가 직접 상호작용하는 부분을 개발
### Client-side frameworks가 필요한 이유
- 웹 애플리케이션: 현대적이고 복잡한 대화형 웹 사이트
- Client-side framworks를 이용하여 매우 동적인 대화형 애플리케이션을 수월하게 구축할 수 있음
- 
# Vue
## Vue의 2가지 핵심 기능
1. 선언적 렌더링 (Decarative Rendering)
   - 표준 HTML을 확장하는 '템플릿 구문'을 사용하여 JavaScript 상태(데이터)를 기반으로 화면에 출력될 HTML을 선언적으로 작성
2. 반응성 (Reactivity)
   - JavaScript 상태(데이터) 변경을 추적하고, 변경사항이 발생하면 자동으로 DOM을 업데이트
# Vue Tutorial
## Vue 사용법
1. CDN 방식
2. NPM 설치 방식

### Vue 기본 구조
- `createApp()`에 전달되는 객체는 Vue 컴포넌트(Component)
- 컴포넌트의 상태는 `setup()` 함수 내에서 선언되어야 하며 객체를 반환해야 함
  ```js
  const app = createApp({
    setup() {
      const message = ref('Hello vue!')
      return {
        message
      }
    }
  })
  ```
### 템플릿 렌더링
- 반환된 객체의 속성은 템플릿에서 사용할 수 있음
- Mustache syntax(콧수염 구문)를 사용하여 메시지 값을 기반으로 동적 테스트를 렌더링
  ```html
  <div id="app">
    <h1>{{ message }}</h1>
  </div>
  ```
- 콘텐츠는 식별자나 경로에만 국한되지 않으며 유효한 JavaScript 표현식을 사용할 수 있음
  ```html
  <h1>{{ message.split('').reverse().join('') }}</h1>
  ```
### Event Listeners in Vue
- `v-on` directive를 사용하여 DOM 이벤트를 수신할 수 있음