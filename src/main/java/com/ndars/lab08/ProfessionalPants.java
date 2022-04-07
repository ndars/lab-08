package com.ndars.lab08;

/**
 * A class modeling a professional pair of pants.
 * @author ndars
 */
public class ProfessionalPants implements Pants {
    
    private final String DESCRIPTION = "a pair of professional looking slacks";

    @Override
    public String getPantsDescription() {
        return DESCRIPTION;
    }
}
