package at.dej.OO.camera;

import at.dej.OO.mobilephone.PhoneFile;

public class Files {
    private int fileNUmber = 0;

    public PhoneFile takePicture(){
        PhoneFile file = new PhoneFile("png","pic" + fileNUmber,1000);
        fileNUmber ++;
        return file;
    }
}
