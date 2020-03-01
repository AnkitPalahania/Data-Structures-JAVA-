import java.util.Scanner;

public class MyLinkedList 
{   
	static class student
	{
		String name;
		student next;
	}
	
	static student first=null,last,temp,new1;
	
	public static void main(String args[])
	{
		System.out.println("Enter how many students name you want to enter: ");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			student new1=new student();
			System.out.println("name "+i);
			
			new1.name=s.next();    
			new1.next=null;
			
			if(first==null)
			{
				first=new1;
				last=new1;
			}
			else
			{
				last.next=new1;
				last=new1;
			}
			
		}
		
		System.out.println("----------------THE NAMES ARE------------------ ");
		for(temp=first;temp!=null;temp=temp.next)     //can use a while loop as well :)
		{
			System.out.println(temp.name);
		}
		
		//Just in case if you are are finding it difficult to understand the above for loop , you can use the below for loop
		// But it is not recommended every time :)
		/*
		for(int i=1;i<=n;i++)
		{
			System.out.println(first.name);
			first=first.next;
		}
		*/
	}
	
}
