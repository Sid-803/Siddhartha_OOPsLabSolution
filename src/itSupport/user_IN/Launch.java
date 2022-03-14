package itSupport.user_IN;
import itSupport.classes_main.*;
import itSupport.service.*;
import java.util.Scanner;

public class Launch {

	public static void main(String[] args) {
		//User is asked to enter the first name of the candidate.
		System.out.println("Please enter the First Name");
		Scanner str1 = new Scanner(System.in);
		String a1 = str1.next();

		//User is asked to enter the second name of the candidate.
		System.out.println("Please enter the last name");
		Scanner str2 = new Scanner(System.in);
		String a2 = str2.next();

		//User is asked to choose the integral value of the corresponding department.
		int i1 = 0;
		Scanner str3 = new Scanner(System.in);
		System.out.println("Please choose the corresponding integer value against candidate's department");
		System.out.println("1. Technical");
		System.out.println("2. Human Resource");
		System.out.println("3. Administration");
		System.out.println("4. Legal");
		
		//On the basis of the choice of integer value, following cases are formed.
		do {
			i1 = str3.nextInt();
		switch(i1) {
		case 1:
			//length of password is hardcoded as 10
			int sd = 10;
			//declaration for this case to set the value of department variable in Employee class.
			String a3 = "Tech";
			//Employee class is initiated using variable employee with arguments - first name and second name entered above by user.
			Employee employee = new Employee(a1,a2);
			//Employee class is extended in CredentialService using Employee class as datatype and its parametrised method - setDepartment is populated.
			employee.setDepartment(a3);
			//static variable compname in Employee class is hardcoded with company name.
			Employee.compname = "XYZ";
			//CredentialService class is initialised using the defined constructor.
			CredentialService credit = new CredentialService(employee);
			//method showCredential is called using initialised variable from CredentialService class.
			System.out.println(credit.showCredentials(sd));
			break;
		case 2:
			int sd1 = 10;
			String a31 = "hr";
			Employee employee1 = new Employee(a1,a2);
			employee1.setDepartment(a31);
			Employee.compname = "XYZ";
			CredentialService credit1 = new CredentialService(employee1);
			System.out.println(credit1.showCredentials(sd1));
			break;
		case 3:
			int sd2 = 10;
			String a32 = "admin";
			Employee employee2 = new Employee(a1,a2);
			employee2.setDepartment(a32);
			Employee.compname = "XYZ";
			CredentialService credit2 = new CredentialService(employee2);
			System.out.println(credit2.showCredentials(sd2));
			break;
		case 4:
			int sd3 = 10;
			String a33 = "Legal";
			Employee employee3 = new Employee(a1,a2);
			employee3.setDepartment(a33);
			Employee.compname = "XYZ";
			CredentialService credit3 = new CredentialService(employee3);
			System.out.println(credit3.showCredentials(sd3));
			break;
			}
		}while(i1 != 0);
		str1.close();
		str2.close();
		str3.close();
	}
}
