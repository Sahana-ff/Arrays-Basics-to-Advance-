import java.util.*;

public class Main
{
	public static void main(String[] args) {
        
        int arr[]={-2,-3,4,-1,-2,1,5,-8,5,5};
        int sum=0;
        int max=Integer.MIN_VALUE;
        int ans_start=-1;
        int start=-1;
        int end=-1;
        for(int i=0;i<arr.length;i++){
            if(sum==0) ans_start=i; //tracks the starting index of each subarray
            sum+=arr[i];
            if(sum>max){
                max=sum;
                start=ans_start;//tracks the starting index of maximum sum subarray
                end=i;//tracks the end of maximum sum subarray
            }
            if(sum<0) sum=0;
        }
        
        for(int i=start;i<=end;i++){
            System.out.print(arr[i]+" ");
        }
        
        
	}
}
