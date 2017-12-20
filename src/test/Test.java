package test;

import lombok.Getter;

import java.util.List;

@lombok.NoArgsConstructor
@lombok.Data
@Getter
public class Test {


    /**
     * sourceCode : MDL
     * destinationCode : RGN
     * k7Passengers : [{"passengerType":"AD","count":1}]
     * dateFlexibility : true
     * depertureDate : 2017/12/01
     * returnDate : 2017/12/03
     * myanmarCitizen : false
     * seamen : false
     * roundTrip : true
     */

    private String sourceCode;
    private String destinationCode;
    private boolean dateFlexibility;
    private String depertureDate;
    private String returnDate;
    private boolean myanmarCitizen;
    private boolean seamen;
    private boolean roundTrip;
    private List<K7Passengers> k7Passengers;
}
