package com.ndars.lab08;

/**
 * A class modeling a casual pair of pants.
 * @author ndars
 */
public class CasualPants implements Pants {
    
    private final String DESCRIPTION = "a pair of casual looking jeans";

    @Override
    public String getPantsDescription() {
        return DESCRIPTION;
    }
}
