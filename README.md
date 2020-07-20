# 生成 archetype 包
```$xslt
mvn archetype:create-from-project -Darchetype.properties=archetype.properties
```
# 上传
```$xslt
mvn clean package -Dmaven.test.skip=true -s xxx
```

# 生成
* `-DarchetypeCatalog=local 本地包使用`
```$xslt
mvn archetype:generate -DarchetypeGroupId=com.bytes.bfs -DarchetypeArtifactId=bytes-archetype  -DarchetypeVersion=1.0.0-SNAPSHOT -DgroupId=com.bytes.bfs -DartifactId=bfs-demo -Dversion=1.0.0-SNAPSHOT -Dpackage=com.bytes.bfs.demo -s /Users/jianghao/.m2/settings_scs.xml
```