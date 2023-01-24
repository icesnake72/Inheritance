package MyPack;



public class MyGame {

    public static void main(String[] args) {
//        MyChampion myCh = new MyChampion("카이사", 100,10);
//        myCh.GetInfo();
//        myCh.Move(5,5);
//
//        MyChampion myCh2 = new MyChampion("제드", 200,10);
//        myCh2.GetInfo();
//        myCh2.Move(10,10);
//
//        myCh2.Attack(myCh);

        Kaisa kaisa1 = new Kaisa();
        kaisa1.GetInfo();
        kaisa1.Move(10,10);

        Zed zed = new Zed();
        MyChampion.Location loc = zed.new Location();


        zed.Attack(kaisa1);
        kaisa1.Attack(zed);
    }
}