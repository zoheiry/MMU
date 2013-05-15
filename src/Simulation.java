import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Simulation {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(split("10000000000100"));
		
	}
	
	public static ReferenceAndVirtualAddress split(String in) {
		ReferenceAndVirtualAddress out = new ReferenceAndVirtualAddress();
		out.reference = out.reference(in.substring(0,2));
		out.virtual_address = in.substring(2, in.length());
		return out;
	}
	
	public boolean conformation(String reference) {
		
	}
}

class ReferenceAndVirtualAddress {
	String reference;
	String virtual_address;
	
	public String toString() {
		return reference + " | " + virtual_address;
	}
	
	public String reference(String reference) {
		if (reference.equals("00")) 
			return "read";
		if (reference.equals("01"))
			return "execute";
		return "write";
	}
}