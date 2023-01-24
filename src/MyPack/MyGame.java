package MyPack;



public class MyGame {

    public static void main(String[] args) {
        Kaisa kaisa1 = new Kaisa();
        kaisa1.GetInfo();
        kaisa1.Move(10,10);

        Zed zed = new Zed();
        MyChampion.Location loc = zed.new Location(5,5);
        zed.Move(loc);

        zed.Attack(kaisa1);
        kaisa1.Attack(zed);
    }
}