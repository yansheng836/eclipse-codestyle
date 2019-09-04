javadoc-test
=================

测试"`Java`文档注释(javadoc)"的使用。



## 一、基本设置

### 1.Eclipse设置位置

Windows-->Preferences-->Java-->Code Style-->Code Templates


### 2.Eclipse添加文档注释的快捷键：`Shift+Alt+J`

### 3.生成文档注释的方法：

3.1 点击项目

3.2 （上面工具栏）Project-->Generate Javadoc-->Nest-->Nest-->VM options(可能需要填写一些参数)-->Finish.


## 二、文档注释的模板

### 1.我的模板

文件：[eclipse-codetemplates-my.xml](https://github.com/yansheng836/javadoc-test/tree/master/eclipse-codetemplates/eclipse-codetemplates-my.xml)

生成文档时需要添加的参数：
```bash
-encoding utf-8 -charset utf-8  -tag date:a:date -tag Title:a:Title  -tag Description:a:Description -tag Fields:a:Fields
```

详见： <https://blog.csdn.net/weixin_41287260/article/details/92182854>

