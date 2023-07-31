public class Main {
    public static void main(String[] args) {
        int start = 5;
        int end = 100;

        long sum = 0;

        for (int i = start; i <= end; i++){
            sum += i;
        }
        System.out.println(sum);
    }
}