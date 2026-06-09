package array;

public class largestelement {
    public static void main(String[] args) {
        int a[] = {1,2,1,3,2,4};
            int max = a[0];
            for(int i=1; i<a.length; i++) {
                if(a[i] > max)
                    max = a[i];
            }
            System.out.println(max);
        }
    }

