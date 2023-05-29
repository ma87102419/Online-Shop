# Online Shop E-commerce Project

## Description and Features

This is an e-commerce project which uses Angular as front-end, Spring Boot as back-end, and MySQL as database.
Users can browse four product categories: books, coffee mugs, mouse pads, and luggage tags. They can also enter keywords to search for products.

After the user checks out, an automatic confirmation email is sent to the user's registered email address for record-keeping and reference.

In addition, users can choose to log in before checking out. This facilitates the tracking of their past orders, thereby allowing them to review their shopping history anytime under their account profile.

## Build on Local Server

You can build the online shop website on your local computer:

### Create Database Schemas

Set up the database with `create_users.sql`.

Create product database schemas and insert data with `create_products.sql`.

Create country and state database schemas and insert data with `countries_states.sql`. This is used in the checkout page to faciliate users in entering shipping and billing addresses.

Create order database schemas with `create_orders.sql`

### Run Application

For the back-end side, run the application with Maven in the `server/` directory.

For the front-end side, run with `npm start` in `client/angular-ecommerce/` directory.

The online shop website can be accessed at `https://localhost:4200/`.

Start shopping all kinds of good things online!
