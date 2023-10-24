import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        try(Scanner tangentbord = new Scanner(System.in)) 
        {
            int litetTal=10;
            if(litetTal<1000)
            {
                int stortTal=1000;
                System.out.println(litetTal + " är mindre än "+stortTal);
            }
            else
            {
                int stortTal=1000;
                System.out.println(litetTal + "är mindre än "   +stortTal);
            }

            {
                int stortTal=1000;
                 System.out.println("litetTal="+litetTal+", stortTal=" +stortTal);
            }
        // B och C uppgift
        int tal1 = 10;
        int tal2 = 0;
       
         if(tal1<tal2)
        {
           
                System.out.println(tal2 + " är större än "+tal1);
        }else{
          
            System.out.println(tal2 + " är mindre än "+tal1);
        }
        // D uppgift

        System.out.println("Vad är klockan: ");
        int klockan = tangentbord.nextInt(); 
        if(klockan>=7 && klockan <=8)
        {
            System.out.println(" dags att vakna upp");
        }
        else if(klockan>12)
        {
            System.out.println("Dags att äta");
        }
        
       
    }
}
}