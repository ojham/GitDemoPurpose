package collections;

import java.util.Comparator;

public class EmpidComparison implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		
		if(e1.empid==e2.empid){
			return 0;
		}
		else if(e1.empid<e2.empid){
			return -1;
		}
		
		return 1;
	}
	
	

}
