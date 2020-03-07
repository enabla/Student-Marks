public class ReportFormTest{
	public static void main(String[] args){
		int[][] results =  {{87,96,70},
			                {68,87,90},
						    {94,100,90},
						    {100,81,82},
						    {83,65,85},
							{78,87,65},
							{85,75,83},
							{91,94,100},
							{76,72,84},
							{87,93,73}};
		
		ReportForm myClassResult = new ReportForm("Form 3 Term II", results);
		System.out.printf("Here is the Class results for:%n%s%n%n",myClassResult.getSubject());
		myClassResult.processMks();
	}
}