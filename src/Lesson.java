import java.util.Scanner;
public class Lesson {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] x = new int [5];
        int n=0;
        for (int i=0; i<5; i++){
            x[i]=scan.nextInt();
        }
        for (int val: x){
            if (val<0){
                System.out.println(val);
            }
        }
    }
}
