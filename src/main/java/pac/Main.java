package pac;
import java.util.Scanner;

/** Основний клас Main.
 *  Користувач вводить порядковий номер n.
 *  Обчислюємо значення числа Фібоначчі перед створенням об'єкта.
 */
public class Main {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введіть номер числа Фібоначчі (n): ");
        n = scan.nextInt();

        long fibNum = Fibon.calculateFib(n);
        Fibon fibon = new Fibon(n, fibNum);

        if (fibon.getFibNum() == -1) {
            System.out.println("Число Фібоначчі для " + n + " занадто велике для типу long.");
        }

        if (fibon.getFibNum() >= 0)
        {
            System.out.println("Число Фібоначчі за номером " + n + ": " + fibon.getFibNum());
            if (fibon.isLess1_75()) {
                System.out.println("Число Фібоначчі за номером " + n + " менше за 1.75^" + n);
            }
            else {
                System.out.println("Число Фібоначчі за номером " + n + " не менше за 1.75^" + n);
            }
        }
    }
}