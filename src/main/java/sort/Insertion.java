package sort;


import static sort.model.Example.exch;
import static sort.model.Example.less;

/**
 * 插入排序
 */
public class Insertion {
    public static void sort(Comparable[] a){
        //将a[]按升序排列
        int N=a.length;
        for(int i=1;i<N;i++){
            //将a[i]插入a[i-1]、a[i-2]、a[i-3]...之中
            for(int j=i;j>0 && less(a[j],a[j-1]);j--){
                exch(a,j,j-1);
            }
        }
    }
}
