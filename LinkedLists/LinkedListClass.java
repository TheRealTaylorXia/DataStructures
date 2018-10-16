import java.util.*;

public class LinkedListClass
{
    private Node first;
    private int currentSize = 0;
    
    
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
        currentSize++;
        
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
            currentSize--;
            return temp;
        }
    }
    
    public int size()
    {
        return currentSize;
    }
    
    private static Node getNode(int n)
    {
        for (int i=0; i<=n; i++)
        {
            first = first.next;
        }
    }
    
    public Object get(int n)
    {
        
    }
    
    public void set(int n, Object newElement)
    {
        
    }
    
    public ListIterator listIterator()
    {
        return new LinkedListIterator();
    }
    
    class LinkedListIterator implements ListIterator
    {
        private Node position;
        private Node previous;
        private boolean isAfterNext;
        
        public LinkedListIterator()
        {
            position = null;
            previous = null;
            isAfterNext = false;
            
        }
        
        public Object next()
        {
            if (!hasNext())
                throw new NoSuchElementException();
            else
            {
                previous  = position;
                isAfterNext = true;
                
                if (position == null)
                    position = first;
                else
                    position = position.next;
                    
                return position.data;
            }
        }
        
        /*
        public boolean hasNext()
        {
            if (position == null)
                return first != null;
            else
                return position.next != null;
        }*/
        
        public boolean hasNext()
        {
            return position != null;
        }
                
        public void add(Object element)
        {
            if (position == null)
            {
                first.data = element;
            }
            else
            {
                Node newNode = new Node();
                newNode.data = element;
                newNode.next = position.next;
                position.next = newNode;
                position = newNode;
            }
            currentSize++;
            isAfterNext = false;
        }
                
        public void remove(Object element)
        {
            if (!isAfterNext)
                throw new IllegalStateException();
            if (position == first)
                removeFirst();
            else
            {
                previous.next = position.next;
            }
            position = previous;
            currentSize--;
            isAfterNext = false;
        }
    }
}
