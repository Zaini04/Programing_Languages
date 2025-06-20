# Print Fibonacci series till input n		=> index is 1 based

.data  
	prompt: 	.asciiz 	"Enter the number of terms in Fibonacci series: "  
	result: 	.asciiz 	"Fibonacci series: "  
#	newline: 	.asciiz  	"\n"
	space: 		.asciiz  	" "

.text  
main:  
    # Print the prompt  
    li $v0, 4  
    la $a0, prompt  
    syscall  

    # Read number of terms  
    li $v0, 5  
    syscall  
    move $t0, $v0      # Number of terms to compute in $t0  

    # Print result header  
    li $v0, 4  
    la $a0, result  
    syscall  

    # Initialize first two Fibonacci numbers  
    li $t1, 0          # First Fibonacci number  
    li $t2, 1          # Second Fibonacci number  

    # Check if $t0 is 0 or 1  
    blez $t0, end      # If number of terms <= 0, skip  

    # Print the first Fibonacci number  
    li $v0, 1  
    move $a0, $t1  
    syscall  
    
    # print space
    la	$v0, 4
    la	$a0, space
    syscall

    # Decrement count  
    sub $t0, $t0, 1  

    # If only one term, print and exit  
    beqz $t0, end  

    # Print the second Fibonacci number  
    li $v0, 1  
    move $a0, $t2  
    syscall  

    # print space
    la	$v0, 4
    la	$a0, space
    syscall

    # Decrement count  
    sub $t0, $t0, 1  
    blez $t0,end

loop:  
    # Calculate next Fibonacci number  
    add $t3, $t1, $t2  # $t3 = $t1 + $t2  

    # Print the next Fibonacci number  
    li $v0, 1  
    move $a0, $t3  
    syscall  
    
    # print space
    la	$v0, 4
    la	$a0, space
    syscall
    
    # Update the previous two Fibonacci numbers  
    move $t1, $t2      # $t1 becomes $t2  
    move $t2, $t3      # $t2 becomes new Fibonacci number  

    # Decrement count  
    sub $t0, $t0, 1  

    # Check loop condition  
    bnez $t0, loop  

end:  
    # Print newline  
#    li $v0, 4  
#    la $a0, newline  
#    syscall  

    # Exit program  
    li $v0,10
    syscall
