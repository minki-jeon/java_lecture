package ch07.lecture.p03polymorphism;

public class App04 {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.walk();
        hero.pickWeapon(new Gun());
        hero.attack();

        hero.walk();
        hero.pickWeapon(new Sword());
        hero.attack();

        hero.walk();
        hero.pickWeapon(new Bow());
        hero.attack();

    }
}

class Weapon {
    public void use() {
        System.out.println("무기를 사용합니다.");
    }
}

class Sword extends Weapon {
    @Override
    public void use() {
        System.out.println("검을 휘두릅니다.");
    }
}

class Gun extends Weapon {
    @Override
    public void use() {
        System.out.println("총을 쏩니다.");
    }
}

class Bow extends Weapon {
    @Override
    public void use() {
        System.out.println("활을 쏩니다.");
    }
}

class Hero {
    private Weapon weapon;

    public void pickWeapon(Weapon weapon) {
        System.out.println("무기를 얻고 교체합니다.");
        this.weapon = weapon;
    }

    public void attack() {
        System.out.println("공격합니다.");
        weapon.use();
    }

    public void walk() {
        System.out.println("걸어갑니다.");
    }
}
