
public class SortString {
public static void main(String[] args) {
	
//	int arr[]={43,53,6,4,43,6,75,642,67};
	String arr[]={"mohan","ajay","ram","ravi","jack"};
	
	String temp=null;
	
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr.length;j++)
		{
			if(arr[i].compareTo(arr[j])>0)
			{
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			}
						
		}
	}
	
	
	for(String n:arr)
	{
		System.out.println(n);
	}
}
}
