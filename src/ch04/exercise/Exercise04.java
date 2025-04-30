package ch04.exercise;

import java.util.ArrayList;

public class Exercise04 {
    //* Reference : [Book. 이것이 자바다] p.140
    public static void main(String[] args) {
        int dice_a;
        int dice_b;
        int[] dice;

        do {
            dice_a = (int) (Math.random() * 6) + 1;
            dice_b = (int) (Math.random() * 6) + 1;
            System.out.println("Result Dice : (" + dice_a + ", " + dice_b + ")");
        } while ((dice_a + dice_b) != 5);
        
        System.out.println("===========================================");

        do {
            dice = randomDice.getDoubleDice();
            System.out.println("Result Dice : (" + dice[0] + ", " + dice[1] + ")");
        } while ((dice[0] + dice[1]) != 5);
    }
}

class randomDice {
    public static int[] getDoubleDice() {
        return new int[]{(int) (Math.random() * 6) + 1, (int) (Math.random() * 6) + 1};
    }
}
