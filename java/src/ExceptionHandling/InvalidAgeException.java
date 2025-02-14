package ExceptionHandling;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

class User {
    int age;

    public void setAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 150) {
            throw new InvalidAgeException("Age is invalid. Age must be between 0 and 150.");
        }
        this.age = age;
    }

    public static void main(String[] args) {
        try {
            User user = new User();
            user.setAge(-2); // This will throw an InvalidAgeException
            System.out.println("User age: " + user.age);
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

