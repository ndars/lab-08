package com.ndars.lab08;

/**
 * An interface defining an abstract factory for producing clothing.
 * @author ndars
 */
public interface ClothingFactory {
    Top makeTop();
    Pants makePants();
    Footwear makeFootwear();
}
