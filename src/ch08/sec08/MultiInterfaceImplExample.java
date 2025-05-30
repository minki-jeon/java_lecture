package ch08.sec08;

public class MultiInterfaceImplExample {
    //* Reference : [Book. 이것이 자바다] p.366
    public static void main(String[] args) {
        RemoteControl rc = new SmartTelevision();
        // RemoteControl 인터페이스에 선언된 추상 메소드만 호출 가능
        rc.turnOn();
        rc.turnOff();

        Searchable searchable = new SmartTelevision();
        // Searchable 인터페이스에 선언된 추상메소드만 호출 가능
        searchable.search("http://www.youtube.com");
    }
}
