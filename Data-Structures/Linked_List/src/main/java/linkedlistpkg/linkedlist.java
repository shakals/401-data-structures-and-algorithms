/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linkedlistpkg;

public class linkedlist {
//    public String getGreeting() {
//        return "Hello world.";
//    }

    public static node head = null;
    public static node tail = null;

    public static void insertnode(String inputvalue) {
        node newnode = new node(inputvalue);

        if (head == null) {
            head = newnode;
            tail = newnode;
        }
        else {
            tail.nextnode = newnode;
            tail = newnode;
        }
       // return head;
    }

    public static boolean searchlinkedlist (String searchvalue) {
        node tempnode = head;
        boolean valuefound = false;

        while (tempnode != null) {
            if (tempnode.nodevalue == searchvalue) {
                valuefound = true;
            }
            tempnode = tempnode.nextnode;
        }
        return valuefound;
    }

    public static void printlinkedlist() {
        node tempnode = head;
        String linkedlist = "";

        while (tempnode != null) {
            linkedlist = linkedlist + tempnode.nodevalue + "-->";
            tempnode = tempnode.nextnode;
        }
        linkedlist = linkedlist + "NULL";
        System.out.println("Linked List: " + linkedlist);
    }

    public static void main(String[] args) {
        node headnode;
        insertnode("A");
        insertnode("B");
        insertnode("C");
        insertnode("D");


        String linkedlist = "";

        printlinkedlist();
        if (searchlinkedlist("A")) {
            System.out.println("'A' found in Linked List");
        }
        else {
            System.out.println("'A' not found in Linked List");
        }


        if (searchlinkedlist("X")) {
            System.out.println("'X' found in Linked List");
        }
        else {
            System.out.println("'X' not found in Linked List");
        }

    }
}
