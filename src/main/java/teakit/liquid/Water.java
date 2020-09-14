package teakit.liquid;


import javax.swing.*;

public class Water {

    public static final int MAX_TEMP_WATER = 100;
    public static final int MIN_TEMP_WATER = 1;
    public static final int MIN_VOLUME_WATER = 1;

    private int volumeWater;
    private int tempWater;


    public Water() {
        this(MIN_VOLUME_WATER);
    }

    public Water(int volumeWater, int tempWater) {
        this.tempWater = tempWater;
        this.volumeWater = volumeWater;
    }

    public Water(int volumeWater) {
        this.volumeWater = volumeWater;
        this.tempWater = randomTempWater();
        System.out.println("--------------" + "\n" + "Created " + volumeWater + " Ml water" + "\n" + "With start temperature " + tempWater);
    }


    public int getTempWater() {
        return tempWater;
    }

    public int getVolumeWater() {
        return volumeWater;
    }

    public void setVolumeWater(int volumeWater) {
        this.volumeWater = volumeWater;
        System.out.println("--------------" + "\n" + "Set " + volumeWater + " Ml water");
    }

    public void setTempWater(int tempWater) {
        if (tempWater > MAX_TEMP_WATER) {
            throw new IllegalArgumentException();
        } else
            this.tempWater = tempWater;
    }

    private int randomTempWater() {
        double temp = 1 + Math.random() * 15;
        return (int) Math.round(temp);
    }

    protected int takeSomeWater(int volumeWater) {
        if (this.volumeWater >= volumeWater) {
            this.volumeWater -= volumeWater;
            return volumeWater;
        }

        int currentWater = this.volumeWater;
        this.volumeWater = 0;
        this.tempWater = 0;

        return currentWater;
    }

    public void addIce(int pieceIce, Water water) {

        int newTempWater = tempWater - pieceIce * 15; //Новая температура воды = Темепература старой - колличество Льда * 15
        int addVolumeWater = volumeWater + pieceIce * 10; //Лед littleBit увеличит итоговый объем
        if (newTempWater > randomTempWater()) {
        } else {
            newTempWater = randomTempWater();
        }
        int differenceTemp = tempWater - newTempWater;
        int addedVolume = pieceIce * 10;
        water.setTempWater(newTempWater);
        System.out.println("--------------" + "\n" + "Tea was chilled on " + differenceTemp + " degrees" + " | " + "pieces of ice added " + pieceIce);
        if (addedVolume > volumeWater / 8) {
            JOptionPane.showMessageDialog(null,"Очень много льда, уменьши колличество льда...");
            water.setVolumeWater(addVolumeWater);
        } else {
            water.setVolumeWater(addVolumeWater);
            System.out.println("--------------" + "\n" + "When ice melted Tea volume was added on " + addedVolume + " Ml");
        }
    }

    @Override
    public String toString() {
        return "--------------" + "\n"
                + "Volume Water = " + getVolumeWater() + "\n" + "Temp Water = " + getTempWater();
    }
}


