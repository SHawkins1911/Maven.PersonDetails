package com.zipcodewilmington;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    public String whileLoop() {
        Integer counter = 0;
        StringBuilder result = new StringBuilder ();
        while(counter < personArray.length){
            Person currentPerson = personArray[counter];
            result.append(currentPerson.toString());
            counter++;



        }
            return result.toString();
        }
        // create a `counter`
        // while `counter` is less than length of array
            // begin loop

                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable

            // end loop



    public String forLoop() {
        int initValue;
        int termCond;
        int i;
        Integer counter = 0;
        StringBuilder result = new StringBuilder ();
        // identify initial value
        // identify terminal condition
        // identify increment
        for(i = 0; i <= counter; i++) {
            counter++;
            String currentPerson = counter.toString();
            result.append(currentPerson);
            result.toString();

            // use the above clauses to declare for-loop signature
            // begin loop
            // use `counter` to identify the `current Person` in the array
            // get `string Representation` of `currentPerson`
            // append `stringRepresentation` to `result` variable
            // end loop
        }
        return result;
    }



    public String forEachLoop() {
        String result = "";
        // identify array's type
        // identify array's variable-name

        // use the above discoveries to declare for-each-loop signature
            // begin loop
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop

        return result;
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
