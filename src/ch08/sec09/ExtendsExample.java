package ch08.sec09;

public class ExtendsExample {
    //* Reference : [Book. 이것이 자바다] p.369
    public static void main(String[] args) {
        InterfaceCImpl impl = new InterfaceCImpl();

        InterfaceA ia = impl;
        ia.methodA();
//        ia.methodB();
        System.out.println();

        InterfaceB ib = impl;
//        ib.methodA();
        ib.methodB();
        System.out.println();

        InterfaceC ic = impl;
        ic.methodA();
        ic.methodB();
        ic.methodC();
    }
}
