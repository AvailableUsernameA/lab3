import static org.junit.Assert.*;

import org.junit.*;

public class LinkedListTests {

    @Test
    public void testPrepend() {
        LinkedList input = new LinkedList();
        input.prepend(5);
        LinkedList result = new LinkedList();
        Node Node1 = new Node(5, null);
        result.root = Node1;
        assertEquals(result.toString(), input.toString());

        input.prepend(7);
        Node Node2 = new Node(7, Node1);
        result.root = Node2;
        assertEquals(result.toString(), input.toString());
    }

    @Test
    public void testAppend() {
        LinkedList input = new LinkedList();
        LinkedList result = new LinkedList();
        input.append(5);
        Node Node1 = new Node(5, null);
        result.root = Node1;
        assertEquals(result.toString(), input.toString());

        input.append(7);
        Node Node2 = new Node(7, null);
        Node1.next = Node2;
        assertEquals(result.toString(), input.toString());

        input.append(9);
        Node Node3 = new Node(9, null);
        Node2.next = Node3;
        assertEquals(result.toString(), input.toString());
    }

    @Test
    public void testFirst() {
        LinkedList input = new LinkedList();
        //assertEquals(null, input.first());
        
        input.append(7);
        assertEquals(7, input.first());

        input.append(9);
        assertEquals(7, input.first());
    }

    @Test
    public void testLast() {
        LinkedList input = new LinkedList();
        
        input.append(7);
        assertEquals(7, input.last());

        input.append(9);
        assertEquals(9, input.last());

        input.prepend((5));
        assertEquals(9, input.last());
    }

    @Test
    public void testToString() {
        LinkedList input = new LinkedList();
        assertEquals("", input.toString());
        
        input.append(7);
        assertEquals("7 ", input.toString());

        input.append(9);
        assertEquals("7 9 ", input.toString());

        input.prepend((5));
        assertEquals("5 7 9 ", input.toString());
    }

    @Test
    public void testLength() {
        LinkedList input = new LinkedList();
        assertEquals(0, input.length());
        
        input.append(7);
        assertEquals(1, input.length());

        input.append(9);
        assertEquals(2, input.length());

        input.prepend((5));
        assertEquals(3, input.length());
    }
}