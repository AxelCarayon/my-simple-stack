package deqo.acar;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;

import static org.junit.Assert.*;

public class SimpleStackTest {

    Item i;
    SimpleStack s;
    SimpleStack s2;

    /**
     * Crée un item et le stack qui sera utilisé.
     */
    @Before
    public void setUp() {
        i = new Item();
        s = new SimpleStack();
        s2 = mock(SimpleStack.class);
    }

    @After
    public void tearDown() {
    }

    /**
     * Teste si le stack est vide à son initialisation et si il n'est pas vide quand on lui rajoute un élément.
     */
    @Test
    public void isEmpty() {
        when(s2.isEmpty()).thenReturn(true);
        System.out.println(s2.isEmpty());
        when(!s2.isEmpty()).thenReturn(false);
        s2.push(i);
        System.out.println(s2.isEmpty());
        try{
            assertTrue(s.isEmpty());
            s.push(i);
            assertFalse(s.isEmpty());
        }catch (Exception e){
            System.out.println(e);
        }
    }

    /**
     * Teste que la taille est bien de 0 et qu'elle incrémente bien quand on rajoute un élément dedans.
     */
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

    /**
     * Teste que un élément as bien été ajouté après un push.
     */
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

    /**
     * Vérifie que l'item ajouté en tête de liste est bien égal à celui qu'on as mis dans la liste.
     */
    @Test
    public void peek() {
        try{
            s.push(i);
            assertEquals(s.peek(),i);
        }catch (Exception e){
            System.out.println(e);
        }
    }

    /**
     * Teste que la liste est bien vide quand on as enlevé un élément dans la liste.
     */
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