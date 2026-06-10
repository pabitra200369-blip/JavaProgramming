package array;

 public class lastindex {
    public static void main(String[] args) {
        int a[] = {1,2,9,3,9,4,9,6,7,8};
        int key = 9;
        int index = -1;

        for(int i=0; i<a.length; i++) {
            if(a[i] == key)
                index = i;
        }

        System.out.println(index);
    }
}
