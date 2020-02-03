package com.brms;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.brms.book.Book;
import com.brms.book.service.BookRegisterService;
import com.brms.book.service.BookSearchService;
import com.brms.member.Member;
import com.brms.member.service.MemberRegisterService;
import com.brms.member.service.MemberSearchService;

public class MainClass {
	public static void main(String[] args) {

		String[] bNums = { "739", "985", "184", "830", "816" };
		String[] bTitles = { "html", "css", "jQuery", "java", "spring" };
		String[] mIds = { "rabbit", "hippo", "raccoon", "elephan", "lion" }; //�쉶�썝ID
		String[] mPws = { "96539", "94875", "15284", "48765", "28661" }; //�쉶�썝鍮꾨쾲
		String[] mNames = { "agatha", "barbara", "chris", "doris", "elva" }; //�쉶�썝�씠由�
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:appCtx.xml");
		
	 //빈객체 생성
		BookRegisterService bookRegisterService = ctx.getBean("bookRegisterService", BookRegisterService.class);
		for (int i = 0; i < bNums.length; i++) { //0~4
			Book book = new Book(bNums[i], bTitles[i], true, null); //985 , css , true, null
			bookRegisterService.register(book); ////985 , css , true, null
			
		}
		

		BookSearchService bookSearchService = ctx.getBean("bookSearchService", BookSearchService.class);
		System.out.println("\nbNum\tbTitle\tbCanRen\tbLenderId");
		System.out.println("------------------------------------------");
		for (int i = 0; i < bNums.length; i++) { //0~4
			Book book = bookSearchService.searchBook(bNums[i]); //"739", "985", "184", "830", "816"
			System.out.print(book.getbNum() + "\t");
			System.out.print(book.getbTitle() + "\t");
			System.out.print(book.isbCanRental() + "\t");
			System.out.println(book.getbMember() == null ? null : book.getbMember().getmId());
		}
		
	
		MemberRegisterService memberRegisterService = ctx.getBean("memberRegisterService", MemberRegisterService.class);
		for (int i = 0; i < mIds.length; i++) { //0~4
			Member member = new Member(mIds[i], mPws[i], mNames[i]); //rabbit 96539 agatha
			memberRegisterService.register(member);
		}
		
		// �뜑誘� �쉶�썝 紐⑸줉 異쒕젰
		MemberSearchService memberSearchService = ctx.getBean("memberSearchService", MemberSearchService.class);
		System.out.println("\nmId\tmPw\tmName");
		System.out.println("------------------------------------------");
		for (int i = 0; i < mIds.length; i++) { //0~4
			Member member = memberSearchService.searchMember(mIds[i]); //String rabbit
			System.out.print(member.getmId() + "\t"); //rabbit
			System.out.print(member.getmPw() + "\t"); //96539
			System.out.print(member.getmName() + "\n"); //agatha
		}
		
		// �룄�꽌 ���뿬 紐⑸줉 �벑濡�
		//public void register(Book book) 
		//public Book(String bNum, String bTitle, boolean bCanRental, Member bMember) 
		//�깉濡쒖슫 李몄“�뜲�씠�꽣�뱾�쓣 �깮�꽦 媛곸옄 �떎瑜� 二쇱냼媛믪쓣 媛�吏�怨� �엳�떎 �떎瑜멸컼泥댁씠�떎 .
		bookRegisterService.register(new Book("739", "html", false, memberSearchService.searchMember("elephan")));
		bookRegisterService.register(new Book("184", "jQuery", false, memberSearchService.searchMember("hippo")));
		bookRegisterService.register(new Book("816", "spring", false, memberSearchService.searchMember("rabbit")));
		bookRegisterService.register(new Book("985", "css", false, memberSearchService.searchMember("rabbit")));
		
		// �룄�꽌 ���뿬 紐⑸줉 異쒕젰
		System.out.println("\nbNum\tbTitle\tbCanRen\tbLenderId");
		System.out.println("------------------------------------------");
		for (int i = 0; i < bNums.length; i++) { //0~4
			Book book = bookSearchService.searchBook(bNums[i]); //String  739
			System.out.print(book.getbNum() + "\t"); // 739
			System.out.print(book.getbTitle() + "\t"); //html
			System.out.print(book.isbCanRental() + "\t"); //false
			System.out.println(book.getbMember() == null ? null : book.getbMember().getmId()); //elephan
		}
		
		ctx.close();
		
	}
}
