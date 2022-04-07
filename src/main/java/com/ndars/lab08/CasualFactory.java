package com.ndars.lab08;

/**
 * A class implementing an abstract factory design. Produces casual clothes.
 * @author ndars
 */
public class CasualFactory implements ClothingFactory {
    @Override
    public Top makeTop() {
        return new CasualTop();
    }

    @Override
    public Pants makePants() {
        return new CasualPants();
    }

    @Override
    public Footwear makeFootwear() {
        return new CasualFootwear();
    }
}
