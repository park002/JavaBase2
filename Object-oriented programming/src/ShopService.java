
public class ShopService {
	private static ShopService Service = new ShopService();

	private ShopService() {

	}

	static ShopService getInstance() {
		return Service;
	}
}
