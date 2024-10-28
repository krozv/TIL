// 기본 타입 간의 호환성
// 객체 타입 간의 호환성
// 어떤 객체타입을 다른 객체타입으로 취급해도 괜찮은가?

type Animal = {
    name: string;
    color: string;
}

type Dog = {
    name: string;
    color: string;
    breed: string;
}

let animal: Animal = {
    name: "기린",
    color: "yellow",
}

let dog: Dog = {
    name: "멍멍이",
    color: "black",
    breed: "진도"
}

animal = dog;
// dog = animal; // 불가능
// 프로퍼티를 기준으로 타입을 정하는 구조적 타입 시스템

// 초과 프로퍼티 검사
type Book = {
    name: string,
    price: number;
}

type ProgrammingBook = {
    name: string,
    price: number,
    skill: string,
}

let book: Book = {
    name : 'test',
    price: 2000,
    // skill: "react.js"
}

let programmingBook: ProgrammingBook = {
    name: "한 입 크기로 잘라먹는 리액트",
    price: 20000,
    skill: "react.js"
};

book = programmingBook;
let book2: Book = programmingBook;

function func(book: Book) {}
func({
    name: "초과 프로퍼티가 뭐지",
    price: 20000,
    // skill: 'test',
})
func(programmingBook)