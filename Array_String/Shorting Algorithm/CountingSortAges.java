import java.util.Scanner;

public class CountingSortAges {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] ages = new int[n];

        for (int i = 0; i < n; i++) {
            ages[i] = sc.nextInt();
        }

        int min = 10;
        int max = 18;

        int[] count = new int[max - min + 1];

        for (int i = 0; i < n; i++) {
            count[ages[i] - min]++;
        }

        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        int[] output = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            output[count[ages[i] - min] - 1] = ages[i];
            count[ages[i] - min]--;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(output[i] + " ");
        }
    }
}
