package ch18.sec10;

import java.io.Serializable;

public class Member implements Serializable {
    //* Reference : [Book. 이것이 자바다] p.812
    private static final long serialVersionUID = 10L;
    private String id;
    private String name;

    private String address;
    

    public Member(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return id + ": " + name;
    }
}
