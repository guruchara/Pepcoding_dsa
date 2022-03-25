/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public ArrayList<TreeNode> guru(TreeNode node,int x)
    {
        if(node==null)
        {
            ArrayList<TreeNode>l=new ArrayList<>();
            return l;
        }
        
        if(node.val==x)
        {
            ArrayList<TreeNode>l=new ArrayList<TreeNode>();
            l.add(node);
            return l;
        }
        
        ArrayList<TreeNode>lans=guru(node.left,x);
        if(lans.size()>0)
        {
            lans.add(node);
            return lans;
        }
        
        ArrayList<TreeNode>rans=guru(node.right,x);        
        if(rans.size()>0)
        {
            rans.add(node);
            return rans;
        }
        
        return new ArrayList<TreeNode>();
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        ArrayList<TreeNode>p2r=guru(root,p.val);
        ArrayList<TreeNode>q2r=guru(root,q.val);
        
        int i=p2r.size()-1;
        int j=q2r.size()-1;
        
        TreeNode LCA=null;
        while(i>=0 && j>=0)
        {
            // through the get we get node bcz make ArrayList of nodes and if i write p2r.get(i).val ..
            if(p2r.get(i).val!=q2r.get(j).val)
            {
                break;
            }
            
            LCA=p2r.get(i);           
            i--;            
            j--;
        }
        // question Tag : Amazon, Sprikrl, all PBC ..  :) 
        return LCA;
    }
}