package ch13.lecture;

public class App06 {
}

// bounded type parameter
class Box062<T extends String> {
    // T extends String : String 타입과 하위 타입만 받는다.
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public void action() {
        // Object의 메소드 사용 가능
//        String o = (String) item;
//        o.toUpperCase();
        
        // bounded type parameter로 특정 타입의 메소드를 안전하게 사용 가능하다.
        item.toUpperCase();

    }
}


class Box061<T> {
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public void some() {
        // 타입파라미터 item의 메소드는 Object의 메소드만 사용 가능
        System.out.println(item.hashCode());
        System.out.println(item.toString());
        System.out.println(item.equals(null));
    }


}
