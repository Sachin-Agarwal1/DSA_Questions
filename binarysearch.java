import java.util.*;
public class binarysearch {
    public static int binarysearch(int num[],int key){
        int st = 0, end = num.length-1;
        while (st<=end){
            int mid = (st+end)/2;
            if (num[mid]==key){
                return mid;
            }
            if (num[mid]<key){
                st = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int num []={10,20,33,40};
                    //   {15,25,35,45},
                    //   {27,29,37,48},
                    //   {32,33,39,50}};
    int key = 40;
    System.out.println(binarysearch(num,key));             
    }
    
}
