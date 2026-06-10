package array;

public class MaximumOccuredElement {
    public static void main(String[] args) {
        int a[] = {1,2,1,3,1,4};
        int maxCount = 0;
        int element = 0;
        for(int i=0; i<a.length; i++) {
            int count = 0;
            for(int j=0; j<a.length; j++) {
                if(a[i] == a[j])
                    count++;
                }
                if(count > maxCount) {
                    maxCount = count;
                    element = a[i];
                }
            }
            System.out.println(element + "-" + maxCount);
        }
    }

