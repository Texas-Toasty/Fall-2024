package Week12;

class Person {
    String firstName;
    String lastName;
    String gender;
    int age;
    double weight;
    double height;
    String ethnicGroup;
    String religion;

    // Constructor
    public Person(String firstName, String lastName, String gender, int age, double weight, double height, String ethnicGroup, String religion) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.ethnicGroup = ethnicGroup;
        this.religion = religion;
    }

    // Say a greeting
    public void sayGreeting() {
        System.out.println("Hello! My name is " + firstName + " " + lastName + ". Nice to meet you!");
    }

    // Say a prayer
    public void sayPrayer() {
        System.out.println("Dear Lord, thank you for this day. Amen.");
    }

    // Take a nap
    public void takeNap() {
        System.out.println(firstName + " is taking a nap. Zzz...");
    }

    // Eat something
    public void eatSomething() {
        System.out.println(firstName + " is eating a delicious meal. Yum!");
    }

    // Get full name
    public String getName() {
        return firstName + " " + lastName;
    }

    // Change religion
    public void setReligion(String newReligion) {
        System.out.println(firstName + " has changed religion to " + newReligion + ".");
        this.religion = newReligion;
    }

    // Display person's information
    @Override
    public String toString() {
        return String.format(
                "Person Information:\n" +
                "-------------------\n" +
                "First Name: %s\n" +
                "Last Name: %s\n" +
                "Gender: %s\n" +
                "Age: %d\n" +
                "Weight: %.2f lbs\n" +
                "Height: %.2f ft\n" +
                "Ethnic Group: %s\n" +
                "Religion: %s\n",
                firstName, lastName, gender, age, weight, height, ethnicGroup, religion
        );
    }
}

