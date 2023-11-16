# Vigo Server

## Usage

### Set the environment variables

- Copy the `application.yml.sample` file to `application.yml`

```bash
cp src/main/resources/application.yml.sample src/main/resources/application.yml
```

- Edit the `application.yml` file and set the environment variables

### Run PostgreSQL 16 (on Fedora 38)

```bash
# Start server
sudo systemctl start postgresql-16

# Access client
sudo -u postgres psql
```

### With Maven

```bash
mvn clean install
mvn spring-boot:run
```

### With Docker

- Uncomment or add the following line to the pom.xml file

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-docker-compose</artifactId>
    <scope>runtime</scope>
    <optional>true</optional>
</dependency>
```

```bash
sudo systemctl start docker
mvn clean install && sudo mvn spring-boot:run
```
