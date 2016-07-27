import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;


public class MsgIdTest {
	
	@Test
	public void getMsgId(){
		String str="&lt;sysmsg type=\"revokemsg\"&gt;&lt;revokemsg&gt;&lt;session&gt;wxid_rywzrzre4pgw22&lt;/session&gt;&lt;oldmsgid&gt;1642051749&lt;/oldmsgid&gt;&lt;msgid&gt;8119924889549745209&lt;/msgid&gt;&lt;replacemsg&gt;&lt;![CDATA[\"丶\" 撤回了一条消息]]&gt;&lt;/replacemsg&gt;&lt;/revokemsg&gt;&lt;/sysmsg&gt;";
		Pattern pattern=Pattern.compile("&lt;msgid&gt;\\d+&lt;/msgid&gt;");
		Matcher m = pattern.matcher(str);
		if(m.find()){
			System.out.println(m.group());
		}
	}
}
