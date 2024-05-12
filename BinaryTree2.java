class BinaryTree2 {
    private BTNode2<Integer> root;

    /* Constructor */
    public BinaryTree2() {
        root = null;
    }

    /* Function to check if tree is empty */
    public boolean isEmpty() {
        return root == null;
    }

    /* Functions to insert data */
    public void insert(Integer data) {
        root = insert(root, data);
    }

    /* Function to insert data recursively */
    private BTNode2<Integer> insert(BTNode2<Integer> node, Integer data) {
        if (node == null)
            node = new BTNode2<>(data);
        else {
            if (node.getLeft() == null)
                node.setLeft(insert(node.getLeft(), data));
            else
                node.setRight(insert(node.getRight(), data));
        }
        return node;
    }

    /* Function to count number of nodes */
    public int countNodes() {
        return countNodes(root);
    }

    /* Function to count number of nodes recursively */
    private int countNodes(BTNode2<Integer> r) {
        if (r == null)
            return 0;
        else {
            int l = 1;
            l += countNodes(r.getLeft());
            l += countNodes(r.getRight());
            return l;
        }
    }

    /* Function to search for an element */
    public boolean search(Integer val) {
        return search(root, val);
    }

    /* Function to search for an element recursively */
    private boolean search(BTNode2<Integer> r, Integer val) {
        if (r == null)
            return false;
        if (r.getData().equals(val))
            return true;
        if (search(r.getLeft(), val))
            return true;
        return search(r.getRight(), val);
    }

    /* Function for inorder traversal */
    public void inorder() {
        inorder(root);
    }

    private void inorder(BTNode2<Integer> r) {
        if (r != null) {
            inorder(r.getLeft());
            System.out.print(r.getData() + " ");
            inorder(r.getRight());
        }
    }

    /* Function for preorder traversal */
    public void preorder() {
        preorder(root);
    }

    private void preorder(BTNode2<Integer> r) {
        if (r != null) {
            System.out.print(r.getData() + " ");
            preorder(r.getLeft());
            preorder(r.getRight());
        }
    }

    /* Function for postorder traversal */
    public void postorder() {
        postorder(root);
    }

    private void postorder(BTNode2<Integer> r) {
        if (r != null) {
            postorder(r.getLeft());
            postorder(r.getRight());
            System.out.print(r.getData() + " ");
        }
    }
}
