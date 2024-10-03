package pac;
import java.util.Scanner;

/**
 * Клас Fibon призначений для чисел Фібоначчі.
 * Також присутній конструктор та методи доступу до порядкового номера n та значення числа.
 */
class Fibon {
    private int n;
    private long fibNum;

    /** Конструктор
     *
     * @param n порядковий номер числа
     * @param fibNum значення числа Фібоначчі
     */
    public Fibon(int n, long fibNum) {
        this.n = n;
        this.fibNum = fibNum;
    }

    /** Обчислення значення Фібоначчі
     *
     * @param n порядковий номер числа
     * @return наступне число в ряді Фібоначчі
     */
    public static long calculateFib(int n) {
        if (n <= 0) {
            return 0;
        }
        else if (n == 1) {
            return 1;
        }
        else {
            long a = 0, b = 1, c = 0;
            for (int i = 2; i <= n; i++) {
                c = a + b;
                if (c < 0)
                {
                    System.out.println("Переповнення при обчисленні");
                    return -1;
                }
                a = b;
                b = c;
            }
            return c;
        }
    }

    /** Метод для перевірки чи задовольняє наше число умову N<1.75^N
     * @return <True> якщо задовольняє умову
     */
    public boolean isLess1_75() {
        return fibNum < Math.pow(1.75, n);
    }

    /** Метод для отримання значення числа
     * @return значення числа
     */
    public long getFibNum() {
        return fibNum;
    }
}
