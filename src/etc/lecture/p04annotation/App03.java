package etc.lecture.p04annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@MyAnnotation03
public class App03 {
    @MyAnnotation03
    private int val;

    @MyAnnotation03
    App03() {

    }

    @MyAnnotation03
    public void method(@MyAnnotation03 int param) {
        @MyAnnotation03
        int value;

    }
}

// @Target: Annotation 적용 대상
@Target({
        ElementType.CONSTRUCTOR,
        ElementType.METHOD,
        ElementType.FIELD,
        ElementType.PARAMETER,
        ElementType.LOCAL_VARIABLE,
        ElementType.TYPE})
// @Retention: 유지정책 (얼마나 유지할 것인지) / RUNTIME: 프로그램 실행하는동안
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation03 {

}
