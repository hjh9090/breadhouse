package com.bara.breadhouse.constant;

public enum Location {
	SEOUL("SEOUL"), GYEINGGI("GYEINGGI"), GANGWON("GANGWON"), GYEONGBUK("GYEONGBUK")
	,GYEONGNAM("GYEONGNAM"), GWANGJU("GWANGJU")
	,DAEJEON("DAEJEON"), DAEGU("DAEGU"), BUSAN("BUSAN"), SEJONG("SEJONG"), INCHEON("INCHEON")
	,ULSAN("ULSAN"), JEONBUK("JEONBUK"), JEONNAM("JEONNAM") 
	,CHUNGBUK("CHUNGBUK"), CHUNGNAM("CHUNGNAM"), JEJU("JEJU");
	
	private final String locationCode;
	
	
	Location(String locationCode) {
		this.locationCode = locationCode;
	}
	
	
	
	
	
}
