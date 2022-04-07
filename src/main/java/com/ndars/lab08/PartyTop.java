package com.ndars.lab08;

/**
 * A class modeling a party-appropriate shirt.
 * @author ndars
 */
public class PartyTop implements Top {
    
    private final String DESCRIPTION = "a tank top you could wear to a party";

    @Override
    public String getTopDescription() {
        return DESCRIPTION;
    }
}
