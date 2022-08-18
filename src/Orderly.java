import java.util.Scanner;
public class Orderly {
    public static void main(String[] args) {
        int []x=new int [5];
        Scanner scan = new Scanner(System.in);
        for (int i=0; i<5; i++){
            x[i]=scan.nextInt();
        }
        Boolean orderly=true;
        for (int i=0; i<4; i++){
            if (x[i]>x[i+1]){
                orderly=false;
                break;
            }
        }
        System.out.println("x is orderly = " + orderly);
    }
}

