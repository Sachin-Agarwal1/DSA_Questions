public class second_largest_Element_in_array {
    public static void main(String args[]) {
        int a[]= {100,42,1000,25,100,88};
        int i;
         int firstlargest;
         int secondlargest;
        if(a[0]<a[1]){
          firstlargest= a[0];
          secondlargest= a[0];
         }else{
             firstlargest= a[1];
             secondlargest= a[1];
             
            }
        
           for( i=0; i<a.length; i++){
             if(a[i]>firstlargest){
                 secondlargest=firstlargest;
                 firstlargest=a[i];
                }
             else if(a[i]>secondlargest && a[i]!=firstlargest){
                secondlargest=a[i];
            }
        }
        System.out.println("First Largest is: "+firstlargest);
        System.out.println("Second Largest is: "+secondlargest);
        
    }
    
}





