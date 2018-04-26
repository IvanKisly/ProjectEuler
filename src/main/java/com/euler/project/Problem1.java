/* Copyright © 2017 EIS Group and/or one of its affiliates. All rights reserved. Unpublished work under U.S. copyright laws.
 * CONFIDENTIAL AND TRADE SECRET INFORMATION. No portion of this work may be copied, distributed, modified, or incorporated into any other media without EIS Group prior written consent. */
package com.euler.project;

import org.testng.annotations.Test;

import java.util.stream.IntStream;


/**
 * @author ikisly
 *
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 *
 */
public class Problem1 {

    //82 ms
    @Test
    public void test() {
        int sum = IntStream.range(3, 1000).parallel().filter(i-> i%3==0 || i%5==0).sum();
        System.out.println(sum);
    }
}
