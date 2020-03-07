public class ReportForm{
	private String subject;
	private int[][] mrks;
	
	public ReportForm(String subject, int[][] mrks){
		this.subject = subject;
		this.mrks = mrks;
	}
	
	public void setSubject(String subject){
		this.subject = subject;
	}
	
	public String getSubject(){
		return subject;
	}
	
	public void processMks(){
		outPutMks();
		
		System.out.printf("%n%s% d%n%s %d%n%n",
						"The lowest marks is",getMinimum(),
						"The highest marks is",getMaximum());
						
		outPutBarGraph();
	}
	
	public int getMinimum(){
		
		int minimum = mrks[0][0];
		for(int[] studentMks : mrks){
			for(int mrks : studentMks){
				if(mrks < minimum){
					minimum = mrks;
				}
			}
		}
		return minimum;
	}
	
	public int getMaximum(){
		
		int maximum = mrks[0][0];
		for(int[] studentMks : mrks){
			for(int mrks : studentMks){
				if(mrks > maximum){
					maximum = mrks;
				}
			}
		}
		return maximum;
	}
	
	public int getSumOfMks(int[] stdntMks){
		int total = 0;
		
		for(int mks : stdntMks){
			total += mks;
		}
		return total;
	}
	
	public double getAverageMks(int[] stdntMks){
		return (double)getSumOfMks(stdntMks)/stdntMks.length;
	}
	
	public void outPutBarGraph(){
		int[] sets = new int[11];
		
		for(int[] studentMks : mrks){
			for(int mrks : studentMks){
				++sets[mrks/10];
			}
		}
		for(int counter = 0; counter < sets.length; counter++){
			if(counter == 10){
				System.out.printf("%7d:  ",100);
			}else {
				System.out.printf("%02d - %02d:  ",counter * 10, counter * 10 +9);
			}
			for(int stars = 0; stars < sets[counter]; stars++){
				System.out.print("*");
			}
			System.out.println();
		}

	}
	
	public void outPutMks(){
		System.out.printf("Here are the Marks:%n");
		System.out.print("                ");
		for(int test = 0; test < mrks[0].length; test++){
			System.out.printf("Subject %d  ", test + 1);
		}
		System.out.print("Total  ");
		System.out.println("Average");
		
		for(int student = 0; student < mrks.length; student++){
			System.out.printf("Student %3d",student+1);
			
			for(int test : mrks[student]){
				System.out.printf("%10d",test);
			}
			int sum = getSumOfMks(mrks[student]);
			double mean = getAverageMks(mrks[student]);
			
			System.out.printf("%12d%2s%6.2f%n",sum,"   ",mean);
		}
	}
}