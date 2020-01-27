package stacksandqueues;

public class Stack {
    protected Node topOfStack;

    protected Stack(){
        this.topOfStack = new Node();
    }

    protected void push (String inputValue) {
        if (this.topOfStack.nodeValue != " ") {
            this.topOfStack = new Node(inputValue, this.topOfStack);
        }
        else {
            this.topOfStack.nodeValue = inputValue;
        }
    }


    public String toString() {
        String tempString = "";
        Node tempNode = this.topOfStack;

        do {
            tempString = tempString + "\n__________\n| \t" + tempNode.nodeValue + "\t |";
            //System.out.println("Printing loop:" +temp);
            tempNode = tempNode.nextnode;
        }
        while (tempNode != null);

        return "--------------------- \n Stack: " + tempString + "\n ------------------";
    }
}
