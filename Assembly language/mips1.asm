.data
msg1: .asciiz "Input First Number: "
msg2: .asciiz "Input Second Number: "
msg3: .asciiz "Input Third Number: "
msg4: .asciiz "Sum of three Numbers: "
.text
la $a0,msg1
li $v0,4
syscall
li $v0,5
syscall
move $t0,$v0
 	
la $a0,msg2
li $v0,4
syscall
li $v0,5
syscall
move $t1,$v0

la $a0,msg3
li $v0,4
syscall
li $v0,5
syscall
move $t2,$v0



la $a0,msg4
li $v0,4
syscall

add $a0,$t0,$t1
add $a0, $a0,$t2

li $v0,1
syscall
