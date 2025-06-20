.data
type_name: .asciiz "Please Enter Your Name :  " 
NAME: .asciiz "\nYour Name in Capital is  "
msg: .space 31

.text
.globl main
main:
	la $a0, type_name
	li $v0, 4
	syscall
	
	la $a0, msg
	li $a1,31
	li $v0, 8
	syscall
	
	la $a0,NAME
	li $v0,4
	syscall
	
	la $t0,msg
loop:
	lb $t1,($t0)
	beqz $t1,exit_loop
	blt $t1,'a',no_change
	bgt $t1,'z',no_change
	
	addiu $t1,$t1,-32
	sb $t1,($t0)
no_change:
	addiu $t0,$t0,1
	j loop
exit_loop:
	la $a0,msg
	li $v0,4
	syscall
	li $v0,10
	syscall