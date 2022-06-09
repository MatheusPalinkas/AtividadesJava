public class Index {
    public static void main(String[] args){
        Hora meiaNoite = new Hora(0, 1, 1);
        
        System.out.println("Meia Noite: ");
        System.out.println(meiaNoite.getHora1());
        System.out.println(meiaNoite.getHora2());
        System.out.println(meiaNoite.getSegundos());

        Hora meioDia = new Hora(12, 1, 1);
        System.out.println("Meio dia: ");
        System.out.println(meioDia.getHora1());
        System.out.println(meioDia.getHora2());
        System.out.println(meioDia.getSegundos());
    }
}
