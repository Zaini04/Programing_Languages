.data 
c: .word 3
k: .word 2
.text
.globl main
main:
	la $t0, c
	la $t1, k
	
	lw $s0,0($t0)
	lw $s1,0($t1)
	
	slt $s3,$s0,$s1
	beq $s3,$0,notless
	
	sw $s0,0($t1)
	sw $s1,0($t0)
notless:
	addiu $v0,$0,5
	move $a0, $v0
	
	li $v0, 1
	syscall
	
	li $v0,10
	syscall