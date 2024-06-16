void main() {

  // 2.0 Basic Data Types
  String name = "krozv";
  bool alive = true;
  int age = 12;
  double money = 69.99;
  num x = 12; // integer와 double의 부모 class
  x = 3.4;

  // 2.1 Lists
  var giveMeFive = true;
  var numbers = [
    1, 
    2, 
    3, 
    4,
    if (giveMeFive) 5, // collection if
    ];
  List<int> nums = [1, 2, 3, 4,];
  numbers.add(6);
  print(numbers);
  print(numbers.first);
  print(numbers.last);
  print(numbers.length);
  
  // 2.2 String Interpolation
  var name2 = "krozv";
  var age2 = 26;
  var greeting = "Hello everyone, my name is $name2 and I'm ${age2 + 2}.";
  print(greeting);

  // 2.3 Collection For
  
}