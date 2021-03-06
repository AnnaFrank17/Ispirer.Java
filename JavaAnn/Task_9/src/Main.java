public class Main {

    public  enum Planet{
        MERCURY,
        VENUS,
        EART,
        MARS,
        JUPITER,
        SATURN,
        URANUS,
        NEPTUN;
    }

    public  enum Planet2{
        MERCURY2(3.302e-23, 2.439e+06),
        VENUS2(3.3042e+23, 2.439e+06),
        EART2(3.3032e+23, 2.439e+06),
        MARS2(3.30322e+23, 2.439e+06),
        JUPITER2(3.3022e+23, 2.439e+06),
        SATURN2(3.312e+23, 2.439e+06),
        URANUS2(3.3072e+23, 2.439e+06),
        NEPTUN2(3.3092e+23, 2.439e+06);
        private  final double mass;
        private  final double radius;
        private  final double gravity;
        private  static final double G = 6.673000e-11;
        Planet2 (double mass, double radius)
        {
            this.mass=mass;
            this.radius=radius;
            this.gravity=G*mass/(radius*radius);
        }
    }

    public  enum clas{
        Me(60, 23),
        You(79, 26),
        She(56, 19);

        private  final int mass;
        private  final int age;
        private  final int death;
        private  static final int coun = 55;
        clas (int mass, int age)
        {
            this.mass=mass;
            this.age=age;
            this.death=coun+age;
        }
    }

    public static void main(String[] args) {
        // write your code here
        String s01 = new String();
        System.out.println("s01.length=" + s01.length());

        char [] cs = {'0', '1', '2', '3', '4', '5', '6', '7'};
        String s02 = new String();
        System.out.println("s02.length=" + s02.length()+"   "+"s02="+ s02);

        String s03 = new String(cs,3,5);
        System.out.println("s03.length=" + s03.length()+"   "+"s03="+ s03);

        String s04 = "01234567";
        System.out.println("s04.length=" + s04.length()+"   "+"s04="+ s04);

        String s05 = new String("01234567");
        System.out.println("s05.length=" + s05.length()+"   "+"s05="+ s05);

        System.out.println("\"01234567\".length=" + "01234567".length());

        String s06 = new String("01234567");
        for (int i=0; i<s06.length(); i++)
        {
            System.out.println(s06.charAt(i) +((i< s06.length()-1)? "-": "  "));

        }
        System.out.println(" ");
        char[] cs1= new char [6-2];
        s06.getChars(2,6,cs1,0);
        for (int i=0; i<cs1.length; i++)
        {
            System.out.print(cs1[i] +((i< cs1.length-1)? "-": "  "));

        }

        String s07 = new String("01234567");
        String s08 = new String("01234567");
        System.out.println("(s07==s08) = " + (s07==s08));
        System.out.println("(s07 ==\"01234567\") = " + (s07=="01234567"));
        System.out.println("s07.equals(s08)="+ s07.equals(s08));
        String s09= s08;
        System.out.println("(s09==s09) = " + (s08==s09));

        String s10= new String("Человека невозможно чему-ниубдь научить, его можно убедить");
        System.out.println(s10.indexOf('j'));
        System.out.println(s10.indexOf('о'));
        System.out.println(s10.lastIndexOf('о'));
        System.out.println(s10.indexOf('о', 5));
        System.out.println(s10.lastIndexOf('о', 5));
        System.out.println(s10.lastIndexOf('о', 14));

        String s11 = new String("Лучший вид на этот город, если сесть в бомбардировщик");
        System.out.println(s11.substring(26));
        System.out.println(s11.substring(26,30));

        String s12 = new String("Оффтопик - любое сетевое общение "+ "выходящее за рамки ранее установленной темы");
        System.out.println(s12.replace('ф', 'f'));
        System.out.println(s12.toUpperCase());
        System.out.println(s12.toLowerCase());

        StringBuffer s15 = new StringBuffer(100);
        s15.append("В городе Сочи темные ночи");
        System.out.println("s15.length() = " +s15.length());
        System.out.println("s15.capacity() = " +s15.capacity());
        s15.insert(21, "и теплые");
        System.out.println(s15);
        System.out.println("s15.length() = " +s15.length());
        System.out.println("s15.capacity() = " +s15.capacity());
        s15.delete(21,30);
        System.out.println(s15);
        s15.ensureCapacity(200);
        System.out.println("s15.capacity() = " +s15.capacity());
        String s16 = s15.toString();

        Planet planet = Planet.EART;
        switch (planet)
        {
            case MERCURY: System.out.println("MERCURY"); break;
            case JUPITER: System.out.println("JUPITER"); break;
            default: System.out.println("default");
        }

        Planet2 planet2 = Planet2.NEPTUN2;
        System.out.println(planet2.gravity);
        System.out.println(planet2.mass);
        System.out.println(planet2.radius);

        clas cl = clas.Me;
        System.out.println(cl.age);
        System.out.println(cl.death);
        System.out.println(cl.mass);
    }
}
