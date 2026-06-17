package array;

public class smallestelement {
    public static void main(String[] args) {
        int a[] = {1,2,1,3,2,4};
        int min = a[0];
        for(int i=1; i<a.length; i++) {
            if(a[i] < min)
                min = a[i];
            }
            System.out.println(min);
        }
    }

