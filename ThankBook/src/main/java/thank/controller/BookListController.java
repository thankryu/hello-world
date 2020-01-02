package thank.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import thank.dto.BookInfo;
import thank.service.BookListService;

@Controller
public class BookListController {
	
	@Autowired
	BookListService bookListService;

	@RequestMapping(value="/book/list" , method=RequestMethod.GET)
	public void BookList(Model model) {
		
		List<BookInfo> list = bookListService.list();
		
		int book_seq = bookListService.bookTitle();
		
		model.addAttribute("book_seq", book_seq);
		model.addAttribute("list",list);
	}
	
	/**
	 * 
	 * @param Title
	 * @return
	 */
	@RequestMapping(value="/book/{bookNo}" , method=RequestMethod.GET)
	public ModelAndView BookView(@PathVariable String bookNo, Model model) {
		ModelAndView mv = new ModelAndView();
		
		//변수로 bookNo를 전달 받아 책을 자세히 보는 페이지로 넘긴다
		List<BookInfo> viewerList  = bookListService.bookViewer(bookNo);
		mv.addObject("viewerList",viewerList);
		mv.setViewName("book/viewer");
		return mv;
		
	}
	
	@RequestMapping(value="/book/total/{type}/{list}" , method=RequestMethod.GET)
	public ModelAndView TotalView(@PathVariable String type,@PathVariable String list, Model model) {
		HashMap<String,String> map = new HashMap<>();
		ModelAndView mv = new ModelAndView();
		String min = "0";
		String max = "0";
		if(list.equals("1")) {
			min = "26";
			max = "32";
		} else if(list.equals("2")) {
			min = "33";
			max = "39";
		}else if(list.equals("3")) {
			min = "40";
			max = "46";
		}

		map.put("min", min);
		map.put("max", max);
		map.put("type", type);
		//변수로 bookNo를 전달 받아 책을 자세히 보는 페이지로 넘긴다
		List<BookInfo> viewerList  = bookListService.totalView(map);
		mv.addObject("viewerList",viewerList);
		mv.setViewName("book/total/totalView");
		return mv;
		
	}
	
	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
		return "main";
	}
	
	
}
