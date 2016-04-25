package pippin;

import java.util.Arrays;

public class Factorial {
	public static void main(String[] args) {
		MachineModel test = new MachineModel();
		test.setData(0,8);
		test.setRunning(true);
		
		int op = 0, arg = 0;
		
		op = 1*8 + 1; // LOD using direct addressing (flags 0) plus the parity bit
		arg = 0;
		test.setCode(op, arg);
		
		op = 2*8 + 1; // STO using direct addressing (flags 0) plus the parity bit
		arg = 1;
		test.setCode(op, arg);
		
		op = 1*8 + 1; // LOD using direct addressing (flags 0) plus the parity bit
		arg = 0;
		test.setCode(op, arg);
		
		op = 6*8 + 2 + 1; // SUB using immediate addressing (flags 2) plus the parity bit
		arg = 1;
		test.setCode(op, arg);
		
		op = 2*8 + 1; // STO using direct addressing (flags 0) plus the parity bit
		arg = 0;
		test.setCode(op, arg);
		
		op = 0xC*8; // CMPZ using direct addressing (flags 0)
		arg = 0;
		test.setCode(op, arg);
		
		op = 6*8 + 2 + 1; // SUB using immediate addressing (flags 2) plus the parity bit
		arg = 1;
		test.setCode(op, arg);
		
		op = 4*8 + 1; // JMPZ using direct addressing (flags 0) plus the parity bit
		arg = 4;
		test.setCode(op, arg);
		
		op = 1*8 + 1; // LOD using direct addressing (flags 0) plus the parity bit
		arg = 0;
		test.setCode(op, arg);
		
		op = 7*8 + 1; // MUL using direct addressing (flags 0) plus the parity bit
		arg = 1;
		test.setCode(op, arg);
		
		op = 3*8 + 2 + 1; // JUMP using immediate addressing (flags 2) plus the parity bit
		arg = 1;
		test.setCode(op, arg);

		op = 0xF*8; // HALT using direct addressing (flags 0)
		arg = 0;
		test.setCode(op, arg);
		
		test.setRunning(true);
		int result = 0;
		while(test.isRunning()) {
			if(result != test.getData(1)){
				result = test.getData(1);
				System.out.println("0 => " + test.getData(0) + 
						"; 1 => " + result);
			}
			test.step();
		}
	}
}
