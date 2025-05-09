package ch06.lecture.p10capsule;

public class App01 {
    public static void main(String[] args) {
        Car1 car1 = new Car1();
        car1.speed = 100;
        car1.speed = 0;
        car1.speed = -300;

        Car2 car2 = new Car2();
//        car2.speed = 300;     // private field 직접 접근 불가
        car2.setSpeed(100);
        car2.setSpeed(300);
        car2.setSpeed(-300);
        int s = car2.getSpeed();
        System.out.println("s = " + s);
    }
}

class Car1 {
    int speed;
}

class Car2 {
    // field는 private으로
    private int speed;

    // Setter : field 값을 변경하는 메소드를 public으로
    public void setSpeed(int speed) {
        if (speed >= 0 && speed <= 100) {
            this.speed = speed;
        }
    }

    // Getter : field 값을 읽는(얻는) 메소드를 public으로
    public int getSpeed() {
        return this.speed;
    }
}

class Car3 {
    private int speed;
    private String name;

    // setter 만 구현하면 쓰기 전용 필드
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // getter 만 구현하면 읽기 전용 필드
    public String getName() {
        return name;
    }
}
