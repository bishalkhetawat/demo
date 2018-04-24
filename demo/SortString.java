
public class SortString {
public static void main(String[] args) {
	
	int arr[]={43,53,6,4,43,6,75,642,67};
	
	int temp=0;
	
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr.length;j++)
		{
			if(arr[i]>arr[j])
			{
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			}
						
		}
	}
	
	
	for(int n:arr)
	{
		System.out.println(n);
	}
}
}
