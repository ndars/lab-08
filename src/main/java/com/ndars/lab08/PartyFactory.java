package com.ndars.lab08;

/**
 * A class implementing an abstract factory design. Produces party clothes.
 * @author ndars
 */
public class PartyFactory implements ClothingFactory {
    @Override
    public Top makeTop() {
        return new PartyTop();
    }

    @Override
    public Pants makePants() {
        return new PartyPants();
    }

    @Override
    public Footwear makeFootwear() {
        return new PartyFootwear();
    }
}
