import java.util.*;

class TwoPointer{
    public static void main(String []args){
       int arr[] = {1,2,3,4,5};
        //Use only for sorted array
       Arrays.sort(arr);
       Scanner sc = new Scanner(System.in);
       int key = sc.nextInt();
       int low = 0;
       int high = arr.length-1;
       int flag = 0;
       
       while(low<high){
           int sum = arr[low] + arr[high];
           
           if(sum==key){
               System.out.print("Target is found");
               flag++;
               break;
           }
           
           else if(sum<key){
               low++;
           }
           else{
               high--;
           }
       }
       
       if(flag==0){
            System.out.print("Target is not found");

       }
    }
}
// //output
// PS C:\Users\mdisr\OneDrive\Desktop\PAP\PAP_DAY1> java TwoPointer.java
// 5
// Target is found
// PS C:\Users\mdisr\OneDrive\Desktop\PAP\PAP_DAY1> java TwoPointer.java
// 8
// Target is not found
// PS C:\Users\mdisr\OneDrive\Desktop\PAP\PAP_DAY1> java TwoPointer.java
// 4
// Target is found
// PS C:\Users\mdisr\OneDrive\Desktop\PAP\PAP_DAY1> java TwoPointer.java 
// 7
// Target is not found