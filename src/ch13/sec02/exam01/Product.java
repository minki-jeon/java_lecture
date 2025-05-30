package ch13.sec02.exam01;

public class Product<K, M> {
    //* Reference : [Book. 이것이 자바다] p.575

    private K kind;
    private M model;

    public K getKind() {
        return kind;
    }

    public void setKind(K kind) {
        this.kind = kind;
    }

    public M getModel() {
        return model;
    }

    public void setModel(M model) {
        this.model = model;
    }
}
