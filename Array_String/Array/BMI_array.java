import java.util.Scanner;

public class BMI {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        double[] w=new double[n];
        double[] h=new double[n];
        double[] bmi=new double[n];
        String[] status=new String[n];

        for(int i=0;i<n;i++){
            w[i]=sc.nextDouble();
            h[i]=sc.nextDouble();
        }

        for(int i=0;i<n;i++){
            bmi[i]=w[i]/(h[i]*h[i]);

            if(bmi[i]<18.5) status[i]="Underweight";
            else if(bmi[i]<25) status[i]="Normal";
            else if(bmi[i]<30) status[i]="Overweight";
            else status[i]="Obese";

            System.out.println(w[i]+" "+h[i]+" "+bmi[i]+" "+status[i]);
        }
    }
}
