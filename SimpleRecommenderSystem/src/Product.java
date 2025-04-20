
public class Product {
    private String name;
    private String skinTypeSuitable;
    private String concernTargeted;
    private boolean fragranceFree;
    private String ageGroup;

    public Product(
        String name,
        String skinTypeSuitable,
        String concernTargeted,
        Boolean fragranceFree,
        String ageGroup) {
        this.name = name;
        this.skinTypeSuitable = skinTypeSuitable;
        this.concernTargeted = concernTargeted;
        this.ageGroup = ageGroup;
    }


    public String getName() {
        return name;
    }


    public boolean isSuitableForSkinType(String skinType) {
        return false; // FIXME
    }


    public boolean targetsConcern(String concern) {
        return false; // FIXME
    }


    public boolean isFragranceFree() {
        return false; // FIXME
    }


    public boolean matchesAge(int age) {
        return false; // FIXME
    }
}
