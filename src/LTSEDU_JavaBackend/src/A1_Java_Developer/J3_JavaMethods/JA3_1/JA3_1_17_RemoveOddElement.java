package LTSEDU_JavaBackend.src.A1_Java_Developer.J3_JavaMethods.JA3_1;

import java.util.ArrayList;

public class JA3_1_17_RemoveOddElement {
    public static void main(String[] args)
    {
        ArrayList<Integer> Numbers = new ArrayList<Integer>();
        Numbers.add(23);
        Numbers.add(32);
        Numbers.add(45);
        Numbers.add(63);

        Numbers.removeIf(n -> (n % 3 == 0));
        for (int i : Numbers) {
            System.out.println(i);
        }
    }
}
