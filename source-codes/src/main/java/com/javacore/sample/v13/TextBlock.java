package com.javacore.sample.v13;

public class TextBlock {
    public static void main(String[] args) {
        String sql =
                "SELECT id, firstName, lastName FROM Employee\n"
                        + "WHERE departmentId = \"IT\"\n"
                        + "ORDER BY lastName, firstName";

        System.out.println("\nsql: " + sql);

        sql = """
                SELECT id, firstName, lastName FROM Employee
                WHERE departmentId = "IT"
                ORDER BY lastName, firstName""";

        System.out.println("\nsql: " + sql);


        String json = ""
                + "{\n"
                + "language: \"Java\",\n"
                + "version: \"13\",\n"
                + "description: \"is here\"\n"
                + "}\n";
        System.out.println("\njson: " + json);

        json = """
			{
				language: "Java",
				version: "13",
				description: "is here"
			}
			""";
        System.out.println("\njson: " + json);
    }
}