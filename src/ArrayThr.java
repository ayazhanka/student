public class ArrayThr {
    public static void main(String[] args) {
        System.out.println("Массив рандомных цифр: ");
        int n=5;
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
        for (int j = 0; j < n; j++) {
            temp[j]=a[j][n-1];
        }

        //заменяем отсортированную часть то есть промежуточный массив в
        // последнюю строку матрицы
        System.out.println("Ваш результат");
        for (int j = 0; j < n; j++) {
            a[j][n-1] = temp[j];
        }
        double average=0;
        int sum=0;
        for (int val: temp) {
            System.out.println(val);
        }
        for (int j=0; j<n; j++){
            sum += temp[j];
            average = sum / n;
            System.out.println(average);
        }
    }
}
