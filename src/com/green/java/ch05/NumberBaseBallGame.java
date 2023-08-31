package com.green.java.ch05;

import java.util.Arrays;
import java.util.Scanner;

public class NumberBaseBallGame {
    public static void main(String[] args) {
        final int NUMBER_COUNT=3;
        int[] numArr=getRandomNumberArr(NUMBER_COUNT);
        System.out.println(Arrays.toString(numArr));

        Scanner scan=new Scanner(System.in);
        System.out.println("[Game Start]");
        int count=0;
        while(true) {
            int[] myArr=new int[NUMBER_COUNT];

            for (int i = 0; i < NUMBER_COUNT; i++) {
                System.out.printf("%d번숫자를 입력",i+1);
                myArr[i]=scan.nextInt();
            }
            ++count;
            int s=0,b=0,o=0;
            for (int i = 0; i < NUMBER_COUNT; i++) {
                for (int z = 0; z < NUMBER_COUNT; z++) {
                    if (numArr[i] == myArr[z]) {
                        if (i == z) {
                            s++;
                        } else {
                            b++;
                        }
                    }
                }
            }
            o = NUMBER_COUNT - (s + b);
            System.out.printf("S:%d B:%d O:%d\n", s, b, o);
            if(s==NUMBER_COUNT){
                break;
            }
        }
        System.out.println("Game Over");
        System.out.printf("%d번만에 맞췄습니다",count);
    }
    static int[] getRandomNumberArr(int numberCount){
        int[] arr=new int[numberCount];
        int selectedIdx=0;
        Loop:
        while(selectedIdx<arr.length){
            int rVal=getRandomNumberArr2(3,9);

            for(int i=0;i<selectedIdx;i++){         //중복된숫자 찾기
                if(arr[i]==rVal){
                    continue Loop;
                }
            }
            arr[selectedIdx++]=rVal;                //랜덤값을 arr에 저장한다
        }
        return arr;
    }
    static int getRandomNumberArr2(int min,int max){
        return (int)(Math.random()*(max-min+1))+min;
    }
}

