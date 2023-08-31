package com.green.java.ch05;

import java.awt.image.LookupOp;
import java.util.Arrays;

public class ArrayQuiz13 {
    public static void main(String[] args) {

        int[] lottoArr = new int[6];

        setRandomValuArr3(lottoArr);
        System.out.println(Arrays.toString(lottoArr));

        sortArr(lottoArr);
        System.out.println(Arrays.toString(lottoArr));

    }

    public static int getRandomValueFromTo(int sVal, int eVal) {
        return (int) (Math.random() * (eVal - sVal + 1)) + sVal;
    }

    public static void setsetRandomValuArr2(int[] lottoArr) {
        int i = 0;
        Loop:
        while (i < lottoArr.length) {
            int rVal = getRandomValueFromTo(1, 45);
            int z = 0;
            for (; z < lottoArr.length; z++) {
                if (lottoArr[z] == 0) {
                    break;
                } else if (lottoArr[z] == rVal) {
                    continue Loop;
                }
            }
            lottoArr[z] = rVal;
        }
    }

    static void setRandomValuArr(int[] lottoArr) {

        for (int i = 0; i < lottoArr.length; i++) {
            int rVal = getRandomValueFromTo(1, 45);
            for (int z = 0; z < lottoArr.length; z++) {
                if (lottoArr[z] == 0) {
                    lottoArr[z] = rVal;
                    break;
                } else if (lottoArr[z] == rVal) {
                    i--;
                    break;
                }
            }
        }
    }

    public static void setRandomValuArr3(int[] lottoArr) {
        Loop:
        for (int i = 0; i < lottoArr.length; i++) {
            int n = getRandomValueFromTo(1, 45);
            for (int j = 0; j < lottoArr.length; j++) {
                if (lottoArr[j] == 0) {
                    lottoArr[j] = n;
                    break;
                } else if (n == lottoArr[j]) {
                    i--;
                    break;
                }
            }

        }
    }
    public static void sortArr(int[] lottoArr){
        int temp=0;
        for (int i = 0; i < lottoArr.length-1; i++) {
            for (int j = 0; j < lottoArr.length-1-i; j++) {
                if(lottoArr[j]>lottoArr[j+1]){
                    temp=lottoArr[j];
                    lottoArr[j]=lottoArr[j+1];
                    lottoArr[j+1]=temp;
                }
            }
        }
    }
}

