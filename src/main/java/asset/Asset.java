package asset;

public class Asset {
	private int id;
	private String role;
	private String name;
	private String sex;
	private int age;
	
	public Asset(int id, String role, String name, String sex, int age) {
		this.id = id;
		this.role = role;
		this.name = name;
		this.sex = sex;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void viewGenericAssets() {
		System.out.println(
				"Asset: " + name + ", Role: " + role
		);
	}
}
