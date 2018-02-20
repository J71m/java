import java.util.Scanner;
public class kontod{
    public static void main(String[] args) {
        int convert = 1;
    System.out.println("Sisesta konto kujul ");
    System.out.println("Lõpetamiseks sisesta exit või quit");
    Scanner scanner = new Scanner (System.in);
    System.out.print("Konto number: ");
    String entry = scanner.next();
    while (convert == 1){
        System.out.print("Konto "+entry+"-> ");
        String tegevus = scanner.next();
        if(tegevus.equals("jääk")){
            Konto a=new Konto(entry);
            if(!a.otsiKonto()){
                a.algus();
                System.out.println("Konto loodud, jääk 0");
            }else{
               System.out.println("Konto jääk: "+a.raha());
            }
            
        }else if(tegevus.equals("sisesta")){
            System.out.print("Sisesta summa-> ");
            String summa = scanner.next();
            int sisesta = Integer.parseInt(summa);
            System.out.println(a.lisaSumma(sisesta));
        }
        else if (tegevus.equals("exit") || tegevus.equals("quit") || tegevus.equals("stop")) {
            convert = 0;
        }else{
            System.out.println("Kontrolli sisendit");
        }
    }
    }
}