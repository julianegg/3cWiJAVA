package at.dej.OO.mobilephone;

public class PhoneFile {
    private String extension;
    private String name;
    private int size;

    public PhoneFile(String extension, String name, int size) {
        this.extension = extension;
        this.name = name;
        this.size = size;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
