
import java.util.*;
public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int arr[]=new int[5];
		int n;
		int result=0;
		while(true) {
			System.out.println("1.Linear Search in Numbers \n2.in a String \n3.Minimum number in an array \n9.exit");
			n=sc.nextInt();

			switch(n){
			case 1:
				System.out.println("Linear Search in Numbers");
				System.out.println("Enter 5 elements : by enter 1 element press enter");
				for(int i=0;i<arr.length;i++) {
					arr[i]=sc.nextInt();	
				}
				System.out.println("enter the target Element");
				int target=sc.nextInt();
				result=linearSearch(arr,target);
				
				break;
			case 2:
				System.out.println("Linear Search in String\nEnter the String ");
				sc.nextLine();
				String str=sc.nextLine();
				
				System.out.println("Enter the targeted character..."+str);
				char t=sc.next().charAt(0);
				result=lnrSrchString(str,t);
				//System.out.println(result+" "+t);
				break;
			case 3:
				System.out.println("Minimum Number in an array");
				System.out.println("enter 5 elements");
				for(int i=0;i<arr.length;i++) {
					arr[i]=sc.nextInt();
				}
				
				result=minNumber(arr);
				break;
			case 9:
				System.out.println("Process Complete............");
				System.exit(0);
				break;
			}
			//System.out.println(result);
			if(result!=-1) {
				System.out.println("Element is in "+result+" index");
			}else {
				System.out.println("Elemet not found");
			}

		}
	}
	

public static int minNumber(int[]arr) {
	
	if(arr.length==0)
		return -1;
	int min=0;
for(int i=1;i<arr.length;i++) {
	 if(arr[min] > arr[i])
		 min=i;
}
	
	return min;
}


	public static int lnrSrchString(String str, char t) {
		//System.out.println(str.length());
		if(str.length()==0)
			return -1;
		
		for(int i=0;i<str.length();i++)
		{
		 // System.out.println(str.charAt(i) + " "+t);
		  if(str.charAt(i)==t) {
			 
			  return i;
		  }
		}
		
		return -1;
		}

	public static int linearSearch(int[] arr,int target) {
		if(arr.length==0)
			return -1;

		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target)
				return i;
		}

		return -1;

	}


	
	

}
