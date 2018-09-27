
public class TestDataStruc
{
    public static void main(String[] args)
    {
        LinkedListClass list = new LinkedListClass();
        
        String word = "Hello";
        String word2;
        
        list.addFirst(word);
        word2 = (String)list.getFirst();
        System.out.println(word2);
    }
}
