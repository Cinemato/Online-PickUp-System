
public class Product 
{
	double price;
	String name;
	
	public Product(String name, double price)
	{
		this.name = name;
		this.price = price;
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getPrice()
	{
		return price;
	}
	

	public void setPrice(double price) {
		this.price = price;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name + price + "TL" + "\n";
	}	
	
}
