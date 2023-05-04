package at.dej.OO.camera;



import java.util.ArrayList;
import java.util.List;

public class SDCard {
    private int capacity;
    private List<Files> files;

    public SDCard(int capacity) {
        this.capacity = capacity;
        this.files = new ArrayList<>();
    }
    public void save(Files file){
        files.add(file);
    }

    public List<Files> getFiles() {
        return files;
    }
}
