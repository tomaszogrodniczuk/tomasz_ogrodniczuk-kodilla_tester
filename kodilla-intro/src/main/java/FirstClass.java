public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600, 1000, 2010);
        System.out.println(notebook.weight + " " + notebook.price);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkClass();

        Notebook heavyNotebook = new Notebook(2000, 1500, 2018); //dlaczego tu nie działa else if tylko idzie od razu do ostaniego els'a
        System.out.println(heavyNotebook.weight + " " + heavyNotebook.price);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkClass();

        Notebook oldNotebook = new Notebook(1200, 500, 2000);
        System.out.println(oldNotebook.weight + " " + oldNotebook.price);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkClass();

        int notebookWeight = notebook.getWeight();
        System.out.println(notebookWeight);

        LeapYear leapYear = new LeapYear(2100);
        boolean leap = leapYear.getLeapYear();
        System.out.println("Czy rok przestepny?  " + leap);

        Loops loops = new Loops();
        int sum = loops.getSum();
        System.out.println(sum);

        int i = 0;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }
}