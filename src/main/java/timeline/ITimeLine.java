package timeline;

public interface ITimeLine {

	default void timeOffReq(int id, String category, String description) {
		// still in debug phase
		System.out.println("id: " + id);
		System.out.println("category: " + category);
		System.out.println("description: " + description);
	}

	default TimeLine showTimeLine(int id, int shifts, int working_hours) {
		System.out.println("Number of shifts: " + shifts);
		System.out.println("Number of working (in hours): " + working_hours);
		return (TimeLine) this;
	}
}
