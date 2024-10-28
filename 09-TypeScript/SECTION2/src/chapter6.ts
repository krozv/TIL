// any
// 특정 변수의 타입을 확실히 모를 때 사용
// 사용 지양
let anyvar: any = 10;
anyvar = "hello";
anyvar = true;
anyvar = () => {};

let num: number = 10;
num = anyvar;

// unknown
let unknownVar: unknown;
unknownVar = "";
unknownVar = true;
unknownVar = 1;

let num2: number = 10;
// num2 = unknownVar;
// unknownVar.toUpperCase();

if (typeof unknownVar === "number") {
    num = unknownVar;
}