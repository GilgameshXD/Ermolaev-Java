import java.util.ArrayList;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> multiplesOfThree = new ArrayList<>();

        System.out.println("Enter array elements (enter any non-numeric character to finish):");
        while (sc.hasNextInt()) {
            int num = sc.nextInt();
            if (num % 3 == 0) {
                multiplesOfThree.add(num);
            }
        }

        System.out.println();
        for (int i = 0; i < multiplesOfThree.size(); i++) {
            System.out.print(multiplesOfThree.get(i));
            if (i < multiplesOfThree.size() - 1) {
                System.out.print(" ");
            }
        }

        sc.close();
    }
}
