/**
 * @author Zavarynskyi Nazarii
 * @since 22.02.17
 */

package laba2;

/**
 * Contains value of seats.
 * Makes some calcutations 
 * with number of seats.
 */
public class SeatsInWagons extends PassengersTrain {
	public  int kupeWagonSeats = 0,
			platskartWagonSeats = 0,
			luksWagonSeats = 0;

	public SeatsInWagons() {
		super(9, 4, 2);

	}

	/**
	 * Setting number of wagon seats
	 *
	 * @param kupeWagonSeats
	 * @param platskartWagonSeats
	 * @param luksWagonSeats
	 */

	public void setWagonsSeats(int kupeWagonSeats, int platskartWagonSeats, int luksWagonSeats) {
		this.kupeWagonSeats = kupeWagonSeats;
		this.platskartWagonSeats = platskartWagonSeats;
		this.luksWagonSeats = luksWagonSeats;
	}

}

