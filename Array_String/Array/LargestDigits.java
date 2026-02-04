import java.util.Scanner;

public class LargestDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[] d = new int[10];
        int i = 0;

        while(num!=0 && i<10){
            d[i++] = num%10;
            num/=10;
        }

        int max=0, second=0;

        for(int j=0;j<i;j++){
            if(d[j]>max){
                second=max;
                max=d[j];
            } else if(d[j]>second && d[j]!=max){
                second=d[j];
            }
        }

        System.out.println(max+" "+second);
    }
}
