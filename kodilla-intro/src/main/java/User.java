public class User {

    String name;
    int age;

    public User (String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public static void main (String[] args)
    {
        int totalAge;
        int averageAge;

        User anna = new User("Anna", 18);
        User maria = new User("Maria", 56);
        User janusz = new User("Janusz", 65);
        User piotr = new User("Piotr", 10);
        User arek = new User("Arek", 51);

        User[] user = {anna, maria, janusz, piotr, arek};

        totalAge = 0;
        averageAge = 0;

        for (int i = 0; i < user.length; i++)
        {
            totalAge = totalAge + user[i].getAge();
        }
        // System.out.println(totalAge);

        averageAge = totalAge / user.length;
        // System.out.println(averageAge);

        for (int i = 0; i < user.length; i++)
        {
            if (user[i].getAge() < averageAge)
            {
                System.out.println(user[i].getName());
            }
        }


    }

    public String getName()
    {
        return this.name;
    }

    public int getAge()
    {
        return this.age;
    }
}
