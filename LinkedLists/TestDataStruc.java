
public class TestDataStruc
{
    public static void main(String[] args)
    {
        CircularArrayQueue circle = new CircularArrayQueue();
        
        circle.add("Tom");
        circle.add("Diana");
        circle.add("Harry");
        circle.add("Bart");
        
        circle.firstToLast();
        circle.lastToFirst();
        
        while (circle.empty() != true)
        {
            System.out.print(circle.remove());
        }
    }
}
