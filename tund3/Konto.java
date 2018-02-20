import java.io.*;
public class Konto{
    protected String kontonr;
    public static final String kaust = "kontod/";
    public Konto(String andmed){
        kontonr = andmed;
    }
    public Boolean otsiKonto(){
        return new File("kontod/"+kontonr+".txt").exists();
    }
    public String kysiKontoNr(){
        return kontonr;
    }
    public int algus(){
        if(!otsiKonto()){
            PrintWriter output;
            try {
              output = new PrintWriter(new FileWriter(kaust+kontonr+".txt"));
              output.println(0);
              output.close();
            }catch (Exception e) { }
        }
        return 0;
    }
    public boolean kirjutaSumma(int eurod){
        try{
            PrintWriter pw=new PrintWriter(new FileWriter(kaust+kontonr+".txt"));
            pw.println(eurod);
            pw.close();
            return true;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return false;
    }
    public String raha(){
        String rida = "Midagi läks valesti!";
        try {
            BufferedReader br=new BufferedReader(new FileReader(kaust+kontonr+".txt"));
            rida=br.readLine();

            br.close();
            return rida;
        }catch (Exception e){}

        return rida;
    }
    public int lisaSumma(int eurod){
        int sisu=raha();
        sisu +=eurod;
        kirjutaSumma(sisu);
        return sisu;
    } 
   
}