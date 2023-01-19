package at.dej.OO.remote;

public class RemoteMain {
    public static void main(String[] args) {
        Battery b1 = new Battery(87);
        Battery b2 = new Battery(67);

        Remote remote = new Remote(b1, b2);

        float result =  remote.getStatus();
        System.out.println(result);

        remote.TurnOn();
        System.out.println(remote.getBattery1().getCharigingState());
        System.out.println(remote.getBattery2().getCharigingState());

        remote.TurnOff();
        System.out.println(remote);
    }


}
