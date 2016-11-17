public class BadIfs
{
   public static void main(String[] args)
   {
      int x = 9;
      int y = 3;
      int z = 7;
      if (x < y)
      {
          System.out.println("aaa");
      }
      else if (x < z)
      {
          System.out.println("bbb"); 
      } 
      else
      {
          System.out.println("ccc");
      }
      System.out.println("ddd");  
      if (y > z && z > x)
      {
          System.out.println("eee");
          System.out.println("fff");
      }
      else
      {
          System.out.println("ggg");  
      }    
}
}


