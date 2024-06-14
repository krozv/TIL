void main() {
  // 1.1 The Var Keyword

  // 함수나 메소드 내부에 지역 변수를 선언할 때 var 사용
  // 컴파일러가 스스로 타입을 파악함
  var name = 'krozv';
  name = 'test';

  // class에서 변수나 property를 선언할 때 타입 지정
  // 변수 변경 가능
  String nickname = 'krozv';

  // 1.2 Dynamic Type

  // 변수의 타입을 모르거나 변경될 경우 사용
  // 정말 필요할때만 사용할 것
  var dynamicType;
  dynamicType = 12;
  dynamicType = true;

  dynamic variable;
  variable = 123;
  if(variable is String){
    // print(variable.length())
  }
  
  // 1.3 Nullable Variables

  // 개발자가 null 값을 참조할 수 없도록 함
  // null 값을 참조할 경우 런타임 에러 발생
  
  bool isEmpty(String string) => string.length == 0;
  // isEmpty(null);

  // Error: The value 'null' can't be assigned to the parameter type 'String' because 'String' is not nullable.

  // ?을 붙이면 해당 변수가 null값일 수도 있음을 의미
  // ? 없이 사용시 무조건 non-nullable
  String? fruit = 'apple';
  fruit = null;
  if (fruit != null) {
    fruit.isNotEmpty;
  }
  fruit?.isNotEmpty; // 위 if문과 같은 뜻. fruit가 존재하면 뒤 함수를 실행.
  
  // 1.4 Final Variables

  // 한 번 정의된 변수를 수정할 수 없게 만들려면 final을 사용
  final scent = 'olive';
  // scent = 'powder';
  // Error: Can't assign to the final variable 'scent'.

  // 1.5 Late Variables
  
  // final, var 앞에 붙여줄 수 있는 수식어
  late final String drink;
  // do something, go to api
  // late를 사용하면 변수를 먼저 만들고, 나중에 값을 할당할 수 있음
  // flutter로 data fetching 시 활용
  // late final: 한번만 할당할 수 있는 변수
  drink = 'water';

  // 1.6 Constant Variables

  // const: compile-time constant를 생성
  const color = 'white';
  // compile-time에 알고 있는 값이어야 함
  // const API = fetchAPi(); 로 사용 불가

}