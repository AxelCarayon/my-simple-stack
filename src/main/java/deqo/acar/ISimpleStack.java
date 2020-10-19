package deqo.acar;

import java.util.EmptyStackException;

public interface ISimpleStack {
    /**
     * Test if this stack is empty;
     */
    public boolean isEmpty();

    /**
     * Returns the number of items in this stack;
     **/
    public int getSize();


    /**
     * Pushes an item onto the top of this stack.
     * null item is allowed.
     */
    public void push(Item item);

    /**
     *
     * Removes the object at the top of this stack without removing it for the stack.
     * @throws EmptyStackException
     */
    public Item peek() throws EmptyStackException;

    /**
     *
     * Removes the object at the top of this stack and returns that object as the value of this function.
     * @throws EmptyStackException
     */
    public Item pop() throws  EmptyStackException;
}