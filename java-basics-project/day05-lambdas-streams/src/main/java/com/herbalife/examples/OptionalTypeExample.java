package com.herbalife.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalTypeExample {
    public static void main(String[] args) {
        //execute SQL to fetch some records in DB
        //you may get some value or you may not get some value
        List<Row> rows = getRowsFromDBOldStyle();
        if(rows != null) {

        }

        Optional<List<Row>> optionalRows = getRowsFromDB();
        if(optionalRows.isPresent()) {
            List<Row> rowsList = optionalRows.get();
        } else {
            System.out.println("There is no value");
        }

    }

    static Optional<List<Row>> getRowsFromDB() {
        //Execute some SQL
        //return Optional.of(new ArrayList<>());
        return Optional.empty();
    }

    static List<Row> getRowsFromDBOldStyle() {
        //Execute some SQL
        return null; //NOT A GOOD PRACTICE TO RETURN NULL
        //return new ArrayList<>();
    }


}

class Row {}