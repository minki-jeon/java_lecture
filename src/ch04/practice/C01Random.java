package ch04.practice;

import java.util.function.Supplier;

public class C01Random {
    private final static Supplier<Integer> RAND_DICE = () -> new RandomSupplier().getRandomDice();

    public static void main(String[] args) {
        // 두 개의 주사위를 돌려서 같은 값이 나오면 "당첨" 출력, 아니면 "다시 돌려보세요" 출력

//        int dice_a = (int) (Math.random() * 6) + 1;
//        int dice_b = (int) (Math.random() * 6) + 1;
        int dice_a = RAND_DICE.get();
        int dice_b = RAND_DICE.get();

        System.out.println("dice_a = " + dice_a);
        System.out.println("dice_b = " + dice_b);

        if (dice_a == dice_b) {
            System.out.println("당첨");
        } else {
            System.out.println("다시 돌려보세요.");
        }
    }

}

class RandomSupplier implements Supplier<Integer> {
    public Integer getRandomDice() {
        return (int) (Math.random() * 6) + 1;
    }

    @Override
    public Integer get() {
        return 0;
    }
}
