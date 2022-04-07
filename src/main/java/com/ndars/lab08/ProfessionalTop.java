package com.ndars.lab08;

/**
 * A class modeling a professional shirt.
 * @author ndars
 */
public class ProfessionalTop implements Top {
    
    private final String DESCRIPTION = "a professional looking button-down shirt";

    @Override
    public String getTopDescription() {
        return DESCRIPTION;
    }
}
