package project1;

import java.util.Scanner;

public class employeeApp {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		employeeservice e= new employeeServiceImpl();
		System.out.println("=========welcome to employee-DB =========");
		while(true) {
			System.out.println("====menu====");
			System.out.println("1.Create employee-DB \n2. Available Index \n3. Add-Employee \n4. Display-All \n5. Get emp by Eid ");
			System.out.println("6. \n7.Exit");
			System.out.println("Enter your Option:- ");
			int op=ip.nextInt();
			switch(op) {
			case 1:System.out.println("Enter the size of DB:-");
			   int size=ip.nextInt();
			   e.createEmployeeDb(size);
			      break;
			case 2: e.availableIndex();
			      break;
			case 3: System.out.println("enter the Index No :- ");   
					int in=ip.nextInt();
					e.addEmployee(in);
					break;
			case 4 : e.displayAllEmp();
			       break;
				
			case 5: System.out.println("enter the eid :- ");
			int eid=ip.nextInt();
			e.getEmpByEid(eid);
			       break;
			case 7:System.out.println("====think you visit again=====");
			System.exit(0);
			break;
			default: System.out.println("invalid option");
			}

			
			
		}


		

	}

}
