
public class TreeNode 
{
	Product p;
	TreeNode left;
	TreeNode right;
	
	public TreeNode(Product p)
	{
		this.p = p;
		left = null;
		right = null;	
	}
	
	public Product getProduct()
	{
		return p;	
	}
	
	public void setProduct(Product p)
	{
		this.p = p;
	}
	
	public TreeNode getLeft()
	{
		return left;
	}
	
	public void setLeft(TreeNode newLeft)
	{
		left = newLeft;
	}
	
	public TreeNode getRight()
	{
		return right;
	}
	
	public void setRight(TreeNode newRight)
	{
		right = newRight;
	}

	@Override
	public String toString() {
		return p.getName() + p.getPrice();
	}
	
	
	
	

}
