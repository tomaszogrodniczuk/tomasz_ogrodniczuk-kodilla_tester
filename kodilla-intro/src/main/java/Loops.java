public class Loops {
    int sum;

    public static void main(String[] args)
    {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        String[] names = new String[] {"Zygfryd", "Gwidon", "Florentyna"};

        for(int i = 0; i < names.length ; i++)
        {
            System.out.println(names[i]);
        }

    }
    //moja
    public int getSum()
    {
        sum = 0;

        int[] numbers = new int[] {4,6,7,3,10,8,5};
        for(int i = 0; i < numbers.length; i++)
        {
            sum = sum + numbers[i];
        }
        return sum;
    }

    //kodilla
    public int sumNumbers(int[] numbers) {
        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            result = result + numbers[i];
        }
        return result;
    }


}

