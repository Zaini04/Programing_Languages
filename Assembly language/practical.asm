.data
x: .word 5
y: .word 10

.text
main:
	lw $a0,x
	lw $a1,y
	jal function
	move $a0,$v0
	li $v0,1
	syscall
	li $v0,10
	syscall
	


function:
	addi $sp,$sp,-8
	sw $ra,4($sp)
	sw $a1,0($sp)
	# move $a1,$a0
	jal cal
	lw $a1,0($sp)
	mul $a1,$a1,$a1
	add $v0,$v0,$a1
	lw $ra,4($sp)
	addi $sp,$sp,8
	jr $ra	
cal:
	mul $v0,$a0,$a0
	add $v0,$v0,$a1
	jr $ra
	