import java.util.*;
public class Proov3{
  public static void main(String[] args) {
    List<Isikukood> isikukoodid=new ArrayList<Isikukood>();
    Map<Integer, Integer>aastasagedused=new HashMap<Integer, Integer>();
    Map<String, Integer>kuusagedused=new HashMap<String, Integer>();
    isikukoodid.add(new Isikukood("39708290123"));
    isikukoodid.add(new Isikukood("39708290123"));
    isikukoodid.add(new Isikukood("39511160596"));

    for(Isikukood kood: isikukoodid){
        //loetle ainult aasta, ülejäänud kuude ja aastate sageduste jaoks
        //System.out.println(kood.aastaarv4kohta());
        int aasta = kood.aastaarv4kohta();
        String kuu = kood.kuunimi();
        if (kuusagedused.get(kuu) == null) {
          kuusagedused.put(kuu,1);
        }else{
          int kuuKogus=kuusagedused.get(kuu);
          kuusagedused.put(kuu, kuuKogus+1);
        }
        if (aastasagedused.get(aasta) == null) {
          aastasagedused.put(aasta,1);

        }else{
          int kogus=aastasagedused.get(aasta);
          aastasagedused.put(aasta, kogus+1);
        }

    }
    // kuupäevade loetlemine 2 varianti
    isikukoodid.stream().forEach(System.out::println);

    for (int i = 0;i< isikukoodid.size() ; i++) {
          System.out.println(isikukoodid.get(i));
    }

    System.out.println(aastasagedused );
    System.out.println(kuusagedused);



  }
}
