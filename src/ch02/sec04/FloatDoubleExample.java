package ch02.sec04;

public class FloatDoubleExample {
    //* Reference : [Book. 이것이 자바다] p.49
    public static void main(String[] args) {

        float var1 = 0.1234567890123456789f;
        double var2 = 0.1234567890123456789;
        System.out.println("var1 = " + var1);
        System.out.println("var2 = " + var2);

        //10의 거듭제곱 리터럴
        double var3 = 3e6;
        double var32 = 3E6;
        double var33 = 3.0 * 1000000;

        float var4 = 3e6F;
        float var41 = 3E6F;
        float var42 = 3.0F * 1000000;

        double var5 = 2e-3;
        System.out.println("var3 = " + var3);
        System.out.println("var4 = " + var4);
        System.out.println("var5 = " + var5);


    }
}
