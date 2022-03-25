public static int min(Node node) {
    if(node==null)
    {
      return (int)1e9;
    }

    int l=min(node.left);

    int r=min(node.right);

    int mn=Math.min(l,r);

    return Math.min(mn,node.data);
}