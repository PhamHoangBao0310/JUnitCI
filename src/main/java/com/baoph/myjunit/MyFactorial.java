/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.baoph.myjunit;

/**
 *
 * @author DELL
 */
public class MyFactorial {

    public static long getCF(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("n must be from 0 to 20");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return getCF(n - 1) * n;
    }
}
