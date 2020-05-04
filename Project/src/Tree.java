import javax.swing.JTextArea;

public class Tree 
{
	private JTextArea textArea;
	private TreeNode root;
	private int size;
	
	public Tree()
	{
		root = null;
		size = 0;
	}
		
	public int getSize() 
	{
		return size;
	}
	
	public void setSize(int size)
	{
		this.size = size;
	}
	
	public TreeNode getRoot()
	{
		return root;
	}
	
	public boolean insert(TreeNode node) 
	{
		if (root == null)
			root = node;
		else 
		{
			TreeNode parent = null;
			TreeNode current = root;
			while (current != null)
			{
				if (node.getProduct().getName().compareTo(current.getProduct().getName()) <= 0) 
				{
					parent = current;
					current = current.getLeft();
				}
				else if (node.getProduct().getName().compareTo(current.getProduct().getName()) >= 0) 
				{	
					parent = current;
					current = current.getRight();
				}
				else
					return false;
			}
			 
				if (node.getProduct().getName().compareTo(parent.getProduct().getName()) <= 0)
					parent.setLeft(node);
				else
					parent.setRight(node);	
		 }
		
		size++;
		return true;
	}
	
	public boolean delete(TreeNode node) {
		
		TreeNode parent = null;
		TreeNode current = root;
		
		while (current != null) {
			if (node.getProduct().getName().compareTo(current.getProduct().getName()) < 0) 
			{
				parent = current;
				current = current.getLeft();
			}
			
			else if (node.getProduct().getName().compareTo(current.getProduct().getName()) > 0) 
			{
				parent = current;
				current = current.getRight();
			}
			
			else
				break;
			}
		
		if (current == null)
			return false;	
		
		if (current.getLeft() == null) 
		{			
			
			if (parent == null) 
			{
				root = current.getRight();
			}
			else 
			{
				if (node.getProduct().getName().compareTo(parent.getProduct().getName()) < 0)
					parent.setLeft(current.getRight());
				else
					parent.setRight(current.getRight());
			}
		}
		else 
		{
			TreeNode parentOfRightMost = current;
			TreeNode rightMost = current.getLeft();
			while (rightMost.getRight() != null) 
			{
				parentOfRightMost = rightMost;
				rightMost = rightMost.getRight(); 
		
			}
		
			current.setProduct(rightMost.getProduct());
		
			if (parentOfRightMost.getRight() == rightMost)
				parentOfRightMost.setRight(rightMost.getLeft());
			else 
				parentOfRightMost.setLeft(rightMost.getLeft());
		}
		
		size--;
		return true;
	}						
	
	public void inorder(TreeNode root)
	{
		if (root == null)
			return;
		inorder(root.getLeft());
		System.out.println(root.getProduct().getName() + " ");
		inorder(root.getRight());
	}
	
	public void iterate(TreeNode root, JTextArea textArea)
	{
		if (root == null)
			return;
		iterate(root.getLeft(), textArea);
		textArea.append(root.getProduct().toString());
		iterate(root.getRight(), textArea);
	}	

	public TreeNode find(TreeNode root, String name)
	{
		if (root == null)
			return null;
		
		iterate(root.getLeft(), textArea);
		if(root.getProduct().getName() == name)
		{
			return root;
		}
		iterate(root.getRight(), textArea);
		
		return null;
	}
	
	public void clearTree()
	{
		this.root = null;
		size = 0;
	}
}
