// void
// 아무것도 없음을 의미하는 타입

function func1(): string {
    return "hello";
}

function func2(): void {
    console.log("hello");
}

let a: void;
// a = 1;
a = undefined;

// never
// 불가능한 타입
function func3(): never {
    while (true) {}
}

function func4(): never {
    throw new Error();
}