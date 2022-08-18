import java.util.Arrays;
import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int []x = new int[4];
        for (int i=0; i<4; i++){
            x[i]=scan.nextInt();
        }
        int max=x[0];
        int Ind=0;
        for (int i=0; i<4; i++){
            if (max<x[i]){
                Ind=i;
                max=x[i];
            }
        }
        x[Ind]=x[4-1];
        x[4-1]=max;
        for (int value:x) {
            System.out.println(value);
        }

    }
}
