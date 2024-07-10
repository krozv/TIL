# ReactJs로 영화 웹 서비스 만들기

## THE BASICS OF REACT

- Vanilla JS로 아래와 같이 코드를 구성함
```html
<!DOCTYPE html>
<html lang="en">
<body>
    <span>Total clicks: 0</span>
    <button id="btn">Click me</button>
</body>
<script>
    let counter = 0;
    const button = document.getElementById("btn");
    const span = document.querySelector("span");
    function handleClick () {
        counter = counter + 1;
        span.innerText = `Total clicks: ${counter}`;
    }
    button.addEventListener("click", handleClick)
</script>
</html>
```

- React CDN을 사용하여 ReactDOM을 구성함
```html
<!DOCTYPE html>
<html lang="en">
<body>
    <div id="root"></div>
</body>
<script crossorigin src="https://unpkg.com/react@18/umd/react.development.js"></script>
<script crossorigin src="https://unpkg.com/react-dom@18/umd/react-dom.development.js"></script>
<script>
    const root = document.getElementById("root");
    const h3 = React.createElement(
        "h3",
        {
            onMouseEnter: () => console.log("mouse enter"),
        },
        "Hello, I'm a h3"
    );
    const btn = React.createElement(
        "button", // 1. html tag
        null,       // 2. property or event listener
        "Click me"  // 3. text or element
    );
    const container = React.createElement(
        "div",
        {
            onClick: () => console.log("I'm clicked.")
        },
        [h3, btn] // 여러 개의 element 포함 시 array를 넣는다
    );
    ReactDOM.render(container, root);

</script>
</html>
```

- JSX
  - component는 대문자로 시작해야함
  - html tag요소와 구별하기 위함임
```html
<script type="text/babel">
    const root = document.getElementById("root");
    const Title = () => {
        return (
        <h3 
            id='title' 
            onMouseEnter={() => console.log("mouse enter")}
        >
        Hello, I'm a title.
        </h3>)
    }
    const Button = () => {
        return (
        <button
            style={{ backgroundColor: "tomato "}}
            onClick={() => console.log("clicked!")}>
            Click me!
        </button>
        )
    }
    const Contatiner = () => {
        return(
        <div>
            <Title/>
            <Button/>
        </div>
        )
    }
    ReactDOM.render(<Contatiner />, root);
</script>
  ```

### Understanding State
- react로 위 vanilla.js 코드를 변환함
- 조금더 interactive한 방식 배울 예정
- html tag를 return하는 방식으로 사용
```html
<body>
    <div id="root"></div>
</body>
<script crossorigin src="https://unpkg.com/react@18/umd/react.development.js"></script>
<script crossorigin src="https://unpkg.com/react-dom@18/umd/react-dom.development.js"></script>
<script src="https://unpkg.com/@babel/standalone/babel.min.js"></script>
<script type="text/babel">
    const root = document.getElementById("root");
    let counter = 0;
    function countUp() {
        counter += 1;
        reRender();
    }
    function reRender() {
        ReactDOM.render(<Container/>, root);
    }
    function Container() {
        return(
        <div>
            <h3>Total clicks: { counter }</h3>
            <button onClick={countUp}>Click me</button>
        </div>
    )}
    ReactDOM.render(<Container />, root);

</script>
``` 

### setState part One
