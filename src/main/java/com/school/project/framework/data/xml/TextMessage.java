package com.school.project.framework.data.xml;

import java.io.Serializable;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@SuppressWarnings("serial")
@Root(name = "xml")
public class TextMessage extends BaseMessage implements Serializable{
	
	@Element
	private String Content;
	
	@Element
	private String MsgId;

	public String getContent() {
		return Content;
	}

	public void setContent(String content) {
		Content = content;
	}

	public String getMsgId() {
		return MsgId;
	}

	public void setMsgId(String msgId) {
		MsgId = msgId;
	}

	
}
