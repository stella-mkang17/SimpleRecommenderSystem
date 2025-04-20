package recommender;

/**
 * This class provides product recommendations based on simple rules.
 * It checks if the product matches the user's skin type, concern, age,
 * and fragrance preference.
 * 
 * 이 클래스는 간단한 규칙에 기반한 제품 추천 기능을 제공합니다.
 * 제품이 사용자의 피부 타입, 고민, 나이, 향 선호와 맞는지를 확인합니다.
 * 
 * @author Stella Kang (mkang17)
 * @version April 20, 2025
 */
public class RuleBasedRecommender implements Recommender {

    /**
     * constructor of RuleBasedRecommender
     * currently empty
     */
    public RuleBasedRecommender() {

    }


    /**
     * Recommends products using rule-based filtering.
     * A product is included if all of the following are true:
     * - Suitable for the user's skin type
     * - Targets the user's skin concern
     * - Matches the user's age group
     * - Matches the user's fragrance preference
     * 
     * 이 메서드는 규칙 기반으로 제품을 추천합니다.
     * 다음 조건을 모두 만족하는 경우 추천 목록에 포함됩니다:
     * - 사용자 피부 타입과 잘 맞음
     * - 사용자 고민에 적합함
     * - 사용자 나이대에 맞음
     * - 사용자 향 선호와 일치함
     * 
     * @param user
     *            the user's profile (사용자 정보)
     * @param products
     *            the list of available products (전체 제품 목록)
     * @return a list of products that meet all criteria (추천 제품 목록)
     */
    public SinglyLinkedList<Product> recommend(
        UserProfile user,
        SinglyLinkedList<Product> products) {

        SinglyLinkedList<Product> recommended = new SinglyLinkedList<>();

        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);

            boolean matchesSkin = product.isSuitableForSkinType(user
                .getSkinType());
            boolean matchesConcern = product.targetsConcern(user.getConcern());
            boolean matchesAge = product.matchesAge(user.getAge());
            boolean matchesFragrance = !user.prefersFragranceFree() || product
                .isFragranceFree();

            if (matchesSkin && matchesConcern && matchesAge
                && matchesFragrance) {
                recommended.add(product);
            }
        }

        return recommended;
    }

}
