package com.sebitza.javaexercises.controlflow.ex_23;

public class NumberToWords {
    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        } else {
            int revnr = reverse(number);
            if (revnr == 0) {
                System.out.println("Zero");
            }
            int count = getDigitCount(number);
            int revct = getDigitCount(revnr);
            while (revnr != 0) {
                int digit = revnr % 10;
                switch (digit) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                }
                revnr /= 10;
            }
            for (int i = 0; i < (count - revct); i++) {
                System.out.println("Zero");
            }
        }
    }

    public static int reverse(int number) {
        int revnr = 0;
        while (number != 0) {
            int digit = number % 10;
            revnr *= 10;
            revnr += digit;
            number /= 10;
        }
        return revnr;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        int count = 0;
        if (number > 0) {
            while (number != 0) {
                count++;
                number /= 10;
            }
        } else {
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(getDigitCount(5200));
        System.out.println(reverse(100));
        numberToWords(1000);
    }
}
