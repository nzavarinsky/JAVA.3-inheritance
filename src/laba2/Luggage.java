/**
 * @author Zavarynskyi Nazarii
 * @since 22.02.17
 */

package laba2;

/**
 * Contains all needed
 * info about luggage in wagons.
 * Makes some calculations with
 * luggage value.
 */

public class Luggage extends PassengersTrain {
    private int luggagePerKupe,
            luggagePerPlatskart,
            luggagePerLuks;
    public int luggageInKupe,
            luggageInPlatskart,
            luggageInLuks;

    /**
     * Caluclates and shows
     * sum of luggage in all
     * types of Wagons.
     */


    Luggage(int luggagePerPlatskart, int luggagePerKupe, int luggagePerLuks) {
        super(12,8,5);

        this.luggagePerPlatskart = luggagePerPlatskart;
        this.luggagePerKupe = luggagePerKupe;
        this.luggagePerLuks = luggagePerLuks;
    }


    /**
     * Calculates luggage in every type of wagon
     *
     * @return sum of luggage
     */
    public int sumOfLuggage() {

        luggageInKupe = kupeWagons * luggagePerKupe;

        luggageInPlatskart = platskartWagons * (platskartWagons * luggagePerPlatskart);

        luggageInLuks = luksWagons * (luksWagons * luggagePerLuks);

        return luggageInKupe + luggageInPlatskart + luggageInLuks;

    }
}

