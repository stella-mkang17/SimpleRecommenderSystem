package recommender;

/**
 * This interface represents a general recommender system.
 * Any class that recommends products (e.g., rule-based, content-based)
 * should implement this interface.
 * 
 * 이 인터페이스는 전반적인 추천 시스템을 나타냅니다.
 * 화장품을 추천하는 모든 클래스(예: 규칙 기반, 콘텐츠 기반)는 이 인터페이스를 구현해야 합니다.
 * 
 * @author Stella Kang (mkang17)
 * @version April 20, 2025
 */
public interface Recommender {

    /**
     * Recommends products based on the user profile and product list.
     * 
     * 사용자 프로필과 전체 제품 목록을 바탕으로 추천 제품을 반환합니다.
     *
     * @param user
     *            the user's profile (사용자 정보)
     * @param products
     *            the list of available products (전체 제품 목록)
     * @return a list of products recommended for the user (추천 결과 리스트)
     */
    public SinglyLinkedList<Product> recommend(UserProfile user,
        SinglyLinkedList<Product> products);
}
