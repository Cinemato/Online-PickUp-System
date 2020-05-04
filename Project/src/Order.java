import java.text.*;
import java.util.*;

public class Order 
{
	String orderId;
	String orderDate;
	
	public Order()
	{
		UUID uuid = UUID.randomUUID();
		String id = uuid.toString();
		orderId = id.substring(0, 8);
		
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");  //MM For 12 Months and HH for 24 Hours
		Date date = new Date();
		this.orderDate = dateFormat.format(date);
	}

	public String getOrderId()
	{
		return orderId;
	}

	public void setOrderId(String orderId)
	{
		this.orderId = orderId;
	}

	public String getOrderDate()
	{
		return orderDate;
	}

	public void setOrderDate(String orderDate)
	{
		this.orderDate = orderDate;
	}

	@Override
	public String toString() 
	{
		return " " + orderId + "..........................................." + orderDate + "\n";
	}
	
	
	
	

}
