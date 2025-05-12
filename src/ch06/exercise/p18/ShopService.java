package ch06.exercise.p18;

public class ShopService {
    //* Reference : [Book. 이것이 자바다] p.282

    private static ShopService object;

    private ShopService() {

    }

    public static ShopService getInstance() {
        if (object == null) {
            ShopService shopService = new ShopService();
            object = shopService;
        }

        return object;
    }
}
