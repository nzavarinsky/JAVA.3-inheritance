/**
 * @author Zavarynskyi Nazarii
 * @since 22.02.17
 */

package laba2;

/**
 * Describes and shows all
 * enough info about freigth train.
 */

public class FreigthTrain  {
	public  String route,
			typeOfCargo,
			nameOfTrain;

	public FreigthTrain(String route, String typeOfCargo, String nameOfTrain) {
		this.route = route;
		this.typeOfCargo = typeOfCargo;
		this.nameOfTrain = nameOfTrain;
	}

	/**
	 * @return Info about route
	 * and type of cargo.
	 */
	@Override
	public String toString() {
		return "Name of train : " + nameOfTrain +"\n"+
				"Route = " + route + "\n" +
				"Type of cargo is " + typeOfCargo;

	}
	
	
}
