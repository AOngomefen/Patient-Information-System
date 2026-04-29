
public class Procedure {

	private String procedureName, procedureDate, practitioner, charges;
	
	// constructor to initialize the procedure information
	
	public Procedure(String procedureName, String procedureDate, String practitioner, String charges) {
		this.procedureName = procedureName;
		this.procedureDate = procedureDate;
		this.practitioner = practitioner;
		this.charges = charges;
	}
	
	// setter methods for the procedure information
	
	public void setProcedureName(String procedureName) {
		this.procedureName = procedureName;
	}
	
	public void setProcedureDate(String procedureDate) {
		this.procedureDate = procedureDate;
	}
	
	public void setPractitioner(String practitioner) {
		this.practitioner = practitioner;
	}
	
	public void setCharges(String charges) {
		this.charges = charges;
	}
	
	// getter methods for the procedure information
	public String getProcedureName() {
		return procedureName;
	}
	
	public String getProcedureDate() {
		return procedureDate;
	}
	
	public String getPractitioner() {
		return practitioner;
	}
	
	public String getCharges() {
		return charges;
	}
	
	// toString method to print the procedure information
	
	public String toString() {
		return "Procedure Name: " + procedureName + "" + 
				"\nProcedure Date: " + procedureDate + 
				"\nPractitioner: " + practitioner + 
				"\nCharges: " + charges;
	}
	
	
}
