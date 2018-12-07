public class StaticPerson {
    private static String firstName, lastName;

    public StaticPerson(String firstNameArg, String lastNameArg)
    {
        firstName=firstNameArg;
        lastName=lastNameArg;
    }

    public static String getFirstName() {
        return firstName;
    }

    public static void setFirstName(String firstName) {
        StaticPerson.firstName = firstName;
    }

    public static String getLastName() {
        return lastName;
    }

    public static void setLastName(String lastName) {
        StaticPerson.lastName = lastName;
    }

    @Override
    public String toString()
    {
        return String.format("%s %s", firstName, lastName);
    }
}
