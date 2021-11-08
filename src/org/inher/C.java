package org.inher;
// child class
public class C implements A,B {

	@Override
	public void empId() {
		System.out.print("1");
	}

	@Override
	public void empName() {
		System.out.print("2");
		
	}

	@Override
	public void companyId() {
		System.out.print("3");
		
	}

	@Override
	public void companyName() {
		System.out.print("4");
		
	}
	public static void main(String[] args) {
		C c = new C();
		c.empId();c.empName();c.companyId();c.companyName();
	}
	
}
