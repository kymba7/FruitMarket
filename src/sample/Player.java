package sample;

public class Player {
    public double cash;
    public int invApples;
    public int invOranges;
    public int invBananas;
    public int invGrapes;

    public Player(double cash, int invApples, int invOranges, int invBananas, int invGrapes) {
        this.cash = cash;
        this.invApples = invApples;
        this.invOranges = invOranges;
        this.invBananas = invBananas;
        this.invGrapes = invGrapes;
    }

    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }

    public int getInvApples() {
        return invApples;
    }

    public void setInvApples(int invApples) {
        this.invApples = invApples;
    }

    public int getInvOranges() {
        return invOranges;
    }

    public void setInvOranges(int invOranges) {
        this.invOranges = invOranges;
    }

    public int getInvBananas() {
        return invBananas;
    }

    public void setInvBananas(int invBananas) {
        this.invBananas = invBananas;
    }

    public int getInvGrapes() {
        return invGrapes;
    }

    public void setInvGrapes(int invGrapes) {
        this.invGrapes = invGrapes;
    }
}
