package test;

public class yichangfanhui{ 
    public int add(int a,int b){   
         try {
             return a/b;      
         } 
        catch (Exception e) {  
            System.out.println("catch����");
         }
         finally{ 
             System.out.println("finally����");
         }
          return 0;
    } 
     public static void main(String argv[]){ 
         yichangfanhui test =new yichangfanhui(); 
         System.out.println("���ǣ�"+test.add(9, 0)); 
     }
}
