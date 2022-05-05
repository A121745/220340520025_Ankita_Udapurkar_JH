import java.util.*;
public class Question1
{
	public static void main(String[] args){
   int[] arr={2,4,6,8,3};
   
   for(int i=arr.length-1;i>=0;i--)
   {
     int j,temp=arr[i];
	 for(j=i-1;j>=0 && arr[j]>temp;j-- )
	 {
		 arr[j+1]=arr[j];
		 System.out.println(Arrays.toString(arr));
		
	 }
	 arr[j+1]=temp;
 }

	System.out.println(Arrays.toString(arr));
}
   
}