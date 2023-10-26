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
        else if(klockan>=12 && klockan<23)
        {
            System.out.println("Dags att äta");
        }
    
        else if(klockan>=23)
        {
            System.out.println("dags att gå och lägga sig");
        }

        // E uppgift
        System.out.println("Vad är din ålder: ");
        int ålder= tangentbord.nextInt(); 
        System.out.println("Är du medlem: ");
        tangentbord.nextLine();
        String svar = tangentbord.nextLine();
        
        if(ålder>=18 && svar.equalsIgnoreCase("ja"))
        {
            System.out.println("Du får komma in");
        }
        else 
        {
            System.out.println("Du får ej inträde");
        }

       
    }
}
}