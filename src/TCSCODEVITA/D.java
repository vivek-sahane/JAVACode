package TCSCODEVITA;


import java.util.*;

class D {

    static class Junction {
        String id;
        List<String> connections = new ArrayList<>();

        Junction(String id) {
            this.id = id;
        }

        void addConnection(String connection) {
            connections.add(connection);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        scanner.nextLine(); // consume newline

        Map<String, Junction> junctions = new HashMap<>();
        List<String> goods = new ArrayList<>();
        List<Integer> manualCosts = new ArrayList<>();
        int K = 0;

        // Read the conveyor belt system structure
        for (int i = 0; i < N; i++) {
            String[] input = scanner.nextLine().split(" ");
            String junctionId = input[0];

            Junction junction = junctions.getOrDefault(junctionId, new Junction(junctionId));

            for (int j = 1; j < input.length; j++) {
                junction.addConnection(input[j]);
            }

            junctions.put(junctionId, junction);
        }

        // Read the goods
        String[] goodsArr = scanner.nextLine().split(" ");
        goods.addAll(Arrays.asList(goodsArr));

        // Read the manual shift costs
        String[] costArr = scanner.nextLine().split(" ");
        for (String cost : costArr) {
            manualCosts.add(Integer.parseInt(cost));
        }

        // Read the value of K
        K = scanner.nextInt();

        // Call the function to calculate total manual shifting cost
        int totalCost = calculateManualShiftingCost(junctions, goods, manualCosts, K);

        // Output the result
        System.out.println(totalCost);
    }

    public static int calculateManualShiftingCost(Map<String, Junction> junctions, List<String> goods, List<Integer> manualCosts, int K) {
        Map<String, Integer> junctionSwitches = new HashMap<>();
        int totalCost = 0;

        for (int i = 0; i < goods.size(); i++) {
            String good = goods.get(i);
            boolean manualShiftRequired = false;

            // Find the path for this good
            List<String> path = findPath(junctions, good);

            // Count switches and check if any junction exceeds its limit
            for (String junctionId : path) {
                junctionSwitches.put(junctionId, junctionSwitches.getOrDefault(junctionId, 0) + 1);

                if (junctionSwitches.get(junctionId) > K) {
                    manualShiftRequired = true;
                    break;
                }
            }

            // If manual shift is required, add the corresponding cost
            if (manualShiftRequired) {
                totalCost += manualCosts.get(i);
            }
        }

        return totalCost;
    }

    public static List<String> findPath(Map<String, Junction> junctions, String good) {
        List<String> path = new ArrayList<>();
        Set<String> visited = new HashSet<>();

        // Start from the good and follow its path to the warehouse
        String current = good;

        while (current != null) {
            path.add(current);
            visited.add(current);

            Junction currentJunction = junctions.get(current);
            if (currentJunction == null) {
                break;
            }

            String next = null;
            for (String connection : currentJunction.connections) {
                if (!visited.contains(connection)) {
                    next = connection;
                    break;
                }
            }

            if (next == null) {
                break; // No more connections, reached warehouse
            }

            current = next;
        }

        return path;
    }
}
