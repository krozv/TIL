- [History of JavaScript](#history-of-javascript)
    - [ECMAScript](#ecmascript)
- [DOM](#dom)
  - [개요](#개요)
    - [DOM (The Document Object Model)](#dom-the-document-object-model)
    - [DOM API](#dom-api)
    - [DOM 특징](#dom-특징)
    - [DOM tree](#dom-tree)
    - [DOM 핵심](#dom-핵심)
  - [document 객체](#document-객체)
    - [‘document’ 객체](#document-객체-1)
- [DOM 선택](#dom-선택)
  - [선택 메서드](#선택-메서드)
    - [`document.querySelector(selector)`](#documentqueryselectorselector)
    - [`document.querySelectorAll(selector)`](#documentqueryselectorallselector)
- [DOM 조작](#dom-조작)
  - [속성(attribute) 조작](#속성attribute-조작)
    - [1. classList 메서드](#1-classlist-메서드)
  - [HTML 콘텐츠 조작](#html-콘텐츠-조작)
  - [](#)

# History of JavaScript

### ECMAScript

Ecma International이 정의하고 있는 표준화된 스크립트 프로그래밍 언어 명세

→ 스크립트 언어가 준수해야 하는 규칙, 세부사항 등을 제공

ES6 부터 객체 지향 프로그래밍 언어임

# DOM

## 개요

### DOM (The Document Object Model)

웹 페이지(Document)를 구조화된 객체로 제공하여 프로그래밍 언어가 페이지 구조에 접근할 수 있는 방법을 제공

→ 문서 구조, 스타일, 내용 등을 변경할 수 있도록 함

### DOM API

다른 프로그래밍 언어가 웹 페이지에 접근 및 조작할 수 있도록 페이지 요소들을 객체 형태로 제공하며 이에 따른 메서드 또한 제공

### DOM 특징

DOM에서 모든 요소, 속성, 텍스트는 하나의 객체

모두 document 객체의 하위 객체로 구성됨

### DOM tree

브라우저는 HTML 문서를 해석하여 DOM tree라는 객체 트리로 구조화

→ 객체 간 상속 구조가 존재

### DOM 핵심

문서의 요소들을 객체로 제공하여 다른 프로그래밍 언어에서 접근하고 조작할 수 있는 방법을 제공하는 API

## document 객체

### ‘document’ 객체

웹 페이지 객체

DOM Tree 진입점

페이지를 구성하는 모든 객체 요소를 포함

# DOM 선택

웹 페이지를 동적으로 만들기 == 웹 페이지를 조작하기

조작 순서

1. 조작하고자 하는 요소를 **선택** (또는 탐색)
2. 선택된 요소의 콘텐츠 또는 속성을 **조작**

## 선택 메서드

### `document.querySelector(selector)`

제공한 선택자와 일치하는 element 한 개 선택

→ 제공한 CSS selector를 만족하는 첫 번째 element 객체를 반환 (없다면 `null` 반환)

### `document.querySelectorAll(selector)`

제공한 선택자와 일치하는 여러 element를 선택

→ 제공한 CSS selector를 만족하는 NodeList를 반환

```jsx
<body>
	
```

# DOM 조작

## 속성(attribute) 조작

### 1. classList 메서드

클래스 속성 조작

**‘classList’ property**

요소의 클래스 목록을 DOMTokenList(유사 배열) 형태로 반환

## HTML 콘텐츠 조작

##