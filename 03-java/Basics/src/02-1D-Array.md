# 배열(Array)
- 같은 종류의 데이터를 저장하기 위한 자료구조
- 크기가 고정되어 있음 (한번 생성된 배열은 크기를 바꿀 수 없음)
- 배열을 객체로 취급(참조형

## 배열의 선언
타입[] 변수

타입 변수[]

## 배열의 생성과 초기화
자료형[] 배열이름 = new 자료형 [길이]

## 배열의 메모리 생성과정

## 배열의 순회
반복문을 이용하여 배열의 요소를 순회할 수 있음
```java
public class example{
    public static void main(String[] args) {
        int intArray[] = {1, 3, 5, 7, 9};
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }
}
```
### for-each
가독성이 개성된 반복문으로, 배열 및 Collections에서 사용가능

index에서 대신 직접 요소(elements)에 접근하는 변수를 제공

naturaly ready only (copied value)

```java
public class example{
    public static void main(String[] args){
        int intArray [] = {1, 3, 5, 7, 9};
        
        for (int x: intArray){
            System.out.println(x);
        }
    }
}
```
##  배열의 출력
반복문을 통해서 출력

Arrays.toString(배열): 배열 안의 요소를 [값1, 값2, ...] 형태로 출력

## 배열의 복사
배열은 생성하면 길이를 변경할 수 없기 때문에 더 많은 저장공간이 필요하다면 큰 배열을 생성하고
이전 배열의 값을 복사 해야함

새로운 배열 = Arrays.copyOf(복사하고싶은 배열, 새로운 배열의 크기)

System.arraycopy(Object src, int srcPos, Object dest, int destPos, int length)

## 배열(Array) 응용
### 최대값, 최솟값 찾기
```java
public class example{
    public static void main(String[] args){
        int[] intArray = {3, 27, 13, 8, 235, 7, 22, 9, 435, 31, 54};
        
//        1. 주어진 수의 범위 내에서 지정
//        int min = 1000;
//        int max = 0;
        
//        2. int형 중에서 최대, 최소 값으로 지정
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
//        3. 배열의 가장 첫번째 원소로 초기화
//        int min = nums[0];
//        int max = nums[0];
        
        for(int num: intArray) {
            if(num>max) {
                max = num;
            }
            if(num<min) {
                min = num;
            }
        }
        System.out.printf("min: %d, max: %d%n", min, max);
    }
}
```
### 구간합 계산하기
구간합: 주어진 배열에서 두 수 N, M이 주어질 때 N번 인덱스부터 M번 인덱스까지의 합 구하기
(단, 항상 N<=M)

### 빈도수 구하기
