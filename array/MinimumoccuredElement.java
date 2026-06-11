package array;

public class MinimumoccuredElement {
    public static void main(String[] args) {
        int a[] = {1,2,1,1,2,1};
        int minCount = a.length;
        int element = 0;
        for(int i=0; i<a.length; i++) {
            int count = 0;
            for(int j=0; j<a.length; j++) {
                if(a[i] == a[j])
                    count++;
                }
                if(count < minCount) {
                    minCount = count;
                    element = a[i];
                }
            }
            System.out.println(element + "-" + minCount);
        }
    }

