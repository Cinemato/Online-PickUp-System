
public class Testing 
{
	public static void main(String[] args) 
	{
		Tree t = new Tree();
		
		Product p = new Product("Khaled", 15);
		Product p1 = new Product("Uvo", 12);
		Product p2 = new Product("Uvo", 12);
		
		TreeNode k = new TreeNode(p);
		TreeNode k1 = new TreeNode(p1);
		TreeNode k2 = new TreeNode(p2);
		
		t.insert(k);
		t.insert(k1);
		t.insert(k2);

		System.out.println(t.getSize());
		
		t.delete(k);
		System.out.println(t.getSize());
		t.inorder(k);
		
	}

}
