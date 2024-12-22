package ch06.sec03;

public class SportsCar {
//Public 클래스는 다른 패키지에서도 사용가능.

}

class Tire { 
//클래스를 소스파일에 중복 선언 하여도 오류는 나지 않는다.
//그러나 하나의 소스파일안에 "공개클래스"(Public)는 하나만 존재할 수 있다.
//default 클래스는 다른 패키지에서 사용 불가능하다. 
//Tire 클래스의 경우 접근제한자가 붙지 않았고, 이 경우 default가 기본적으로 붙게된다.
}
