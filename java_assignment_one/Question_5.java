
import java.util.Arrays;  

public class Question_5{ 
 
	public static int getSecondLargest(int[] a, int total)
	{  
	  Arrays.sort(a);  
	  return a[total-2];  
        }  
       public static void main(String args[])
	{  
		int a[]={11,22,33,44,55,66};   
		System.out.println("Second Largest element: "+getSecondLargest(a,a.length));   
	}
}  

/**********output**************

Second Largest element: 55
*******************************/