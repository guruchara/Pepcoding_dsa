class Node
{
	int val;
    Node left;
    Node right;

    public Node(int val)
    {
    	this.val=val;
    	this.left=null;
    	this.right=null;
    }

}
public class BinaryTree
{
	// here is node
	public static Node node;
    
    public static void display(Node node)
    {
    	if(node==null)
        {
        	return;
        }
        display(node.left);
        display(node.right);
        System.out.print(node.val +" ");
    }
    public static int height(Node node)
    {
    	if(node==null)
    	{
    		return 0;
    	}

    	return Math.max(height(node.left),height(node.right))+1;
    }
    public static int diameter(Node node)
    {
    	// approach 
    	//  find lh and rh
    	// and add 2
    	// find ld and rd after that find max diameter
    	// find max from height as well as diameter
    	if(node==null)
    	{
    		return -1;
    	}

    	// find lh
    	int lh=height(node.left);
    	// find rh
    	int rh=height(node.right);

        // sum of lh and rh +2 
    	int sum=lh+rh+2;

        // find ld and rh
        int ld=diameter(node.left);

        int rd=diameter(node.right);

        int max=Math.max(ld,rd);

        return Math.max(max,sum);
    }
	public static void main(String[] args) {
	    
	    BinaryTree bt=new BinaryTree();

	    // calling one by one node
	    bt.node=new Node(1);
	    bt.node.left=new Node(2);
	    bt.node.right=new Node(3);

	    bt.node.left.left=new Node(4);
	    bt.node.left.right=new Node(5);

        System.out.println(diameter(node));
	    display(node);	
	}
}

/*
D:\PEP_GURU_DSA\Tree\BinaryTree>java BinaryTree
4 5 2 3 1
D:\PEP_GURU_DSA\Tree\BinaryTree>
*/