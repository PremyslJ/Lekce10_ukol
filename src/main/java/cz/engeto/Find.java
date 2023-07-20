package cz.engeto;

import java.util.List;

public class Find {
    /**
     * Popis metody findTheFirstNumberInLimit
     * Metoda iteruje každý prvek (oneElement) v seznamu listOfNumbers pomocí cyklu "for-each".
     * Pro každý prvek v seznamu zkontroluje, zda je větší nebo rovno lowerLimit a
     * zároveň menší nebo rovno upperLimit a využívá podmínku: oneElement <= upperLimit && oneElement >= lowerLimit.
     * Pokud podmínka platí a prvek spadá do zadaného rozmezí, tak metoda prvek vrátí. Pokud žádná v limitu nejajde
     * vrátí null
     *
     * @param listOfNumbers seznam hodnot
     * @param lowerLimit    dolní limit
     * @param upperLimit    horní limit
     * @return
     */
    public Double findTheFirstNumberInLimit(

            List<Double> listOfNumbers, Double lowerLimit, Double upperLimit) {

        for (Double oneElement : listOfNumbers) {
            if (oneElement <= upperLimit && oneElement >= lowerLimit) {
                System.out.println(oneElement);
                return oneElement;
            }

        }
        return null;
    }

}