
## 脚手架的生成和部署
### 生成
```text
mvn archetype:create-from-project -Darchetype.properties=archetype.properties

```

### 部署
```text
cd target/generated-sources/archetype/<br>
mvn install or mvn deploy
```

### 根据脚手架生成项目
```text
mvn archetype:generate -DarchetypeGroupId=com.bytes.bfs -DarchetypeArtifactId=maven-archetype  -DarchetypeVersion=1.0.0-SNAPSHOT -DgroupId=com.bytes.bfs.demo -DartifactId=bfs-demo -Dversion=1.0.0-SNAPSHOT

-DgroupId=com.bytes.bfs.demo 生成新项目默认使用得包名,使用groupId值
 
```

