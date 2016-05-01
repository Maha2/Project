package classAssignment13CONSTRUCTOR;

public class PrintNEWline_Task1 {
	public static void main(String[] args) {
		DoctorType_Task2 maha = new DoctorType_Task2(1, "Maha ", "Dentist");
		DoctorType_Task2 amala = new DoctorType_Task2(2, "Amala","heart surgeon");
		DoctorType_Task2 akhil = new DoctorType_Task2(3, "Akhil", "Dentist");
		maha.printDetails();
		amala.printDetails();
		akhil.printDetails();
	}

}
