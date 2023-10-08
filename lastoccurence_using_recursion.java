public class lastoccurence_using_recursion {
    public static int lastOccurence(int arr[], int key, int i){
     if(i == arr. length-1) {
         return -1;
     }
     int isFound = lastOccurence(arr, key, i+1);
    if(isFound == -1 && arr[i] == key) {
         return i;
    }
    return isFound;
}
public static void main(String[] args) {
    int arr[]={5,6,2,5,2,3,5,37};
    System.out.println(lastOccurence(arr,5,0));
}
}
     
