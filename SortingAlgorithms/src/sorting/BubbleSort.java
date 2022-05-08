package sorting;

public class BubbleSort {
	
	static int arr[] = {4, 1, 6, 90, 50, 70, 20, 19};

	public static void main(String[] args)
	{
		bubbleSort(arr);
		printArray();	
	}
	
	static void bubbleSort(int arr[])
	{
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	
	static void printArray()
	{
		for(int item:arr)
			System.out.println(item+" ");
	}

}
