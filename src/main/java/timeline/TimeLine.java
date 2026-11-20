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

	// mutable
	private int shifts;
	private int working_hours;

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

	@Override
	public TimeLine showTimeLine(int id, int shifts, int working_hours) {
		setId(id);
		this.shifts = shifts;
		this.working_hours = working_hours;
		ITimeLine.super.showTimeLine(id, shifts, working_hours);
		return this;
	}

    @Override
    public String getRole() {
        return role;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getSex() {
        return sex;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public int getId() {
        return id;
    }

    public String getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }

    public int getShifts() {
        return shifts;
    }

    public int getWorking_hours() {
        return working_hours;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setShifts(int shifts) {
        this.shifts = shifts;
    }

    public void setWorking_hours(int working_hours) {
        this.working_hours = working_hours;
    }
}
