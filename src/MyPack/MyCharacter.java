package MyPack;

public class MyCharacter {
    public static int lastId = 0;
    private int HP;
    private int AttackPower;
    private int x;
    private int y;
    private String name;
    private int id;

    public MyCharacter() {
        this.HP = 100;
        AttackPower = 10;
        this.x = 0;
        this.y = 0;
        this.name = "unknown";
        this.id = lastId++;
    }

    public MyCharacter(int HP, int x, int y) {
        this.HP = HP;
        AttackPower = 10;
        this.x = x;
        this.y = y;
        this.id = lastId++;
    }

    public MyCharacter(int x, int y) {
        this.name = "unknown";
        AttackPower = 10;
        this.x = x;
        this.y = y;
        this.HP = 100;
        this.id = lastId++;
    }

    public MyCharacter(String name, int HP, int AttackPower) {
        this.name = name;
        this.AttackPower = AttackPower;
        this.HP = HP;
        this.x = 0;
        this.y = 0;
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
        System.out.println("X : " + x + " Y : " + y);
    }

    public void Move(int x, int y) {
        System.out.println(this + " 이동...");
        this.x = x;
        this.y = y;

        GetInfo();
    }

    public void Attack(MyCharacter enemy) {
        if ( enemy!=null ) {
            System.out.println(this + "가 " + enemy + "를 공격합니다.");
            enemy.HP -= AttackPower;
            enemy.GetInfo();
            GetInfo();
        }
    }
}

class Kaisa extends MyCharacter {
    public Kaisa() {
        super("카이사", 300, 10);
    }
}

class Zed extends MyCharacter {
    public Zed() {
        super("제드", 500, 20);
    }
}

class Lux extends MyCharacter {
    public Lux() {
        super("럭스", 300, 5);
    }
}
