package thank.dto;

import java.util.Date;

public class BookInfo {

    // 책고유관리번호 
    private Integer bookSeq;

    // 제목 
    private String bookTitle;

    // 작가 
    private String bookAuthor;

    // 분류 
    private String bookCategory;

    // 언어 
    private String bookLanguage;

    // 묘사 
    private String bookDescription;

    // 태그 
    private String bookTag;

    // 조회수 
    private Integer bookReviewCount;

    // 수정일 
    private Date bookUpdate;

    // 저장일 
    private Date bookInsert;

    // 페이지번호 
    private Integer bookPage;

    // 저장위치 
    private String bookUploadPath;
    
    private String bookExtension;

    // 파일크기 
    private Integer bookSize;

    private Integer pageCount;
	public Integer getBookSeq() {
		return bookSeq;
	}

	public void setBookSeq(Integer bookSeq) {
		this.bookSeq = bookSeq;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public String getBookCategory() {
		return bookCategory;
	}

	public void setBookCategory(String bookCategory) {
		this.bookCategory = bookCategory;
	}

	public String getBookLanguage() {
		return bookLanguage;
	}

	public void setBookLanguage(String bookLanguage) {
		this.bookLanguage = bookLanguage;
	}

	public String getBookDescription() {
		return bookDescription;
	}

	public void setBookDescription(String bookDescription) {
		this.bookDescription = bookDescription;
	}

	public String getBookTag() {
		return bookTag;
	}

	public void setBookTag(String bookTag) {
		this.bookTag = bookTag;
	}

	public Integer getBookReviewCount() {
		return bookReviewCount;
	}

	public void setBookReviewCount(Integer bookReviewCount) {
		this.bookReviewCount = bookReviewCount;
	}

	public Date getBookUpdate() {
		return bookUpdate;
	}

	public void setBookUpdate(Date bookUpdate) {
		this.bookUpdate = bookUpdate;
	}

	public Date getBookInsert() {
		return bookInsert;
	}

	public void setBookInsert(Date bookInsert) {
		this.bookInsert = bookInsert;
	}

	public Integer getBookPage() {
		return bookPage;
	}

	public void setBookPage(Integer bookPage) {
		this.bookPage = bookPage;
	}

	public String getBookUploadPath() {
		return bookUploadPath;
	}

	public void setBookUploadPath(String bookUploadPath) {
		this.bookUploadPath = bookUploadPath;
	}

	public Integer getBookSize() {
		return bookSize;
	}

	public void setBookSize(Integer bookSize) {
		this.bookSize = bookSize;
	}

	public String getBookExtension() {
		return bookExtension;
	}

	public void setBookExtension(String bookExtension) {
		this.bookExtension = bookExtension;
	}

	public Integer getPageCount() {
		return pageCount;
	}

	public void setPageCount(Integer pageCount) {
		this.pageCount = pageCount;
	}

	@Override
	public String toString() {
		return "BookInfo [bookSeq=" + bookSeq + ", bookTitle=" + bookTitle + ", bookAuthor=" + bookAuthor
				+ ", bookCategory=" + bookCategory + ", bookLanguage=" + bookLanguage + ", bookDescription="
				+ bookDescription + ", bookTag=" + bookTag + ", bookReviewCount=" + bookReviewCount + ", bookUpdate="
				+ bookUpdate + ", bookInsert=" + bookInsert + ", bookPage=" + bookPage + ", bookUploadPath="
				+ bookUploadPath + ", bookExtension=" + bookExtension + ", bookSize=" + bookSize + "]";
	}



	
}
