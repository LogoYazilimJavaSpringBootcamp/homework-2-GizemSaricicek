package org.example.AbstractFactoryImplementation;

public class ColorFactory implements AbstarctFactory<Color>{ // Color için AbstarctFactory'den implement edilen factory

    public Color create(String colorName){

        if("White".equalsIgnoreCase(colorName)){
            return new White();
        }
        else if("Brown".equalsIgnoreCase(colorName)){
            return new Brown();
        }
        return null;
    }
}
