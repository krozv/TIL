// 타입 별칭
type User = {
    id: number,
    name: string,
    nickname: string
}
// 같은 scope 내에서는 중복 불가
// 함수 내 scope는 노상관

let user: User = {
    id: 1,
    name: "박주연",
    nickname: "123",
}

let user2: User = {
    id: 2,
    name: 'juyeon',
    nickname: 'hahahaha'
}

// 인덱스 시그니처
type CountryCodes = {
    [key : string] : string;
}
let countryCodes: CountryCodes = {
    Korea: 'ko',
    UnitedState: 'us',
}
type CountryNumberCodes = {
    [key: string] : number;
}
let countryNumberCodes: CountryNumberCodes = {
    Korea: 410,
    UnitedState: 840,
    UnitedKingdom: 826
}