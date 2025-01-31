import java.util.Scanner;

class BinarySearch{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        //USE ONLY SORTED ARRAY
        int[]arr={1,2,3,4,5};
        int key = sc.nextInt();
        int low = 0;
        int high = arr.length-1;
        int flag = 0;
        
        while(low<=high){
        int mid = (low+high)/2;
            
            if(arr[mid]==key){
                System.out.print("Element found at position "+mid);
                flag = flag+1;
                break;
            }
            
            else if(arr[mid]<key){
                low = mid+1;
            }
            
            else{
                high = mid-1;
            }
            
        }
        
        if(flag==0){
            System.out.println("Element not found");
        }
        
    }
}
// //OUTPUT
// PS C:\Users\mdisr\OneDrive\Desktop\PAP\PAP_DAY1> javac BinarySearch.java
// PS C:\Users\mdisr\OneDrive\Desktop\PAP\PAP_DAY1> java BinarySearch.java 
// 5
// Element found at position 4
// PS C:\Users\mdisr\OneDrive\Desktop\PAP\PAP_DAY1> java BinarySearch.java
// 3
// Element found at position 2
// PS C:\Users\mdisr\OneDrive\Desktop\PAP\PAP_DAY1> java BinarySearch.java
// 8
// Element not found