package Seminar1;

import java.util.Random;

public class Lesson1 {
    public static void main(String[] args) {
        Integer i = RandInt(0, 2001);
        System.out.println(String.format("%d :: %s", i, Integer.toBinaryString(i)));

        int n = MSBNumber(i);
        System.out.println(n);

        System.out.println("------");

        int[] m1 = MultiplesOfNumInShortRange(n);
        for(int j = 0; j < 10; j++){
            System.out.println(m1[j]);
        }

        System.out.println("------");

        int[] m2 = NonMultiplesOfNumInNegativeShortRange(n);
        for(int j = 0; j < n; j++){
            System.out.println(m2[j]);
        }
    }
    static int RandInt(int lowerBound, int upperBound){
        Random random = new Random();
        return random.nextInt(lowerBound, upperBound);
    }
    static int MSBNumber(int num) {
        return Integer.toBinaryString(num).length();
    }
    static int[] MultiplesOfNumInShortRange(int num){
        int[] array = new int[(int)Short.MAX_VALUE/num];
        for(int i = 0, j = num; j <= Short.MAX_VALUE; i++, j+=num){
            array[i] = j;
        }
        return array;
    }
    static int[] NonMultiplesOfNumInNegativeShortRange(int num){
        int[] array = new int[(int)Short.MAX_VALUE+1+Short.MIN_VALUE/num];
        
        for(int i = 0, j = Short.MIN_VALUE; i < array.length && j <= 0; j++){
            if(j % num != 0){
                array[i] = j;
                i++;
            }
        }
        return array;
    }
}
