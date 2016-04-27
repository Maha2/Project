package class11Assignment.question3;

import class11Assignment.question1.Address;
import class11Assignment.question1.Student;

public class AssignAddressToStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student studMaha = new Student();
		studMaha.studName = "Maha";
		studMaha.studId = 23;
		studMaha.studGrade = "Fifth";
		

		Address address = new Address();
		// address.country = "India";
		studMaha.address = address;
		address.country = "India";

		//studMaha.address = new Address();
		//studMaha.address.country = "Sweedan";

		// studMaha.address = address;

		// studMaha.address.country="India";

		System.out.println(address.country);
		// System.out.println(studMaha.address.state);
		// System.out.println(studMaha.address.addressOne);

	}

}
