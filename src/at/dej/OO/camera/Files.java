package at.dej.OO.camera;



public class Files {

    private String name;

    private enum FILE_SIZE{klein, mittel, groß};

    private int fileNUmber = 0;



    public Files takePicture(){
        Files file = new Files("png","pic" + fileNUmber,1000);
        fileNUmber ++;
        return file;
    }
}
