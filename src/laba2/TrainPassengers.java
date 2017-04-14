/**
 * @author Zavarynskyi Nazarii
 * @since 22.02.17
 */

package laba2;

/**
 * Describes all info about
 * passengers in passenger train.
 * Makes some calculation
 * with their number.
 */

public class TrainPassengers extends PassengersTrain {
    public  int kupePassengers = 0,
            platskartPassengers = 0,
            luksPassengers = 0;

    public TrainPassengers(int kupePassengers, int platskartPassengers, int luksPassengers) {
        super(15,14,6);
        this.kupePassengers = kupePassengers;
        this.platskartPassengers = platskartPassengers;
        this.luksPassengers = luksPassengers;
    }

    /**
     * Calculates passengers in every
     * type of wagon
     */
    public int Passengers() {
        kupePassengers = kupeWagons * kupeWagons;
        luksPassengers = luksWagons * platskartWagons;
        platskartPassengers = platskartWagons * luksWagons;
        return platskartPassengers + luksPassengers + kupePassengers;
    }


}

