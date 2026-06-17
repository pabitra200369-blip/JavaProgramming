package array;

public class singledigitsum {
    public static void main(String[] args) {
        int a[] = {23,55,57,93,10,1};
        for(int i=0; i<a.length; i++) {
            int n = a[i];
            while(n > 9) {
                int sum = 0;
                while(n > 0) {
                    sum += n % 10;
                    n /= 10;
                    }
                    n = sum;
                }
                System.out.print(n + " ");
            }
        }
    }

