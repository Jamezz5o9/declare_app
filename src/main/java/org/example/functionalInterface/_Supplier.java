package org.example.functionalInterface;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {
        System.out.println(getConnection.get());
        System.out.println(getConnectionUrl());
    }

    static String getConnectionUrl(){
        return "jdbc://localhost:5432/users";
    }
    static Supplier<List<String>> getConnection = () -> List.of("jdbc://localhost:5432/users1",
            "jdbc://localhost:5432/users2",
            "jdbc://localhost:5432/users3");

}
