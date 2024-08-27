import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class College implements Comparable<College>
{
	private String name, website, mobile, founder, location;
	private Integer numberOfDept;
	private Date startingDate;
	
	public College() {}
	
	public College(String name, String website, String mobile, String founder, String location, Integer numberOfDept,
			Date startingDate) {
		super();
		this.name = name;
		this.website = website;
		this.mobile = mobile;
		this.founder = founder;
		this.location = location;
		this.numberOfDept = numberOfDept;
		this.startingDate = startingDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getFounder() {
		return founder;
	}

	public void setFounder(String founder) {
		this.founder = founder;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Integer getNumberOfDept() {
		return numberOfDept;
	}

	public void setNumberOfDept(Integer numberOfDept) {
		this.numberOfDept = numberOfDept;
	}

	public Date getStartingDate() {
		return startingDate;
	}

	public void setStartingDate(Date startingDate) {
		this.startingDate = startingDate;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		College arg=(College) obj;
		return this.getName().equals(arg.getName());
	}
	
	

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
	
	

	@Override
	public String toString() {
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");

		return String.format("Name: %s\n"
				+ "Website: %s\n"
				+ "Mobile: %s\n"
				+ "Founder: %s\n"
				+ "Number of Dept: %d\n"
				+ "Location: %s\n"
				+ "Starting Date: %s\n"
				+ "", name, website, mobile, founder, numberOfDept, location, sdf.format(startingDate));
	}

	@Override
	public int compareTo(College o) {
		return this.getName().compareTo(o.getName());
	}

//	@Override
//	public int hashCode() {
//		return Objects.hash(founder, location, mobile, name, numberOfDept, startingDate, website);
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		College other = (College) obj;
//		return Objects.equals(founder, other.founder) && Objects.equals(location, other.location)
//				&& Objects.equals(mobile, other.mobile) && Objects.equals(name, other.name)
//				&& Objects.equals(numberOfDept, other.numberOfDept) && Objects.equals(startingDate, other.startingDate)
//				&& Objects.equals(website, other.website);
//	}
	

	
}
