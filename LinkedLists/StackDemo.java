
public class StackDemo
{
    public static void main(String[] args)
    {
        LinkedListStack demo = new LinkedListStack();
        
        demo.push("Smash");
        demo.push("In");
        demo.push("Waluigi");
        demo.push("Put");
        
        while (demo.isEmpty() == false)
            System.out.println(demo.pop());
    }
}
