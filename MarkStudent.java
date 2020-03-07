import java.util.Scanner;

public class MarkStudent{
	private static String studentNames;
	private int adminNo;
	private int[] subjMks;
	private int totalMks;
	
	public MarkStudent(String names, int admNo){
		this.studentNames = names;
		this.adminNo = admNo;
	}
	
	public void setNames(String studentNames){
		this.studentNames = studentNames;
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
		//subjMks[] = new int[8];
		int tMks = 0;
		//int smks = 0;
		for(int sMrks = 0; sMrks < subjMks.length; sMrks++){
			System.out.printf("Enter marks for %s.%n",studentNames);
			int smks = input.nextInt();
			if(smks <= 100){
				subjMks[sMrks] = smks;
			} else {
				System.out.printf("Marks cannot be above 100 percent. So %d is invalid marks.%n",smks);
			}
			tMks += smks;
			totalMks = tMks;
		}
		
	}
	
	public MarkStudent getStMks(){
		//MarkStudent[] subjMks = new;
		return subjMks;
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