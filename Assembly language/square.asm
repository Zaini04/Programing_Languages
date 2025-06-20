.data 
prompt: .asciiz "Enter a number:\t"
square: .asciiz "\nSquare of a given number is:\t"
.text
main:
	li $v0,4   #print string
	la $a0,prompt
	syscall
	li $v0,5
	syscall
	move $t0,$v0
	li $v0,4
	la $a0,square
	syscall
	mul $t1,$t0,$t0
	move $a0,$t1
	li $v0,1
	syscall
	li $v0,10
	syscall
		