package collection;

public class John implements Comparable<John> {

	private int id;
	private String name;

	public John(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public int compareTo(John j) {
		if (id == j.id) {
			return 0;
		} else if (id > j.id) {
			return 1;
		}
		return -1;
	}

	@Override
	public String toString() {
		return "John [id=" + id + ", name=" + name + "]";
	}
}
