package array;

public class CountZero {
    public static void main(String[] args) {
        int a[] = {1,0,2,0,5,6,0};
        int count = 0;
        for(int i=0; i<a.length; i++) {
            if(a[i] == 0)
                    count++;
            }
            System.out.println(count);
        }
    }

