public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        // This program is for just implement the basics of Interface OOP concept

        MobilePhone phone1 = new MobilePhone("0764858427");
        phone1.powerOn();
        phone1.callPhone("0764858427");
        phone1.answer();
    }
}
