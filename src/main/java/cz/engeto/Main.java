package cz.engeto;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Find find = new Find();

        Double findTheFirstNumber = find.findTheFirstNumberInLimit(Arrays.asList(12.0,8.126,6.0),11.0,12.6);

        System.out.println(findTheFirstNumber );
    }
}