public class App {
    public static void main(String[] args) {
        App p = new App();
        int number = (int) Math.floor(Math.random() * 10);
        p.pyramidOfNumber(number);
    }

    void pyramidOfNumber(int number) {
        System.out.println("functional");
    }
}
