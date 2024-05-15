.global _start
_start:
main:

	ldr r0,=n1		@Load the address of n1 to r0
	ldr r1,[r0]		@Load the value of n1 to r1
	ldr r2,=n2		@Load the address of n2 to r2
	ldr r3,[r2]		@Load the value of n2 to r3
	
	add r4,r1,r3	@ADD r1,r3 --> store it in r4
	sub r5,r1,r3	@SUB r1,r3 --> store it in r5
	
	B .
	
.data
	n1: .word 87654321
	n2: .word 12345678