package recursion.basic_Questions;

public class printNumbersFrom5To1 {
    public static void printNumbers(int num) {
        if(num==0){
            return;
        }
        System.out.println(num);
        printNumbers(num-1);
    }

    public static void main(String[] args) {
        int num = 5;
        printNumbers(num);
    }
}
