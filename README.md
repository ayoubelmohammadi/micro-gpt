# micro-gpt

Multi-module Spring Boot project with a `product` service module and PostgreSQL database via Docker Compose.

## Project structure

- `pom.xml` - parent Maven project
- `product` - Spring Boot product module

## Start product database

```bash
docker compose up -d
```

## Stop product database

```bash
docker compose down
```

## Product database connection

- Host: `localhost`
- Port: `5432`
- Database: `products_db`
- Username: `products_user`
- Password: `products_password`

## Run the product service

```bash
mvn -pl product spring-boot:run
```
