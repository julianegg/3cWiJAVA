package at.dej.OO.mobilephone;

public class Camera {
    private int fileNUmber = 0;

    public PhoneFile takePicture(){
        PhoneFile file = new PhoneFile("png","pic" + fileNUmber,1000);
        fileNUmber ++;
        return file;
    }
}
