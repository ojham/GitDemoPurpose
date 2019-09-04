package collections;

import java.util.ArrayList;
import java.util.Collections;

public class Comparing {

	public static void main(String[] args) {
		
		ArrayList<StudentCollection> al = new ArrayList<StudentCollection>();
		
		al.add(new StudentCollection(5,"danish"));
		al.add(new StudentCollection(3,"Kumar"));
		al.add(new StudentCollection(4,"ojha"));
		al.add(new StudentCollection(2,"balaeshwar"));
		al.add(new StudentCollection(1,"desai"));
		
		Collections.sort(al);
		
		for(StudentCollection s:al){
			
			System.out.println(s.name+" "+s.rank);
			
		}
		
		
		
		ArrayList<Employee> al1 = new ArrayList<Employee>();
		al1.add(new Employee(678,"murugan",54000));
		al1.add(new Employee(456, "Dnaish",50000));
		al1.add(new Employee(789,"bhaskar",67000));
		al1.add(new Employee(567,"mahipaL",45789));
		
		Collections.sort(al1, new salaryComparison());
		
		for(Employee e:al1){
			
			System.out.println(e.empid+" "+e.name+" "+e.salary);
		}
		
		System.out.println("***********************************");
		
		
		Collections.sort(al1,new EmpidComparison());
		
		for(Employee e1:al1){
			System.out.println(e1.empid+" "+e1.name+" "+e1.salary);
		}
		
	}

}
