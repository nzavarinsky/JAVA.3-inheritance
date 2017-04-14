package laba2;

/**
 * Created by NAZAR on 02.03.2017.
 */
public class SortTrainsByPassengers implements Comparable {
    public int numOfPassengers;


    public SortTrainsByPassengers(int numOfPassengers) {
        this.numOfPassengers = numOfPassengers;
        this.numOfPassengers = numOfPassengers;
        this.numOfPassengers = numOfPassengers;

    }



    public int getNumOfPassengers(){
        return this.numOfPassengers;
    }


    @Override
    public String toString(){
        return "Num of pass" + this.numOfPassengers ;
    }

    @Override
    public int compareTo(Object o) {
        SortTrainsByPassengers tmp = (SortTrainsByPassengers) o;
        if(this.numOfPassengers > tmp.numOfPassengers){
            return -1;

        } else if ( this.numOfPassengers < tmp.numOfPassengers)
        {
            return 1;
        }
        return 0;
    }
        }



