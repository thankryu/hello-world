package thank.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import thank.dao.BookListDao;
import thank.dto.BookInfo;

@Service
public class BookListServiceImpl implements BookListService {

	@Autowired private BookListDao bookListDao;

	@Override
	public List<BookInfo> list() {
		System.out.println("service impl");
		return bookListDao.selectAll();
	}

	@Override
	public int bookTitle() {
		return  bookListDao.bookTitle();
	}

	@Override
	public List<BookInfo> bookViewer(String bookNo) {
		return bookListDao.bookViewer(bookNo);
	}

	@Override
	public List<BookInfo> totalView(HashMap<String, String> map) {
		return bookListDao.bookTotalViewer(map);
	}
	
	
}
