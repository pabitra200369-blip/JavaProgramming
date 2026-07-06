package array;

import java.util.Arrays;

class StringSort {
    public static void main(String[] args) {

        String a[]={"Ram","Amar","Cel","David","Bunny"};

        Arrays.sort(a);

        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
    }
}
