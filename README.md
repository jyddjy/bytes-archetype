
## 脚手架的生成和部署
### 生成
mvn archetype:create-from-project -Darchetype.properties=archetype.properties

### 部署
cd target/generated-sources/archetype/<br>
mvn install or mvn deploy
