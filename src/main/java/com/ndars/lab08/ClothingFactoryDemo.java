package com.ndars.lab08;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * A program demonstrating the use of the abstract factory design pattern.
 * @author ndars
 */
public class ClothingFactoryDemo {
    
    enum ClothingFamily {
        PROFESSIONAL,
        CASUAL,
        PARTY,
        UNDEFINED
    }

    public static void main(String[] args) {
        // read a config file to determine which factory to use
        ClothingFactory cf;
        switch(getClothingConfig()) {
            case PROFESSIONAL -> cf = new ProfessionalFactory();
            case CASUAL -> cf = new CasualFactory();
            case PARTY -> cf = new PartyFactory();
            default -> cf = null;
        }
        if(cf == null) {
            System.err.println("ClothingFactory failed to initialize! Exiting...");
            return;
        }
        // create the articles of clothing and "send" them to the user
        Top top = cf.makeTop();
        Pants pants = cf.makePants();
        Footwear footwear = cf.makeFootwear();
        System.out.println("Sent the following to the customer:");
        System.out.println(top.getTopDescription());
        System.out.println(pants.getPantsDescription());
        System.out.println(footwear.getFootwearDescription());
    }
    
    /**
     * Parses config.cfg and determines the user's clothing setting.
     * @return a ClothingFamily enum value. UNDEFINED if config invalid.
     */
    private static ClothingFamily getClothingConfig() {
        ClothingFamily family = ClothingFamily.UNDEFINED;
        try (Scanner userConfig = new Scanner(new File("config.cfg"))){
            while (userConfig.hasNextLine()) {
                String configLine = userConfig.nextLine().toLowerCase();
                if(configLine.startsWith("family")) {
                    if(configLine.contains("professional")) {
                        family = ClothingFamily.PROFESSIONAL;
                    } else if(configLine.contains("casual")) {
                        family = ClothingFamily.CASUAL;
                    } else if(configLine.contains("party")) {
                        family = ClothingFamily.PARTY;
                    }
                    break;
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("config.cfg not found!");
        }
        return family;
    }
}