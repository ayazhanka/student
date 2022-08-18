public class rec {
    public static  int rec(int n){
        if (n==1){
            return 1;
        }
        return  n+rec(n-1);
    }

    public static void main(String[] args) {
        int sum;
        sum = rec(10);
        System.out.println(sum);
    }
}
