
public class Town implements Comparable<Town> {

	private String name;

	/**
	 * Constructor
	 * 
	 * @param name - name of the town
	 */
	Town(String name) {
		this.name = name;
	}

	/**
	 * Copy constructor
	 * 
	 * @param templateTown - town to copy
	 */
	Town(Town templateTown) {
		this.name = templateTown.name;
	}

	/**
	 * @return name of the town
	 */
	public String getName() {
		return name;
	}

	/**
	 * Compare two towns by name
	 * 
	 * @param o - town to compare with
	 * @return 0 if names are equal, a positive or negative number if the names are
	 *         not equal
	 */
	@Override
	public int compareTo(Town o) {
		return this.name.compareTo(o.name);
	}

	/**
	 * To string method
	 * 
	 * @return the town name
	 */
	public String toString() {
		return name;
	}

	/**
	 * @return the hashcode for the name of the town
	 */
	public int hashCode() {
		return name.hashCode();
	}

	/**
	 * The comparison for equality will be based in the name
	 * 
	 * @param obj - object to be compared with
	 * @return true if the town names are equal, false if not
	 */
	@Override
	public boolean equals(Object obj) {
		Town t = (Town) obj;
		return this.name.equals(t.getName());
	}

}