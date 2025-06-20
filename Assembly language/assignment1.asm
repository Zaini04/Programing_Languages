.data
result: .word 0      # To store the final result.

.text
.globl main

# Main function equivalent
main:
    li $a0, 5         # Input value (i = 5). Modify as needed.
    jal rt_1          # Call rt_1 function.
    sw $v0, result    # Store the result in memory.
    li $v0, 10        # Exit syscall.
    syscall

# rt_1 function
rt_1:
    addi $sp, $sp, -8 # Allocate stack space.
    sw $ra, 4($sp)    # Save return address.
    sw $a0, 0($sp)    # Save argument.

    beq $a0, 0, rt_1_base_case # Check if i == 0.
    addi $a0, $a0, -1 # Decrement i by 1.
    jal rt_2          # Call rt_2.
    j rt_1_exit       # Jump to exit.

rt_1_base_case:
    li $v0, 0         # Return 0 for base case.

rt_1_exit:
    lw $a0, 0($sp)    # Restore argument.
    lw $ra, 4($sp)    # Restore return address.
    addi $sp, $sp, 8  # Deallocate stack space.
    jr $ra            # Return to caller.

# rt_2 function
rt_2:
    mul $t0, $a0, $a0 # Compute i * i.
    sll $v0, $t0, 1   # Multiply result by 2 (shift left by 1).
    jr $ra            # Return to caller.
