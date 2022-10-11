import Family.*;

public class App {
    public static void main(String[] args) throws Exception {
        Crocodile wani = new Crocodile();
        Eel unagi = new Eel(2.0f, 1.0f, "Fish", "unknown", "River", "Gill", "Release electric charge");
        Eagles washi = new Eagles(3.2f, 1.5f, "Bird", "RHCE", true, true);


        System.out.println(wani.ShowInfo());
        System.out.println(unagi.ShowInfo());
        System.out.println(washi.ShowInfo());
    }
}
