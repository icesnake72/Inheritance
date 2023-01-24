package MyPack;

public abstract class MyChampion {

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

        public void Copy(Location loc) {
            this.x = loc.x;
            this.y = loc.y;
        }
    }

    private Location loc = new Location();

    public static int lastId = 0;
    private int HP;
    private int SP;
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
        System.out.println("SP : " + SP);
        System.out.println("X : " + loc.x + " Y : " + loc.y);
    }

    public void Move(int x, int y) {
        System.out.println(this + " 이동...");
        loc.x = x;
        loc.y = y;

        GetInfo();
    }

    public void Move(Location location) {
        this.Move(location.x, location.y);
    }

    public void Attack(MyChampion enemy) {
        if ( enemy!=null ) {
            System.out.println(this + "가 " + enemy + "를 공격합니다.");
            enemy.HP -= AttackPower;
            enemy.GetInfo();
            GetInfo();
        }
    }

    public void SelfHeal(int weight) {
        HP += weight;
        System.out.println(this + "의 HP가 " + weight + "만큼 회복되어 " + HP + " 입니다");
    }

    protected void InitSP(int SP) {
        this.SP = SP;
    }

    protected void IncSP(int weight) {
        SP += weight;
        System.out.println(this + "의 SP가 " + weight + "만큼 회복되어 " + SP + " 입니다");
    }

    protected void DecSP(int weight) {
        SP -= weight;
        System.out.println(this + "의 SP가 " + weight + "만큼 감소되어 " + SP + " 입니다");
    }

    protected void DecHP(int power) {
        HP -= power;
        System.out.println(this + "의 HP가 " + power + "만큼 감소되어 " + HP + " 입니다");
    }

    public abstract void Skill(MyChampion target);
}

class Kaisa extends MyChampion {
    public static final int KAISA_FULL_HP = 300;
    public Kaisa() {
        super("카이사", KAISA_FULL_HP, 10);
        InitSP(100);
    }

    @Override
    public void Attack(MyChampion enemy) {
        super.Attack(enemy);

        SelfHeal(2);
    }

    @Override
    public void Skill(MyChampion target) {
        System.out.println(this + "가 " + target + "에게 스킬을 사용함");
        target.DecHP(50);
        target.DecSP(5);

    }
}

class Zed extends MyChampion {
    public static final int ZED_FULL_HP = 500;
    public Zed() {
        super("제드", ZED_FULL_HP, 20);
        InitSP(50);
    }

    @Override
    public void Attack(MyChampion enemy) {
        super.Attack(enemy);
        SelfHeal(-1);
    }

    @Override
    public void Skill(MyChampion target) {
        System.out.println(this + "가 " + target + "에게 스킬을 사용함");
        target.DecHP(100);
    }
}

class Lux extends MyChampion {
    public static final int LUX_FULL_HP = 300;
    public Lux() {
        super("럭스", LUX_FULL_HP, 2);
        InitSP(150);
    }

    @Override
    public void Attack(MyChampion enemy) {
        super.Attack(enemy);
        SelfHeal(3);
    }

    @Override
    public void Skill(MyChampion target) {
        System.out.println(this + "가 " + target + "에게 스킬을 사용함");
        target.SelfHeal(10);
    }
}
