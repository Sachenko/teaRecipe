package teakit.ingredient;

public class Lemon {
    private int sliceLemon; //Долька лимона
    public final boolean CHECK_LEMON = true;

    public Lemon(int sliceLemon) {
        this.sliceLemon = sliceLemon;
        System.out.println(toString());
    }

    public Lemon getLemon() {
        return this;
    }

    public int getSliceLemon() {
        return this.sliceLemon;
    }


    @Override
    public String toString() {
        return  "--------------" + "\n"
                + "Дольки лимона в колличестве " + getSliceLemon() + "шт";
    }

    public String checkLemon() {
        return "true";
    }
}

