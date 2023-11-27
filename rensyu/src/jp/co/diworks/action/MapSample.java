package jp.co.diworks.action;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapSample {
	public static void main (String[]args) {
		Map<String,String> map = new LinkedHashMap<String,String>();
		
		//値のセットは put メソッド
		map.put("山","value1");
		map.put("田","value2");
		map.put("た","value3");
		map.put("ろ","value4");
		map.put("う","value5");
		
		//値の取得
		//String value = map.get("key1"); //value1 が取得出来る!
		//System.out.println(value);
		
		//String valueNull = map.get("key6"); //存在しない key の場合は Null
		//System.out.println(valueNull);
		
		
		//map に該当する key が存在するか否かチェックすることも可能
		if(map.containsKey("key1")) {
			System.out.println("key1は存在します");
		}else{
			System.out.println("key1は存在しません");	
		}
		
		//拡張 for文 を利用して全て取得する
		for(Map.Entry<String,String> e:map.entrySet()) {
			System.out.println(e.getKey() +":" + e.getValue());
		}
		
	}

}
