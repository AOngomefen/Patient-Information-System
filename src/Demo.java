
public class Demo {

	public static void main(String[] args) {
		
		
		String separator = "--------------------------------------------------";
		System.out.println(specifier(separator, 2));
		System.out.println("Welcome to the Patient Information System!");
		System.out.println(specifier(separator, 2));

		System.out.println("--This program demonstrates the use of the Patient and Procedure classes.--");
		System.out.println("--This program allows you to store and display patient information and procedure information.--");

		System.out.println(specifier(separator, 2));
		System.out.println("\n");
		
		/*
		// create a patient object and initialize the patient information
		Patient patient = new Patient("John", "A.", "Doe", "123 Main St", "Anytown", "CA", "12345", "555-1234", "Jane Doe", "555-5678");
		
		// create a procedure object and initialize the procedure information
		Procedure procedure = new Procedure("Physical Exam", "01/01/2024", "Dr. Smith", "$100");
		
		// print the patient information and procedure information
		System.out.println(patient);
		System.out.println(procedure);
		*/
		
		Patient empty = new Patient("", "", "", "", "", "", "", "", "", "");
		
		Patient p = new Patient(
			    "Marcus",
			    "J",
			    "Williams",
			    "456 Elm Street",
			    "Houston",
			    "TX",
			    "77001",
			    "713-555-2847",
			    "Diane Williams",
			    "713-555-9931"
			);

			System.out.println(p.toString());
		
		Procedure p1 = new Procedure("X-Ray",      "04/27/2026", "Dr. Smith", "250.00");
		Procedure p2 = new Procedure("Blood Test", "04/27/2026", "Dr. Jones", "150.00");
		Procedure p3 = new Procedure("MRI",        "04/27/2026", "Dr. Lee",   "1200.00");

		double total = Double.parseDouble(p1.getCharges()) 
		             + Double.parseDouble(p2.getCharges()) 
		             + Double.parseDouble(p3.getCharges());
		
		System.out.println("\n" + p1 + "\n");
		System.out.println(p2 + "\n");
		System.out.println(p3 + "\n");
		System.out.printf("Total Charges: $%,.2f%n", total); // expected: Total Charges: $1,600.00
		
	}
	
	public static String specifier(String separator, int length) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < length; i++) {
			sb.append(separator);
		}
		return sb.toString();
	}

}
