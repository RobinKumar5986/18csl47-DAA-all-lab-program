import java.util.Scanner;

class Staff {
    private String name, staffid, phno;
    private float salary;

    public Staff(String a, String b, String c, float d) {
        name = a;
        staffid = b;
        phno = c;
        salary = d;
    }

    public String toString() {
        return "staff[name =" + name + ",staffid =" + staffid + ",phno =" + phno + ",salary=" + salary + "]";
    }
}

class technical extends Staff {
    private String skills;

    public technical(String a, String b, String c, float d, String e) {
        super(a, b, c, d);
        skills = e;
    }

    public String toString() {
        return "technical[super=" + super.toString() + ",skills=" + skills + "]";
    }
}

class teaching extends Staff {
    private String domain;
    private int publications;

    public teaching(String a, String b, String c, float d, String e, int f) {
        super(a, b, c, d);
        domain = e;
        publications = f;
    }

    public String toString() {
        return "teaching[super=" + super.toString() + ",domain=" + domain + ",publications=" + publications + "]";
    }
}

class contract extends Staff {
    private final int period;

    public contract(String a, String b, String c, float d, int e) {
        super(a, b, c, d);
        period = e;
    }

    public String toString() {
        return "contract[super=" + super.toString() + ",period=" + period + "]";
    }
}

public class program_2a {
    public static String name1, staffid1, phno1;
    private static float Sal;

    private void readdata() {
        System.out.println("Enter the deatils");
        Scanner in = new Scanner(System.in);
        System.out.println("Name : ");
        name1 = in.next();
        System.out.println("Staffid : ");
        staffid1 = in.next();
        System.out.println("Phno : ");
        phno1 = in.next();
        System.out.println("Salary : ");
        Sal = in.nextFloat();
    }

    public static void main(String[] args) {
        contract b[] = new contract[3];
        teaching c[] = new teaching[3];
        technical d[] = new technical[3];
        int per, publca;
        String skills, dom;
        program_2a sc = new program_2a();
        System.out.println("Enter the details of contract");
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            sc.readdata();
            System.out.println("Contract period : ");
            per = in.nextInt();
            b[i] = new contract(name1, staffid1, phno1, Sal, per);
        }
        for (int i = 0; i < 3; i++) {
            sc.readdata();
            System.out.println("Skills : ");
            skills = in.next();
            d[i] = new technical(name1, staffid1, phno1, Sal, skills);
        }
        for (int i = 0; i < 3; i++) {
            sc.readdata();
            System.out.println("Domain : ");
            dom = in.next();
            System.out.println("Publications : ");
            publca = in.nextInt();
            c[i] = new teaching(name1, staffid1, phno1, Sal, dom, publca);
        }
        System.out.println("Details");
        for (int j = 0; j < 3; j++) {
            System.out.println(b[j]);
            System.out.println(c[j]);
            System.out.println(d[j]);
        }
    }
}