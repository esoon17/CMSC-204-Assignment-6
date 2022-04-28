
public class Road implements Comparable<Road> {
	private Town source;
	private Town destination;
	private int degrees;
	private String name;

	/**
	 * Constructor
	 * 
	 * @param source      - One town on the road
	 * @param destination - Another town on the road
	 * @param degrees     - Weight of the edge, i.e., distance from one town to the
	 *                    other
	 * @param name        - Name of the road
	 */

	Road(Town source, Town destination, int degrees, String name) {
		this.source = source;
		this.destination = destination;
		this.degrees = degrees;
		this.name = name;
	}

	/**
	 * Constructor with weight preset at 1
	 * 
	 * @param source      - One town on the road
	 * @param destination - Another town on the road
	 * @param name        - Name of the road
	 */
	Road(Town source, Town destination, String name) {
		this.source = source;
		this.destination = destination;
		this.degrees = 1;
		this.name = name;
	}

	/**
	 * Returns true only if the edge contains the given town
	 * 
	 * @param town - a vertex of the graph
	 * @return true only if the edge is connected to the given vertex
	 */
	public boolean contains(Town town) {
		if (source.equals(town) || destination.equals(town)) {
			return true;
		}
		return false;
	}

	/**
	 * To string method.
	 * 
	 * @return String
	 */
	@Override
	public String toString() {
		return source.getName() + " via " + name + " to " + destination.getName() + " " + degrees + " mi";
	}

	/**
	 * Returns the road name
	 * 
	 * @return the name of the road
	 */
	public String getName() {
		return name;
	}

	/**
	 * Returns the second town on the road
	 * 
	 * @return a town on the road
	 */
	public Town getDestination() {
		return destination;
	}

	/**
	 * Returns the first town on the road
	 * 
	 * @return a town on the road
	 */
	public Town getSource() {
		return source;
	}

	/**
	 * Compare two road objects
	 * 
	 * @param o - road to compare with
	 * @return 0 if the road names are the same, a positive or negative number if
	 *         the road names are not the same
	 */
	@Override
	public int compareTo(Road o) {
		return this.name.compareTo(o.name);
	}

	/**
	 * Returns the degrees of the road
	 * 
	 * @return the degrees of the road
	 */
	public int getWeight() {
		return degrees;
	}

	/**
	 * Returns true if each of the ends of the road r is the same as the ends of
	 * this road. Remember that a road that goes from point A to point B is the same
	 * as a road that goes from point B to point A.
	 * 
	 * @param r - road object to compare it to
	 * @return true if the roads are equal, false if not
	 */
	public boolean equals(Object r) {
		Road road = (Road) r;
		return (road.destination.equals(this.destination) && road.source.equals(this.source))
				|| (road.destination.equals(this.source) && road.source.equals(this.destination));
	}

}