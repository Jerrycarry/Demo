package com.atjerry.study.Test;

/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study.Test
 * @Author: Jerry
 * @CreateTime: 2024-05-15  23:23
 * @Description: TODO
 * @Version: 1.0
 */

/*
 * 分支结构之switch—case的使用
 * 1.语法格式
 * switch(表达式){
 *   case 常量1:
 *       执行语句
 *   case 常量2:
 *       执行语句
 *   case 常量3:
 *       执行语句
 *   default:
 *       执行语句
 * }
 * 2.执行过程:
 *      根据表达式中的值,依次匹配case语句。一旦与某一个case中的常量相等,那么就执行此case语句中的执行语句。
 * 执行完执行语句之后,
 *          情况1:遇到break,则执行break后,跳出当前的switch-case结构
 *          情况2:没有遇到break,则继续执行其后的case中的执行语句。--->case穿透
 * 直到遇到break或者执行完所有的case及default中的语句，退出当前的switch-case结构
 * 3.说明:
    switch中的表达式只能是特定的数据类型。如下：byte\short\char\int\枚举(JDK5.0新增)\String(JDK7.0新增)
    case后都是跟的常量，使用表达式与这些常量做相等的判断，不能进行范围的判断。
    开发中，使用switch-case时，通常case匹配的情况都有限。
    break:可以使用在switch-case中。一旦执行此break关键字，就跳出当前的switch-case结构
    default:类似于if-else中的else结构。
 * */
public class SwitchCaseTest {
    public static void main(String[] args) {
        int sum = 1;
        switch (sum) {
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            default:
                System.out.println("other");
        }
    }
}
