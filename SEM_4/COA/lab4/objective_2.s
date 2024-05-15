.global _start
_start:

	ldr r0,=n1		@Load the address of n1 to r0
	ldr r1,[r0]		@Load the value of n1 to r1
	ldr r0,=n2		@Load the address of n2 to r0
	ldr r2,[r0]		@Load the value of n2 to r2
	
	add r3,r1,r2		@ADD r1,r2 --> store it in r3
	ldr r0,=store_add	@Load address of variable "store_add" in r0
	str r3,[r0]			@store the value r3 --> store_add
		
	sub r4,r1,r2		@SUB r1,r2 --> store it in r4
	ldr r0,=store_sub	@Load address of variable "store_sub" in r0
	str r4,[r0]			@store the value r4 --> store_sub
	
	mul r5,r1,r2		@MUL r1,r2 --> store it in r5
	ldr r0,=store_mul	@Load address of variable "store_mul" in r0
	str r5,[r0]			@store the value r5 --> store_mul
	
	B .
.data
	n1: .word 10
	n2: .word 2
	store_add: .word 0
	store_sub: .word 0
	store_mul: .word 0