package org.kyhslam.lambda;

import java.util.Arrays;

public class lambda_0728 {

    public static void main(String[] args) {

        int[] arr = new int[5];


        /*for(int i=0; i < arr.length; i++){
            arr[i] = getRandomNumber(i);
        }*/

        Arrays.setAll(arr, i -> (int)(Math.random()*5) + 1);


        for(int i=0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }



    public static int getRandomNumber(int i){
        return (int) (Math.random()*5) + 1;
    }

}
