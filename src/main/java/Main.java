import org.jsoup.select.Elements;

public class Main {
    public static void main(String[] args) {

        Parser myHtmlPars = new Parser();

        Elements myRows = myHtmlPars.parsHtml();

        Currency usd = new Currency(myRows, 1);
        Currency eur = new Currency(myRows, 2);
        Currency gpb = new Currency(myRows, 3);
        Currency uah = new Currency(myRows, 11);


        usd.print();
        eur.print();
        gpb.print();
        uah.print();

    }




}
