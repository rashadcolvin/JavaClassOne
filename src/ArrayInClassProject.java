public class ArrayInClassProject {
    
        public static void main(String[] args) {
            // Create three arrays
            int[] intArray = {1, 2, 3};
            double[] doubleArray = {1.1, 2.2, 3.3};
            String[] stringArray = {"Jhase", "Azia", "Champ"};
    
            // Access and print elements of the arrays
            System.out.println("Elements of intArray:");
            for (int i = 0; i < intArray.length; i++) {
                System.out.print(intArray[i] + " ");
            }
    
            System.out.println("\nElements of doubleArray:");
            for (int i = 0; i < doubleArray.length; i++) {
                System.out.print(doubleArray[i] + " ");
            }
    
            System.out.println("\nElements of stringArray:");
            for (int i = 0; i < stringArray.length; i++) {
                System.out.print(stringArray[i] + " ");
            }
    
            // Alter multiple values in the arrays
            intArray[2] = 99;
            doubleArray[3] = 77.7;
            stringArray[1] = "grape";
    
            // Print the altered elements
            System.out.println("\nAltered elements of intArray:");
            for (int i = 0; i < intArray.length; i++) {
                System.out.print(intArray[i] + " ");
            }
    
            System.out.println("\nAltered elements of doubleArray:");
            for (int i = 0; i < doubleArray.length; i++) {
                System.out.print(doubleArray[i] + " ");
            }
    
            System.out.println("\nAltered elements of stringArray:");
            for (int i = 0; i < stringArray.length; i++) {
                System.out.print(stringArray[i] + " ");
            }
        }
    }
    

