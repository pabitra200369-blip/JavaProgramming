package array;

public class sumindex {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6};
        int even = 0, odd = 0;
        for(int i=0; i<a.length; i++) {
            if(i % 2 == 0)
                even = even + a[i];
            else
                odd = odd + a[i];
            }
            System.out.println("Even Index Sum = " + even);
            System.out.println("Odd Index Sum = " + odd);
        }
    }

