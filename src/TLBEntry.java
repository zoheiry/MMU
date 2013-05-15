public class TLBEntry {
	
	private int page_number;
	private int page_frame_number;
	private boolean valid;
	private boolean read;
	private boolean write;
	private boolean execute;
	

	public int getPage_number() {
		return page_number;
	}
	public void setPage_number(int page_number) {
		this.page_number = page_number;
	}
	public int getPage_frame_number() {
		return page_frame_number;
	}
	public void setPage_frame_number(int page_frame_number) {
		this.page_frame_number = page_frame_number;
	}
	public boolean isValid() {
		return valid;
	}
	public void setValid(boolean valid) {
		this.valid = valid;
	}
	public boolean isRead() {
		return read;
	}
	public void setRead(boolean read) {
		this.read = read;
	}
	public boolean isWrite() {
		return write;
	}
	public void setWrite(boolean write) {
		this.write = write;
	}
	public boolean isExecute() {
		return execute;
	}
	public void setExecute(boolean execute) {
		this.execute = execute;
	}
	
	
	
	
}
