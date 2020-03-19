package annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) //Annotation이 진행기간. runtime -> 생성생성주기와 동일
@Target(ElementType.TYPE)           // Annotation을 붙일수 있는 타입.
@interface TypeAnnotation{  // Type이라는 Annotation
    String name();        //속성명  name = name -> vlaue = (나중에 지정될값)
    int value();          //속성명  name = vlaue -> vlaue = (나중에 지정될값)
    //value속성값은 생략이 가능.(필수 속성값)

}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MathodAnnotation{
    String name();
    int value();
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.PARAMETER)
@interface ParamAnnotation{
    String name();
    int value();
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD) //멤버변수
@interface FieldAnnotation{
    String name();
    int value();
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD) //멤버변수
@interface Field2Annotation{
    String name();
    int value();
}

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.METHOD,ElementType.PARAMETER,ElementType.FIELD})
@interface AllAnnotation{
    String id();
    String pw();
}

//key명이 value 일때는 사용시, key명을 생략할수 있다.
//value key의 값을 꼭 지정해야 하며, default를 이용 할 수 있다.
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface ValueAnnotation{
    String value();
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface ValueAnnotation2{
    String value() default "";
}

public class Annotations {

}