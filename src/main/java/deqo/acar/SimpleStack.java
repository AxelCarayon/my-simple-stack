package deqo.acar;

import java.util.EmptyStackException;
import java.util.Stack;

public class SimpleStack extends Stack implements ISimpleStack{

    /**
     * Fonctionne comme un stack et implémente ISimpleStack.
     */
    public SimpleStack(){
        super();
    }

    /**
     * @return si le stack est vide ou non.
     */
    @Override
    public boolean isEmpty() {
        return super.isEmpty();
    }

    /**
     * @return le nombre d'éléments de le stack.
     */
    @Override
    public int getSize() {
        return super.size();
    }

    /**
     * @param item ce qu'on veut ajouter dans le stack.
     * Ajoute l'Item item dans le stack.
     */
    @Override
    public void push(Item item) {
        super.push(item);
    }

    /**
     * Montre l'item au dessus du stack sans le supprimer.
     * @return le premier item du stack.
     * @throws EmptyStackException si le stack est vide.
     */
    @Override
    public Item peek() throws EmptyStackException {
        return (Item) super.peek();
    }

    /**
     * Montre l'item au dessus du stack et l'enlève.
     * @return le dernier item du stack.
     * @throws EmptyStackException si le stack est vide.
     */
    @Override
    public Item pop() throws EmptyStackException {
        return (Item) super.pop();
    }
}
