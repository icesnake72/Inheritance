package MyPack;



public class Main {
    public static void main(String[] args) {
        MyCharacter myCh = new MyCharacter("카이사", 100,10);
        myCh.GetInfo();
        myCh.Move(5,5);

        MyCharacter myCh2 = new MyCharacter("제드", 200,10);
        myCh2.GetInfo();
        myCh2.Move(10,10);

        myCh2.Attack(myCh);
    }
}