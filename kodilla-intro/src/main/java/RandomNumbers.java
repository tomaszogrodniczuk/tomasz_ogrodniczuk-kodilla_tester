import java.util.Random;

public class RandomNumbers {

    int min;
    int max;
    int count;

    public static void main (String[] argh)
    {
        RandomNumbers randomNumbers = new RandomNumbers();

        randomNumbers.calcMinMax();

        System.out.println("Min: " + randomNumbers.getMin());
        System.out.println("Max: " + randomNumbers.getMax());
        System.out.println("Count: " + randomNumbers.getCount());
    }


    public void calcMinMax()
    {
        min = 30;
        max = 0;
        count = 0;

        Random random = new Random();

        int sum = 0;

        while (sum <= 5000)
        {
            int temp = random.nextInt(31);
            sum = sum + temp;

            if(temp > max)
            {
                max = temp;
            }

            if(temp < min)
            {
                min = temp;
            }
            count++;
        }
    }

    public int getMin()
    {
        return this.min;
    }

    public int getMax()
    {
        return this.max;
    }

    public int getCount()
    {
        return this.count;
    }

}
