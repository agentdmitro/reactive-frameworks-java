--   COFFEE DRINKS

CREATE TABLE coffee_drinks (
     id BIGSERIAL PRIMARY KEY,
     name VARCHAR(255) NOT NULL,
     rice NUMERIC(10, 2) NOT NULL
);

--   RECIPES

CREATE TABLE recipes (
      id BIGSERIAL PRIMARY KEY,
      drink_id BIGINT NOT NULL,
      water INT NOT NULL,
      coffee INT NOT NULL,
      milk INT NOT NULL
);

ALTER TABLE recipes
    ADD CONSTRAINT fk_recipe_drink
    FOREIGN KEY (drink_id) REFERENCES coffee_drinks(id);

--   ORDERS

CREATE TABLE orders (
     id BIGSERIAL PRIMARY KEY,
     drink_id BIGINT NOT NULL,
     sugar_level INT NOT NULL,
     status VARCHAR(50) NOT NULL
);

ALTER TABLE orders
    ADD CONSTRAINT fk_order_drink
        FOREIGN KEY (drink_id) REFERENCES coffee_drinks(id);
