package com.company;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Main {
    public static Map<String, Integer> roman = new HashMap() {
        {
            put("I", 1);
            put("V", 5);
            put("X", 10);
            put("L", 50);
            put("C", 100);
            put("D", 500);
            put("M", 1000);
        }
    };

    public static int minimumRange(int[] numbers, int cover) {
        List<Integer> lista = Arrays.stream(numbers)
                .boxed()
                .toList();
        lista = lista.stream().sorted().toList();
        int initialRange = Integer.MAX_VALUE;
        for (int i = 0; i <= lista.size() - cover; i++) {
            initialRange = Math.min(initialRange, lista.get(i + cover - 1) - lista.get(i));
        }
        return initialRange + 1;
    }
    static int[] bulbsOnAfterOperations(int testCases, int[] bulbs) {
        int[] results = new int[testCases];

        for (int i = 0; i < testCases; i++) {
            int n = bulbs[i];
            results[i] = (int) Math.sqrt(n); // Square root gives the number of factors (pairs)
        }

        return results;
    }

    public static void main(String[] args) {
//        int[] numbers = new int[]{4, 2, 3};
//        List<Integer> lista = Arrays.stream(numbers)
//                .boxed()
//                .collect(Collectors.toList());
//        lista = lista.stream().sorted().collect(Collectors.toList());
//        System.out.println(minimumRange(new int[]{2, 10, 8, 17 ,18 , 19}, 3));
     //   numberOfLight(new int[]{3, 1, 2}, 3);
        int[] result = bulbsOnAfterOperations(3 , new int[]{1,2 ,3, 5});
        System.out.println("");
    }

    static void numberOfLight(int[] bulbs, int opt) {
        List<Integer> primes = generatePrime(opt);
        primes.add(1);
        int numberOfOnLight = 0;
        for (int i = 0; i < bulbs.length; i++) {
            int number = bulbs[i];
            numberOfOnLight = 0;
            for (int b = 1; b < number; b++) {
                if (isOn(b, primes)) {
                    numberOfOnLight++;
                }
            }
            System.out.println(numberOfOnLight);
        }

    }

    static boolean isOn(int number, List<Integer> primes) {
        List<Integer> count = null;
        int indexPrime = 0;
        int indexCount = 0;
        count = new ArrayList<>();
        count.add(0);
        while (true) {
            if (number == 0) {
                break;
            }
            if (indexPrime >= primes.size()) {
                break;
            }
            if (primes.get(indexPrime) > number) {
                break;
            } else {
                if (number % primes.get(indexPrime) == 0) {
                    number = number / primes.get(indexPrime);
                    count.set(indexCount, count.get(indexCount) + 1);
                } else {
                    count.add(0);
                    indexPrime++;
                    indexCount++;
                }
            }
        }
        count = count.stream().filter(c -> c > 0).collect(Collectors.toList());
        int numberOfDivisors = 1;
        for (int z = 0; z < count.size(); z++) {
            numberOfDivisors = numberOfDivisors * (count.get(z) + 1);
        }
        return numberOfDivisors % 2 != 0;
    }

    static boolean isPrime(int n) {
        if (n <= 1)
            return false;

        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }

    // Function to print primes
    static List<Integer> generatePrime(int n) {
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (isPrime(i))
                primes.add(i);
        }
        return primes;
    }


    public int romanToInt(String s) {
        List<Integer> numbers = new ArrayList<>();
        String[] arr = s.split("");
        StringBuilder number = new StringBuilder("");
        for (int i = 0; i < arr.length; i++) {
            if (roman.get(arr[i]) > roman.get(arr[i + 1])) {
                numbers.add(roman.get(arr[i]));
                number = new StringBuilder();
            } else if (Objects.equals(roman.get(arr[i]), roman.get(arr[i + 1]))) {
                number.append(arr[i]);
            } else {

            }
        }
        return 0;
    }


    public static boolean wordPattern(String pattern, String s) {
        Map<String, String> map = new HashMap<>();
        String[] patterns = pattern.split("");
        String[] ss = s.split(" ");
        if (patterns.length != ss.length) return false;
        for (int i = 0; i < patterns.length; i++) {
            if (!map.containsKey(patterns[i])) {
                if (map.containsValue(ss[i])) {
                    return false;
                }
                map.put(patterns[i], ss[i]);
            } else {
                if (!map.get(patterns[i]).equals(ss[i])) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int[] ditgit(int[] digits) {
        digits[digits.length - 1] += 1;
        if (digits[digits.length - 1] > 9) {
            for (int i = digits.length - 1; i > 0; i--) {
                if (digits[i] > 9) {
                    int odd = digits[i] % 10;
                    digits[i] = odd;
                    digits[i - 1] += 1;
                }
            }
            if (digits[0] > 9) {
                int[] newResult = new int[digits.length + 1];
                newResult[0] = 1;
                digits[0] = digits[0] % 10;
                for (int i = 1; i <= digits.length; i++) {
                    newResult[i] = digits[i - 1];
                }
                return newResult;
            }
        } else {
            return digits;
        }
        return digits;
    }
}
