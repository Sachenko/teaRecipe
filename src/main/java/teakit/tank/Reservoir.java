package teakit.tank;

public abstract class Reservoir {

    protected int maxVolume;

    public Reservoir (int maxVolume) {
    this.maxVolume = maxVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }
}
