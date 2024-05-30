package com.atjerry.study.oneArray.exer;

/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study.one.Exer
 * @Author: Jerry
 * @CreateTime: 2024-05-19  19:49
 * @Description: TODO
 * @Version: 1.0
 */

/**
 *案例：”破解“房东电话
 *升景坊单间短期出租4个月，550元/月（水电煤公摊，网费35元/月），空调、卫生间、厨房齐全。屋内均1个行业人士
 所以要求来租者最好是同行或者刚毕业的年轻人，爱千净、安静。
 */
public class ArrayExer {
    public static void main(String[] args) {
        int [] arr = new int[]{8,2,1,0,3};
        int [] index = new int[]{2,0,1,3,2,4,0,1,3,2,3,3};

        String tel = "";
        for (int i = 0; i < index.length; i++) {
            int value = index[i];
            tel += arr[value];
        }
        System.out.println("联系方式:" + tel);
    }
}
