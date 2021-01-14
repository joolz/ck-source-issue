package nl.joolz.test.cktest;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class CkTestBean {
	private String content = "initial value";

	public void doPost() {
		System.err.println(content);
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getContent() {
		return content;
	}
}
