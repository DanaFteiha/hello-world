
//Driver class
public class Driver {
	public static void main(String [] args){
		Employee [] EmployeeArray=new Employee[3];
		EmployeeArray[0]=new SalariedEmployee("Lama", "Daoudi", 1180376, 125);
		EmployeeArray[1]=new HourlyEmployee("Dana", "Fteiha", 1181337, 30, 100);
		EmployeeArray[2]=new SalariedEmployee("Alan","Walker", 211559414,2000);
		for(int i=0; i<3;i++){
			System.out.println(EmployeeArray[i].toString());
		}
		System.out.println("\n\nThe total Earning of the employees is:"+totalEarning(EmployeeArray));
}
//returns the total earnings of all employees
   public static double totalEarning(Employee[] arr){
	double total=0;
	for(int i=0; i<arr.length; i++){
		total+=arr[i].earning();
	}
	return total;
}	
}
	
