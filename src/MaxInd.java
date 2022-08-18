import java.util.Scanner;
public class MaxInd {
    public static void main(String[] args) {
        int []x=new int[11];
        Scanner scan = new Scanner(System.in);
        for (int i =0; i<11; i++){
            x[i]=scan.nextInt();
        }
        int max=x[0];
        int maxInd=0;
        for (int i=0; i<10; i++){
            if (max<x[i]){
                max=x[i];
                maxInd=i;
            }
        }
        for (int i=11-1; i>maxInd+1; i--){
            x[i]=x[i-1];
        }
        x[maxInd+1]=maxInd;
        for (int val: x) {
            System.out.println(val);
        }
    }
}
