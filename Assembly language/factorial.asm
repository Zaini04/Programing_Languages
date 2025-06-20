.data
prompt: .asciiz "Enter a number: "  # Prompt message
result_msg: .asciiz "Factorial is: " # Result message
factorial: .word 1                 # Store factorial result

.text
.globl main
main:
    # Prompt user for input
    li $v0, 4                   # Print string syscall
    la $a0, prompt              # Load prompt message
    syscall

    # Read user input
    li $v0, 5                   # Read integer syscall
    syscall
    move $t0, $v0               # Store input number in $t0

    # Initialize variables
    li $t1, 1                   # Counter (i = 1)
    li $t2, 1                   # Accumulator (factorial = 1)

factorial_loop:
    ble $t0, $zero, end_loop    # If input <= 0, exit loop
    mul $t2, $t2, $t1           # factorial *= i
    addi $t1, $t1, 1            # Increment counter (i++)
    bne $t1, $t0, factorial_loop # Repeat until i == input
    mul $t2, $t2, $t0           # Multiply by the final value of t0

end_loop:
    # Display result
    li $v0, 4                   # Print string syscall
    la $a0, result_msg          # Load result message
    syscall

    move $a0, $t2               # Load factorial result into $a0
    li $v0, 1                   # Print integer syscall
    syscall

    # Exit program
    li $v0, 10                  # Exit syscall
    syscall
