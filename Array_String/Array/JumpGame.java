import java.util.Scanner;

public class JumpGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int reach = 0;

        for (int i = 0; i < n; i++) {
            if (i > reach) {
                System.out.println(false);
                return;
            }

            reach = Math.max(reach, i + nums[i]);
        }

        System.out.println(true);
    }
}
