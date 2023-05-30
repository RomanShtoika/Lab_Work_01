public class Exercise_4 {
    private int horsepower;
    private int engineVolume;
    private String brand;
    private String model;
    private int year;
    private String color;

    public Exercise_4(int horsepower, int engineVolume, String brand, String model, int year, String color) {
        this.horsepower = horsepower;
        this.engineVolume = engineVolume;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public int getEngineVolume() {
        return engineVolume;
    }

    public static void main(String[] args) {
        Exercise_4[] cars = new Exercise_4[]{
                new Exercise_4(130, 1800, "Toyota", "Corolla", 2014, "Silver"),
                new Exercise_4(110, 1500, "Honda", "Accord", 2012, "Black"),
                new Exercise_4(160, 2000, "Nissan", "Sentra", 2017, "Red"),
                new Exercise_4(95, 1400, "Ford", "Focus", 2013, "Blue"),
                new Exercise_4(190, 2500, "BMW", "X5", 2015, "White"),
                new Exercise_4(120, 1600, "Volkswagen", "Jetta", 2016, "Gray"),
                new Exercise_4(140, 1900, "Mazda", "6", 2018, "Green"),
                new Exercise_4(105, 1300, "Chevrolet", "Cruze", 2012, "Yellow"),
                new Exercise_4(175, 2100, "Kia", "Sorento", 2020, "Brown"),
                new Exercise_4(150, 1900, "Hyundai", "Elantra", 2017, "Orange")

        };

        int totalEngineVolume = 0;
        int totalHorsepower = 0;

        for (Exercise_4 car : cars) {
            totalEngineVolume += car.getEngineVolume();
            totalHorsepower += car.getHorsepower();
        }

        System.out.println("The sum of engine volumes of all cars is: " + totalEngineVolume);
        System.out.println("The sum of horsepower's of all cars is: " + totalHorsepower);
    }
}