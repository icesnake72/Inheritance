package MyPack;

public class MyChampion {

    class Location {
        private int x;
        private int y;
        public Location(){
            this.x = this.y = 0;
        }
        public Location(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    private Location loc = new Location();

    public static int lastId = 0;
    private int HP;
    private int AttackPower;

    private String name;
    private int id;

    public MyChampion() {
        this.HP = 100;
        AttackPower = 10;
        this.loc.x = 0;
        this.loc.y = 0;
        this.name = "unknown";
        this.id = lastId++;
    }

    public MyChampion(int HP, int x, int y) {
        this.HP = HP;
        AttackPower = 10;
        this.loc.x = x;
        this.loc.y = y;
        this.id = lastId++;
    }

    public MyChampion(int x, int y) {
        this.name = "unknown";
        AttackPower = 10;
        this.loc.x = x;
        this.loc.y = y;
        this.HP = 100;
        this.id = lastId++;
    }

    public MyChampion(String name, int HP, int AttackPower) {
        this.name = name;
        this.AttackPower = AttackPower;
        this.HP = HP;
        this.loc.x = 0;
        this.loc.y = 0;
        this.id = lastId++;
    }

    @Override
    public String toString() {
        return "MyCharacter{" +
                "name='" + name + '\'' + "(id:" + id + ')' +
                '}';
    }

    public void GetInfo() {
        System.out.println("Information of " + this);
        System.out.println("HP : " + HP);
        System.out.println("X : " + loc.x + " Y : " + loc.y);
    }

    public void Move(int x, int y) {
        System.out.println(this + " 이동...");
        loc.x = x;
        loc.y = y;

        GetInfo();
    }

    public void Move(Location loc) {
        this.loc.x = loc.x;
        this.loc.y = loc.y;
    }

    public void Attack(MyChampion enemy) {
        if ( enemy!=null ) {
            System.out.println(this + "가 " + enemy + "를 공격합니다.");
            enemy.HP -= AttackPower;
            enemy.GetInfo();
            GetInfo();
        }
    }
}

class Kaisa extends MyChampion {
    public Kaisa() {
        super("카이사", 300, 10);
    }
}

class Zed extends MyChampion {
    public Zed() {
        super("제드", 500, 20);
    }
}

class Lux extends MyChampion {
    public Lux() {
        super("럭스", 300, 5);
    }
}