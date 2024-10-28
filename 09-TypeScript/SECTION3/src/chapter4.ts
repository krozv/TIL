// 대수 타입
// 여러 개의 타입을 합성해서 새롭게 만들어낸 타입
// 합집합 타입과 교집합 타입이 존재

// 1. 합집합 - Union Type
let a: string | number | boolean; // 무한대로 추가 가능

a = 1;
a = 'atest';
a = true;

let arr: (string | number | boolean)[] = [1, "hello", true]

type Dog = {
    name: string;
    color: string;
};

type Person = {
    name: string;
    language: string;
}
type Union1 = Dog | Person;

let union1: Union1 = {
    name: 'test',
    color: 'black',
}

let union2: Union1 = {
    name: 'test',
    language: 'test'
}

let union3: Union1 = {
    name: 'test',
    language: 'test',
    color: 'test',
}