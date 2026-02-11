# micro-gpt

Multi-module Spring Boot project with a `product` service module and PostgreSQL database via Docker Compose.

## Project structure

- `pom.xml` - parent Maven project
- `product` - Spring Boot product module
  - Flyway migrations in `product/src/main/resources/db/migration`

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

## Flyway

- Flyway is enabled in the `product` module.
- Initial migration file: `V1__create_products_table.sql`.

## Run the product service

```bash
mvn -pl product spring-boot:run
```
