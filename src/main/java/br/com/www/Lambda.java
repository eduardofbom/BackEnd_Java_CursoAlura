package br.com.www;


import br.com.www.interfaces.CheckPalindrome;
import br.com.www.interfaces.ICheck;
import br.com.www.interfaces.IConvert;
import br.com.www.interfaces.IOperation;

public class Lambda {
    public static void main(String[] args) {
        IOperation sum = (a, b) -> a + b;
        System.out.println(sum.execute(2, 3));
        System.out.println(sum.execute(4, 5));
        System.out.println();

        ICheck checkPrime = (a) -> {
            if (a <= 1) return false;
            for (int i = 2; i <= Math.sqrt(a); i++) {
                if (a % i == 0) return false;
            }
            return true;
        };
        System.out.println(checkPrime.execute(11));
        System.out.println(checkPrime.execute(12));
        System.out.println();

        IConvert stringToUpperCase = String::toUpperCase;
        System.out.println(stringToUpperCase.execute("hello"));
        System.out.println(stringToUpperCase.execute("world"));
        System.out.println();

        CheckPalindrome checkPalindrome = (s) -> s.contentEquals(new StringBuilder(s).reverse());
        System.out.println(checkPalindrome.isPalindrome("radar"));
        System.out.println(checkPalindrome.isPalindrome("hello"));
        System.out.println();

    }
}
