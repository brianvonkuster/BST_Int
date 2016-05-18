package BST;


public interface INT_Tree {

	public boolean Search(int item);
	public boolean Insert(int item);
	public boolean Delete(int item);
	
	public void InOrder(Node n);
	public void PreOrder(Node n);
	public void PostOrder(Node n);
	
	public int GetSize();
	public boolean isEmpty();
	public void clear();
	
}
