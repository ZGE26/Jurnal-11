class BTNode2<Integer> {
    private BTNode2<Integer> left, right;
    private Integer data;

    /* Constructor */
    public BTNode2() {
        left = null;
        right = null;
        data = null;
    }

    /* Constructor */
    public BTNode2(Integer item) {
        left = null;
        right = null;
        data = item;
    }

    /* Function to set left node */
    public void setLeft(BTNode2<Integer> n) {
        left = n;
    }

    /* Function to set right node */
    public void setRight(BTNode2<Integer> n) {
        right = n;
    }

    /* Function to get left node */
    public BTNode2<Integer> getLeft() {
        return left;
    }

    /* Function to get right node */
    public BTNode2<Integer> getRight() {
        return right;
    }

    /* Function to set data to node */
    public void setData(Integer d) {
        data = d;
    }

    /* Function to get data from node */
    public Integer getData() {
        return data;
    }
}
