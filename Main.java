import java.util.ArrayList;

public class Main {
     public static void main(String[] args) {
         //longest subarray-brute force
        int []arr={1,2,3,1,1,1,1,4,2,3};
        int n=arr.length;
        int maxlen=0;
        //generate all the subarrays
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");

                }
                System.out.println();
            }
        }


    }
}