import javax.swing.JTextField;
import javax.swing.JTextArea;
public class Queue 
{
	Node front;
	Node rear;
	
	public Queue()
	{
		OrderHistory.textArea = new JTextArea();
		front = null;
		rear = null;
	}
	
	public boolean isEmpty()
	{
		return (front == null);
	}
	
	public void emptyQueue()
	{
		front = null;
		rear = null;
		
		outputQueue();
		
		OrderHistory.textArea.setText("");
	}
	
	public String getFront()
	{
		assert(front != null);
		return front.getOrder().toString();
	}
	
	public String getRear()
	{
		assert(rear != null);
		return rear.getOrder().toString();
	}
	
	public void addToQueue(Order order)
	{
		Node newNode = new Node(order);
		
		if(isEmpty())
		{
			front = rear = newNode;
		}
		
		else
		{
			rear.setLink(newNode);
			rear = newNode;
		}
	}
	
	public void deleteFromQueue()
	{
		if(isEmpty())
		{
			System.out.println("Queue Is Empty!");
		}
		
		else
		{
			front = front.getLink();
			if(front == null)
			{
				rear = null;
			}
		}
	}
	
	public void outputQueue()
	{
		Node current = new Node();
		current = front;
		
		if(isEmpty())
		{
			System.out.println("Queue Is Empty!");
		}
		
		else
		{
			OrderHistory.textArea.setText("");
			while(current != null)
			{
				System.out.println(current.getOrder().toString());
				OrderHistory.textArea.append(current.getOrder().toString());
				current = current.getLink();
			}
		}
	}
	
	public int getPosition(String orderId)
	{
		Node current = new Node();
		current = front;
		
		int pos = 1;
		
		if(isEmpty())
		{
			System.out.println("Queue Is Empty!");
			return -1;
		}
		
		else if(!doesExist(orderId))
		{
			return -1;
		}
		
		else
		{
			while(current != null)
			{
				if(current.getOrder().getOrderId().equals(orderId))
				{
					return pos;
				}
				
				else
				{
					current = current.getLink();
					pos++;
				}
			}
			
			return -1;
		}	
	}
	
	public boolean doesExist(String orderId)
	{
		Node current = new Node();
		current = front;
		
		if(isEmpty())
		{
			System.out.println("Queue Is Empty!");
			return false;
		}
		else
		{
			while(current != null)
			{
				if(current.getOrder().getOrderId().equals(orderId))
				{
					return true;
				}
				
				else
				{
					current = current.getLink();
				}
			}
			
			System.out.println("Item With Order ID: " + orderId + " Does Not Exist.");
			return false;
		}	
	}
	
	public int getSizeOfQueue()
	{
		Node current = new Node();
		current = front;
		
		int size = 0;
		
		while(current != null)
		{
			size++;
			current = current.getLink();
		}		
		
		return size;		
	}
	
	
}
