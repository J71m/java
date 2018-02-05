public class Proov1{
    public static void main(String[] arg){
        Isikukood t=new Isikukood("39708290123");
        Isikukood toomas=new Isikukood("50804250357");
        System.out.println("Kuu nr "+t.kuunr()+" nimega "+t.kuunimi()+
           ", päev nr "+t.paevanr());

        System.out.println(toomas.kuunr()+" "+toomas.aastaarv4kohta());
    }
}
