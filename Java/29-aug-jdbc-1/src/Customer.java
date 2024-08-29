

import java.util.Date;

public class Customer {
	private Integer id;
	private String name;
	private Date dob;
	private String address;
	private String phone;
	
	public Customer() {}

	public Customer(Integer id, String name, Date dob, String address, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.address = address;
		this.phone = phone;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", dob=" + dob + ", address=" + address + ", phone=" + phone
				+ "]";
	}
	
	
}
