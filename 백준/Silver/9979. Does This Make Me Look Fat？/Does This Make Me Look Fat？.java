import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean first = true;
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            if (line == null || line.isEmpty()) continue;
            if (line.equals("START")) {
                List<Dieter> list = new ArrayList<>();
                while (sc.hasNextLine()) {
                    String record = sc.nextLine();
                    if (record.equals("END")) break;
                    String[] parts = record.split(" ");
                    String name = parts[0];
                    int days = Integer.parseInt(parts[1]);
                    int startWeight = Integer.parseInt(parts[2]);
                    int currentWeight = startWeight - days;
                    list.add(new Dieter(name, currentWeight));
                }
                list.sort((a, b) -> b.weight - a.weight);
                if (!first) System.out.println();
                for (Dieter d : list) {
                    System.out.println(d.name);
                }
                first = false;
            }
        }
        sc.close();
    }
}

class Dieter {
    String name;
    int weight;
    Dieter(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }
}
