package com.example.multipackagedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

/*
 1.如果不同源集包含同一文件的不同版本，Gradle 将按以下优先顺序决定使用哪一个文件（左侧源集会替换右侧源集的文件和设置）：
编译变体 > 编译版本类型 > 正式版类型，即产品特性源集 > 主源集 > 库依赖项
例如，要生成应用的“fullDebug”版本，编译系统需要合并来自以下源集的代码、设置和资源：
src/fullDebug/（编译变体源集）
src/debug/（编译版本类型源集）
src/full/（正式版类型源集，即产品特性源集）
src/main/（主源集）
2.1单个目录结构创建
右键点击 src 目录，然后依次选择 New > Folder > Java Folder。
从 Target Source Set 旁边的下拉菜单中，选择 debug
2.2创建xml文件
在同一 Project 窗格中，右键点击 src 目录，然后依次选择 New > XML > Values XML File。
输入 XML 文件的名称或保留默认名称。
从 Target Source Set 旁边的下拉菜单中，选择 debug。
*/
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //R.layout.activity_main 测试drawable mipmap,color,string,textSize等
        //R.layout.test_layout 测试布局
        setContentView(R.layout.test_layout);
        //获取的不是包名，是application ID
        Log.e("tag", getPackageName());
        TextView tv = findViewById(R.id.tv);
        tv.setText(tv.getText().toString() + "===" + TestUtils.sayHello());
        //判断不同apk逻辑的标志
        Log.e("tag", BuildConfig.APPLICATION_ID);
        //自定义BuildConfigFiled
        //BuildConfig.isTest;
    }
}
