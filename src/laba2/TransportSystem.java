/**
 * @author Zavarynskyi Nazarii
 * @since 22.02.17
 */

package laba2;

import java.io.IOException;


/**
 * Calls choosing menu.
 */

public class TransportSystem {

    public static void main(String[] args) throws IOException {

        Manager mg = new Manager();
        mg.createPassengersTrain();
        mg.sortTrainsByPassengers();
        mg.createLocomotive();
        mg.creatCargo();

    }

}