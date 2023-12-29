public class FilterShortStrings {
    public static void main(String[] args) {
        // Example arrays
        String[] array1 = {"Hello", "2", "world", ":-)"};
        String[] array2 = {"1234", "1567", "-2", "computer science"};
        String[] array3 = {"Russia", "Denmark", "Kazan"};

        // Processing and printing the results
        System.out.println("Result for array1: " + arrayToString(filterStrings(array1)));
        System.out.println("Result for array2: " + arrayToString(filterStrings(array2)));
        System.out.println("Result for array3: " + arrayToString(filterStrings(array3)));
    }

    public static String[] filterStrings(String[] input) {
        // Count short strings
        int count = 0;
        for (String s : input) {
            if (s.length() <= 3) {
                count++;
            }
        }

        // Create a new array to hold short strings
        String[] result = new String[count];

        // Fill the new array
        int index = 0;
        for (String s : input) {
            if (s.length() <= 3) {
                result[index++] = s;
            }
        }

        return result;
    }

    public static String arrayToString(String[] array) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < array.length; i++) {
            sb.append("\"").append(array[i]).append("\"");
            if (i < array.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
