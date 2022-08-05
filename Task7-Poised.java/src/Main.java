import java.util.Scanner;
import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
		//Person customer = new Person(role, name, telephone, email, address);
		int projectNumber = 0;
		String projectName = null ;
		String buildingType = null;
		String address = null;
		String ERFnumber = null;
		double totalFee = 0;
		double amtPaid = 0;
		String deadline = null;
		String projects = null;
		double outstanding = 0;
		String contractors = null;
		Person contractor = null;
		
		int i = 1;
		while (i != 0) {
			Scanner opt = new Scanner(System.in);
			//Menu to be printed
			String menu = "\nEnter the number you want to choose:"
						+ "\n1: See all projects"
						+ "\n2: Find and select projects"
						+ "\n3: Add new project"
						+ "\n4: Update existing projects"
						+ "\n5: Display projects that are past due"
						+ "\n6: Display unfinished projets"
						+ "\n7: Display completed project"
						+ "\n8: Finalize a project"
						+ "\n0: Quit" 
						+ "\n:  ";
			
			System.out.print(menu);
			int option = opt.nextInt();
			
			
			//See all projects
			if (option == 1) {
				System.out.print(projects + "\n");
			}
				
			
			//Find and select projects
			//Find project by name
			if (option == 2) { 
				System.out.print("1: Search project by name \n2: Search project by number"); }
				
			//Add new project
			if (option == 3) {
				//Project name
				System.out.print("\nProject name:  ");
				Scanner pname = new Scanner(System.in);
				projectName = pname.nextLine();
				System.out.print("Enter the customers' surname:  ");
				Scanner cuSurname = new Scanner(System.in);
				String customerSurname = cuSurname.nextLine();
				if (projectName.length() == 0) {
						projectName = (buildingType + customerSurname); 	}
				else {
					projectName = projectName; 		}
				
				//Project number
				System.out.print("Project number:  ");
				Scanner prnumber = new Scanner(System.in);
				projectNumber = prnumber.nextInt();
					
				//ERF number
				System.out.print("ERF number:  ");
				Scanner prERFnum = new Scanner(System.in);
				ERFnumber = prERFnum.nextLine();
				
				//Type of building
				System.out.print("Type of building:  ");
				Scanner prType = new Scanner(System.in);
				buildingType = prType.nextLine();
				
				//Address
				System.out.print("Project address:  ");
				Scanner prAddress = new Scanner(System.in);
				address = prAddress.nextLine();
				
				//Deadline
				System.out.print("Deadline:  ");
				Scanner prDeadline = new Scanner(System.in);
				deadline = prDeadline.nextLine();
				
				//Total fee
				System.out.print("Total fee:  ");
				Scanner prTotalFee = new Scanner(System.in);
				totalFee = prTotalFee.nextFloat();
				
				//Amount paid
				System.out.print("Amount paid:  ");
				Scanner prAmtPaid = new Scanner(System.in);
				amtPaid = prAmtPaid.nextFloat();
				
					//Persons' attributes
					//New name
				System.out.print("Enter the new name:  ");
				Scanner newName = new Scanner(System.in);
				String name = newName.nextLine();
					
					//Surname
				System.out.print("Enter the new surname:  ");
				Scanner newSurname = new Scanner(System.in);
				String surname = newSurname.nextLine();
					
					//New telephone
				System.out.print("Enter the new telephone number:  ");
				Scanner newTel = new Scanner(System.in);
				String telephone = newTel.nextLine();
					
					//New email
				System.out.print("Enter the new email address:  ");
				Scanner newEmail = new Scanner(System.in);
				String Email = newEmail.nextLine();
					
					//New address
				System.out.print("Enter the new address:  ");
				Scanner newAddress = new Scanner(System.in);
				String Address = newAddress.nextLine();
				
				Person Contractor = new Person("contractor", name, surname, telephone, Email, Address);
				Project createProject = new Project(projectName, projectNumber, buildingType, address, ERFnumber, deadline, totalFee, amtPaid, Contractor);
				String theContractor = Contractor.to_string();
				contractors += theContractor;
				String project = createProject.display();
				projects += project;
				System.out.print("\nProject has been created.\n");
			}
			
			//Update existing project
			else if (option == 4) {
				//Menu to be printed
				String display = "\nChoose which option you want to update"
						+ "\n1: Update project name"
						+ "\n2: Update project number"
						+ "\n3: Update ERF number"
						+ "\n4: Update type of building"
						+ "\n5: Update project address"
						+ "\n6: Update deadline"
						+ "\n7: Update amount paid"
						+ "\n8: Update the contractors contact details"
						+ "\n:  ";
				System.out.print(display);
				Scanner Choices = new Scanner(System.in);
				int choices = Choices.nextInt();
				
				//Update Project name
				if (choices == 1) {
					System.out.print("Please enter the new name");
					Scanner newName = new Scanner(System.in);
					String newProjectName = newName.nextLine();
					System.out.print("Project name has been changed to:  " + newProjectName + "\n");
					Project displayEdit = new Project(newProjectName, projectNumber, buildingType, address, ERFnumber, deadline, totalFee, amtPaid, contractor); 
					}
													
				//Update project number
				else if (choices == 2) {
					System.out.print("Please enter the new project number:  ");
					Scanner prNumber = new Scanner(System.in);
					int newProjectNumber = prNumber.nextInt();
					System.out.print("Project number has been changed to:  " + newProjectNumber + "\n");
					Project displayEdit = new Project(projectName, newProjectNumber, buildingType, address, ERFnumber, deadline, totalFee, amtPaid, contractor);
					}
						
				//Update type of building
				else if (choices == 3) {
					System.out.print("Please enter the new type of building:  ");
					Scanner TOB = new Scanner(System.in);
					String newType = TOB.nextLine();
					System.out.print("Type of building has been changed to:  " + newType + "\n");
					Project displayEdit = new Project(projectName, projectNumber, newType, address, ERFnumber, deadline, totalFee, amtPaid, contractor);
					}
				//Update address
				else if (choices == 4) {
					System.out.print("Please enter the new address:  ");
					Scanner Address = new Scanner(System.in);
					String newAddress = Address.nextLine();
					System.out.print("Address has been changed to:  " + newAddress + "\n");
					Project displayEdit = new Project(projectName, projectNumber, buildingType, newAddress, ERFnumber, deadline, totalFee, amtPaid, contractor); 
					}
				//Update ERF number
				else if (choices == 5) {
					System.out.print("Please enter the new ERF number:  ");
					Scanner newERFnum = new Scanner(System.in);
					String newERFnumber = newERFnum.nextLine();
					System.out.print("ERF number has been changed to:  " + newERFnumber + "\n");
					Project displayEdit = new Project(projectName, projectNumber, buildingType, address, newERFnumber, deadline, totalFee, amtPaid, contractor); 				
					}
				//Update Deadline
				else if (choices == 6) {
					System.out.print("Please enter the new deadline:  ");
					Scanner date = new Scanner(System.in);
					String newDeadline = date.nextLine();
					System.out.print("Deadline has been changed to:  " + newDeadline + "\n");
					Project displayEdit = new Project(projectName, projectNumber, buildingType, address, ERFnumber, newDeadline, totalFee, amtPaid, contractor); 				
					}
			
				//Update the Total amount paid
				else if (choices == 7) {
					System.out.print("Please enter the new Total Amount Paid:  ");
					Scanner amount = new Scanner(System.in);
					double newAmtPaid = amount.nextDouble();
					System.out.print("Amount paid has been changed to:  " + newAmtPaid + "\n");
					Project displayEdit = new Project(projectName, projectNumber, buildingType, address, ERFnumber, deadline, totalFee, newAmtPaid, contractor);						
					}
					
				//Update contractors contact details
				else if (choices == 8) {
							
					//New name
					System.out.print("Enter the new name:  ");
					Scanner newName = new Scanner(System.in);
					String name = newName.nextLine();
						
					//Surname
					System.out.print("Enter the new surname:  ");
					Scanner newSurname = new Scanner(System.in);
					String surname = newSurname.nextLine();
						
					//New telephone
					System.out.print("Enter the new telephone number:  ");
					Scanner newTel = new Scanner(System.in);
					String telephone = newTel.nextLine();
						
					//New email
					System.out.print("Enter the new email address:  ");
					Scanner newEmail = new Scanner(System.in);
					String Email = newEmail.nextLine();
						
					//New address
					System.out.print("Enter the new address:  ");
					Scanner newAddress = new Scanner(System.in);
					String Address = newAddress.nextLine();
							
					Person contractorEdit = new Person("contractor", name, surname, telephone, Email, Address);
					System.out.print("\nThe contractors' details has been updated.\n");
					}
				}
				
				//Display projects that are past due
				//else if (option == 5) { }
					
				//Display unfinished projects
				//else if (option == 6) { }
					
				//Display completed projects
				//else if (option == 7) { }
				
				//Finalizing the project
				else if (option == 8) {
					outstanding = totalFee - amtPaid;
					if (totalFee == amtPaid) {
						System.out.print("Finances of this project has been fully settled. \nEnter the completion date:");
						Scanner completionDate = new Scanner(System.in);
						String dateCompleted = completionDate.nextLine();
						System.out.print(projects + "\nCompletion date: " + dateCompleted + "\n");
					}
					else {
						System.out.print("\nInvoice: \nTotal Fee: " + totalFee + "\nAmount paid: " + amtPaid + "\nOutstanding: " + totalFee + " - " + amtPaid + " = " + outstanding);
						System.out.print("\n\nCustomer's contact details: " + contractors);
						System.out.print("\n\nAmount to pay = " + outstanding);
						System.out.print("\n\nThe invoice has been send to the customer.\n");
						}
				}
			else {
				System.out.print("Goodbye!");
				break;
			}
			}
		}
}