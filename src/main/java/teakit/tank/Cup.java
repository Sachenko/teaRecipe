package teakit.tank;

import teakit.ingredient.Sugar;
import teakit.ingredient.TeaLeaf;
import teakit.liquid.Tea;
import teakit.liquid.Water;

// Имеет небольшой объем и удобную ручку для удобства. Обычно именно из нее наслаждаются напитком.
public class Cup extends Reservoir {
    private Tea tea;
    private Water water;

    public Cup() {
        super(300);
        System.out.println("--------------" + "\n" +
                "Empty cup with max volume 300");
    }

    public void createOfOrdinaryTea(Water water, TeaLeaf teaLeaf) {
        if (water.getTempWater() < 100) {
            throw new IllegalArgumentException();
        } else {
            Tea tea = new Tea(teaLeaf, water, 300);
            this.tea = tea;
            System.out.println("--------------" + "\n" + "Created cup of ordinary tea inside cup without anything");
        }
    }

    public Tea getTea() {
        return this.tea;
    }

    @Override
    public String toString() {
        return "---------------" + "\n"
                + "Max volume Cup = " + maxVolume + "\n" +
                "Volume liquid inside cup = " + tea.getVolumeWater() + "\n" +
                "Temp liquid inside cup = " + tea.getTempWater();
    }
}
