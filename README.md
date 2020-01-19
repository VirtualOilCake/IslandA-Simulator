# A岛模拟器

****是否因为自己法的串没有人回复而沮丧？****  
**现在，你可以体验A岛风格的自动回复了！**

## 简介

本项目基于Java，意在创造一个自动回复的bot

## 如何帮助维护本项目

- 可以到[这个 Issue 里说明](https://github.com/manoil/IslandA-Simulator/issues/3) ，我会把你加入到 contributor 里面
- 可以 fork 本项目，然后修改好之后向本项目创建一个 [Pull Request](https://github.com/manoil/IslandA-Simulator/pulls)，我们看到后会第一时间处理

> 如果你有Java相关的编程背景，我相信你一定做的比我好，  
> 毕竟我的判断语句基本上只有if，也没有用interface或抽象类。  
> 所以如果可以的话，能帮忙改一下结构是最好的  

但是，如果只是想为这个项目添加识别的关键词或者添加更多种类的回复，你甚至 **无需有任何编程基础** 就可以做到。

### 如何添加关键字

1. 找到 [Main类](src/main/java/io/github/manoil/ia/Main.java)
2. 找到你想添加的关键字类型的关键字列表 （都有注释有 `//xxx关键字` ）
3. 在对应类别的判断列表中加入关键字判断语句，格式为 `inputString.contains("你想设为关键字的内容") || `

*最后一个不能以 `||` 结尾，其他的必须要与其他的判断以 `||` 相连，因为 `||` 是连接符，表示"或者" *

### 如何添加回复

1. 找到 [Main类](src/main/java/io/github/manoil/ia/Main.java)
2. 找到你想添加的回复类型的关键字列表 （在后半段一大堆if的地方）
3. 在判断对应的回复中加入 `output.add("你想要回复的内容");`

**欢迎任何人对本项目做出任何贡献！**

### 更新记录

+ 1.0.0 初版
+ 1.0.01 加入假装有cookie功能
