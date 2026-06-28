package array;

class HalfShift {
    public static void main(String[] args) {

        int a[]={2,5,8,9,3,1};
        int mid=a.length/2;

        for(int i=mid;i<a.length;i++)
            System.out.print(a[i]+" ");

        for(int i=0;i<mid;i++)
            System.out.print(a[i]+" ");
    }
}
