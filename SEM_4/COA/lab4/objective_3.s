.global _start
_start:
	
	ldr r0,=n1		@Load the address of n1 to r0
	ldr r1,[r0]		@Load the value of n1 to r1
	ldr r0,=n2		@Load the address of n2 to r0
	ldr r2,[r0]		@Load the value of n2 to r2
	
	and r3,r1,r2	@AND operation of r1,r2 --> store it in r3
	orr r4,r1,r2	@OR operation of r1,r2 --> store it in r4
	eor r5,r1,r2	@XOR operation of r1,r2 --> store it in r5
	mvn r6,r2		@NOT operation of r1,r2 --> store it in r6
	
	B .
.data
	n1: .word 10
	n2: .word 2