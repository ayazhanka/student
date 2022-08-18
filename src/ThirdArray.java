import java.util.Scanner;
public class ThirdArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] a=new int[10];
        for (int i=0; i<10; i++){
            a[i]=scan.nextInt();
        }
        int []b=new int [10];
        for (int j=0; j<10; j++){
            b[j]=scan.nextInt();
        }
        int []c=new int [20];
        for (int i=0; i<20; i++){
            if (i%2 ==0){
                c[i]=a[i/2];
            }else{
                c[i]=b[i/2];
            }
        }
        for (int val: c) {
            System.out.println(val);
        }
    }
}
