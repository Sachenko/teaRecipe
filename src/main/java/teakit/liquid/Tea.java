package teakit.liquid;
import teakit.ingredient.Lemon;
import teakit.ingredient.Sugar;
import teakit.ingredient.TeaLeaf;

public class Tea extends Water {

    public final String COLOR = "Brown";
    private final TeaLeaf teaLeaf;
    private boolean citrusFlavor = false;
    private boolean sugarFlavor = false;
    private int cubeSugar;
    private int sliceLemon;


    public Tea(TeaLeaf teaLeaf, Water water, int volumeWater) {
        super(volumeWater);
        if(water.getTempWater() < MAX_TEMP_WATER ) {
            throw new IllegalArgumentException();
        } else {
            this.teaLeaf = teaLeaf;
            super.setTempWater(water.getTempWater());
            super.setVolumeWater(water.takeSomeWater(this.getVolumeWater()));
            System.out.println(toString());
        }
    }

    public void setTeaSugar(Sugar sugar) {
        sugarFlavor = sugar.CHECK_SUGAR;
        cubeSugar =  sugar.getCubeSugar();
        System.out.println("--------------" + "\n" +  cubeSugar + " Cube sugar added to tea");
    }

    public void setSliceLemon(Lemon lemon) {
        citrusFlavor = lemon.CHECK_LEMON;
        sliceLemon =  lemon.getSliceLemon();
        System.out.println("--------------" + "\n" +  sliceLemon + " Slice Lemon added to tea");
    }

    @Override
    public String toString() {
        return  "--------------" + "\n"
                + "Volume Tea = " + getVolumeWater() + "\n" + "Temp Tea = " + getTempWater() + "\n"
                + "Tea is sweet = " + sugarFlavor + " | " + "Number Sugar cube " +  cubeSugar + "\n"
                + "Taste of the tea citrus = " + citrusFlavor + " | " + "Number slice Lemon " +  sliceLemon
                ;
    }
}