package MyPack;



public class MyGame {

    public static void main(String[] args) {
        MyChampion myCh = new MyChampion("카이사", 100,10);
        myCh.GetInfo();
        myCh.Move(5,5);

        MyChampion myCh2 = new MyChampion("제드", 200,10);
        myCh2.GetInfo();
        myCh2.Move(10,10);

        myCh2.Attack(myCh);
    }
}