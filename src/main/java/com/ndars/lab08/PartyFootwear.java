package com.ndars.lab08;

/**
 * A class modeling party-appropriate footwear.
 * @author ndars
 */
public class PartyFootwear implements Footwear {
    
    private final String DESCRIPTION = "a pair of boots you could wear to a party";

    @Override
    public String getFootwearDescription() {
        return DESCRIPTION;
    }
}
