package ch06.sec11.exam02;

public class EarthExample {
    //* Reference : [Book. 이것이 자바다] p.258
    public static void main(String[] args) {
        // 상수 호출 (정적 필드 -> 클래스명으로 접근 가능)
        System.out.println("지구의 반지름: " + Earth.EARTH_RADIUS + "km");
        System.out.println("지구의 표면적: " + Earth.EARTH_SURFACE_AREA + "km^2");
    }
}
