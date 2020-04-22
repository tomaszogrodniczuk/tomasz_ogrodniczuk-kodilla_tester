public class Notebook {

    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year){

        this.weight = weight;
        this.price = price;


}
    public void checkPrice() {
        if(this.price < 600) {
            System.out.println("This notebook is very cheap.");
            } else if(this.price > 600 && this.price < 1000) {
                System.out.println("This price is good.");
            } else {
                System.out.println("This notebook is quite expensive.");
            }
    }

    public void checkWeight(){
        if(this.weight < 700) {
            System.out.println("Urzadzenie jest lekkie.");
        } else if(this.weight > 700 && this.price < 1300) {
            System.out.println("Urzadzenie jest niezbyt ciezkie.");
        } else {
            System.out.println("Urzadzenie jest ciezkie.");
        }
    }

    public void checkClass(){
        if(this.price < 700 && this.year < 2007){
            System.out.println("Urzadzenie jest stare i tanie.");
        }else if(this.price > 1200 && this.year > 2012){
            System.out.println("Urzadzenie jest nowe i drogie.");
        }else {
            System.out.println("Urzadzenie jest klasy sredniej.");
        }
        }


}
