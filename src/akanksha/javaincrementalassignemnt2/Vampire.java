package akanksha.javaincrementalassignemnt2;

import java.util.Arrays;

public class Vampire {
    private static void swap(char[] arr, int i, int j) {
        char c = arr[i];
        arr[i] = arr[j];
        arr[j] = c;
    }

    // Utility function to reverse a char array between specified indices
    private static void reverse(char[] arr, int i, int j) {
        // do till two end-points intersect
        while (i < j) {
            swap(arr, i++, j--);
        }
    }

    public static int countDigit(int i) {
        int n = i, d = 0;
        while (n > 0) {
            d++;
            n = n / 10;
        }
        return d;
    }

    public static Boolean checkVampire(int num, int N, int digit) {
        int[] arr = new int[digit];
        int n = num;
        for (int i = digit - 1; i >= 0; i--) {
            arr[i] = n % 10;
            n = n / 10;
        }
        int num1 = 0;
        for (int i = 0; i < digit / 2; i++) {
            num1 = arr[i] + num1 * 10;
        }
        int num2 = 0;
        for (int i = digit / 2; i < digit; i++) {
            num2 = arr[i] + num2 * 10;
        }
        if (num1 * num2 == N) {
            int r1 = num1 % 10;
            int r2 = num2 % 10;
            if (r1 == 0 && r2 == 0) {
                return false;
            } else return true;
        } else {
            return false;
        }
    }

    public static void check(int N) {
        int num = N;
        int digits = countDigit(N);
        String str = Integer.toString(num);
        char[] s = str.toCharArray();
        Arrays.sort(s);
        if (digits % 2 == 0) {

            while (true) {
                //System.out.println(String.valueOf(s));
                Boolean x = checkVampire(Integer.parseInt(new String(s)), N, digits);
                if (x == true) {
                    count++;
                    System.out.println(N);
                    return;
                } else {
                    int i = digits - 1;
                    while (s[i - 1] >= s[i]) {
                        // if i is first index of the string, that means we are
                        // already at last possible permutation
                        // (string is sorted in reverse order)
                        if (--i == 0)
                            return;
                    }

                    // find highest index j to the right of index i such that
                    // s[j] > s[i–1] (s[i..n-1] is sorted in reverse order)

                    int j = digits - 1;
                    while (j > i && s[j] <= s[i - 1])
                        j--;

                    // Swap characters at index i-1 with index j
                    swap(s, i - 1, j);

                    // reverse the substring s[i..n-1] and return true
                    reverse(s, i, digits - 1);

                }
            }
        }

    }

    static int count = 0;

    public static void main(String[] args) {
        int i = 1000;
        while (count < 100) {
            int c = countDigit(i);
            if (c % 2 == 0) {
                check(i++);
            }

        }
    }
}
