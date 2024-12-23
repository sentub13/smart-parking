package payment.com.example.payment.demo.Tutorial;

import java.util.ArrayList;

public class Tutorial {
    //  Implement Fibonacci Sequence
    public static int fibonacci(int n){
        if(n < 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
        // return fibonacci(num - 1) + fibonacci(num - 2);
    }

    //  Remove duplicates from an array string
    public static void getMinimumNum() {
        int[] nums = {3, 0, 9, 8, 5, 1};
        int minimum = Integer.MAX_VALUE;;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] < minimum){
                minimum = nums[i];
            }
        }
        System.out.println("minimum-----"+ minimum);
    }

    //  Remove duplicates from an array string
    public static void getMaximamNum () {
        int[] nums = {4, 2, 6, 8, 10};
        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > max){
                max = nums[i];
            }
        }
        System.out.println("max----"+ max);
    }

    //  Check if the string is palindrome
    public static void checkPalindrome() {
        System.out.println(("----"));
        String str = "elle";
        Boolean isPalindrome = true;
        int j = str.length()-1;

        for (int i = 0; i < str.length()/2; i++) {
            if (str.charAt(i) != str.charAt(j)){
                isPalindrome = false;
                break;
            }
            j--;
        }
        System.out.println("isPalindrome====" + isPalindrome);
    }

    //  Remove duplicates from an array string
    public static void removeDuplicateString() {
        String[] num = {"apple", "Lemon", "banana", "cherry", "Lemon", "guava", "apple", "Orange"};
        ArrayList<String> uniqueList = new ArrayList<>();
        for (int i = 0; i < num.length; i++) {
            if (!uniqueList.contains(num[i])) {
                uniqueList.add(num[i]);
            }
        }
        System.out.println("==="+ uniqueList);
    }

    public static void swapTwoNum() {
        int a = 10;
        int b = 20;
        a = a + b;
        b = a - b;
        a = a - b;

        int x = 10;
        int y = 20;
        int z;

        z = x;
        x = y;
        y = z;

        System.out.println(a +"--"+ b);
        System.out.println(x + "--" + y + "--" + z);
    }

    // To find longest word from a string using custom code
    public static void longestWord() {
        String str = "Priya is a good girl and having hardworking skills";
        String longStr = "";
        String[] words = str.split(" ");

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > longStr.length()) {
                longStr = words[i];
            }
        }
        System.out.println("Longest Word ====" + longStr); // output: hardworking
    }

    // String reverse without in build method
    public static void reverseString() {
        String str = "Hello World";
        String reverStr = "";
        for (int i = str.length()-1; i >= 0; i--) {
            reverStr += str.charAt(i);
        }
        System.out.println("Reverse String === " + reverStr); // output: dlroW olleH
    }
}
