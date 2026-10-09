public class Loop_1 {
    public static void main(String[] args){
          
          //print100Stars(100);
           printStargrid(5);
        }
      

    
    

public static void print100Stars(int countOfStars){



for(int count=1;count<=100;count++){
    System.out.print("* ");
}}
public static void printStargrid(int gridsize){
    for(int count=1;count<=gridsize;count++)
    {
    for(int row=1;row<=gridsize;row++)

    {
        System.out.print("*");
    }
    System.out.println("");
}
}
} 