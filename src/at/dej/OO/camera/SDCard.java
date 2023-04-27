package at.dej.OO.camera;

import at.dej.OO.mobilephone.PhoneFile;

import java.util.ArrayList;
import java.util.List;

public class SDCard {
    private int capacity;
    private List<PhoneFile> files;

    public SDCard(int capacity) {
        this.capacity = capacity;
        this.files = new ArrayList<>();
    }
    public void save(PhoneFile file){
        files.add(file);
    }

    public List<PhoneFile> getFiles() {
        return files;
    }
}
