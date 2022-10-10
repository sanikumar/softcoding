import java.util.*;
 
 
 class display

 {
    public static void main (String[] args)
   {
       System.out.println("underlove");
       Scanner sc= new Scanner(System.in );
       int a = sc.nextInt();
              System.out.println(a);
     List<String> list = Arrays.asList(args);
        Collections.sort(list);
        System.out.println(list);
     

       sc.close();
   }
 }
