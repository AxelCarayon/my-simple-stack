package deqo.acar;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleStackTest {

    Item i;
    SimpleStack s;
    @Before
    public void setUp() throws Exception {
        i = new Item();
        s = new SimpleStack();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void isEmpty() {
        assertTrue(s.isEmpty());
        s.push(i);
        assertFalse(s.isEmpty());
    }

    @Test
    public void getSize() {
        assertEquals(0,s.getSize());
        s.push(i);
        assertEquals(1,s.getSize());
    }

    @Test
    public void push() {
        assertEquals(0,s.getSize());
        s.push(i);
        assertEquals(1,s.getSize());
    }

    @Test
    public void peek() {
        s.push(i);
        assertEquals(s.peek(),i);
    }

    @Test
    public void pop() {
        s.push(i);
        s.pop();
        assertTrue(s.isEmpty());
    }
}