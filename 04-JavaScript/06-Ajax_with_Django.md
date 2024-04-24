# Ajax와 서버
### Ajax
- Asynchronous JavaScript and XML
- 비동기적인 웹 어플리케이션 개발에 사용하는 기술
# Ajax with follow
## 비동기 팔로우 구현
### 사전 준비
- 아아
### Ajax 적용
- form 태그 수정
  - 요청이 axios로 대체되므로 form 태그의 action과 method를 삭제
  - submit event가 발생하는 form 태그 선택
- url에 작성할 user pk 가져오는 방법 
  - JS로 user pk를 전달하는 방법
  - html에서 저장한 변수명이 JS에서는 -을 기준으로 camelCase로 바뀌는 것을 유의할 것
  ```html
  <form id="follow-form" data-user-id="{{ person.pk }}">
    ...
  </form>
  ```
  ```js
  const userId = event.currentTarget.dataset.userId
  const userId = this.dataset.userId
  const userId = formTag.dataset.userId
  ```
  - data-* 속성
    - 사용자 지정 데이터 특성을 만들어 임의의 데이터를 HTML과 DOM 사이에서 교환 할 수 있는 방법
    - 모든 사용자 지정 데이터는 JavaScript에서 dataset 속성을 통해 사용
    - 주의사항
      - 대소문자 여부에 상관없이 xml 문자로 시작 불가
      - 세미콜론 포함 불가
      - 대문자 포함 불가
- csrf token를 보내는 방법
  - [django document](https://docs.djangoproject.com/en/5.0/howto/csrf/#acquiring-the-token-if-csrf-use-sessions-or-csrf-cookie-httponly-is-true)
  - csrf 값을 가진 input 요소를 직접 선택 후 axios에 작성
  ```js
  적어라!
  ```
- 팔로우 버튼 토글
  - 팔로우 버튼을 토글하기 위해서는 현재 팔로우 상태인지 언팔로우 상태인지에 대한 상태 확인 필요
  - Django의 view 함수에서 팔로우 여부를 파악할 수 있는 변수를 추가로 생성해 JSON 타입으로 응답
# Ajax with likes