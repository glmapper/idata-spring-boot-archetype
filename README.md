## 快速开始

本项目是基于 maven archetype 构建的多模块脚手架工程，包含了一些常用的依赖和配置，可以帮助你快速搭建一个新的项目。 项目主要包括以下几个模块：
- `parent`：父工程，用于管理依赖版本和插件版本
- `common`：公共模块，用于存放一些公共的工具类和配置
- `web`：web 模块，用于存放 web 项目的代码
- `service`：service 模块，用于存放 service 项目的代码
- `model`：model 模块，用于存放一些实体对象模型
- `jpa`：jpa 模块，集成 spring data jpa，用于存放 jpa 相关的代码
- `mybatis`：mybatis 模块，集成 mybatis，用于存放 mybatis 相关的代码

### 如何使用
1、先 clone 项目到本地
```shell
git clone https://github.com/glmapper/idata-spring-boot-archetype.git
```
2、安装到本地仓库
```shell
cd idata-spring-boot-archetype
mvn clean install
```

3、使用脚手架
```shell
mvn archetype:generate 
  -DarchetypeGroupId=com.idata
  -DarchetypeArtifactId=idata-spring-boot-archetype 
  -DarchetypeVersion=1.0.0 
  -X -DarchetypeCatalog=local
```

然后根据提示填写 groupId、artifactId、package 等信息，即可生成一个新的项目。
