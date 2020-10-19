package hotel.booking.service;

import java.util.List;

import hotel.booking.model.Category;
import hotel.booking.model.Hotel;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface HotelServiceDAO {

	public Category getCategories();

	public List<String> searchTerm(String term);

	public List<Hotel> searchHotels(String term, int offset, int limit, String sortcolumn, String sorttype);

	public int getCount(String term);

	public List<Hotel> categorySearch(String categorylist, int offset, int limit, String sortcolumn, String sorttype);

	int getCategoryCount(String categorylist);

	public List<Hotel> searchHotelById(String id);

	public void creteBooking(String rooms, String id, String date, String user_id);

	public void createUser(String fname, String lname, String emailTxt, String pwd);

}
