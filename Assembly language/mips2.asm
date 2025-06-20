.data
# Data section for strings and constants
msg1:   .asciiz "Enter the first number: "                      # Prompt for first number
msg2:   .asciiz "Enter the second number: "                     # Prompt for second number
msg3:   .asciiz "Hello, the result of the operation is:\n"      # String to print
msg4:   .asciiz "\nResult of Addition: "                          # String for addition result
msg5:   .asciiz "\nResult of Subtraction: "                       # String for subtraction result
msg6:   .asciiz "\nResult of Multiplication: "                    # String for multiplication result
msg7:   .asciiz "\nResult of Division (Quotient): "               # String for division quotient
msg8:   .asciiz "\nResult of Division (Remainder): "              # String for division remainder

.text
.globl main
main:
    # Print msg1 ("Enter the first number:")
    li $v0, 4        # Print string syscall
    la $a0, msg1     # Load address of msg1
    syscall

    # Read the first number from the user
    li $v0, 5        # Read integer syscall
    syscall
    move $t0, $v0    # Store the first number in $t0

    # Print msg2 ("Enter the second number:")
    li $v0, 4        # Print string syscall
    la $a0, msg2     # Load address of msg2
    syscall

    # Read the second number from the user
    li $v0, 5        # Read integer syscall
    syscall
    move $t1, $v0    # Store the second number in $t1

    # Print msg3 ("Hello, the result of the operation is:")
    li $v0, 4        # Print string syscall
    la $a0, msg3     # Load address of msg3
    syscall

    # Addition: $t2 = $t0 + $t1
    add $t2, $t0, $t1  # $t2 = $t0 + $t1
    # Print msg4 ("Result of Addition: ")
    li $v0, 4        # Print string syscall
    la $a0, msg4     # Load address of msg4
    syscall
    # Print the result of addition
    li $v0, 1        # Print integer syscall
    move $a0, $t2    # Move result of addition to $a0
    syscall

    # Subtraction: $t3 = $t0 - $t1
    sub $t3, $t0, $t1 # $t3 = $t0 - $t1
    # Print msg5 ("Result of Subtraction: ")
    li $v0, 4        # Print string syscall
    la $a0, msg5     # Load address of msg5
    syscall
    # Print the result of subtraction
    li $v0, 1        # Print integer syscall
    move $a0, $t3    # Move result of subtraction to $a0
    syscall

    # Multiplication: $t4 = $t0 * $t1
    mul $t4, $t0, $t1 # $t4 = $t0 * $t1
    # Print msg6 ("Result of Multiplication: ")
    li $v0, 4        # Print string syscall
    la $a0, msg6     # Load address of msg6
    syscall
    # Print the result of multiplication
    li $v0, 1        # Print integer syscall
    move $a0, $t4    # Move result of multiplication to $a0
    syscall

    # Division: $t5 = $t0 / $t1
    div $t0, $t1      # Divide $t0 by $t1
    mflo $t5          # Move quotient to $t5
    mfhi $t6          # Move remainder to $t6

    # Print msg7 ("Result of Division (Quotient): ")
    li $v0, 4        # Print string syscall
    la $a0, msg7     # Load address of msg7
    syscall
    # Print the quotient
    li $v0, 1        # Print integer syscall
    move $a0, $t5    # Move quotient to $a0
    syscall

    # Print msg8 ("Result of Division (Remainder): ")
    li $v0, 4        # Print string syscall
    la $a0, msg8     # Load address of msg8
    syscall
    # Print the remainder
    li $v0, 1        # Print integer syscall
    move $a0, $t6    # Move remainder to $a0
    syscall

    # Exit program
    li $v0, 10       # Exit syscall
    syscall
