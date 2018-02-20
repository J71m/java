import java.util.*;
import java.io.*;
public class Kontor{
    Map<String, Konto> kontod=new HashMap<String, Konto>();
    protected void loeKontod(){
        public Kontor(){
            loeKontod();
        }
        String[] fnimed=new File(Konto.kontokaust).list();
        for(String fnimi: fnimed){
            kontod.put(fnimi, new Konto(fnimi));
        }
    }
    public String kontoSisu(String kontonr){
        if(kontod.get(kontonr)!=null){
            return "Konto "+kontonr+" saldo "+kontod.get(kontonr).loeSumma();

        }
        return "konto "+kontonr+" puudub";
    }
}