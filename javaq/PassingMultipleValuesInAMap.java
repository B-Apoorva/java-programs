package javaq;

import java.util.*;

/**
 * Processes commands to manage a Map<String, List<Employee>>.
 * Commands:
 *  - ADD <City> <Name> <Id>
 *  - FETCH <City>
 *
 * Example input:
 * 6
 * ADD Banglore Poojitha 24
 * ADD Banglore Misba 30
 * ADD Banglore Rishika 10
 * ADD Chennai Garima 13
 * FETCH Banglore
 * FETCH Mumbai
 */
public class PassingMultipleValuesInAMap {

    // Simple Employee class with name and id
    static class Employee {
        private final String name;
        private final int id;

        public Employee(String name, int id) {
            this.name = name;
            this.id = id;
        }

        public String getName() { return name; }
        public int getId() { return id; }

        @Override
        public String toString() {
            // Used only if you print the object directly
            return name + " " + id;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, List<Employee>> cityEmployees = new HashMap<>();

        // First line: number of commands
        int n = Integer.parseInt(sc.nextLine().trim());

        for (int i = 0; i < n; i++) {
            String line = sc.nextLine().trim();
            if (line.isEmpty()) {
                i--; // ignore empty lines if any
                continue;
            }

            String[] parts = line.split("\\s+");
            String command = parts[0];

            if ("ADD".equalsIgnoreCase(command)) {
                // Format: ADD <City> <Name> <Id>
                if (parts.length < 4) {
                    // You can handle error more gracefully if needed
                    continue;
                }
                String city = parts[1];
                String name = parts[2];
                int id = Integer.parseInt(parts[3]);

                cityEmployees
                    .computeIfAbsent(city, k -> new ArrayList<>())
                    .add(new Employee(name, id));

            } else if ("FETCH".equalsIgnoreCase(command)) {
                // Format: FETCH <City>
                if (parts.length < 2) {
                    continue;
                }
                String city = parts[1];
                List<Employee> list = cityEmployees.get(city);

                if (list == null || list.isEmpty()) {
                    System.out.println("No Employees");
                } else {
                    // Print each employee as: "<name> <id>"
                    for (Employee e : list) {
                        System.out.println(e.getName() + " " + e.getId());
                    }
                }
            }
        }
    }
}
