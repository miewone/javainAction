# 람다 
## 람다란 무엇인가?

- 익명
  - 보통의 메서드와 달리 이름이 없으므로 익명이라 표현
- 함수
  - 람다는 메서드처럼 특정 클래스에 종속되지 않으므로 함수라고 부른다. 하지만 메서드처럼 파라미터 리스트, 바이, 반화 ㄴ형식, 가능한 예외 리스트를 포함한다.
- 전달
  - 람다 표현식을 메서드 인수로 전달하거나 변수로 저장할 수 있다.
- 간결성
  - 익명 클래스처럼 많은 자질구레한 코드를 구현할 필요가 없다.

### 람다 형식

`(Apple a1, Apple a2) -> a1.getWeight().compareTo(a2.getWeight());`

- `(Apple a1, Apple a2)` 람다 파라미터
  - comparator의 compare 메서드 파라미터

- `->` 화살표
  - 화살표는 람다의 파라미터 리스트와 바디를 구분한다.

- `a1.getWeight().compareTo(a2.getWeight());` 람다 바디
  - 두 사과의 무게를 비교한다. 람다의 반환값에 해당하느 표현식이다.

### 자바 8의 유효한 람다 표현식

#### 표현식 스타일 람다 

기본문법

- `(parameters) -> expression`

블록 스타일

- `(parameters) -> {statements;}`

`(String s) -> s.length()`

String 형식의 파라미터 하나를 가지며 int를 반환한다.
람다 표현식에는 return이 함축되어 있으므로 return 문을 명시적으로 사용하지 않아도 된다.
<hr/>

`(Apple a) -> a.getWeight() > 150`

Apple 형식의 파라미터 하나를 가지며 boolean을 반환한다.
<hr/>

```java
(int x,int y) -> {
    System.out.println("Result:");
    System.out.println(x+y);
}
```

int 형식의 파라미터 두 개를 가지며 리턴값이 없다.(void return).
이 예제에서 볼 수 있듯이 람다 표현식은 여러 행의 문장을 포함할 수 있다.
<hr/>

`() -> 42` = 파라미터가 없으며 int 42를 반환한다.

<hr/>

`(Apple a1,Apple a2) -> a1.getWeight().compareTo(a2.getWeight());`

Apple 형식의 파라미터 두개를 가지며 int를 반환한다.

## 함수 디스크립터

함수형 인터페이스의 추상 메서드 시그니처는 람다 표현식의 시그니처를 가리킨다.

람다 표현식의 시그니처를 서술하는 메서드를 `함수 디스크립터`라고 부른다.

`()-> void` 표기는 파라미터 리스트가 없으며 void를 반환하는 함수를 의미한다.