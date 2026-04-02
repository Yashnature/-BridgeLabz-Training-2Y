import java.util.Scanner;

public class DynamicDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int num=sc.nextInt();
        int max=10,index=0;
        int[] d=new int[max];

        while(num!=0){
            if(index==max){
                max+=10;
                int[] t=new int[max];
                for(int i=0;i<d.length;i++) t[i]=d[i];
                d=t;
            }
            d[index++]=num%10;
            num/=10;
        }

        int largest=0,second=0;

        for(int i=0;i<index;i++){
            if(d[i]>largest){
                second=largest;
                largest=d[i];
            }else if(d[i]>second && d[i]!=largest){
                second=d[i];
            }
        }

        System.out.println(largest+" "+second);
    }
}
