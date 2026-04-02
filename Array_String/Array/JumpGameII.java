import java.util.Scanner;

public class JumpGameII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        if (n <= 1) {
            System.out.println(0);
            return;
        }

        int jumps = 0;
        int currEnd = 0;
        int currFar = 0;

        for (int i = 0; i < n - 1; i++) {
            currFar = Math.max(currFar, i + nums[i]);

            if (i == currEnd) {
                jumps++;
                currEnd = currFar;
            }
        }

        System.out.println(jumps);
    }
}
