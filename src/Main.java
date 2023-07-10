public class Main {
    public static void main(String[] args) {
        Balyk balyk = new Balyk();
        balyk.setJashagan("suuda jashait");
        balyk.setBalyktusu("kyzyl");
        balyk.setBalyksalmagy(2);
        System.out.println("jashagan jeri : "+balyk.getJashagan());
        System.out.println("tusu kandai : "+balyk.getBalyktusu());
        System.out.println("kancha kg : "+balyk.getBalyksalmagy()+ "  kg   ");

        System.out.println();

        Popugai popugai = new Popugai();
        popugai.setPopugaiaty("jora");
        popugai.setPopugaitusu("kok");
        popugai.setPopugaijashy(1);
        popugai.setPopugaisenasy(100);
        System.out.println("popugai aty : "+ popugai.getPopugaiaty());
        System.out.println("popugai tusu : "+ popugai.getPopugaitusu());
        System.out.println("popugai jashy : "+ popugai.getPopugaijashy()+ "  jash ");
        System.out.println("popugai kancha dollar turat : "+ popugai.getPopugaisenasy()+ " $ turat");

        System.out.println();

        Myshyk myshyk = new Myshyk();
        myshyk.setMyshykaty("masha");
        myshyk.setMyshyktusu("kara");
        myshyk.setMaalymat("Дуйно жузундо болжол менен 600 миллион уй мышыгы бар.");
        System.out.println("myshyktyn aty : "+myshyk.getMyshykaty());
        System.out.println("myshyktyn tusu : "+myshyk.getMyshyktusu());
        System.out.println("myshyk jonundo maalymat : "+myshyk.getMaalymat());

        System.out.println();

        It it = new It();
        it.setItaty("REKS");
        it.setMaalymat("Эн ылдам чуреаган ит саатына 72 чакырым ылдамдыкта чуркай алат.");
        it.setKanchjashait(25);
        System.out.println("Ittin aty : "+it.getItaty());
        System.out.println("It jonundo maalymat : "+it.getMaalymat());
        System.out.println("It tn uzagy kancha jyl jashit : "+it.getKanchjashait());
    }
}