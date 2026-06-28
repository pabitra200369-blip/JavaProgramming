package array;

class InsertElement {
    public static void main(String[] args) {

        int a[] = {1,2,3,4};
        int index = 3;
        int value = 5;

        int b[] = new int[a.length+1];

        for(int i=0;i<index;i++)
            b[i]=a[i];

        b[index]=value;

        for(int i=index;i<a.length;i++)
            b[i+1]=a[i];

        for(int i=0;i<b.length;i++)
            System.out.print(b[i]+" ");
    }
}
