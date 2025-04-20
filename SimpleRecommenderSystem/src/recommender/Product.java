package recommender;

/**
 * Stores product information for recommendation system.
 * 제품 추천 시스템에서 사용할 화장품 정보를 저장하는 클래스입니다.
 * 
 * @author Stella Kang (mkang17)
 * @version 2025.04.20
 */
public class Product {
    private String name;
    private String skinTypeSuitable;
    private String concernTargeted;
    private boolean fragranceFree;
    private String ageGroup;

    /**
     * Creates a new Product.
     * 새로운 제품을 만듭니다.
     * 
     * @param name
     *            name of the product (제품 이름)
     * @param skinTypeSuitable
     *            suitable skin type (적합한 피부 타입)
     * @param concernTargeted
     *            targeted skin concern (피부 고민)
     * @param fragranceFree
     *            true if fragrance-free (무향 여부)
     * @param ageGroup
     *            target age group, "teens" "20s" "30s" "40s" "50s" "senior"
     */
    public Product(
        String name,
        String skinTypeSuitable,
        String concernTargeted,
        boolean fragranceFree,
        String ageGroup) {
        this.name = name;
        this.skinTypeSuitable = skinTypeSuitable;
        this.concernTargeted = concernTargeted;
        this.fragranceFree = fragranceFree;
        this.ageGroup = ageGroup;
    }


    /**
     * Gets the name of this product.
     * 
     * @return the product's name
     * 
     *         제품의 이름을 가져옵니다.
     * 
     * @return 제품 이름
     */
    public String getName() {
        return name;
    }


    /**
     * Checks if this product is suitable for a given skin type.
     * For example, if the user has "oily" skin, and this product
     * is made for "oily" skin, it will return true.
     * 
     * @param skinType
     *            the skin type to check (e.g., "dry", "oily", "sensitive")
     * @return true if this product matches the skin type, false otherwise
     * 
     *         이 제품이 특정 피부 타입에 적합한지 확인합니다.
     *         예: 사용자의 피부 타입이 "지성"이고, 이 제품도 "지성"용이면 true를 반환합니다.
     * 
     * @param skinType
     *            검사할 피부 타입 (예: "건성", "지성", "민감성")
     * @return 제품이 피부 타입과 일치하면 true, 아니면 false
     */
    public boolean isSuitableForSkinType(String skinType) {
        return skinTypeSuitable.equalsIgnoreCase(skinType);
    }


    /**
     * Checks if this product targets a specific skin concern.
     * For example, if this product is for "acne", and the concern
     * is "acne", it will return true.
     * 
     * @param concern
     *            the skin concern to check (e.g., "acne", "wrinkles")
     * @return true if this product is for that concern, false otherwise
     * 
     *         이 제품이 특정 피부 고민을 해결하는지 확인합니다.
     *         예: 제품이 "여드름"용이고, 확인하려는 고민도 "여드름"이면 true를 반환합니다.
     * 
     * @param concern
     *            확인할 피부 고민 (예: "여드름", "주름")
     * @return 제품이 해당 고민을 해결하면 true, 아니면 false
     */
    public boolean targetsConcern(String concern) {
        return concernTargeted.equalsIgnoreCase(concern);
    }


    /**
     * Checks if this product is fragrance-free.
     * 
     * @return true if the product does not contain fragrance
     * 
     *         이 제품이 무향인지 확인합니다.
     * 
     * @return 무향이면 true
     */
    public boolean isFragranceFree() {
        return fragranceFree;
    }


    /**
     * Checks if this product matches a target age group.
     * For example, if the product is for "20s" and the user's age
     * is 23, it will return true.
     * 
     * @param age
     *            the user's age
     * @return true if the user's age fits the product's age group
     * 
     *         이 제품이 특정 나이대에 적합한지 확인합니다.
     *         예: 제품이 "20대"용이고 사용자의 나이가 23세이면 true를 반환합니다.
     * 
     * @param age
     *            사용자의 나이
     * @return 나이대가 맞으면 true, 아니면 false
     */
    public boolean matchesAge(int age) {
        if (ageGroup.equals("teens")) {
            return age >= 10 && age < 20;
        }
        else if (ageGroup.equals("20s")) {
            return age >= 20 && age < 30;
        }
        else if (ageGroup.equals("30s")) {
            return age >= 30 && age < 40;
        }
        else if (ageGroup.equals("40s")) {
            return age >= 40 && age < 50;
        }
        else if (ageGroup.equals("50s")) {
            return age >= 50 && age < 60;
        }
        else if (ageGroup.equals("senior")) {
            return age >= 60;
        }
        else {
            return false;
        }
    }
}
