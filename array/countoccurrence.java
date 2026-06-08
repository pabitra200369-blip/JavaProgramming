package array;

public class countoccurrence {
    public static void main(String[] args) {
        int a[] = {1,2,1,3,2,4};
        for(int i=0; i<a.length; i++) {
            int count = 0;
            for(int j=0; j<a.length; j++) {
                if(a[i] == a[j])
                    count++;
                }
                boolean first = true;
                for(int k=0; k<i; k++) {
                    if(a[i] == a[k])
                        first = false;
                }
                if(first)
                    System.out.println(a[i] + "-" + count);
            }
        }
    }

