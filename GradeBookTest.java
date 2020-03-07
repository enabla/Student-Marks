public class GradeBookTest{
	public static void main(String[] args){
		int[] sbjctMks = {87,68,94,100,83,78,85,91,76,87};
		
		GradeBook myReportForm = new GradeBook("Mathematics Form 3", sbjctMks);
		System.out.printf("The following are the marks for %s:%n%n",myReportForm.getSubject());
		myReportForm.processMrks();
	}
}