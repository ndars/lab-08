package com.ndars.lab08;

/**
 * A class implementing an abstract factory design. Produces professional clothes.
 * @author ndars
 */
public class ProfessionalFactory implements ClothingFactory {
    @Override
    public Top makeTop() {
        return new ProfessionalTop();
    }

    @Override
    public Pants makePants() {
        return new ProfessionalPants();
    }

    @Override
    public Footwear makeFootwear() {
        return new ProfessionalFootwear();
    }
}
