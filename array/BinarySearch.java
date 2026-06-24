package array;

class BinarySearch {
    public static void main(String[] args) {

        int a[] = {10,20,30,40,50};
        int key = 40;

        int low=0, high=a.length-1;

        while(low<=high) {

            int mid=(low+high)/2;

            if(a[mid]==key) {
                System.out.println("Found at index "+mid);
                break;
            }
            else if(key>a[mid])
                low=mid+1;
            else
                high=mid-1;
        }
    }
}
