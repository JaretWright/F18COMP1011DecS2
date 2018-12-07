public class StaticDemo {
    public static void main(String[] args)
    {
        Person person1 = new Person("Goggles","Pizanno");
        Person person2 = new Person("Fred","Flintstone");

        StaticPerson sp1 = new StaticPerson("Barry","LateAgain");
        StaticPerson sp2 = new StaticPerson("Taylon","BarrysBrother");

        System.out.printf("Person1: %s%n", person1);
        System.out.printf("Person2: %s%n", person2);
        System.out.printf("StaticPerson1: %s%n", sp1);
        System.out.printf("StaticPerson2: %s%n", sp2);

        System.out.printf("Hashcode location for person1 firstName: %s%n",
                                                        person1.getFirstName().hashCode());
        System.out.printf("Hashcode location for person2 firstName: %s%n",
                                                        person2.getFirstName().hashCode());
        System.out.printf("Hashcode location for sp1 firstName: %s%n",
                                                        sp1.getFirstName().hashCode());
        System.out.printf("Hashcode location for sp2 firstName: %s%n",
                                                        sp2.getFirstName().hashCode());




    }
}
