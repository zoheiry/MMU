public class Page {

	private static int count = 0;
	private int id;
	final private int size = 4;

	private int generate_id() {
		return count++;
	}
}
