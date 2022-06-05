package com.bara.breadhouse.dao.mapper;

import java.util.List;

import com.bara.breadhouse.vo.StoreVo;

public interface StoreMapper {

	public int insertStore (StoreVo vo);
	
	public List getLocationStoreList (String location);
	
	public int getDetailStore (String lat, String lan);
	
	public int updateStore (String lon, String lan);
	
	public int deleteStore (String lon, String lan);
	
	
	
	
}
