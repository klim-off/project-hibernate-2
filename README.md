# project-hibernate-2

 map entities onto existing tables, and add minimal functionality to check that the mapping is done correctly.
Now in more detail:

    1. Download the dump file (https://javarush.com/downloads/ide/javarush/dump-hibernate-2.sql) and deploy it on your local machine. As a database, we will use a test database, which is distributed as an example along with the MySQL installation package. The dump is needed to record the state of the database, since we cannot guarantee that it will not change in a day, month, or year.
    
    2. We won’t have a project template, so create the project yourself. This should be a maven project with all the necessary dependencies ( hibernate-core-jakarta , mysql-connector-java , p6spy ).
    
    3. Connect our local deployed database as a datasource in Idea. After that, in the Database tab, place the cursor on the movie diagram and press the key combination Alt+Ctrl+Shift+U(works only in the Ultimate version). This will show the structure of the entire movie schema (with column names, keys, etc.). It looks something like this:
       I agree, it's not very comfortable to watch. Disable showing the names of all columns and comments:
       As a result, you will get a database schema that can already be analyzed:
       
    4. The circuit looks complicated, but it's not all bad. To analyze the structure of a database, you need to find where to start. There is no single correct answer, but I would recommend starting with the table film. Let's look at a few relationships as an example:
        ◦ The relationship between tables filmand film_textis an explicit OneToOne relationship , because the table film_texthas a field film_idthatNOTrefers to an ID from the table film(no foreign key). But according to the name and logic, this connection should exist. In addition, in the table film_textthe field film_idacts as a primary key, which guarantees that no more than one “film text” corresponds to one “movie”.
        ◦ Now let's look at the tables filmand category. Logically, a film can have several categories. And one category, perhaps, for different films. In addition, there is an intermediate link table between these two tables film_category. Based on all of the above, this is an explicit ManyToMany relationship .
        ◦ Let's look at the tables filmand language. From a logical point of view, a film may have translations into different languages ​​and different films may be in the same language. That is, ManyToMany suggests itself . But if we look at the contents of the table film, we can notice that each row of the table is a unique movie. And there is only one field language_id in the line (There is also original_language_id, but in all records it is null, so we can ignore it). That is, one film can only have one language. And maybe different films have the same language. Communication – ManyToOne (communication is directed from film to language).
    5. Now the main task is to create all the necessary entity classes and map them to schema tables movie.
    6. Add a method that can create a new customer (customer table) with all dependent fields. Don’t forget to make the method transactional (so as not to get into a situation where the buyer’s address is recorded in the database, but the buyer himself is not).
    7. Add a transaction method that describes the event “the buyer went and returned a previously rented movie.” Choose any buyer and rental event at your discretion. There is no need to recalculate the film's rating.
    8. Add a transactional method that describes the event “the buyer went to the store and rented inventory there.” At the same time, he made a payment (payment) from the seller (staff).” Select the film (through the inventory) at your discretion. The only restriction is that the film must be available for rental. That is, either rental should have no inventory records at all, or the return_date column of the table should be filled in rentalfor the last rental of this inventory.
    9. Add a transactional method that describes the event “a new movie was made and it became available for rent.” Choose the film, language, actors, categories, etc. at your discretion.

