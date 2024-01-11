import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] list = new int[10];
        for (int i = 0; i < 10; i++) {
            list[i] = i*i;
        }
        System.out.print("Please select a element of the list : ");

        try {
            int element = input.nextInt();
            System.out.println(list[element]);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}