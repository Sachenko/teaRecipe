package teakit.tank;

import teakit.liquid.Water;

public class Kettle extends Reservoir {

    private Water water;

    public Kettle() {
        super(1500);
        System.out.println("--------------" + "\n" + "Kettle, can Boil a full 1500 Ml");
    }

    public Kettle(int maxVolume) {
        super(maxVolume);
        System.out.println("--------------" + "\n" + "Kettle, can Boil a full " + maxVolume + " Ml");


    }

    public void setMaxTempWater(Water water) {
        this.water.setTempWater(Water.MAX_TEMP_WATER);
        System.out.println("--------------" + "\n" + "Kettle Boil " + maxVolume + " Ml");
    }

    public void setWater(Water water) {
        if(water.getVolumeWater() > maxVolume ) {
            throw new IllegalArgumentException();
        } else
        this.water = water;
        System.out.println("--------------" + "\n" + "Kettle is fill " + water.getVolumeWater() + " Ml water");
    }

}

