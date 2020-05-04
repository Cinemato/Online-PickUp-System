
public class Node 
{
	Node link;
	Order order;
	
	public Node(Node link, Order order)
	{
		this.link = link;
		this.order = order;
	}
	
	public Node()
	{
		this(null, null);
	}
	
	public Node(Order order)
	{
		this(null, order);
	}

	public Node(Node link) 
	{
		this(link, null);
	}	

	public Node getLink() {
		return link;
	}

	public void setLink(Node link) {
		this.link = link;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	
	
	
	
	
}



