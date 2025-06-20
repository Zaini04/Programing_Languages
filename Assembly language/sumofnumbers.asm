.data 
num1: .asciiz "Enter a positive number:\t"
result: .asciiz "sum of numbers:\t"

.text
main:
	li $v0,4
	la $a0,num1
	syscall
	li $v0,5
	syscall
	move $t0,$v0
	
	li $t1,1
	li $t2,0
	
sum_loop:
	ble $t0,$zero,endloop
	add $t2,$t2,$t1
	addi $t1,$t1,1
	bne $t1,$t0,sum_loop
	add $t2,$t2,$t1
		
endloop:
	li $v0,4
	la $a0,result
	syscall
	
	move $a0,$t2
	li $v0,1
	syscall
	
	li $v0,10
	syscall