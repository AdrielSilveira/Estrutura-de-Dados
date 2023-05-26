package P1;

public class ex_3 {
    public static void main(String[] args) {
        int n = 10; //calculando o décimo termo da série de Fibonacci
        long result = calcularFibonacci(n);
        System.out.println("O " + n + "º termo da série de Fibonacci é: " + result);
    }

    public static long calcularFibonacci(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("O número deve ser maior que zero.");
        }

        if (n == 1 || n == 2) {
            return 1;
        }

        long fibMinus2 = 1;
        long fibMinus1 = 1;
        long fibonacci = 0;

        for (int i = 4; i <= n; i++) {
            fibonacci = fibMinus2 + fibMinus1;
            fibMinus2 = fibMinus1;
            fibMinus1 = fibonacci;
        }

        return fibonacci;
    }
}