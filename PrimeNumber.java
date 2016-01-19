public class BilanganPrima{
	public static void main(String[] args){
		int bilangan = 7;
		boolean prima = true;
		
		for (int i=2; i<=(bilangan/2); i++){
			if ((bilangan%1) == 0){
				prima = false;
				break;
			}
		}
		if (prima){
			System.out.println(bilangan+" merupakan bilangan prima");
		}
		else{
			System.out.println(bilangan+" bukan bilangan prima");
		}
			
	}
}
