public class Main {
    public static void main(String[] args) {
        int start = 5;
        int end = 100;

        long sum = (end - start + 1) * (end + start) / 2;

        System.out.println(sum);
    }
}