import java.util.Scanner;

public class Assessment {
    public static void main(String[] args) {
        System.out.println(square(5));
        System.out.println(sum(2,4.5));
        System.out.println(average(5));
    }

    public static int square(int number) {
        return number * number;
    }

    public static double sum(int number1, double number2) {
        return number1 + number2;
    }

    public static double average(int[] numbers) {
        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();
        int sum =0;
        for(int i : numbers) userInput += i;
        return ((double) sum)/ numbers.length;
    }
}
