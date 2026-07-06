package array;

class ZeroLeft {
    public static void main(String[] args) {

        int a[]={2,0,5,3,1,0,3,1};

        for(int i=0;i<a.length;i++) {
            if(a[i]==0)
                System.out.print(a[i]+" ");
        }

        for(int i=0;i<a.length;i++) {
            if(a[i]!=0)
                System.out.print(a[i]+" ");
        }
    }
}
