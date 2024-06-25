import { useState } from 'react';

// Hooks: `use`로 시작하는 함수
// 컴포넌트의 상단에서만 Hooks를 호출할 수 있음

export default function MyApp() {
  // 컴포넌트 간 state 공유하는 방법
  const [count, setCount] = useState(0);

  function handleClick() {
    setCount(count + 1);
  }
  return (
      <div>
        <h1>Counters that update separately</h1>
        <MyButton count={count} onClick={handleClick}/>
        <MyButton count={count} onClick={handleClick}/>
      </div>
  );
}

// 전달된 props를 읽는 방식
function MyButton({ count, onClick }) {
  return (
    <button onClick={onClick}>
      Clicked {count} times
    </button>
  )
}