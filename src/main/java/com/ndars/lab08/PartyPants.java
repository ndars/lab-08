package com.ndars.lab08;

/**
 * A class modeling a party-appropriate pair of pants.
 * @author ndars
 */
public class PartyPants implements Pants {
    
    private final String DESCRIPTION = "a pair of pants you could wear to a party";

    @Override
    public String getPantsDescription() {
        return DESCRIPTION;
    }
}
