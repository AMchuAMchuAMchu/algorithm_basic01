package com.atguigu.basic01;

import org.junit.Test;

/**
 * Description==>TODO
 * BelongsProject==>algorithm_basic01
 * BelongsPackage==>com.atguigu.basic01
 * CreateTime==>2022-09-12 07:21:43
 * Version==>1.0
 * Author==>02雪乃赤瞳楪祈校条祭制作委员会 wyq_start
 */
public class _01_SwapBoth {


    @Test
    public void test04() {


        
        int num01 = 4 >> 1;//2



        int num02 = 4 << 1;

        int num03 = ~4;


        System.out.println("num01 :"+num01);

        System.out.println("num02 :"+num02);

        System.out.println("num03 :"+num03);


    }

    @Test
    public void test03() {

        int num01 = 10;

        int num02 = 20;

//        System.out.println("交换之前 >> " + num01 + "," + num02);

        num01 = num01 + num02;

        num02 = num01 - num02;

        num01 = num01 - num02;

//        System.out.println("交换之后 >> " + num01 + "," + num02);


    }

    @Test
    public void test02() {

        int num01 = 10;

        int num02 = 20;

//        System.out.println("交换之前 >> " + num01 + "," + num02);

        num01 ^= num02;

        num02 ^= num01;

        num01 ^= num02;

//        System.out.println("交换之后 >> " + num01 + "," + num02);

    }


    @Test
    public void test01() {

        int num01 = 10;

        int num02 = 20;

        int num03;

//        System.out.println("交换之前 >> "+num01+","+num02);

        num03 = num01;

        num01 = num02;

        num02 = num03;

//        System.out.println("交换之后 >> "+num01+","+num02);


    }


}
