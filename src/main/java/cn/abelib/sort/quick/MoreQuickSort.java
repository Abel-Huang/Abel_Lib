package cn.abelib.sort.quick;

import cn.abelib.sort.BasicSort;
import cn.abelib.sort.InsertionSort;

import java.util.Arrays;
import java.util.Collections;

/**
 * Created by abel-huang on 2017/7/19.
 *
 */
public class MoreQuickSort extends BasicSort {
    private final int TRANS_ARG=5;

    public void sort(Comparable[] a) {
        Collections.shuffle(Arrays.asList(a));
        sort(a, 0, a.length - 1);
    }

    //   ���ڲ���С����ʽ���ò�����������������
    //   ʹ�������з֣������ظ�Ԫ�ص������ٶ�
    private void sort(Comparable []a, int low, int high){
        if (high<=low+TRANS_ARG){
            new InsertionSort().sort(a, low, high);
            return;
        }
        int left=low, right=high, i=low+1;
        Comparable value=a[low];
        while(i<=right){
            int cmp=a[i].compareTo(value);
            if (cmp < 0)
                exchange(a, left++, i++);
            else if (cmp > 0)
                exchange(a, i, right--);
            else
                i++;
        }
        sort(a, low, left-1);
        sort(a, right+1, high);
    }
}
