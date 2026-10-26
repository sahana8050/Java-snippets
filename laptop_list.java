class laptop{
    void good()
    {
      System.out.println("good laptop");
    }
    void best()
    {
        System.out.println(" good processor");
    }}

    class Hp extends
    laptop{
        void good()
        
            {
            System.out.println("Hp is first brand  working good ");
        }
    }
    
    class Dell extends 
    laptop{
        void best()
        {
            System.out.println("Dell is also good");
        }

    }
        class Lenova extends
    laptop{
        void good()
        
            {
            System.out.println("best for early users");
        }
    }

public class laptop_list {
    public static void main(String[] args ){
        laptop  hp =new Hp();
          hp.good();
        System.out.print("");
        laptop  dell=new Dell();
          dell.best();
        System.out.print("");
        laptop  lenova =new Lenova();
          lenova.best();
        System.out.print("");


        
    }
    
}
