package interview_programs;

public class MergeTwoArrays {

	public static void main(String[] args) {
		int[] array1= {10,20,30};
		int a1= array1.length;
		int[] array2= {100,200,300,400};
		
		int[] merge = new int[array1.length + array2.length];
		
		for(int i=0;i<array1.length;i++)
		{
			  merge[i]      =  array1[i];
		}
		
		for(int i=0;i<array2.length;i++)
		{
			    merge[i + array1.length]        =    array2[i];
		}
		
		//for(int i=0;i<(array1.length + array2.length);i++)
		for(int i=0;i<merge.length;i++)
		{
			System.out.println(merge[i]);
		}

	}

}
