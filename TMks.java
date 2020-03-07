public class TMks{
	public static void main(String[] args){
		int[] Mks = {67,34,55,78,81,67,68,72};
		int totalMks = 0;
		for(int sum : Mks)
			totalMks += sum;
		
		System.out.printf("The sum of all the 8 marks is %d.%n",totalMks);
	}
}