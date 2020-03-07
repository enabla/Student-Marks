public class GradeBook{
	private String subject;
	private int[] mrks;
	
	public GradeBook(String subject, int[] mrks){
		this.subject = subject;
		this.mrks = mrks;
	}
	
	public void setSubject(String subject){
		this.subject = subject;
	}
	
	public String getSubject(){
		return subject;
	}
	
	public void processMrks(){
		outputMarks();
		System.out.println();
		System.out.printf("Average score is %.2f marks.%n%n",getAverage());

		System.out.printf("The minimum score is %d marks%nThe maximum score is %d marks%n%n%n",getMinimum(),getMaximum());
		
		outputBarChart();
	}
	
	public int getMinimum(){
		int minimum = mrks[0];
		for(int mrk : mrks){
			if(mrk < minimum){
				minimum = mrk;
			}
		}
		return minimum;
	}
	
	public int getMaximum(){
		int maximum = mrks[0];
		for(int mrk : mrks){
			if(mrk > maximum){
				maximum = mrk;
			}
		}
		return maximum;
	}
	
	public double getAverage(){
		int sum = 0;
		for(int mark : mrks){
			sum += mark;
		}
		return (double) sum/mrks.length;
	}
	
	public void outputBarChart(){
		System.out.println("MARKS DISTRIBUTION");	
		
		int[] rg = new int[11];
		
		System.out.println();
		System.out.printf("%s%s%s%n","Range","   ","Frequency");
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
	
	public void outputMarks(){
		System.out.println("MARKS SCORED");
		for(int i = 0; i < mrks.length; i++){
			System.out.printf("%3d%6s%d%n",i+1," ",mrks[i]);
		}
	}
}