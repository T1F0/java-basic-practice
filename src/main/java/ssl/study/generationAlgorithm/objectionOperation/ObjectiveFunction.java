package com.supconit.study.generationAlgorithm.objectionOperation;

public class ObjectiveFunction {
    //计算目标函数值
    public int computeObject(int[] schemeArray){
        int result = 0;
        for (int i = 0; i < schemeArray.length; i++) {
            result = result + i*schemeArray[i];
        }
        return result;
    }
}
