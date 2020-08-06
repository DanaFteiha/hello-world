//implementation of inheritance 
public class SalariedEmployee extends Employee{
	//implementation of encapsulation 
	//private variables can be seen only in the same class
	private double weeklySalary;
	
	public SalariedEmployee() {
		super();
		weeklySalary=0;
	}
	public SalariedEmployee(String firstName,String lastName,int idNum,double weeklySalary) {
		super(firstName,lastName,idNum);
		this.weeklySalary=weeklySalary;
	}
	//runtime polymorphism
	@Override
	public double earning() {
		return (weeklySalary*4);
	}
	
	public String toString() {
		return super.toString()+"\nEarning is: "+earning();
	}

}
