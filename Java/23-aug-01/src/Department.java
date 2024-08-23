
public class Department {
	private int id;
	
	public Department() {}
	
	
	public Department(int id)
	{
		this.id=id;
	}
	
	public void setId(int id)
	{
		//check if id is valid
		if(id<0)
			throw new NumberFormatException("Id cannot be negative");
		this.id=id;
	}
	public static void main(String[] args) {
		Department d1=new Department();
		d1.setId(111);
		
		Department d2=new Department(112);
		

	}
}
