import { useState } from 'react';

// 같은 컴포넌트를 여러번 렌더링하면 각각의 컴포넌트는 고유한 State를 얻게 된다.
export default function MyApp() {
  return (
      <div>
        <h1>Counters that update separately</h1>
        <MyButton />
        <MyButton />
      </div>
  );
}

function MyButton() {
  const [count, setCount] = useState(0);

  function handleClick() {
    setCount(count + 1);
  }
  return (
    <button onClick={handleClick}>
      Clicked {count} times
    </button>
  )
}