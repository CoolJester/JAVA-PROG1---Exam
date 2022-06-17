package question2;

/**
 *
 * @author 19342975
 */
public class Question2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Arrays with the member name and member weights
        String[] memberName = {"Jeff Jones", "Kari Smith", "Jabu Xolani", "Karen Williams", "Eric Bitterhout"};
        int[][] memberWeight = {{10, 10, 7}, {10, 13, 20}, {8, 7, 5}, {10, 7, 5}, {12, 10, 9}};
        
        //varible used to calculate the total weight lost
        int totalWeight = 0;
        
        //Printing the headers
        System.out.println("MEMBER\t\t\tWEIGHT LOSS\tGOAL MET");
        
        //Printing the name and weight lost
        for(int x = 0; x < memberWeight.length; x++){
            //resetting the control varaible            
            totalWeight = 0;
            
            //Printing the names
            System.out.print(memberName[x]);
            for(int i = 0; i < memberWeight[x].length; i++){
                totalWeight += memberWeight[x][i];
            }
            //Printing total weight and checking if the goal was reached
            System.out.print("\t\t" + totalWeight + "\t\t" + ((totalWeight >= 25) ? "Yes" : "No") + "\n");
        }
    }
    
}
