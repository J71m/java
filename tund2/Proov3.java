import java.util.*;
public class Proov3{
  public static void main(String[] args) {
    List<Isikukood> isikukoodid=new ArrayList<Isikukood>();
    isikukoodid.add(new Isikukood("39708290123"));

    for(Isikukood kood: isikukoodid){
        System.out.println(kood.aastaarv4kohta());
    }

    isikukoodid.stream().forEach(System.out::println);
    for (int i = 0;i< isikukoodid.size() ; i++) {
          System.out.println(isikukoodid.get(i));
    }
    
  }
}
