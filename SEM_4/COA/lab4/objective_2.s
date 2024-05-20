@NAME : PRATIK KUMAR MUDULI
@REGD. NO.: 2241013372
.global _start
_start:
	
	ldr r0, =0x10100000
	ldr r1,[r0],#4
	ldr r2,[r0],#4
	
	adds r3,r1,r2
	str r3,[r0],#4
	
	subs r4,r1,r2
	str r4,[r0],#4
	
	mul r5,r1,r2
	str r5,[r0]
	
my_exit: b my_exit