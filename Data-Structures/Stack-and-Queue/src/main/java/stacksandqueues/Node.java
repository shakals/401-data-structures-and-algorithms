package stacksandqueues;

public class Node {
    protected String nodeValue;
    protected Node nextnode;

    public Node(){
        this.nodeValue = " ";
        this.nextnode = null;
    }

    public Node(String inputValue, Node currentTopOfStack){
        this.nodeValue = inputValue;
        this.nextnode = currentTopOfStack;
    }
}
