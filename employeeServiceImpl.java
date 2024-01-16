package project1;

import java.util.Scanner;

import javax.swing.text.AbstractDocument.BranchElement;

public class employeeServiceImpl implements employeeservice {
	
	employee[] eDB;
	Scanner sc=new Scanner(System.in);
	@Override
	public void createEmployeeDb(int size) {
		eDB = new employee[size]; 
		System.out.println(" employee db created with size of :- "+size);
		
	}
	@Override
	public void availableIndex() {
		int c = 0;
		System.out.println("===Available Index===");
		for(int i=0;i<eDB.length;i++) {
			System.out.println(i+" ");
			c++;
		}
	
	
	if(c==0) {
		System.out.println("database IS full");
	}
	
	
	System.out.println();
	
}
	@Override
	public void addEmployee(int in) {
	
		
		if(in>=eDB.length) {
			System.out.println("Invalid Index No ");
		}
		else if(eDB[in]!=null) {
			System.out.println("Its already accupied...!!!");
		}
		
		else {
			System.out.println("enter Emp eid");
			int eid = sc.nextInt();
			System.out.println("enter emp name");
			String name = sc.next();
			System.out.println("enter emp degn");
			String dgn = sc.next();
			System.out.println("enter emp sal ");
			double sal = sc.nextDouble();
			eDB[in]=new employee(eid, name, dgn, sal);
			System.out.println("database seccessfully created");
		}
	}
	
	
	
	
	
	@Override
	public void displayAllEmp() {
		System.out.println("===Employee--Details===");
		int c=0;
		for(int i=0; i<eDB.length;i++) {
			if(eDB[i]!=null) {
				System.out.println(eDB[i]);
				c++;
			}
		}
	
	if(c==0) {
		System.out.println("database is Empty...!!!");
	}
}
	
	
	
	
	
	
	@Override
	public void getEmpByEid(int eid) {
		
		System.out.println("===Employee by Eid===");
		int c=0;
		for(employee ele : eDB) {
			if(ele!=null) {
				if(ele.getEid()==eid) {
					System.out.println(ele);
					c++;
					break;
				}
			}
		}
		if(c==0) {
			System.out.println("eid not found...!!!!");
		}
		
		
	}
	

}
