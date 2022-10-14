import static org.junit.Assert.*;

import java.util.ArrayList;

import java.util.List;

import org.junit.*;

public class ListTests {
    @Test
    public void testFilter() {
        List<String> input1 = new ArrayList<String>();
        input1.add("apple");
        input1.add("hi");
        input1.add("banana");
        List<String> result1 = ListExamples.filter(input1, new longStringChecker());
        List<String> expect1 = new ArrayList<String>();
        expect1.add("apple");
        expect1.add("banana");
        assertEquals(expect1, result1);
    }

    @Test
    public void testMerge() {
        List<String> input1 = new ArrayList<>();
        input1.add("a");
        input1.add("b");
        List<String> input2 = new ArrayList<>();
        input2.add("c");
        List<String> result = ListExamples.merge(input1, input2);
        List<String> expect = new ArrayList<>();
        expect.add("a");
        expect.add("b");
        expect.add("c");
        assertEquals(expect, result);
    }
}