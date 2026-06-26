package array;

class DeleteElement {
    public static void main(String[] args) {

        int a[]={1,2,3,4};
        int index=2;

        for(int i=0;i<a.length;i++) {
            if(i!=index)
                System.out.print(a[i]+" ");
        }
    }
}
