public class findgreen{
    public static void main ( String a[])
    {
        String[] colors= { "red", "whihte","yellow","green"};
        boolean found =false;
        for(String color : colors){
            if(color.equals("green"))
            {
                found=true;
                break;
            }
        }
        if(found)
        {
        System.out.print("green found");
        }
        else{
            System.out.printf("green not found");
        }
            }
        

        
    }