package jp.co.diworks.action;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetSample {
	public static void main(String[]agrs) {
		Set<String> set = new LinkedHashSet<String>();
		
		//値のセットは add メソッド
		set.add("value1");
		set.add("value2");
		set.add("value3");
		set.add("value4");
		set.add("value5");
		
		set.add("value1"); //	重複要素は追加出来ない
		
		//拡張 for文 を利用
		for(String s : set) {
			System.out.println(s);
		}
		
	}

}
