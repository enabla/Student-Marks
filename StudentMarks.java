import java.util.Scanner;

public class StudentMarks{
	private static String studentNames;
	private int adminNo;
	private int[] subjMks;
	private int totalMks;
	
	public StudentMarks(String names, int admNo){
		this.studentNames = names;
		this.adminNo = admNo;
	}
	
	public void setNames(String studentNames){
		this.names = studentNames;
	}
	
	public String getNames(){
		return studentNames;
	}
	
	public void setAdminNo(int adminNo){
		this.adminNo = adminNo;
	}
	
	public int getAdminNo(){
		return adminNo;
	}
	
	public void getMks(){
		Scanner input = new Scanner(System.in);
		this.subjMks[] = new int[8];
		int tMks = 0;
		int smks = 0;
		for(int sMrks:subjMks){
			System.out.printf("Enter marks for %s.%n",studentNames);
			smks = input.nextInt();
			if(smks <= 100){
				subjMks[sMrks] = smks;
			} else {
				System.out.printf("Marks cannot be above 100 percent. So %d is invalid marks.%n",smks);
			}
			tMks += smks;
		}
		this.totalMks = tMks;
	}
	
	public int getTMrks(){
		return totalMks;
	}
	
	public void listMks(){
		for(int sMrks:subjMks){
			System.out.printf("%02d%2s",subjMks[sMrks]," ");
		}
	}
}