package deqo.acar;

import java.util.EmptyStackException;
import java.util.Stack;

public class SimpleStack extends Stack implements ISimpleStack{

    public SimpleStack(){
        super();
    }

    @Override
    public boolean isEmpty() {
        return super.isEmpty();
    }

    @Override
    public int getSize() {
        return super.size();
    }

    @Override
    public void push(Item item) {
        super.push(item);
    }

    @Override
    public Item peek() throws EmptyStackException {
        return (Item) super.peek();
    }

    @Override
    public Item pop() throws EmptyStackException {
        return (Item) super.pop();
    }
}
