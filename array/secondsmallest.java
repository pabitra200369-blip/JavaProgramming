package array;

public class secondsmallest {
    public static void main(String[] args) {
        int a[] = {1,2,1,3,2,4};
        int min = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for(int i=0; i<a.length; i++) {
            if(a[i] < min) {
                second = min;
                min = a[i];
                } else if(a[i] < second && a[i] != min) {
                second = a[i];
                }
            }
            System.out.println(second);
        }
    }

