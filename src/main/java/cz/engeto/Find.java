package cz.engeto;

import java.util.List;

public class Find {
    /**
     *
     * @param listOfNumbers
     * @param lowerLimit
     * @param upperLimit
     * @return
     */
    public Double findTheFirstNumberInLimit(

            List<Double> listOfNumbers, Double lowerLimit, Double upperLimit)
    {

        for(Double oneElement : listOfNumbers){
            if (oneElement <= upperLimit && oneElement >= lowerLimit) {
                return oneElement;
            }

        }
        return null;
    }

}