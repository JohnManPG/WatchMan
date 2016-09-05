package test;

public class yichangfanhui{ 
    public int add(int a,int b){   
         try {
             return a/b;      
         } 
        catch (Exception e) {  
            System.out.println("catchÓï¾ä¿é");
         }
         finally{ 
             System.out.println("finallyÓï¾ä¿é");
         }
          return 0;
    } 
     public static void main(String argv[]){ 
         yichangfanhui test =new yichangfanhui(); 
         System.out.println("ºÍÊÇ£º"+test.add(9, 0)); 
     }
}
