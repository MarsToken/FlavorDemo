package com.example.multipackagedemo;

import android.util.Log;

/**
 * 模拟Java类差异，要么反射，要么采用此方法：此方法类名相同，注意差异的Java文件一定不能放到main里，否则报错：重复类错误
 * Created by hp on 2019/12/7.
 */
public class TestUtils {
    public static String sayHello() {
        Log.e("tag", "hello,=qq");
        return "Java Code qq";
    }
}
