public class Launcher {
    public static void main(String[] args) {
        Remiso remiso = new Remiso("123456789", "Juan", "Perez");
        Reservista reservista = new Reservista("987654321", "Ana", "Garcca", "xxxx-xxxx-xxxx");
        Aplazado aplazado = new Aplazado("112233445", "Carlos", "Lopez", "xx/xx/xxxx");
        Reclutado reclutado = new Reclutado("556677889", "Marta", "Rodriguez", "xxxxxxxxx");

        System.out.println(remiso.toString());
        System.out.println(reservista.toString());
        System.out.println(aplazado.toString());
        System.out.println(reclutado.toString());
    }
}