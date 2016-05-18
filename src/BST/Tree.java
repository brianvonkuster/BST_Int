package BST;

public class Tree implements INT_Tree {

	private Node root = null;
	
	// DO SUCCESSOR, PREDECESSOR
	
	public Tree()
	{
		
	}
	
	@Override
	public boolean Search(int item) {
		// TODO Auto-generated method stub
		return false;
	}

	public Node getRoot()
	{
		return root;
	}
	
	@Override
	public boolean Insert(int item) {

		if (root == null)
		{
			root = new Node(item);
			return true;
		}
		
		Insert(item, root);
		
		return false;
	}
	
	// Recursive insert
	private void Insert(int item, Node curNode) {
		
		if (item < curNode.getData())
		{
			if (curNode.getLeft() == null)
			{
				Node n = new Node(item);
				curNode.setLeft(n);
				n.setParent(curNode);
			}
			else
			{
				Insert(item, curNode.getLeft());
			}
		}
		else if (item > curNode.getData())
		{
			if (curNode.getRight() == null)
			{
				Node n = new Node(item);
				curNode.setRight(n);
				n.setParent(curNode);
			}
			else
			{
				Insert(item, curNode.getRight());
			}
		}
		else
		{
			if (curNode.getLeft() == null)
			{
				Node n = new Node(item);
				curNode.setLeft(n);
				n.setParent(curNode);
				return;
			}
			else if (curNode.getRight() == null)
			{
				Node n = new Node(item);
				curNode.setRight(n);
				n.setParent(curNode);
				return;
			}
		}
	}

	@Override
	public boolean Delete(int item) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void InOrder(Node n) {
		if (n != null)
		{
			PostOrder(n.getLeft());
			System.out.println(n.getData());
			PostOrder(n.getRight());
		}
		
	}

	@Override
	public void PreOrder(Node n) {
		if (n != null)
		{
			System.out.println(n.getData());
			PostOrder(n.getLeft());
			PostOrder(n.getRight());
		}
		
	}

	@Override
	public void PostOrder(Node n) {
		if (n != null)
		{
			PostOrder(n.getLeft());
			PostOrder(n.getRight());
			System.out.println(n.getData());
		}
		
	}

	@Override
	public int GetSize() {
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}
	
	public String toString()
	{
		return "";
	}

}
