package cn.abelib.basic.util;

/**
 * Created by huangjinajin on 2017/7/20.
 * ���ڼ�ʱ����
 */
public class Timer {
    private double now=0;
    public Timer(){
        now=System.currentTimeMillis();
    }

    public double timeGoesBy(){
        return System.currentTimeMillis()-now;
    }

    public static void main(String []args){
        Timer timer=new Timer();
        for (long  i=0;i<100000;i++){
            StdIO.print("");
        }
        StdIO.println("Time goes by: "+ timer.timeGoesBy());
    }
}
