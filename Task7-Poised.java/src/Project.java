public class Project {
	//Attributes
	private String project_name;
	private int project_number;
	private String ERFnumber;
	private String typeOfBuilding;
	private String project_address;
	private String project_deadline;
	private double totalFee;
	private double amtPaid;
	private Person contractor;
	
	//Constructors
	public Project(String project_name, int project_number, String typeOfBuilding, String project_address, String ERFnumber, String project_deadline, double totalFee2, double amtPaid2, Person contractor)
	{
	this.project_name = project_name;
	this.project_number = project_number;
	this.ERFnumber = ERFnumber;
	this.typeOfBuilding = typeOfBuilding;
	this.project_address = project_address;
	this.project_deadline = project_deadline;
	this.totalFee = totalFee2;
	this.amtPaid = amtPaid2;
	}


	//Getters
	public String getProjectName() {
		return project_name; 	}
	
	public int getProjectNumber() {
		return project_number;		}
	
	public String getERFnumber() {
		return ERFnumber;		}
	
	public String getTOB() {
		return typeOfBuilding; 		}
	
	public String getProjectAddress() { 
		return project_address;			}
	
	public String getProjectDeadline() {
		return project_deadline; 	}
	
	public double getTotalFee() {
		return totalFee; 	}
	
	public double getAmtPaid() {
		return amtPaid; 	}
	
	
	//Setters
	public void setName(String newName) {
		project_name = newName;			}

	public void setProjectNumber(int newProjectNumber) {
		project_number = newProjectNumber; 		}

	public void setTel(String newERFnumber) {
		ERFnumber = newERFnumber;		}

	public void setTOB(String newTOB) {
		typeOfBuilding = newTOB; 		}

	public void setProjectAddress(String newProjectAddress) {
		project_address = newProjectAddress;		  }
	
	public void setProjectDeadline(String newProjectDeadline) {
		project_deadline = newProjectDeadline; 		}
	
	public void setTotalFee(float newTotalFee) {
		totalFee = newTotalFee; 		}
	
	public void setAmtPaid(float newAmtPaid) {
		totalFee = newAmtPaid; 		}
	
	//Methods
	public String display() {
		String output = "\nProject Number: " + project_number
					+ "\nProject Name: " + project_name
					+ "\nType of building: " + typeOfBuilding
					+ "\nAddress:  " + project_address
					+ "\nERF Number:  " + ERFnumber
					+ "\nTotal Fee:  " + totalFee
					+ "\nAmout already payed:  R" + amtPaid
					+ "\nDeadline:  " + project_deadline;
		return output; }
		
	
	
		
	
	
}
