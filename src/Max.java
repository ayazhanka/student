import java.sql.SQLOutput;
import java.util.Scanner;
public class Max {
    public static void main(String[] args) {
        int []x=new int[5];
        Scanner scan = new Scanner(System.in);
        for (int j=0; j<5; j++){
            x[j]=scan.nextInt();
        }
        int max=x[0];
        int i=1;
        int count=0;
        while (i<5){
            if (x[i]>max){
                max=x[i];
            }
            i=i+2;
        }
        for (int j=1; j<5; j=j+2){
            if(x[j]==max){
                count ++ ;
            }
        }
        System.out.print(count);

    }
}
