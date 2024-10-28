// enum type
// 여러가지 값들에 각각 이름을 부여해 열거해두고 사용하는 타입

enum Role {
    ADMIN = 10,
    USER,
    GUEST,
}

enum Language {
    korean = 'ko',
    english = 'en',
}
const user1 = {
    name: "test",
    role: Role.ADMIN,
    language: Language.korean,
}

const user2 = {
    name: "주연",
    role: Role.USER,
    language: Language.english,
}
console.log(user1, user2)