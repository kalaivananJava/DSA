package main;
import java.util.*;
public class LinearSearch2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int arr[][]={ {91,2,3,4},{5,16,7,800}};
		int digit[][]=new int[][] {{72,999,888,77},{77,9999,7777,22,11,1},{1,2,22,908}};
		int n;
		int result[]=new int[2];
		while(true) {
			System.out.println("1.Linear Search in Numbers 2. Maximum element an array 3. having given digits \n4.having higher wealth 9.exit");
			n=sc.nextInt();
			int target=0;

			switch(n){
			case 1:
				System.out.println("Linear Search in Numbers {1,2,3,4},{5,6,7,8}");


				System.out.println("enter the target Element");
				target=sc.nextInt();
				result=linearSearch(arr,target);

				if(result[0]==-1) {
					System.out.println("Not Found....");
				}else {
					System.out.println(Arrays.toString(result));
				}

				break;
			case 2:
				System.out.println("Linear Search Max Numbers {1,2,3,4},{5,6,7,8}");

				System.out.println(maxLS(arr));

				break;
			case 3:
				System.out.println("Linear Search in selected digts");
				
				System.out.println("Enter the digits you need to select {72,999,888,77},{77,9999,7777,22,11,1},{1,2,22,908}" );
				int d=sc.nextInt();
				
				result=digits(digit,d);
				if(result[0]==-1) {
					System.out.println("Elements not found");
				}else {
					System.out.println(Arrays.toString(result));
				}
				break;
			case 4:
				System.out.println("Higher wealth {72,999,888,77},{77,9999,7777,22,11,1},{1,2,22,908}");
				result=highWealth(digit);
				System.out.println(Arrays.toString(result));
				break;
			case 9:
				System.out.println("Process Complete............");
				System.exit(0);
				break;
			}
			//System.out.println(result);


		}
	}
	
	static int[] highWealth(int digit[][]) {
		if(digit.length==0)
			return new int[] {-1};
		int ind=-1;
		int sum=0;
		int max=0;
		for(int i=0;i<digit.length;i++)
		{    
			
			for(int j=0;j<digit.length;j++) {
				sum+=digit[i][j];
			}
			System.out.println(max+" "+sum);
			if(max<sum)
			{
				max=sum;
				ind=i;
			}
			sum=0;
		}
		
		return digit[ind];
	}
	static int[] digits(int digit[][],int d) {
		//System.out.println(digit.length+" "+d);
		if(d==0 || digit.length==0)
			return new int[] {-1};
		
		int val[] = new int[14];
		int dig;
		int c=0;
		for(int i=0;i<digit.length;i++) {
			for(int j=0;j<digit[i].length;j++) {
				dig=(int) Math.log10(digit[i][j])+1;
				//System.out.println(dig);
				if(dig == d) {
					val[c]=digit[i][j];
				c++;
			}}
		}
	//	System.out.println(Arrays.toString(val));
		return val;
		
	}
	public static int maxLS(int arr[][]) {
		if(arr.length==0)
			return -1;
		int max=arr[0][0];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j]>max)
					max=arr[i][j];
			}

		}
		return max;
	}
	public static int[] linearSearch(int[][] arr,int target) {
		if(arr.length==0)
			return new int[]{-1,-1};

		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j]==target)
					return new int[] {i,j};
			}
		}

		return new int[] {-1,-1};

	}

}
