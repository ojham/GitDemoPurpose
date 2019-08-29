package collections;

public class StudentCollection implements Comparable<StudentCollection> {
	
	public int rank;
	public String name;
	
	 public StudentCollection(int rank, String name){
		
		this.rank=rank;
		this.name=name;
	}
	
	

	@Override
	public int compareTo(StudentCollection c) {
		
		if(this.rank==c.rank){
			return 0;
		}
		else if(this.rank<c.rank){
			
			return -1;
		}else{
			return  1;
		}
		
	}

}
