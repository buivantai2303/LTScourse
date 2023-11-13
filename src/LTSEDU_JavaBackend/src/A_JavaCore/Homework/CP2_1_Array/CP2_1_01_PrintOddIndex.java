package A_JavaCore.Homework.CP2_1_Array;
import java.util.Random;
import java.util.Scanner;

public class CP2_1_01_PrintOddIndex {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Array length: ");
        int num = scanner.nextInt();

        String[] arr = new String[num];

        for (int i = 0; i < num; i++){
            Random rand = new Random();
            int ranNum = rand.nextInt(100);
            arr[i] = String.valueOf(ranNum);
        }

        System.out.print("Array full: " );
        for (int i = 0; i < num; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.println("----------------------");
        System.out.print("Odd index in array: ");

        for (int i = 0; i < num; i++){
            if ( i % 2 == 1){
                System.out.print(arr[i] + " ");
            }
        }

        System.out.println();
        System.out.println("----------------------");
        System.out.print("Even index in array: ");

        for (int i = 0; i < num; i++){
            if ( i % 2 == 0){
                System.out.print(arr[i] + " ");
            }
        }
    }
}
