import java.util.*;
class Question2
{
    static class Node
	{
	   int data;
	   Node next;
	   Node prev;
	   
	   Node(int val)
	   {
	       data=val;
		   next=null;
		   prev=null;
	   }
	}
	
	Node head;
	static int a=1;
	
	public void print()
	{
	   Node temp=head;
	   while(temp!=null)
	   {
	       System.out.print(temp.data+" ");
	   }
	}
	
	public void add(int data)
	{
	       Node nn=new Node(data);
		   nn.next=head;
		   nn.prev=null;
		   if(head!=null)
		   {
		       head.prev = nn;
		   }
		   head = nn;
	}
	
	public static void main(String args[])
	{
	   Question2 Q= new Question2();
	   Scanner s =new Scanner(System.in);
	   a=s.nextInt();
	   int n=s.nextInt();
	   for(int i=0;i<n;i++)
	   {
		   Q.add(s.nextInt());
	   }
	   
        System.out.println("result:");
        Q.print();		
	}
	
	
}