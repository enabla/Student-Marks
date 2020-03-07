import java.util.Scanner;

public class MarksClass{
	private String classNames[];
	private int classAdms[];
	private MarkStudent clasSbjectMks[];
	private int studenTotalMks[];
	private int students;
	private int sumOfMrks;
	private double averageMrks;
	
	public MarksClass(){
		Scanner input = new Scanner(System.in);
		System.out.println("How many students did the exam?");
		int popltn = input.nextInt();
		this.students = popltn;
		this.classNames = new String[students];
		this.classAdms = new int[students];
		this.clasSbjectMks = new MarkStudent[students];
	}
	
	public void makeList(){
		Scanner input = new Scanner(System.in);
		int sumOfMrks = 0;
	
		for(int list = 0; list < classAdms.length; list++){
			System.out.println("Enter student names:");
			String names = input.nextLine();
			
			System.out.println("Enter the student admission Number:");
			int admn = input.nextInt();
			
			MarkStudent stdnt = new MarkStudent(names, admn);
			
			
			stdnt.setNames(names);
			classNames[list] = stdnt.getNames();
			
			
			stdnt.setAdminNo(admn);
			classAdms[list] = stdnt.getAdminNo();
			
			stdnt.getMks();
			clasSbjectMks[list] = stdnt.getStMks();
			
			studenTotalMks[list] = stdnt.getTMrks();
		}
		this.sumOfMrks = sumOfMrks;
		System.out.printf("%s%4s%10s%20S%s%n","No.","Admn","NAMES","MARKS","TOTALS");
		for(int list:classAdms){
			System.out.printf("%d%4d%10s%3d%n",list,classAdms[list],classNames[list],studenTotalMks[list]);
		}
		System.out.printf("%39s%d%n","Total Marks",sumOfMrks);
	}
}