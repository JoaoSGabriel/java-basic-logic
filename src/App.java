public class App {
    public static void main(String[] args) {
        App p = new App();
        int number = (int) Math.floor(Math.random() * 10);
        p.pyramidOfNumber(number);
    }

    void pyramidOfNumber(int number) {
        for(int i = 1; i < number; i++) {
            int value = i;
            String text = "";
            while(value > 0) {
                text += i;
                value--;
            }
            System.out.println(text);
        }
    }
}
