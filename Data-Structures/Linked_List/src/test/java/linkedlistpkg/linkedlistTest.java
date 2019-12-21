package linkedlistpkg;

import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.*;

public class linkedlistTest {
    @Test
    public void insertnode() {
        linkedlist linkedlistclass = new linkedlist();
        linkedlistclass.insertnode("1");
        assertNotNull("Head should not be null after inserting a node", linkedlistclass.head);
    }
}