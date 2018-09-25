import java.util.*;

public class LinkedListClass
{
    private Node first;
    
    
    class Node
    {
        public Object data;
        public Node next;
    }
    
    public LinkedListClass()
    {
        first = null;
    }
    
    public void addFirst(Object element)
    {
        Node newNode = new Node();
        newNode.data = element;
        newNode.next = first;
        first = newNode;
        
    }
    
    public Object getFirst()
    {
        if (first == null)
            throw new NoSuchElementException();
        else
            return first.data;
    }
    
    public Object removeFirst()
    {
        if (first == null)
            throw new NoSuchElementException();
        else
        {
            Object temp = first.data;
            first = first.next;
            return temp;
        }
    }
}
