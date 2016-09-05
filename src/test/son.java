package test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class son{
	 
	
    
	public static void main(String[] args) {
		String  str ="北京市(海淀区)(朝阳区)(西城区)";//这是需要匹配的字符串，接收动态值，可以类比一篇文章，过来进行规则检测，然后输出检测结果
		String patStr = ".*?(?=\\()";//这是正则表达式的检测对着，使用字符串对象存储
		Pattern pattern= Pattern.compile(patStr);
		/**正则表达式的编译表示形式, 指定为字符串的正则表达式必须首先被编译为此类的实例**/
		Matcher m= pattern.matcher(str);//翻译过来就是用正则表达式去匹配一串字符串
		if(m.find()){
			System.out.println(m.group(0));
		}else{
			System.out.println(m.group(0));
		}
      
	}

}
