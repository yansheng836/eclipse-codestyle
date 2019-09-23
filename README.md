# Eclipse Codestyle

主要介绍了Eclipse中Java的文档注释(javadoc)和代码风格的设置。

---
:sparkles:**推荐关注**阿里巴巴的p3c项目组，推荐理由（优秀的产品）：
1. [《Java 开发手册》](<https://github.com/alibaba/p3c/blob/master/阿里巴巴Java开发手册（华山版）.pdf>)：本手册以Java开发者为中心视角，总结了一系列的编码规范，包含了编程规约、异常日志、单元测试、安全规约、MySQL数据库、工程结构、设计规约七个维度。
2. [“Java 开发规约IDE插件”](https://github.com/alibaba/p3c)：针对手册规约而制作的一个IDE插件，有Eclipse版本和IDEA版本；用插件扫描代码可以发现你的违约代码，并给出违约规则，以帮助你改正。

---

:link:相关内容：

p3c的github项目地址：<https://github.com/alibaba/p3c>

有关p3c项目的介绍：[阿里巴巴主导的“华山版《Java 开发手册》”简介](<https://blog.csdn.net/weixin_41287260/article/details/92185040>)

---

## Table of Contents

* [一、基本设置](#%E4%B8%80%E5%9F%BA%E6%9C%AC%E8%AE%BE%E7%BD%AE)
  * [1\.Eclipse设置位置](#1eclipse%E8%AE%BE%E7%BD%AE%E4%BD%8D%E7%BD%AE)
  * [2\.XML模板文件的使用（导入和导出）](#2xml%E6%A8%A1%E6%9D%BF%E6%96%87%E4%BB%B6%E7%9A%84%E4%BD%BF%E7%94%A8%E5%AF%BC%E5%85%A5%E5%92%8C%E5%AF%BC%E5%87%BA)
  * [3\.相关快捷键](#3%E7%9B%B8%E5%85%B3%E5%BF%AB%E6%8D%B7%E9%94%AE)
  * [4\.生成文档注释的方法](#4%E7%94%9F%E6%88%90%E6%96%87%E6%A1%A3%E6%B3%A8%E9%87%8A%E7%9A%84%E6%96%B9%E6%B3%95)
* [二、模板](#%E4%BA%8C%E6%A8%A1%E6%9D%BF)
  * [1\.我的模板](#1%E6%88%91%E7%9A%84%E6%A8%A1%E6%9D%BF)
    * [1\.1  codetemplates\.xml](#11--codetemplatesxml)
    * [1\.2  codestyle\.xml](#12--codestylexml)
  * [2\.p3c项目推荐的模板](#2p3c%E9%A1%B9%E7%9B%AE%E6%8E%A8%E8%8D%90%E7%9A%84%E6%A8%A1%E6%9D%BF)
    * [2\.1  codetemplates\.xml](#21--codetemplatesxml)
    * [2\.2  codestyle\.xml](#22--codestylexml)
* [三、Java开发手册\-注释规约（部分）](#%E4%B8%89java%E5%BC%80%E5%8F%91%E6%89%8B%E5%86%8C-%E6%B3%A8%E9%87%8A%E8%A7%84%E7%BA%A6%E9%83%A8%E5%88%86)

---

## 一、基本设置

### 1.Eclipse设置位置

- javadoc：Windows-->Preferences-->Java-->Code Style-->Code Templates （导出模板文件名默认为：`codetemplate.xml`）
- Java代码风格：Windows-->Preferences-->Java-->Code Style-->Formatter（导出模板文件名一般命名为：`codestyle.xml`）

### 2.XML模板文件的使用（导入和导出）

- 按照上面的内容找到对应位置，`Import……`为导入外部的xml文件，`Export All……`为将自己的模板导出到本地。
- 特别提醒：不要去格式化对应的XML文件，即使它看不来不怎么“友好“！至于格式化后会怎么，会”出乎你的预料“，风格会很奇怪的（亲身体会）。
- 建议：如需导入别人的模板，建议先导出自己的模板，这样如果别人的模板不合自己的习惯，可以再换回来。

### 3.相关快捷键

- javadoc：`Shift+Alt+J`。
- Java代码格式化：`Shift+Ctrl+F`，注意：如果你有安装搜狗输入法，该快捷键可能会与搜狗输入法的“简繁互换”快捷键冲突，把搜狗输入法的对应快捷键设置为其他快捷键即可。

### 4.生成文档注释的方法

4.1 点击项目

4.2 （上面工具栏）Project-->Generate Javadoc-->Nest-->Nest-->VM options(可能需要填写一些参数)-->Finish.

## 二、模板

这里只放两个模板，可到具体文件中查看样式：
- 我的模板： [src/xyz/yansheng/mydoc](https://github.com/yansheng836/eclipse-codestyle/tree/master/src/xyz/yansheng/mydoc) 
- p3c项目推荐的模板： [src/xyz/yansheng/p3c](https://github.com/yansheng836/eclipse-codestyle/tree/master/src/xyz/yansheng/p3c) 

---
下面是模板的简单介绍：

### 1.我的模板

#### 1.1  codetemplates.xml

我之前在网上找了一个模板，根据自己的习惯进行了修改。用一段时间后，自我感觉：注释很**丰富**，也就是多的意思，感觉有很多冗余信息，而且修改代码后可能会忘记修改注释（因为比较多，可能改不全，有很大隐患）。

总的来说：不是很推荐使用（具体看个人喜好，这里只是进行简单备份），建议使用第二种！

文件：[my-eclipse-codetemplates.xml](https://github.com/yansheng836/eclipse-codestyle/tree/master/codestyle/my-eclipse-codetemplates.xml)

生成文档时需要添加的参数：

```bash
-encoding utf-8 -charset utf-8  -tag date:a:date -tag Title:a:Title  -tag Description:a:Description -tag Fields:a:Fields
```

详见： <https://blog.csdn.net/weixin_41287260/article/details/92182854>

#### 1.2  codestyle.xml

文件：[my-eclipse-codestyle.xml](https://github.com/yansheng836/eclipse-codestyle/tree/master/codestyle/my-eclipse-codestyle.xml)

### 2.p3c项目推荐的模板

众多大佬总结的经验，整洁！

详见： <https://github.com/alibaba/p3c/tree/master/p3c-formatter>

#### 2.1  codetemplates.xml

文件：[eclipse-codetemplates.xml](https://github.com/yansheng836/eclipse-codestyle/tree/master/codestyle/p3c-formatter/eclipse-codetemplate.xml)

生成文档时需要添加的参数：

```bash
-encoding utf-8 -charset utf-8  -tag date:a:date
```

#### 2.2  codestyle.xml

文件：[eclipse-codestyle.xml](https://github.com/yansheng836/eclipse-codestyle/tree/master/codestyle/p3c-formatter/eclipse-codestyle.xml)

## 三、Java开发手册-注释规约（部分）

下图截自《Java开发手册》的：`一、编程规约 >>（八）注释规约`，是该手册中介绍注释规约的主要内容，注意不是全部内容，因为在其它的一些章节也有穿插一些对应的注释规约。

![java开发手册-注释规约](https://s2.ax1x.com/2019/09/04/nZnjMj.jpg)
