import java.util.Scanner;
public class s {
    public static void main(String[] args) {
        int[]x=new int[8];
        Scanner scan = new Scanner(System.in);
        for (int i=0; i<8; i++){
            x[i]=scan.nextInt();
        }
        Boolean isrepeat = false;
        for (int i=0; i<7; i++){
            for (int j=i+1; j<8; j++){
                if (x[i]==x[j]){
                    isrepeat = true;
                    break;
                }
            }
            if(isrepeat)
            System.out.println("array has repeat elements= "+ isrepeat);
        }
    }
}
