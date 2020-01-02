package thank.service;

import java.util.HashMap;
import java.util.List;

import thank.dto.BookInfo;

public interface BookListService {

	public List<BookInfo> list();

	public int bookTitle();

	public List<BookInfo> bookViewer(String bookNo);

	public List<BookInfo> totalView(HashMap<String, String> map);

}
