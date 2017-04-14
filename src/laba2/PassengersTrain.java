/**
 * @author Zavarynskyi Nazarii
 * @since 22.02.17
 */

package laba2;

/**
 * Is used to contain all details
 * about passenger train.
 * Shows route information.
 */

public class PassengersTrain  {
    public int platskartWagons = 0,
            kupeWagons = 0,
            luksWagons = 0;
    public  String nameOfTransport, route;

    public PassengersTrain(int platskartWagons, int kupeWagons, int luksWagons) {
        this.platskartWagons = platskartWagons;
        this.kupeWagons = kupeWagons;
        this.luksWagons = luksWagons;
    }

    public void setNameOfTransport(String nameOfTransport, String route){
        this.nameOfTransport = nameOfTransport;
        this.route = route;
    }
}


