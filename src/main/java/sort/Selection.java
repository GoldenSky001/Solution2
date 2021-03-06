package sort;


import static sort.model.Example.exch;
import static sort.model.Example.less;

/**
 * 选择排序
 */
public class Selection {
    public static void sort(Comparable[] a){
        //将a[]按升序排列
        int N=a.length;
        for(int i=0;i<N;i++){
            //将a[i]和a[i+1...N]中最小的元素交换
            int min=i;
            for(int j=i+1;j<N;j++){
                if(less(a[j],a[min])) min=j;
            }
            exch(a,i,min);
        }
    }
}
