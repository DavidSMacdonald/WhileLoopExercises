package com.company;

public class Main {

    public int addOdds(int n) {
        int i = 1;
        int sum = 0;
        while (i <= n) {
            sum += i;
            i += 2;
        }
        return sum;
    }

    public int sumDigits(int n) {
        int sum = 0;
        while (n>0) {
            sum += n%10;
            n /=10;
        }
        return sum;
    }

    public int howManyYears(double spop, double epop) {
        int i = 0;
        while (spop < epop) {
            // increase by 1.13%
            spop *= 1.0113;
            i++;
        }
        return i;
    }

    public void printSum(int n) {
        int i = 1;
        int sum = 0;
        String Sum = "";
        while (i <= n) {
            sum += i;

            if (i < n) Sum += + i + " + ";
            else Sum += i + " = " + sum;

            i++;
        }
        System.out.println(Sum);
    }

    public boolean isPerfectSquare(int n) {
        int i = 1;
        int sum = 0;
        while (sum < n) {
            sum += i;
            i += 2;
        }
        return sum == n;
    }

    public static void main(String[] args) {
	// write your code here
        Main m = new Main();
        System.out.println(m.addOdds(11));          // 36
        System.out.println(m.addOdds(1));           // 1
        System.out.println(m.addOdds(4));           // 4
        System.out.println();
        System.out.println(m.sumDigits(1244));      // 11
        System.out.println(m.sumDigits(17684));     // 26
        System.out.println(m.sumDigits(44));        // 8
        System.out.println();
        System.out.println(m.howManyYears(111.2, 120));   // 7
        System.out.println(m.howManyYears(111.2, 150));   // 27
        System.out.println(m.howManyYears(150, 150));   // 0
        System.out.println();
        m.printSum(6);      // 1 + 2 + 3 + 4 + 5 + 6 = 21
        m.printSum(8);      // 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 = 36
        m.printSum(3);      // 1 + 2 + 3 = 6
        System.out.println();
        System.out.println(m.isPerfectSquare(25));      // true
        System.out.println(m.isPerfectSquare(49));      // true
        System.out.println(m.isPerfectSquare(24));      // false
        System.out.println(m.isPerfectSquare(50));      // false

    }
}
