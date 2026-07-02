package array;

class ReverseElements {
    public static void main(String[] args) {
        int a[] = {23,55,57,93,1};

        for(int i=0;i<a.length;i++) {
            int n=a[i], rev=0;

            while(n>0) {
                rev=rev*10+n%10;
                n=n/10;
            }

            System.out.print(rev+" ");
        }
    }
}
