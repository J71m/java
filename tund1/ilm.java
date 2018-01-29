public class ilm{
	
	public static String kooliminekuHinnang(int temp) {
		if(temp<-28){return "Külmapüha!";}
		return "Lähed kooli";
	}
	public static String riietusHinnang(int temp, int sademed){
		if(temp<0 && sademed>=1){return "soe kilejope soovituslik";}
		return "riietu kuidas tahad";
	}
	
	public static void main(String[] arg) {
		int temp=-10;
		int sademed=0;
		System.out.println(kooliminekuHinnang(temp));
		System.out.println(riietusHinnang(temp, sademed));
	}
}