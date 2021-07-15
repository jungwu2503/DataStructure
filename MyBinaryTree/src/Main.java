
public class Main {

	public static void main(String[] args) {
		
		BinaryTree tree = new BinaryTree();
		tree.add(6);
		tree.add(4);
		tree.add(2);
		tree.add(5);
		tree.add(9);
		tree.add(7);
		tree.add(8);
		tree.add(10);
		
		tree.postorder();
		
		System.out.println(tree.find(4));
		
		tree.remove(4);
		
		tree.preorder();
		
/*		BTreeNode a = new BTreeNode(6);
		BTreeNode b = new BTreeNode(4);
		BTreeNode c = new BTreeNode(2);
		BTreeNode d = new BTreeNode(5);
		BTreeNode e = new BTreeNode(9);
		BTreeNode f = new BTreeNode(7);
		BTreeNode g = new BTreeNode(8);
		BTreeNode h = new BTreeNode(10);
		
		a.lchild = b;
		b.lchild = c;
		b.rchild = d;
		e.lchild = f;
		f.rchild = g;
		e.rchild = h;
		
		System.out.println(a.getDepth()); */
		
		
		
	}

}

class BinaryTree {
	BTreeNode root;

	BinaryTree() {
		root = null;
	}
	
	void add(int x) {
		if (root == null) {
			root = new BTreeNode(x);
			return;
		}
		root.add(x);		
	}
	
	void inorder() {
		if (root != null) {
			root.inorder();
		}
	}
	
	void preorder() {
		if (root != null) {
			root.preorder();
		}
	}
	
	void postorder() {
		if (root != null) {
			root.postorder();
		}
	}
	
	boolean find(int x) {
		return root.find(x);		
	}
	
	void remove(int x) {
		root.remove(x);
	}
	
}

class BTreeNode {
	
	BTreeNode lchild;
	int data;
	BTreeNode rchild;
	
	public BTreeNode(int x) {
		lchild = rchild = null;
		data = x;
	}
	
	void inorder() {
		
		if (lchild != null) {
			lchild.inorder();
		}
		System.out.println(data);
		if (rchild != null) {
			rchild.inorder();
		}
		
	}
	
	void preorder() {
		
		System.out.println(data);
		if (lchild != null) {
			lchild.preorder();
		}
		if (rchild != null) {
			rchild.preorder();
		}
		
	}
	
	void postorder() {
		if (lchild != null) {
			lchild.postorder();
		}
		if (rchild != null) {
			rchild.postorder();
		}
		System.out.println(data);
	}
	
	int getDepth() {
		int d1 = 0;
		int d2 = 0;
		
		if (lchild != null) {
			d1 = lchild.getDepth();
		}
		if (rchild != null) {
			d2 = rchild.getDepth();
		}
		
		if (d1 > d2) {
			return d1 + 1;
		}
		else return d2 + 1;
		
	}
	
	int getSize() {
		int size = 1;
		
		if (lchild != null) {
			size += lchild.getSize();
		}
		if (rchild != null) {
			size += rchild.getSize();
		}
		
		return size;
	}
	
	boolean isLeaf() {
		if (lchild != null) {
			return false;
		}
		if (rchild != null) {
			return false;
		}
		
		return true;
	}
	
	void add(int x) {
		if (x > data) {
			if (rchild == null) {
				rchild = new BTreeNode(x);
				return;
			}
			else {
				rchild.add(x);
			}
		}
		else {
			if (lchild == null) {
				lchild = new BTreeNode(x);
				return;
			}
			else {
				lchild.add(x);
			}
		}
	}
	
	boolean find(int x) {
		if (data == x) 
			return true;
		
		if (x > data) 
			rchild.find(x);
		else if (x < data)
			lchild.find(x);			
		
//		System.out.println(data);
		return false;
	}
	
	void remove(int x) {
		
		if (data == x) {
			if (rchild == null) {
				lchild = this;
				return;
			}
			else {
				BTreeNode tmp = rchild;
				lchild = this;
				while (rchild != null) {
					rchild = rchild.rchild;
				}
				rchild = tmp;
				return;
			}
		}
		
	}
	
}