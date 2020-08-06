
public class HourlyEmployee extends Employee {

	private double wage, numberOfHoursWorked;	 
	
	public HourlyEmployee() {
		super();
		wage=0;
		numberOfHoursWorked=0;
		}
	public HourlyEmployee(String firstName,String lastName,int idNum,double wage,double numberOfHoursWorked) {
		super(firstName,lastName,idNum);
		this.wage=wage;
		this.numberOfHoursWorked=numberOfHoursWorked;
		}
	@Override
	public double earning() {
		return (wage*numberOfHoursWorked);
	}
	public String toString() {
		return super.toString()+"\nEarning is: "+earning();
	}
	
}


