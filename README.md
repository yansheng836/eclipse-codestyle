javadoc-test
=================

测试"`Java`文档注释(javadoc)"的使用。

测试`Java`代码的风格。



## 一、基本设置

### 1.Eclipse设置位置

- javadoc：Windows-->Preferences-->Java-->Code Style-->Code Templates （导出模板文件名默认为：`codetemplate.xml`）

- java代码风格：Windows-->Preferences-->Java-->Code Style-->Formatter（导出模板文件名一般命名为：`codestyle.xml`）

### 2.xml模板文件的导入和导出（使用）

- 按照上面的内容找到对应位置，`Import……`为导入外部的xml文件，`Export All……`为将自己的模板导出到本地。

- 特别提醒：不要去格式化对应的xml文件，即使它看不来不怎么“友好“！至于格式化后会怎么，会”出乎你的预料“，风格会很奇怪的（亲身体会）。

- 建议：如需导入别人的模板，建议先导出自己的模板，这样如果别人的模板不合自己的习惯，可以再换回来。


### 3.相关快捷键

- javadoc：`Shift+Alt+J`。

- java代码格式化：`Shift+Ctrl+F`，注意：如果你有安装搜狗输入法，该快捷键可能会与搜狗输入法的“简繁互换”快捷键冲突，把搜狗输入法的对应快捷键设置为其他快捷键即可。

### 4.生成文档注释的方法

4.1 点击项目

4.2 （上面工具栏）Project-->Generate Javadoc-->Nest-->Nest-->VM options(可能需要填写一些参数)-->Finish.


## 二、模板

### 1.我的模板

#### 1.1  codetemplates.xml

文件：[eclipse-codetemplates-my.xml](https://github.com/yansheng836/javadoc-test/tree/master/codestyle/my-eclipse-codetemplates.xml)

生成文档时需要添加的参数：
```bash
-encoding utf-8 -charset utf-8  -tag date:a:date -tag Title:a:Title  -tag Description:a:Description -tag Fields:a:Fields
```

详见： <https://blog.csdn.net/weixin_41287260/article/details/92182854>

#### 1.2  codestyle.xml

文件：[my-eclipse-codestyle.xml](https://github.com/yansheng836/javadoc-test/tree/master/codestyle/my-eclipse-codestyle.xml)


