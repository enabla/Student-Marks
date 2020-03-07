public class BarGraph{
	public static void main(String[] args){
		int[] mrks = {87,68,94,100,83,78,85,91,76,87};
		int[] rg = new int[11];
		
		System.out.println();
		System.out.printf("%s%s%s%n","RANGE","   ","FREQUENCY");
		for(int i = 0; i < rg.length; ++i){
			if(i == 10){
				System.out.printf("%10d%s",100,":  ");
			} else
			System.out.printf("%5d -%3d%s",i*10,i*10+9,":  ");
		int c = 0;
		    while(c < mrks.length){
			if((mrks[c])/10 == i){
				System.out.print("*");
			}
			c++;
		}
			System.out.println();
		}
	}
}