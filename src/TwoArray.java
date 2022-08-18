import java.util.Scanner;
public class TwoArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [][] array= new int [3][4];
        System.out.println("Введите двумерный массив: ");
        for (int i=0; i<3; i++){
            for (int j=0; j<4; j++) {
                array[i][j] = scan.nextInt();
            }
        }
        System.out.println("Ваш массив: ");

        for (int i=0; i<3; i++) {
            for (int j = 0; j < 4; j++) {
                int maxIndI = i;
                int maxIndJ = j;
                for (int i1 = i + 1; i1 < 3; i++) {
                    for (int j1 = j + 1; j1 < 4; j++) {
                        if (!(i == i1 && j == j1) && array[i1][j1] > array[maxIndI][maxIndI]) {
                            maxIndI = i;
                            maxIndJ = j;
                        }
                    }
                }
                int buf = array[i][j];
                array[i][j] = array[maxIndI][maxIndI];
                array[maxIndI][maxIndI] = buf;
            }
        }
        for (int i=0; i<3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
