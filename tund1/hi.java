public class hi{
	public static void main(String[] arg) {
		System.out.println("Tere");
		int temp=-10;
		if(arg.length>0){
			temp=Integer.parseInt(arg[0]);
		}
		if(temp<=-28){
			System.out.println("külmapüha");
		}
		if(temp>=15){
			System.out.println("T-särk soovituslik");
		}else{
			System.out.println("kooli");
		}
	}
	
}