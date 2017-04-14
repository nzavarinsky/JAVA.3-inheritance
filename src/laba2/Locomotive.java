/**
 * @author Zavarynskyi Nazarii
 * @since 22.02.17
 */

package laba2;

/**
 * Represents Locomotive-type
 * of train and shows basic info.
 */

class Locomotive  {


	public  String nameOfLocomotive,
			departure,
			arrival;

	public Locomotive(String nameOfLocomotive, String departure, String arrival) {
		this.nameOfLocomotive = nameOfLocomotive;
		this.departure = departure;
		this.arrival = arrival;
	}

	/**
	 * 	@return info about arrival
	 *  and departure of locomotive.
	 */

	@Override
	public String toString() {
		return "Name of locomotive is : " + nameOfLocomotive + "\n"
				+ "Locomotive departure is  " + departure
				+ " and arrival is " + arrival
				+ "\n__________________________";

	}


}
