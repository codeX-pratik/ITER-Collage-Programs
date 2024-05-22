@NAME : PRATIK KUMAR MUDULI
@REGD. NO.: 2241013372
.global _start
_start:
	  ldr r0,=count
	  ldr r1,[r0]
	  ldr r3,=array
	  ldr r4,=even
	  ldr r5,=odd
back: ldr r6,[r3],#4
	  ands r7,r6,#1
	  beq fwd
	  str r6,[r5],#4
	  b fwd1
fwd:  str r6,[r4],#4
fwd1: subs r1,r1,#01
	  bne back
exit: b exit
.data
	count: .word 0x07
	array: .word 0x15,0x35,0x32,0x45,0x10,0x4f,0x34
	even: .word 0,0,0,0,0
	odd: .word 0,0,0,0,0