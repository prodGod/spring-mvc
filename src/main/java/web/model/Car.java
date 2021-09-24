package web.model;

public class Car {


    private String name;
    private String models;
    private int vinCode;

    public Car() {
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", models='" + models + '\'' +
                ", vinCode=" + vinCode +
                '}';
    }

    public Car(String name, String models, int vinCode) {
        this.name = name;
        this.models = models;
        this.vinCode = vinCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModels() {
        return models;
    }

    public void setModels(String models) {
        this.models = models;
    }

    public int getVinCode() {
        return vinCode;
    }

    public void setVinCode(int vinCode) {
        this.vinCode = vinCode;
    }
}