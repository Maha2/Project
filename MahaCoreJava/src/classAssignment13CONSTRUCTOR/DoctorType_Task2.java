package classAssignment13CONSTRUCTOR;

public class DoctorType_Task2 {
	
	public int id;
	public String name;
	public String designation;
	
	public DoctorType_Task2(){
		
	}
	
	public DoctorType_Task2(int id,String name){
		this.id = id;
		this.name = name;
		
	}
	
	public DoctorType_Task2(int id,String name,String designation){
		//this.designation = designation;   ----- This statement is not possible to write first line in this Block. 
		this(id,name);
	    this.designation = designation;
		
	}
	
	public void printDetails(){
		System.out.println("Doctor Id: "+id+"\nDoctor Name:"+name+"\nDoctor Designation: "+designation+"\n******************");
	}
	

}
