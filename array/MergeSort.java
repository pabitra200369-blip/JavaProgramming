package array;

import java.util.Arrays;

class MergeSort {
    public static void main(String[] args) {

        int a[]={9,5,6,1,2,7};

        Arrays.sort(a);

        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
    }
}
