import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        String s=sc.next();
        int[] f=new int[10];

        for(int i=0;i<s.length();i++){
            f[s.charAt(i)-'0']++;
        }

        for(int i=0;i<10;i++){
            System.out.println(i+" "+f[i]);
        }
    }
}
