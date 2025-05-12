package ch07.sec04.exam01;

public class ComputerExample {
    //* Reference : [Book. 이것이 자바다] p.296
    public static void main(String[] args) {
        int r = 10;

        Calculator calculator = new Calculator();
        System.out.println("원 면적: " + calculator.areaCirCle(r));
        System.out.println();

        Computer computer = new Computer();
        System.out.println("원 면적: " + computer.areaCirCle(r));
    }
}
