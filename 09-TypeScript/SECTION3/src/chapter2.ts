// Unknown (전체집합)

function unknownExam(){
    let a: unknown = 1;
    let b: unknown = true;
    
    let unknownVar: unknown;

    // let num: number = unknownVar; // down casting 불가
}

// Never Type
// 모든 집합의 sub type
function neverExam() {
    function neverFunc() : never {
        while (true) {}
    }
    let num: number = neverFunc();
    let neverVar: never;
    // neverVar = num; 반대 불가 down casting
}

// Void Type
function voidExam() {
    function voidFunc(): void {
        console.log("hi");
    }
    let voidVar: void = undefined;
}

// any type
function anyExam() {
    // 모든 타입의 슈퍼 및 서브 가능. never 제외
    let unknownVar: unknown;
    let anyVar: any;
    let undefinedVar: undefined;
    let neverVar: never;

    anyVar = unknownVar;
    unknownVar = anyVar;
    undefinedVar = anyVar;
    // neverVar = anyVar; // 불가능

}