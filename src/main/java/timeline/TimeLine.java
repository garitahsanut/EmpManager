package timeline;

import asset.Asset;

public class TimeLine extends Asset implements ITimeLine{

    private final String role;
    private final String name;
    private final String sex;
    private final int age;
    public int id;
	public String category;
	public String description;

	public TimeLine(int id, String role, String name, String sex, int age) {
		super(id, role, name, sex, age);
		this.id = id;
		this.role = role;
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	
	@Override
	public void timeOffReq(int id, String category, String description) {
		// debug test
		System.out.println("override stamps here");
		ITimeLine.super.timeOffReq(id, category, description);
	}

}
