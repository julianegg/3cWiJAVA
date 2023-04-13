package at.dej.OO.mobilephone;

import java.nio.file.Files;
import java.util.List;

public class Phone {
    private Sim sim;
    private Camera cam;
    private SDCard card;

    public Phone(Sim sim, Camera cam, SDCard card) {
        this.sim = sim;
        this.cam = cam;
        this.card = card;
    }
    public void doCall(String number){
        System.out.println("Calling" + number);
    }
    public void takePicture(){
       PhoneFile file =  this.cam.takePicture();
       this.card.save(file);
        System.out.println(file.getName());
    }
    public void printAllFiles(){
        List<PhoneFile> files  = this.card.getFiles();
        for (PhoneFile file: files) {
            System.out.println(file.getName());
            
        }
    }
}
