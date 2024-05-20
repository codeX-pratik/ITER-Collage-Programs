@NAME : PRATIK KUMAR MUDULI
@REGD. N0.: 2241013372
.global _start
_start:
	
	mov r0, #0x50
	mov r1, #0x40
	adds r2,r0, #0x50
	subs r3,r0, #0x40
	mul r4,r0,r1
my_exit: b my_exit