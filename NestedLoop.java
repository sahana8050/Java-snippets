public class NestedLoop
 {

    public static void main(String a[])
    {
        int i =0;
        while(i<=4)
        {
            System.out.println("hi"+i );
            {
                int j=0;
                while(j<=0)
                {
                    System.out.println("how are you?");
                    j++;
                }
            }
            i++;
    
        } 

        System.out.println("bye"+i);
    }

}
