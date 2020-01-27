package stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {

    @Test
    public void testToString() {
        Stack testStack = new Stack();
        testStack.push("1");
        testStack.push("2");
        System.out.println(testStack.toString());
    }
}