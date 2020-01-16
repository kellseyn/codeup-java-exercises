import java.util.Iterator;
import java.util.NoSuchElementException;

public class Stack<Item> implements Iterable<Item>{
    private int n;
    private Node first;

    @Override
    public Iterator<Item> iterator() {
        return null;
    }

    private class Node{
        private Item item;
        private Node next;
    }

    public Stack (){
        first = null;
        n = 0;
    }

    public boolean isEmpty(){
        return first == null;
    }

    public int size(){
        return n;
    }

    public void push(Item item){
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
        n++;
    }

    public Item pop(){
        if (isEmpty())throw new NoSuchElementException("Stack Underflow");
        Item item = first.item;
        first = first.next;
        n--;
        return item;
    }




    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        System.out.println("Test to see if Stack is empty " + stack.isEmpty());
        System.out.println("Num of items in stack " + stack.size());

    }

}
