package problems;

import java.util.ArrayList;

public class GradingStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer>	grades=new ArrayList<Integer>();
		grades.add(76);
		grades.add(67);
		grades.add(38);
		grades.add(33);
		grades.add(36);
		grades.add(73);
		
		for(int i=0;i<=grades.size()-1;i++){

	        if(grades.get(i)>=38 && grades.get(i)%5!=0){

	            Integer mod=grades.get(i)%5;
	            Integer sum=grades.get(i)+(5-mod);
	            
	            if((sum-grades.get(i))<3){
	                grades.set(i, sum);
	            }
	        }

	    }
		System.out.println(grades);
}
}
