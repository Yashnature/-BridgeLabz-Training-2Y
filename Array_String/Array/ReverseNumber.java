import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int num=sc.nextInt();
        String s=""+num;
        int n=s.length();
        int[] a=new int[n];

        for(int i=0;i<n;i++) a[i]=s.charAt(i)-'0';

        for(int i=n-1;i>=0;i--) System.out.print(a[i]);
    }
}
