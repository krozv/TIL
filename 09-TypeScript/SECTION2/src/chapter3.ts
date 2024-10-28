const user: {
    id?: number, // optional property
    name: string
} = {
    id: 1,
    name: '이정환'
}; // 객체 리터럴 타입. 객체의 모든 프로퍼티를 정의

// ts -> 구조적 타입 시스템
// property Based Type System
// C언어, java -> 명목적 타입 시스템

const config: { 
    readonly apiKey: string // 읽기 전용 속성 할당
} = {
    apiKey: "MY API KEY"
}

// config.apiKey = 'test'