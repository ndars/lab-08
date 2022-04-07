package com.ndars.lab08;

/**
 * A class modeling casual footwear.
 * @author ndars
 */
public class CasualFootwear implements Footwear {
    
    private final String DESCRIPTION = "a pair of casual looking sneakers";

    @Override
    public String getFootwearDescription() {
        return DESCRIPTION;
    }
}
