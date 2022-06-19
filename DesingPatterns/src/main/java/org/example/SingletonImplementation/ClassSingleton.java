package org.example.SingletonImplementation;

public class ClassSingleton {

    private static ClassSingleton INSTANCE;
    private String info = "first class info.";

    //constructor'lar
    private ClassSingleton(){}

    public static ClassSingleton getInstance(){

        if(INSTANCE == null){ // eğer sistemde bir instance yoksa yeni bir tane oluşturuluyor.
            INSTANCE = new ClassSingleton();
        }

        return INSTANCE; //instance geri döndürülüyor.
    }

    //getter ve setter'lar
    public static ClassSingleton getINSTANCE() {
        return INSTANCE;
    }

    public static void setINSTANCE(ClassSingleton INSTANCE) {
        ClassSingleton.INSTANCE = INSTANCE;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
