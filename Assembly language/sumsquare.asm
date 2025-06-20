.data
.text
main:
	li $a0,6
	li $a1,8
	jal sumofsquare
	
	li $v0,1
	syscall
	li $v0,10
	syscall
	
sumofsquare:
	addi $sp,$sp,-8
	sw $ra,4($sp)
	sw $a1,0($sp)
	add $a1, $a1,$zero
	jal mult
	lw $a1,0($sp)
	add $v0,$t0,$a1
	lw $ra, 4($sp)
	addi $sp,$sp,8
	jr $ra
mult:
	mul $t0,$a0,$a1
	jr $t0