package BST;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tree t = new Tree();
		
		t.Insert(20);
		t.Insert(20);
		t.Insert(20);
		//t.Insert(40);
		//t.Insert(25);
		//t.Insert(15);
		//t.Insert(5);
		System.out.println(t.getRoot().getData());
		System.out.println(t.getRoot().getLeft().getData());
		System.out.println(t.getRoot().getRight().getData());
		
		//System.out.println(t.getRoot().getLeft().getLeft().getData());
		//System.out.println(t.getRoot().getLeft().getRight().getData());
		//System.out.println(t.getRoot().getRight().getLeft().getData());
		//System.out.println(t.getRoot().getRight().getRight().getData());
	}

}
