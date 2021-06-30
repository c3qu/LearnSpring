package top.tantalum.beanPostProcessor;

public class ShowMessage {
	private String msg;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public void init() {
		System.out.println("初始化完成！");
	}
	
	public void destroy() {
		System.out.println("已经销毁");
	}

}
