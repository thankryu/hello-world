package thank.dao;

import java.util.HashMap;
import java.util.List;

import thank.dto.BookInfo;

public interface BookListDao {
	public int bookTitle();
	// 게시물 전체 조회
	public List selectAll();
	//책 내용 상세보기
	public List<BookInfo> bookViewer(String bookNo);
	
	public List<BookInfo> bookTotalViewer(HashMap<String, String> map);
}
