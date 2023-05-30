public class Exercise_3 {
    public static void main(String[] args) {
        Exercise_3 users = new Exercise_3();
        users.Init();
        users.PrintInfo();
    }
    private int id;
    private int age;
    private String name;
    private String surname;
    private double weight;
    private double height;

    private Exercise_3[] users;
    public Exercise_3(int id, int age, String name, String surname, double weight, double height){
        this.id = id;
        this.age = age;
        this.name = name;
        this.surname = surname;
        this.weight = weight;
        this.height = height;
    }
    public Exercise_3() {
    }

    public int getAge () {
        return age;
    }

    public double getWeight () {
        return weight;
    }

    public double getHeight () {
        return height;
    }


    public void Init () {
        users = new Exercise_3[]{
                new Exercise_3(1, 28, "Michael", "Johnson", 78.0, 180.0),
                new Exercise_3(2, 35, "Jennifer", "Smith", 65.5, 163.0),
                new Exercise_3(3, 42, "Christopher", "Davis", 88.0, 185.0),
                new Exercise_3(4, 31, "Jessica", "Brown", 57.5, 170.0),
                new Exercise_3(5, 40, "Matthew", "Wilson", 80.0, 178.0),
                new Exercise_3(6, 33, "Emily", "Anderson", 72.0, 165.0),
                new Exercise_3(7, 48, "Madison", "Thomas", 70.0, 172.0),
                new Exercise_3(8, 52, "James", "Martinez", 64.0, 145.0),
                new Exercise_3(9, 26, "Avery", "Taylor", 92.0, 195.0),
                new Exercise_3(10, 60, "Oliver", "Miller", 74.0, 155.0)


        };
    }

    public void PrintInfo () {
        int age = 0;
        double weight = 0;
        double height = 0;

        for (Exercise_3 user : users) {
            age += user.age;
            weight += user.weight;
            height += user.height;
        }

        System.out.println("The age of ten users is: " + age);
        System.out.println("The weight of ten users is: " + weight);
        System.out.println("The height of ten users is: " + height);
    }
}