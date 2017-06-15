import com.pluralsigth.service.CustumerService;
import com.pluralsigth.service.CustumerServiceImpl;

public class Application {

	public static void main(String[] args) {

		CustumerService service = new CustumerServiceImpl();
		
		System.out.println(service.findAll().get(0).getFirstname());
		
	}

}
