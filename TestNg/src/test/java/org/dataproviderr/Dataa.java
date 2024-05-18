package org.dataproviderr;

import org.testng.annotations.DataProvider;

public class Dataa {
	@DataProvider(name="login")
	private Object datas() {
		
		Object obj [][]= {
				{"srinath@gmsl.com","63814856988"},
				{"pathma3402@gmail.com","9360772960"},
				{"pdharanibvn@gmail.com","9566858082"},
				{"shandhini2001@gmail.com","8300366445"}	
		};
		return obj;
	}
	@DataProvider(name="register")
	private Object register() {
		Object obj [][]= {
				{"srinath","A","6381486988","Srinath",28,9,20},
				{"Pathma","E","9360772960","Pathma@19",14,3,11},
				{"Daharani","P","956685882","Dhaaru@2506",25,6,13},
				{"Shandhini","P","8300366445","Shandhini@2001",24,10,22}
		};
		return obj;
	}
}
