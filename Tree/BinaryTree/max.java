public static int max(Node node) {
    if(node==null)
    {
      return Integer.MIN_VALUE;
    }

    int l=max(node.left);

    int r=max(node.right);

    int mx=Math.max(l,r);

    return Math.max(mx,node.data);
}