.DATA
    COUNT DB 09H
    VALUE DW 01H,02H,03H,04H,05H,06H,07H,08H,09H
    SUM DW 0
    AVERAGE DW 0
.CODE
MAIN PROC
    MOV AX,DATA
    MOV DS,AX
    LEA SI,VALUE
    MOV CL,COUNT
    MOV AX,0000H
    MOV BL,CL
    
    BACK: ADD AX,[SI]
          JNC NEXT
          INC DX
          
    NEXT: INC SI
          INC SI
          DEC CL
          JNZ BACK
    
    MOV SUM,AX
    MOV [SI],AX
    DIV BX
    MOV AVERAGE,AX
    
END MAIN        