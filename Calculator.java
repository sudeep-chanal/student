/**
 * The Calculator class is used for performing mathematical calculations.
 */
/**
 
 */
import java.util.Scanner;
class Calculator extends Child
{
    float addition( float operand_1,float operand_2){
        return(operand_1+operand_2);
    }
    float subtraction( float operand_1,float operand_2){
        return(operand_1-operand_2);
    }
    float multiplication( float operand_1,float operand_2){
        return(operand_1*operand_2);
    }
    float division( float operand_1,float operand_2){
        return(operand_1/operand_2);
    }
    float square(float operand_1){
        return(operand_1*operand_1);
    }
    public static void main(String[] args) {
        Calculator calc= new Calculator();
   

 Scanner sc= new Scanner(System.in);
 System.out.println("ENTER THE OPERAND 1");
 int operand_1=sc.nextInt();
 System.out.println("ENTER THE OPERAND 2");
 int operand_2=sc.nextInt();

 
 float add_result=calc.addition(operand_1,operand_2);
 System.out.println("result of subtraction is:"+add_result);

            float sub_result=calc.subtraction(operand_1,operand_2);
    System.out.println("result of subtraction is:"+sub_result);

    float mul_result=calc.multiplication(operand_1,operand_2);
    System.out.println("result of multiplication is:"+mul_result);

    float div_result=calc.division(operand_1,operand_2);
    System.out.println("result of division:"+div_result);

    float sq_result=calc.square(operand_1);
    System.out.println("result of square is:"+sq_result);

    float cube_result=calc.cube(operand_1);
    System.out.println("result of cube is:"+cube_result);

    float modulus_result=calc.mod(operand_1,operand_2);
    System.out.println("result of mod is:"+modulus_result);

   
    }
       
    }
