public class VirtualMemory {
	private Page[] blocks = new Page[16];

	public void setBlocks(Page[] blocks) {
		this.blocks = blocks;
	}

	public Page[] getBlocks() {
		return blocks;
	}

	public static int calculate_block_number(String virtual_address) {
		return (int) Math
				.ceil((Integer.parseInt(virtual_address, 2) - 4000.0) / 4000);

	}

	public static void main(String[] args) {
		System.out.println(calculate_block_number("0001001110001000"));
	}
}
