

/**
 * Write a description of interface ListIterator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface ListIterator
{
    Object next();
    
    boolean hasNext();
    
    void add(Object element);
    
    void remove(Object element);
}
