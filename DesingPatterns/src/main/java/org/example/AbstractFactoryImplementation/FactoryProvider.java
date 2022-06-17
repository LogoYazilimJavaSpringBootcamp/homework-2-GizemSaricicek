package org.example.AbstractFactoryImplementation;

public class FactoryProvider {

    public static AbstarctFactory getFactory(String choice){ // gelen inputa göre farklı factory'lere yönlendirme yapılıyor.

        if("Animal".equalsIgnoreCase(choice)){
            return new AnimalFactory();
        }
        else if("Color".equalsIgnoreCase((choice))){
            return new ColorFactory();
        }
        return null;
    }
}
