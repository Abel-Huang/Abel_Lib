package com.main.basic.util;

import java.util.Random;

/**
 * Created by huangjinajin on 2017/7/22.
 * �����������ڲ��Ե�������Լ��������
 *
 * ֵ��ע����Ƕ�������һ�����double�� �䷶Χ��[0,range)
 * ����range�ǲ����������ȡֵ��Χ
 *
 * ���seed��ͬ��ô���ɵ������Ҳ��ͬ
 */
public class RandomData {
    /**
     * @param seed
     * @param range
     * @return random int
     */
    public static int randInt(long seed, int range){
        Random random=new Random(seed);
        return random.nextInt(range);
    }

    /**
     * @param range
     * @return
     */
    public static int randInt(int range){
        long seed=System.currentTimeMillis();
        return randInt(seed, range);
    }

    /** create a random Integer array
     * @param seed
     * @param range
     * @param size
     * @return random Integer array
     */
    public static  Integer[] randIntegerArray(long seed, int range, int size) {
        Random random=new Random(seed);
        Integer [] integerArray=new Integer[size];
        for (int i=0; i<size; i++){
            integerArray[i]=random.nextInt(range);
        }
        return integerArray;
    }

    /**
     * @param range
     * @param size
     * @return
     */
    public static  Integer[] randIntegerArray(int range, int size) {
        long seed = System.currentTimeMillis();
        return randIntegerArray(seed, range, size);
    }

    /**
     * @param seed
     * @return random double
     */
    public static double randDouble(long seed){
        Random random=new Random(seed);
        return random.nextDouble();
    }

    /**
     * @return random double
     */
    public static double randDouble(){
        long seed=System.currentTimeMillis();
        return randDouble(seed);
    }

    /** create a random Double array
     * @param range
     * @param size
     * @return random Double array
     */
    public static  Double[] randDoubleArray(long seed, int range, int size){
        Random random=new Random(seed);
        Double [] doubleArray=new Double[size];
        for (int i=0; i<size; i++){
            doubleArray[i]=random.nextDouble()+random.nextInt(range);
        }
        return doubleArray;
    }

    /**
     * @param range
     * @param size
     * @return
     */
    public static  Double[] randDoubleArray(int range,int size){
        long seed=System.currentTimeMillis();
        return randDoubleArray(seed, range, size);
    }

    /**
     * ���ɲ�����ָ�����ȵ�����ַ���
     * @param seed
     * @param length
     * @param size
     * @return
     */
    public static  String[] randStringArrray(long seed, int length, int size){
        Random random=new Random();
        return null;
    }

}
