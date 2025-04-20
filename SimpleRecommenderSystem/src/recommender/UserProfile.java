package recommender;

/**
 * This class saves one person's skin information.
 * It includes their skin type, skin problem, age, and if they like
 * fragrance-free products.
 * We use this info to help find good skincare products.
 * 
 * 이 클래스는 한 사람의 피부 정보를 저장합니다.
 * 피부 타입, 피부 고민, 나이, 향 없는 제품을 좋아하는지를 포함합니다.
 * 이 정보를 사용해서 좋은 화장품을 추천합니다.
 * 
 * @author Stella Kang (mkang17)
 * @version April 20, 2025
 */
public class UserProfile {

    private String skinType;
    private String concern;
    private int age;
    private boolean prefersFragranceFree;

    /**
     * Creates a new UserProfile with the given information.
     * 
     * 주어진 정보를 사용해서 새로운 사용자 프로필을 만듭니다.
     *
     * @param skinType
     *            the user's skin type (예: oily, dry, sensitive 등)
     * @param concern
     *            the user's skincare concern (예: acne, redness 등)
     * @param age
     *            the user's age (나이)
     * @param prefersFragranceFree
     *            true if the user prefers products without fragrance (향을 싫어하는지
     *            여부)
     */
    public UserProfile(
        String skinType,
        String concern,
        int age,
        boolean prefersFragranceFree) {
        this.skinType = skinType;
        this.concern = concern;
        this.age = age;
        this.prefersFragranceFree = prefersFragranceFree;
    }


    /**
     * Gets the user's skin type.
     * 
     * 사용자의 피부 타입을 알려줍니다.
     *
     * @return the skin type
     */
    public String getSkinType() {
        return skinType;
    }


    /**
     * Gets the user's main skincare concern.
     * 
     * 사용자의 주요 피부 고민을 알려줍니다.
     *
     * @return the skincare concern
     */
    public String getConcern() {
        return concern;
    }


    /**
     * Gets the user's age.
     * 
     * 사용자의 나이를 알려줍니다.
     *
     * @return the age
     */
    public int getAge() {
        return age;
    }


    /**
     * Checks if the user prefers fragrance-free products.
     * 
     * 사용자가 향이 없는 제품을 좋아하는지 확인합니다.
     *
     * @return true if they prefer fragrance-free, false otherwise
     */
    public boolean prefersFragranceFree() {
        return prefersFragranceFree;
    }
}
