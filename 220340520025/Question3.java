class Question3 
{
    int arr[];
	int max;
	int tos1;
	int tos2;
	
	public Question3(int size)
	{
		max=size;
		arr=new int[size];
		tos1=size/2+1;
		tos2=size/2;
		
	}
	
	public  void s1push(int x)
	{
		if(tos1>0)
		{
			tos1--;
			arr[tos1]=x;
		}
		else
		{
			System.out.println("stack ovrerflow");
			return;
		}
	}
	
	public  int s1pop()
	{
		if(tos1<=max/2)
		{
			int x=arr[tos1];
			tos1++;
			return x;
		}
		else
		{
		   System.out.println("stack underflow");	
		   System.exit(1);
		}
		return 0;
	}
	
	public  void s2push(int x)
	{
		if(tos2<max-1)
		{
			tos2++;
			arr[tos2]=x;
		}
		else
		{
			System.out.println("stack ovrerflow");
			return;
		}
	}
	public  int s2pop()
	{
		if(tos2>=max/2+1)
		{
			int x = arr[tos2];
			tos2--;
			return x;
		}
		else
		{
			System.out.println("stack underflow");
			System.exit(1);
		}
		return 1;
	}
	
	public static void main(String[] args)
	{
		Question3 Q=new Question3(10);
		
		Q.s1push(5);   
		Q.s2push(10);
		Q.s2push(15);
		Q.s1push(11);
        Q.s2push(7);
		Q.s2push(40);
        
		System.out.println("Popped element from stack1 is " +Q.s1pop());
		System.out.println("Popped element from stack1 is " +Q.s2pop());
		

 

	}
	
}