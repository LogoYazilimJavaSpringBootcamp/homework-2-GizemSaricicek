package org.example;
import org.example.AbstractFactoryImplementation.FactoryProvider;
import org.example.SingletonImplementation.ClassSingleton;

public class Main {

    public static void main(String[] args) {

        //Singleton Implementation

        ClassSingleton classSingleton1 = ClassSingleton.getInstance(); //Sistemde ilk defa bir nesne oluşturuluyor.
        System.out.println("Class Info:" + classSingleton1.getInfo()); //first class info.
        System.out.println("Nesnenin bulunduğu adres:" + ClassSingleton.getINSTANCE()); // @4dd8dc3 gibi bir adres döner.

        ClassSingleton classSingleton2 = ClassSingleton.getInstance(); //İkinci bir nesne oluşturuluyor.
        //Ama daha önceden 1 tane oluştuğu için onun yerini bu nesne alıyor.
        classSingleton2.setInfo("new class info.");

        //System.out.println("Class Info:" + classSingleton1.getInfo()); // new class info.
        System.out.println("Class Info:" + classSingleton2.getInfo()); // new class info.
        System.out.println("Nesnenin bulunduğu adres:" + ClassSingleton.getINSTANCE()); // @4dd8dc3 gibi bir adres döner.
        // Aynı adreste nesnseler oluşturuluyor böylece tasarruf sağlanıyor.

//---------------------------------------------------------------------------------------------------

        //Abstract Factory Implementation
        FactoryProvider.getFactory("Animal"); //AnimalFactory'ye yönlendirme oluyor.
        FactoryProvider.getFactory("Color"); //ColorFactory'ye yönlendirme oluyor.
    }
}