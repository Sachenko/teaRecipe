package teakit.ingredient;

public class TeaLeaf {

    private int spoonLeaf; //Ложка чайных листьев

    public TeaLeaf(int spoonLeaf) {
        this.spoonLeaf = spoonLeaf;
        System.out.println(toString());
    }

    public TeaLeaf getTeaLeaf() {
        return this;
    }

    public int getSpoonLeaf() {
        return this.spoonLeaf;
    }


    @Override
    public String toString() {
        return  "--------------" + "\n"
                + "Ложка чайных листьев в колличестве " + getSpoonLeaf() + "шт";
    }

    public String checkLeaf() {
        return "true";
    }
}
