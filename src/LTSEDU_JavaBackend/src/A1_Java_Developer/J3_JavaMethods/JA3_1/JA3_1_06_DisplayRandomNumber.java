package LTSEDU_JavaBackend.src.A1_Java_Developer.J3_JavaMethods.JA3_1;

import java.util.Random;

public class JA3_1_06_DisplayRandomNumber {
    public static void main(String[] args) {
        System.out.println("Value: " + getRandomNumber());
    }

    static int getRandomNumber (){
        Random random = new Random();
        return random.nextInt();
    }
}
