package recursion.basic_Questions;

//public class sumOfFirstNNaturalNumbers {
//    public static void sum(int n) {
//        int sum = 0;
//        for (int i = 1; i <= n; i++) {
//            sum += i;
//        }
//        System.out.println(sum);
//
//    }
//    public static void main(String[] args) {
//        int n = 5;
//        sum(n);
//    }
//}

public class sumOfFirstNNaturalNumbers {
    public static void sum(int i, int n, int sum) {

        if (i == n) {
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        sum(i + 1, n, sum);


    }

    public static void main(String[] args) {
        sum(1, 5, 0);
    }
}
