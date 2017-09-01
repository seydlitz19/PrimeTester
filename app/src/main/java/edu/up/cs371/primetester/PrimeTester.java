package edu.up.cs371.primetester;

/**
 * Created by vegdahl on 7/17/2015.
 *
 * The purpose of this class is to define a static method, isPrime, that determines whether an
 * integer is a prime number.
 */
public class PrimeTester {
    /**
     * Tells whether an integer is prime.
     *
     * @param n the number to test
     * @return true iff n is prime
     */
    public static boolean isPrime(long n) {
        // if it is prime, say it is prime
        for (long m = 2; m < n; m++) {
            if (n%m==0) {
                return false;
            }
        }
        if(n==0||n==1) {
            return false;
        }
        return true;
        //this was the previous code, which generated a random answer
        //return Math.random() > 0.5;
    }
}
