package sorting;

public class InsertionSort {
	
	static int arr[] = {4, 1, 6, 90, 50, 70, 20, 19};
	
	public static void main(String[] args)
	{
		insertionSort(arr);
		printArray();
	}
	
	static void insertionSort(int arr[])
	{
		int key=0;
		for(int i=1;i<arr.length;i++)
		{
			key=arr[i];
			int j=i-1;
			while(j>=0 && key<arr[j])
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
			
		}
	}
	
	static void printArray()
	{
		for(int item:arr)
			System.out.println(item+" ");
	}
	
}
