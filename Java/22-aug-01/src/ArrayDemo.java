import java.util.Date;

public class ArrayDemo {

	public static void main(String[] args) {
		int arr[];
		arr=new int[10];
		//we have created an int array of size 10
		
		int arr2[]=new int[10];	//declare, init in same line
		
		int arr3[]= {55, 98, 10, 45, 12};	//what is the size here? 5
		
		System.out.println(arr3.length);
		
		int i1;		//i is created as int type
		
		Date dt;	//incomplete
		dt=new Date();	//complete
		
		Date dtArr[]=new Date[10];		//incomplete
		dtArr[0]=new Date();			//first element is complete
		
		for(int i=0;i<10;i++)
		{
			dtArr[i]=new Date();		//all 10 elements are created
		}
		
		
	}

}
