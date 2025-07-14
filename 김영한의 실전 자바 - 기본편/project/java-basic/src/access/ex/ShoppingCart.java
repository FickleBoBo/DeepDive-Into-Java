package access.ex;

public class ShoppingCart {
    private Item[] items;
    private int count;

    public ShoppingCart() {
        items = new Item[10];
    }

    public void addItem(Item item) {
        if (count >= 10) {
            System.out.println("장바구니가 가득 찼습니다.");
            return;
        }

        items[count++] = item;
    }

    public void displayItems() {
        int totalPrice = 0;
        System.out.println("장바구니 상품 출력");
        for (int i = 0; i < count; i++) {
            System.out.println("상품명: " + items[i].getName() + ", 합계: " + items[i].getTotalPrice());
            totalPrice += items[i].getTotalPrice();
        }
        System.out.println("전체 가격 합: " + totalPrice);
    }
}
