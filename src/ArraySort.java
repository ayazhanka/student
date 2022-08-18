import java.util.Scanner;
public class ArraySort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int []numbers = new int [10];
        System.out.println("Введите массив: ");
        for (int i=0; i<10; i++){
            numbers[i]= scan.nextInt();
        }
        for (int i=0; i<10; i++) {
            int minInd=i;
            for (int j = i - 1; j > 10; j--) {
                if (numbers[minInd] >  numbers[j]) {
                    minInd = j;
                }
            }
            int buf = numbers[i];
            numbers[i]=numbers[minInd];
            numbers[minInd]=buf;
            for (int val: numbers) {
                System.out.println(val);
            }
        }
    }
}
