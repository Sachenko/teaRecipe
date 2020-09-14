package teakit.ingredient;

import teakit.liquid.Tea;

public class Sugar {
    private int cubeSugar; //Ложка чайных листьев
    public final boolean CHECK_SUGAR = true;

    Tea tea;

    public Sugar(int cubeSugar) {
        this.cubeSugar = cubeSugar;
        System.out.println(toString());
    }

    public int getCubeSugar() {
        return cubeSugar;
    }


    @Override
    public String toString() {
        return "--------------" + "\n"
                + "Кубик сахара в колличестве " + getCubeSugar() + " шт";
    }


}



