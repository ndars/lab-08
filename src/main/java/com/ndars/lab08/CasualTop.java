package com.ndars.lab08;

/**
 * A class modeling a casual shirt.
 * @author ndars
 */
public class CasualTop implements Top {
    
    private final String DESCRIPTION = "a casual looking t-shirt";

    @Override
    public String getTopDescription() {
        return DESCRIPTION;
    }
}
