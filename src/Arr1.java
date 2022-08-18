public class Arr1 {
    public static void main(String[] args) {
        System.out.println("Массив рандомных цифр: ");
        int n=7;
        int[][] a = new int[n][n];
        int z = 10;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = (int) (Math.random() * z);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        int[] temp = new int[n];
        for (int i = 0; i < n; i++) {
            temp[i]=a[n-1][i];
        }
        temp = bubbleSort(temp);
        temp = bubbleSort(temp);

        //заменяем отсортированную часть то есть промежуточный массив в
        // последнюю строку матрицы
        System.out.println("Ваш результат");
        for (int i = 0; i < n; i++) {
            a[n-1][i] = temp[i];
        }

        //вывод на экран результата
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + "  ");
            }
            System.out.println();
        }



    }

    //сортировка пузырьком
    private static int[] bubbleSort(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            boolean sorted = true;
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int buf = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = buf;
                    sorted = false;
                }
            }
            if (sorted) {
                break;
            }
        }
        return array;
    }
}
