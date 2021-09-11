import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите произвольное положительное число");
        int n = scanner.nextInt();
        if (n < 0){
            System.out.println("Некорректное значение. Введите положительное число");
            return;
        }
        int sum = 0;
        for(int i = 1; i <= n; i++){
            if(i % 2 == 1){
                sum += i;
            }
        }
        System.out.println("Сумма нечетных чисел от 1 до " + n + ": " + sum);
    }
}
