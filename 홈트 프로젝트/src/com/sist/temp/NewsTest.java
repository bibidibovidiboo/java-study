package com.sist.temp;
import java.io.FileWriter;
import java.util.*;
import org.jsoup.*;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.sist.data.HomeTrainingVO;
public class NewsTest {
	public void newsAllData() {
		try {
			ArrayList<NewsVO> list=new ArrayList<NewsVO>();
			
			for(int i=1;i<=9;i++) 
			{
				Document doc=Jsoup.connect("https://people.incruit.com/resumeguide/pdslist.asp?pds1=1&pds2=11&pass=y").get();
				Elements link=doc.select("td a");
				
				for(int j=0;j<link.size();j++) {
					try {
		        		String dlink=link.get(j).attr("href");
	        			dlink="http://www.dailytoday.co.kr"+dlink.substring(2,dlink.length());
						Document doc2=Jsoup.connect(dlink).get(); 			
						
					
//						Element poster=doc2.selectFirst("div#img_caption img");
//						String poster2=poster.attr("src").substring(11);
//						System.out.println("포스터:"+"http://www.dailytoday.co.kr"+poster2);
//		    	    	
//						Element title=doc2.selectFirst("div.titleWrap strong");
//		    	    	System.out.println("제목:"+title.text());
//		    	    	
//		    	    	Element author=doc2.selectFirst("div.else-area p");
//		        		System.out.println("기자:"+author.text());
//		        		
//		        		Element date=doc2.selectFirst("div.registModifyDate li");
//		        		System.out.println("날짜:"+date.text().substring(5,15));
		        		
		        		// 상세정보

		    	    	System.out.println("============================================");
						
					}catch (Exception ex) {}
				}				
			}

		}catch (Exception ex) {
			System.out.println(ex.getMessage());
		}		
	}
	public static void main(String[] args) {
		NewsTest m=new NewsTest();
		m.newsAllData();
	}
}