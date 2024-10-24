import static java.lang.System.out;
import java.io.Console;
import java.util.Random;

public class lineareSuche{
    public static void main(String[] args){
        
        out.println("Gib eine Zahl ein, welche du suchen möchtest: ");
        //read user input 
        Console console = System.console();
        String userInput = console.readLine();
        int key = Integer.parseInt(userInput);
        
        //Parameter for creating the Array
        int[] array = generateArray(10,5); 
        boolean found = search(array, key);
        outputSolution(found, array);
    }

    private static int[] generateArray(int size, int maxValue){
        int[] localArray = new int[size];
        Random rand = new Random();

        for(int i = 0; i != size; i++){
            localArray[i] = rand.nextInt(maxValue + 1);
        }
        return localArray;
    }

    private static boolean search(int[] feld, int key){
        for(int j = 0; j < feld.length; j++){
            if(feld[j] == key){
                return true;
            }
        }
        return false;
    }

    private static void outputSolution(boolean solution, int[] feld){
        if(solution == true){
            out.print("Du hast den Wert gefunden!!! Hier ist das Array: \n");
            for(int i = 0; i < feld.length; i++){
                out.print(i +". " + feld[i] + "\n");
            }
        }
        else{
            out.print("Der Wert ist NICHT im Array");
        }
    }
}



