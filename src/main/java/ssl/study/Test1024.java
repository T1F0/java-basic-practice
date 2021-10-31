package test;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;

public class Test1024 {
    public static void main(String[] args) {
        //map后续会负责统计每题的正确率
        HashMap<String,String> map = new HashMap<>();
        map.put("君不见高堂明镜悲白发","朝如青丝暮成雪");
        map.put("白日依山尽","黄河入海流");
        map.put("欲穷千里目","更上一层楼");
        //用于判断，后期对接数据库
        String[][] strings = new String[3][2];
        strings[0][0] = "君不见高堂明镜悲白发";
        strings[0][1] = "朝如青丝暮成雪";
        strings[1][0] = "白日依山尽";
        strings[1][1] = "黄河入海流";
        strings[2][0] = "欲穷千里目";
        strings[2][1] = "更上一层楼";
//        JOptionPane.showMessageDialog(null
        //弹出确认框
        String gratePerson = null;
        JOptionPane.showConfirmDialog(null, "欢迎您，确认开始挑战吗", "诗词挑战大会", JOptionPane.PLAIN_MESSAGE);
        //输入框
        int score = 0;
        //循环答题
        for (int i = 0; i < strings.length; i++) {
            String str = JOptionPane.showInputDialog("题目：" + strings[i][0] + "          当前分数：" + score + "当前擂主" + gratePerson);
            if (!str.equals(strings[i][1])) {
                JOptionPane.showConfirmDialog(null,"您没有挑战成功","答错啦",JOptionPane.CLOSED_OPTION);
                break;
            }else score += 10;
        }
        if (score == 30) {
            gratePerson = JOptionPane.showInputDialog(null,"您已全部通关，分数为：" + score +"大侠请留名","恭喜",JOptionPane.OK_OPTION);
        }
    }
}
