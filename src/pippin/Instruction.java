package pippin;

public interface Instruction {
	void execute(int arg, int flags);
	
	static int numOnes(int i) {
//		String s = Integer.toUnsignedString(i, 2);
//		int c = 0;
//		
//		for(int k = 0; k < s.length(); k++)
//			if(s.charAt(k) == '1')
//				c++;
//		
//		return c;
		
		i = i - ((i >>> 1) & 0x55555555);
		i = (i & 0x33333333) + ((i >>> 2) & 0x33333333);
		return (((i + (i >>> 4)) & 0x0F0F0F0F) * 0x01010101) >>> 24;
	}
	
	static void checkParity(int k) {
		if(numOnes(k) % 2 == 1)
			throw new ParityCheckException("The instruction is corrupted.");
	}
}
