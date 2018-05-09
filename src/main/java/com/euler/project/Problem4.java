/* Copyright © 2017 EIS Group and/or one of its affiliates. All rights reserved. Unpublished work under U.S. copyright laws.
 * CONFIDENTIAL AND TRADE SECRET INFORMATION. No portion of this work may be copied, distributed, modified, or incorporated into any other media without EIS Group prior written consent. */
package com.euler.project;

import org.testng.annotations.Test;

import java.util.stream.IntStream;


/**
 * @author ikisly
 *  A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 *
 * Analysis: at least one of 3-digit must divide by 11.
 *
 */
public class Problem4 {


    @Test
    public void test() {
        int max = 0;
        int tempI=0,tempJ=0;

      for(int i = 110; i< 1000; i+=11){
          for(int j = 100; j<1000;j++){
              int pp = i*j;
              if(isPalindromic(pp) && pp> max){
                  max = pp;
                  tempI = i;
                  tempJ=j;
              }
          }
      }
      System.out.println(max+ "="+tempI+"*"+tempJ);
    }

    private boolean isPalindromic(int i){
        char[] chars = String.valueOf(i).toCharArray();

        for(int index=0; index<chars.length/2;index++){
            if(chars[index]!=chars[chars.length-index-1]){
                return false;
            }
        }
        return true;
    }
}
