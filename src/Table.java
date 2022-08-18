import java.util.Scanner;
public class Table {
    public static void main(String[] args) {
        String [] goods = new String[5];
        Scanner scan = new Scanner(System.in);
        for (int i=0; i<5; i++){
            goods[i]=scan.nextLine();
        }
        for (int i=1; i<5; i++){
            if (goods[0].equals(goods[i])){
                System.out.println("is repeat");
                goods[0]=null;
                break;
            }
        }
    }
}
