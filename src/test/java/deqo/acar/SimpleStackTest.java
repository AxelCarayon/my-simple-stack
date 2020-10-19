package deqo.acar;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleStackTest {

    Item i;
    SimpleStack s;
    @Before
    public void setUp() {
        i = new Item();
        s = new SimpleStack();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void isEmpty() {
        try{
            assertTrue(s.isEmpty());
            s.push(i);
            assertFalse(s.isEmpty());
        }catch (Exception e){
            System.out.println(e);
        }
    }

    @Test
    public void getSize() {
        try{
            assertEquals(0,s.getSize());
            s.push(i);
            assertEquals(1,s.getSize());
        }catch (Exception e){
            System.out.println(e);
        }
    }

    @Test
    public void push() {
        try{
            assertEquals(0,s.getSize());
            s.push(i);
            assertEquals(1,s.getSize());
        }catch (Exception e){
            System.out.println(e);
        }
    }

    @Test
    public void peek() {
        try{
            s.push(i);
            assertEquals(s.peek(),i);
        }catch (Exception e){
            System.out.println(e);
        }
    }

    @Test
    public void pop() {
        try{
            s.push(i);
            s.pop();
            assertTrue(s.isEmpty());
        }catch (Exception e){
            System.out.println(e);
        }
    }
}