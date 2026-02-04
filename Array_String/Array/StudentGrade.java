import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        double[][] m=new double[n][3];
        double[] per=new double[n];
        String[] g=new String[n];

        for(int i=0;i<n;i++){
            for(int j=0;j<3;j++){
                m[i][j]=sc.nextDouble();
                if(m[i][j]<0){j--;}
            }
        }

        for(int i=0;i<n;i++){
            per[i]=(m[i][0]+m[i][1]+m[i][2])/3;

            if(per[i]>=90) g[i]="A";
            else if(per[i]>=75) g[i]="B";
            else if(per[i]>=60) g[i]="C";
            else g[i]="D";

            System.out.println(per[i]+" "+g[i]);
        }
    }
}
