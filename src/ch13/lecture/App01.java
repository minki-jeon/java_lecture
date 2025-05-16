package ch13.lecture;

public class App01 {
    public static void main(String[] args) {
        Box01 box = new Box01();
//        box.setItem(99);
//        Integer v = box.getItem();
//        System.out.println("v = " + v);

        box.setItem(3.14);  // double auto-boxing -> Double => Integer 타입에서는 불가 (상속관계 x)
//        box.setItem(99);        // int auto-boxing -> Integer => Double 타입에서는 불가 (상속관계 x)
    }
}

class Box01 {
    //    private Integer item;
    private Double item;

    //    public Integer getItem() {
    public Double getItem() {
        return item;
    }

    //    public void setItem(Integer item) {
    public void setItem(Double item) {
        this.item = item;
    }
}
