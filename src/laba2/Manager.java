package laba2;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by NAZAR on 02.03.2017.
 */
public class Manager {
    private ArrayList<PassengersTrain> passengersTrains = new ArrayList<PassengersTrain>();

    public Manager() {

    }

    public void createPassengersTrain(){
        PassengersTrain passengersTrain = new PassengersTrain(9,4,2);
        passengersTrain.setNameOfTransport("Kobzar", "Lviv-Zhmerynka");
        TrainPassengers trainPassengers = new TrainPassengers(36,54,12);
        SeatsInWagons seatsInWagons = new SeatsInWagons();
        seatsInWagons.setWagonsSeats(36,54,12);
        Luggage luggage = new Luggage(4,4,2);
        System.out.println("Name of train is : " + passengersTrain.nameOfTransport);
        System.out.println("Route is : " + passengersTrain.route);
        System.out.println("The sum of passengers is : " + trainPassengers.Passengers());
        System.out.println("The sum of luggage is : " + luggage.sumOfLuggage());
    }

    public void createLocomotive(){
        Locomotive locomotive = new Locomotive("Ukraina","Sumy", "Kyiv");
        System.out.println(locomotive.toString());
    }

    public void creatCargo(){
        FreigthTrain freigthTrain = new FreigthTrain("Odesa - Chernivtsi", "Diamonds", "TTE16");
        System.out.println(freigthTrain.toString());
    }

    public void sortTrainsByPassengers(){
        SortTrainsByPassengers[] train = new SortTrainsByPassengers[3];
        train[0] = new SortTrainsByPassengers(567);
        train[1] = new SortTrainsByPassengers(621);
        train[2] = new SortTrainsByPassengers(350);

        Arrays.sort(train);
        System.out.println("Trains sorted by number of" + " passengers :  ");
        for (int i = 0; i < train.length; i++)
            System.out.println("Train №" + i + ") " + train[i].getNumOfPassengers());
        System.out.println("___________________________________");
    }





}
