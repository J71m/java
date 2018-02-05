/*import java.io.*;
import java.util.*;
public class Proov4{
  public static void main(String[] args)  throws Exception{
    BufferedReader br=new BufferedReader(new FileReader("andmed.txt"));
    List<Isikukood> isikukoodid=new ArrayList<Isikukood>();
    String rida=br.readLine();
    while (rida!=null) {
      isikukoodid.add(new Isikukood(rida));
      rida=br.readLine();
    }
    br.close();
    System.out.println(isikukoodid);
  }
}*/
import java.io.*;
import java.util.*;
public class Proov4{
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new FileReader("andmed.txt"));
        List<Isikukood> isikukoodid=new ArrayList<Isikukood>();
        String rida=br.readLine();
        while(rida!=null){
            isikukoodid.add(new Isikukood(rida));
            rida=br.readLine();
        }
        br.close();
        System.out.println(isikukoodid);
    }
}
