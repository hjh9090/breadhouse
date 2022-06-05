package com.bara.breadhouse.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StoreVo {
	
	private String lon; // 경도
	private String lat; // 위도
	private String storeName; // 가게 이름
	private String location; // 지역
	private String telNum; // 전화번호
	private String time; // 영업시간 
	
	
	
	

}
