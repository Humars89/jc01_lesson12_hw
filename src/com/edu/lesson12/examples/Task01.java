package com.edu.lesson12.examples;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int N = scanner.nextInt();
        scanner.close();

        if (isPrime(N)) {
            System.out.println("Число " + N + " является простым.");
            System.out.println("Сумма всех простых чисел, меньших " + N + ": " + sumOfPrimes(N));
        } else {
            System.out.println("Число " + N + " не является простым.");
        }
    }

    static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++)
            if (num % i == 0) return false;
        return true;
    }

    static int sumOfPrimes(int limit) {
        int sum = 0;
        for (int i = 2; i < limit; i++)
            if (isPrime(i)) sum += i;
        return sum;
    }
}
