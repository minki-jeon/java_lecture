package ch07.exercise.p08;

public class SnowTireExample {
    //* Reference : [Book. 이것이 자바다] p.338
    public static void main(String[] args) {
        SnowTire snowTire = new SnowTire();
        Tire tire = snowTire;

        snowTire.run();
        tire.run();
    }
}
