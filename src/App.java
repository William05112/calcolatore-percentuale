public class App {
    public static void main(String[] args) throws Exception {
        int uno = 4;
        int due = 1;
        int tre = 7;

        int somma = uno + due + tre;

        float percentualeUno = (float) uno * 100 / (float) somma;
        System.out.println(Math.round(percentualeUno * 100.0) / 100.0);
        float percentualeDue = (float) due * 100 / (float) somma;
        System.out.println(Math.round(percentualeDue * 100.0) / 100.0);
        float percentualeTre = (float) tre * 100 / (float) somma;
        System.out.println(Math.round(percentualeTre * 100.0) / 100.0);
    }
}
