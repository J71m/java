import java.io.Console;
public class ilm{
	
	
	
	public static String kooliminekuHinnang(int temp) {
		if(temp<-28){return "Külmapüha!";}
		return "Lähed kooli";
	}
	public static String riietusHinnang(int temp, int sademed){
		if(temp>0){return "kanna mida tahad";}
		if(temp<-10){
			String[] talveriided={
				"mantel","vanaisa sokk", "puhvaika"};
			return talveriided[(int)(Math.random()*talveriided.length)];
		}
		return (sademed>0) ? "vihmavari" : "jope";
	}
	
	public static void main(String[] arg) {
		int temp=-15;
		int sademed=4;
		/*Console console = System.console();
		int temp=Integer.parseInt(console.readLine("temp:"));
		int sademed=Integer.parseInt(console.readLine("sademed:"));*/
		try{
			if(arg.length>0){temp=Integer.parseInt(arg[0]);}
			if(arg.length>1){sademed=Integer.parseInt(arg[1]);}
		}catch (Exception e){
			System.out.println(
			"Kirjuta õigesti");
			return;
		}

		
		System.out.println(kooliminekuHinnang(temp));
		System.out.println(riietusHinnang(temp, sademed));
	}
}