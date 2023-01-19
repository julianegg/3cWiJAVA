package at.dej.OO.remote;

public class Battery {


    private int charigingState;

    public int getCharigingState() {
        return charigingState;
    }

    public void setCharigingState(int charigingState) {
        this.charigingState = charigingState;
    }

    public Battery(int charigingState) {
        this.charigingState = charigingState;
    }
}
