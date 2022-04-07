package com.ndars.lab08;

/**
 * A class modeling professional footwear.
 * @author ndars
 */
public class ProfessionalFootwear implements Footwear {
    
    private final String DESCRIPTION = "a pair of professional looking shoes";

    @Override
    public String getFootwearDescription() {
        return DESCRIPTION;
    }
}
