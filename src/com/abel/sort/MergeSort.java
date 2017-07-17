package com.abel.sort;

/**
 * Created by huangjinajin on 2017/7/17.
 */
public class MergeSort extends BasicSort {
    protected Comparable [] extra;
//    sort from top to bottom
    @Override
    public void sort(Comparable[] a) {
        extra=new Comparable[a.length];
        sort(a, 0, a.length-1);
    }
//    sort from bottom to top
    public void sortbu(Comparable[] a){
        extra=new Comparable[a.length];
        for( int sz=1;sz<a.length;sz+=sz){
            for(int low=0; low<a.length-sz; low+=sz+sz){
                merge(a, low, low+sz-1,Math.min(low+sz+sz-1,a.length-1));
            }
        }
    }
    protected void sort(Comparable[] a, int low, int high) {
        if (low>=high)
            return;
        int mid=low+(high-low)/2;
        sort(a, low,mid);
        sort(a, mid+1, high);
        if (mid<=mid+1)
            return;
        merge(a, low, mid, high);
    }

    protected void merge(Comparable[] a, int low, int mid, int high){
        int i=low, j=mid+1;
        for(int k=low;k<=high;k++)
            extra[k]=a[k];
        for(int k=low;k<=high;k++)
//            left array is empty
            if(i>mid)
                a[k]=extra[j++];
//            right array is empty
            else if (j>high)
                a[k]=extra[i++];
//            select the smaller item between the first item of two array
            else if (less(extra[j], extra[i]))
                a[k]=extra[j++];
            else
                a[k]=extra[i++];
    }
    public static void main(String args[]){
        String[] a={"as","bc","de","zz","jk","hk","hk","hj"};
        MergeSort merge=new MergeSort();
        merge.sortbu(a);
        if(merge.isSorted(a))
            merge.show(a);
    }
}
