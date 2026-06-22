package array;

class EvenDigitSum {
    public static void main(String[] args) {

        int a[]={231,554,572,962,24,1};

        for(int i=0;i<a.length;i++) {

            int n=a[i];
            int sum=0;

            while(n>0) {
                int d=n%10;

                if(d%2==0)
                    sum=sum+d;

                n=n/10;
            }

            System.out.print(sum+" ");
        }
    }
}
