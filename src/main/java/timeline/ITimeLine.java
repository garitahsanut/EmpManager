package timeline;

public interface ITimeLine {
	
	default void timeOffReq(int id, String category, String description) {
		// still in debug phase
		System.out.println("id: " + id);
		System.out.println("category: " + category);
		System.out.println("description: " + description);
	}
}
