public class Main {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        System.out.println("Tv ligada?: "+smartTv.ligada);
        System.out.println("Canal atual: "+smartTv.canal);
        System.out.println("Volume da tv: "+smartTv.volume);

        System.out.println("\n----------------------\n");

        smartTv.Ligar();
        System.out.println("Tv ligada?: "+smartTv.ligada);

        smartTv.aumentarVolume();
        System.out.println("Volume da tv: "+smartTv.volume);

        smartTv.mudarCanal(13);
        System.out.println("Canal atual: "+smartTv.canal);
    }
}