package array;

import java.util.Arrays;

class CharSort {
    public static void main(String[] args) {

        char a[]={'R','A','C','D','B'};

        Arrays.sort(a);

        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
    }
}
