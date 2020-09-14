package teakit.tank;

//Умеет набирать нагретую воду смешивая ее с чайными листьями или другими компонентами. (Например сахар или лимон)

import teakit.ingredient.TeaLeaf;
import teakit.liquid.Tea;
import teakit.liquid.Water;

public class TeaKettle <Ingredients> extends Reservoir {
    Tea tea;
    Water water;

    public TeaKettle () {
        super(900);
    }


    public void createTastyTea(Water water, TeaLeaf teaLeaf) {
        if (water.getTempWater() < 100) {
            throw new IllegalArgumentException();
        } else {
            new Tea(teaLeaf, water, 300);
            System.out.println("--------------" + "\n" + "Created tasty tea inside kettle with" + "ingredients");
        }
    }


    @Override
    public String toString() {
        return "---------------" + "\n"
                + "Max volume Cup = " + maxVolume + "\n" +
                "Volume tea inside kettle = " + tea.getVolumeWater() + "\n" +
                "Temp liquid inside kettle = " + tea.getTempWater();
    }
}
