//implementation of abstraction since it is shared between all subclasses
abstract class Employee {
    //implementation of encapsulation 
	//protected variables can be seen from any other classes in this package and inherited subclasses from other packages
	protected String firstName;
	protected String lastName;
	protected int idNum;
	//No argument constructer
	protected Employee() {
		
	}
	
	protected Employee(String firstName,String lastName,int idNum) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.idNum=idNum;
	}
	//Abstarct function
	public abstract double earning();
	//toString function
	public String toString() {
		return ("First Name: "+firstName+"\nLast Name: "+lastName+"\nID Number: "+idNum);
	}
	
}

