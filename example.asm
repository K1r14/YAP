li x1, -10
sw x0, 512, x1
li x1, 20
sw x0, 513, x1
li x1, 80
sw x0, 515, x1
li x1, 114
sw x0, 516, x1
li x1, 105
sw x0, 517, x1
li x1, 109
sw x0, 518, x1
li x1, 101
sw x0, 519, x1
li x1, 114
sw x0, 520, x1
li x1, 0
sw x0, 521, x1
li x1, 515
sw x0, 514, x1
li x1, 1
sw x0, 522, x1
lw x1, x0, 514
PRINT_START1:
lw x2, x1, 0
beq x2, x0, PRINT_END2
ewrite x2
addi x1, x1, 1
jal x0, PRINT_START1
PRINT_END2:
li x2, 10
ewrite x2
lw x1, x0, 512
li x2, 5
lw x3, x0, 513
li x4, 30
slt x5, x1, x2
seq x6, x1, x2
or x5, x5, x6
seq x5, x5, x0
slt x1, x3, x4
and x2, x5, x1
sw x0, 522, x2
lw x1, x0, 512
li x2, 5
li x3, 3
mul x4, x2, x3
add x2, x1, x4
sw x0, 512, x2
lw x1, x0, 513
li x2, 3
sub x3, x1, x2
sw x0, 513, x3
lw x1, x0, 512
lw x2, x0, 513
slt x3, x1, x2
seq x4, x1, x2
or x3, x3, x4
seq x3, x3, x0
beq x3, x0, IF_COND3
li x1, 97
sw x0, 523, x1
li x1, 32
sw x0, 524, x1
li x1, 62
sw x0, 525, x1
li x1, 32
sw x0, 526, x1
li x1, 98
sw x0, 527, x1
li x1, 0
sw x0, 528, x1
li x1, 523
PRINT_START5:
lw x2, x1, 0
beq x2, x0, PRINT_END6
ewrite x2
addi x1, x1, 1
jal x0, PRINT_START5
PRINT_END6:
li x2, 10
ewrite x2
jal x0, IF_END4
IF_COND3:
lw x1, x0, 512
lw x2, x0, 513
seq x4, x1, x2
beq x4, x0, ELIF_NEXT7
li x1, 97
sw x0, 529, x1
li x1, 32
sw x0, 530, x1
li x1, 61
sw x0, 531, x1
li x1, 61
sw x0, 532, x1
li x1, 32
sw x0, 533, x1
li x1, 98
sw x0, 534, x1
li x1, 0
sw x0, 535, x1
li x1, 529
PRINT_START8:
lw x2, x1, 0
beq x2, x0, PRINT_END9
ewrite x2
addi x1, x1, 1
jal x0, PRINT_START8
PRINT_END9:
li x2, 10
ewrite x2
jal x0, IF_END4
ELIF_NEXT7:
li x1, 98
sw x0, 536, x1
li x1, 32
sw x0, 537, x1
li x1, 62
sw x0, 538, x1
li x1, 32
sw x0, 539, x1
li x1, 97
sw x0, 540, x1
li x1, 0
sw x0, 541, x1
li x1, 536
PRINT_START10:
lw x2, x1, 0
beq x2, x0, PRINT_END11
ewrite x2
addi x1, x1, 1
jal x0, PRINT_START10
PRINT_END11:
li x2, 10
ewrite x2
IF_END4:
WHILE_LOOP12:
lw x1, x0, 512
li x2, 20
slt x5, x1, x2
beq x5, x0, WHILE_END13
lw x1, x0, 512
li x2, 1
add x6, x1, x2
sw x0, 512, x6
lw x1, x0, 512
iwrite x1
li x2, 10
ewrite x2
jal x0, WHILE_LOOP12
WHILE_END13:
li x1, 0
sw x0, 542, x1
FOR_INIT14:
lw x1, x0, 542
li x2, 5
slt x6, x1, x2
beq x6, x0, FOR_END16
lw x1, x0, 542
iwrite x1
li x2, 10
ewrite x2
lw x1, x0, 542
li x2, 1
add x7, x1, x2
sw x0, 542, x7
jal x0, FOR_INIT14
FOR_END16:
lw x1, x0, 522
beq x1, x0, BOOL_PRINT17
li x2, 100
ewrite x2
li x2, 111
ewrite x2
li x2, 98
ewrite x2
li x2, 114
ewrite x2
li x2, 111
ewrite x2
BOOL_PRINT17:
li x2, 108
ewrite x2
li x2, 122
ewrite x2
li x2, 104
ewrite x2
li x2, 97
ewrite x2
li x2, 10
ewrite x2
lw x1, x0, 512
lw x2, x0, 513
li x7, 30
add x8, x1, x2
slt x1, x8, x7
seq x2, x8, x7
or x1, x1, x2
seq x1, x1, x0
beq x1, x0, IF_COND18
li x2, 83
sw x0, 543, x2
li x2, 117
sw x0, 544, x2
li x2, 109
sw x0, 545, x2
li x2, 109
sw x0, 546, x2
li x2, 97
sw x0, 547, x2
li x2, 32
sw x0, 548, x2
li x2, 98
sw x0, 549, x2
li x2, 111
sw x0, 550, x2
li x2, 108
sw x0, 551, x2
li x2, 115
sw x0, 552, x2
li x2, 104
sw x0, 553, x2
li x2, 101
sw x0, 554, x2
li x2, 32
sw x0, 555, x2
li x2, 51
sw x0, 556, x2
li x2, 48
sw x0, 557, x2
li x2, 0
sw x0, 558, x2
li x2, 543
PRINT_START20:
lw x7, x2, 0
beq x7, x0, PRINT_END21
ewrite x7
addi x2, x2, 1
jal x0, PRINT_START20
PRINT_END21:
li x7, 10
ewrite x7
jal x0, IF_END19
IF_COND18:
li x2, 83
sw x0, 559, x2
li x2, 117
sw x0, 560, x2
li x2, 109
sw x0, 561, x2
li x2, 109
sw x0, 562, x2
li x2, 97
sw x0, 563, x2
li x2, 32
sw x0, 564, x2
li x2, 110
sw x0, 565, x2
li x2, 101
sw x0, 566, x2
li x2, 32
sw x0, 567, x2
li x2, 98
sw x0, 568, x2
li x2, 111
sw x0, 569, x2
li x2, 108
sw x0, 570, x2
li x2, 115
sw x0, 571, x2
li x2, 104
sw x0, 572, x2
li x2, 101
sw x0, 573, x2
li x2, 32
sw x0, 574, x2
li x2, 51
sw x0, 575, x2
li x2, 48
sw x0, 576, x2
li x2, 0
sw x0, 577, x2
li x2, 559
PRINT_START22:
lw x7, x2, 0
beq x7, x0, PRINT_END23
ewrite x7
addi x2, x2, 1
jal x0, PRINT_START22
PRINT_END23:
li x7, 10
ewrite x7
IF_END19:
ebreak

