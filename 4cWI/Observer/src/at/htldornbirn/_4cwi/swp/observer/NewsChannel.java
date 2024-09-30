package at.htldornbirn._4cwi.swp.observer;

public class NewsChannel {
    private String name;

    public NewsChannel(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
