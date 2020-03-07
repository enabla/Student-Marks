public class Bars{
	public static void main(String[] args){
		int[] mrks = {87,68,94,100,83,78,85,91,76,87};
		String[] rage = {"0  -  9","10 - 19","20 - 29","30 - 39","40 - 49","50 - 59","60 - 69","70 - 79","80 - 89","90 - 99","All 100"};
		
		System.out.println();
		System.out.printf("%6s%12s%n","RAGE","FREQUENCY");
		int r = 0;
		
		for(int i = 0; i < rage.length; i++){
			System.out.printf("%6s",rage[i]);
			System.out.printf("%3s"," ");
			for(int m = 0; m < mrks.length; m++){
				if((mrks[m])/10 == i){
					System.out.print("* ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}
}