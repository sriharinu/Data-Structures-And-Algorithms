package sorting;

public class SelectionSort {
	
	static int arr[] = {4, 1, 6, 90, 50, 70, 20, 19};

	public static void main(String[] args) 
	{
	  selectionSort(arr);
          printArray();
	}
	
	static void selectionSort(int arr[])
	{
		for(int i=0;i<arr.length-1;i++)
		{
			int min_index=i;
			int temp=0;
			for(int j=i+1;j<arr.length;j++)
			{				
			   if(arr[min_index]>arr[j])
			   	min_index=j;			
			}
			temp=arr[min_index];        //swap
			arr[min_index]=arr[i];
			arr[i]=temp;
		}
	}
	
	
	static void printArray()
	{
		for(int item:arr)
			System.out.println(item+" ");
	}

}
