package com.adactin.pomanager;

import org.openqa.selenium.WebDriver;

import com.adactin.pom.BookHotel;
import com.adactin.pom.SearchHotel;
import com.adactin.pom.SelectHotel;
import com.adactin.pom.SignInPage;

public class PageObjectManager {
	public static WebDriver driver;
	private SignInPage sp;

	public PageObjectManager(WebDriver driver2) {
		this.driver = driver2;
	}

	public SignInPage getSp() {
		sp = new SignInPage(driver);
		return sp;
	}
		private SearchHotel sh;

		public SearchHotel getSh() {
			sh = new SearchHotel(driver);
			return sh;
		}
		
		private SelectHotel sl;

		public SelectHotel getSl() {
			sl = new SelectHotel(driver);
			return sl;
		}

		private BookHotel bh;

		public BookHotel getBh() {
			bh = new BookHotel(driver);
			return bh;
		}

}
