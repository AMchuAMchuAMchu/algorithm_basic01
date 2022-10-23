package com.atguigu.basic01;

import org.junit.Test;

/**
 * Description ==> TODO
 * BelongsProject ==> algorithm_basic01
 * BelongsPackage ==> com.atguigu.basic01
 * Version ==> 1.0
 * CreateTime ==> 2022-10-03 14:04:26
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
public class _02_xorOrBit {


    @Test
    public void testInfinityAndNaN(){





    }

    @Test
    public void testBit(){

        int num01 = 3>>2;//0

        int num02 = 3<<2;//12

        int num03 = ~3;//-4 四步:变成正数之后取反 -> 再减一 -> 再取反 -> 转为正数之后加一

        System.out.println("num01 >> "+num01);

        System.out.println("num02 >> "+num02);

        System.out.println("num03 >> "+num03);



    }

    @Test
    public void testXor(){

        int num01 = 3&4;//0

        int num02 = 3|4;//7

        int num03 = 3^4;//7

        System.out.println("num01 >> "+num01);

        System.out.println("num02 >> "+num02);

        System.out.println("num03 >> "+num03);


    }

}
