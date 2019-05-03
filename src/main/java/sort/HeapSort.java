package sort;

import static sort.model.Example.exch;
import static sort.model.Example.less;

/**
 * 堆排序
 */
public class HeapSort {
    //堆排序
    public static void sort(Comparable[] a){
        int N=a.length-1;
        //下面的for循环，让堆变成有序(变成最大堆)
        for(int k=(N-1)/2;k>=0;k--){
            sink(a,k,N);
        }
        //下面代码，相当于最大元素出列，然后得到最末位的元素放到根位置，再进行下沉
        while(N>0){
            exch(a,0,N--);
            sink(a,0,N);
        }
    }

    //下沉（让小的数在最大堆中下沉，保持堆顶就是最大元素）
    private static void sink(Comparable[] a,int k,int N){
        while(2*k+1<=N){
            int j=2*k+1;
            if((j+1)<=N){
                if(j<N && less(a[j],a[j+1])) j++;
            }
            if(!less(a[k],a[j])) break;
            exch(a,k,j);
            k=j;
        }
    }
}
