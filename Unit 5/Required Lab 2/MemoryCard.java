/*Shaheer Khan
 * On My Honor as a Student, I have not given nor received aid on this lab
 */
public class MemoryCard {
    private static int[] nums = {1, 1, 2, 2, 3, 3, 4, 4};
    private static int index = 0, next_ID = 1;
    private int value, id;
    private boolean revealed, paired;

    public MemoryCard() {
        value = nums[index];
        index = (index + 1) % nums.length;
    }

    public void setID(){
        id = next_ID;
        next_ID++;
    }

    public int getID(){
        return id;
    }

    public int getValue() {
        return value;
    }

    public void flip() {
        revealed = !revealed;
    }

    public boolean paired(){
        return paired;
    }

    public boolean revealed(){
        return revealed;
    }

    public boolean equals(MemoryCard other) {
        if (value == other.value) {
            paired = true;
            other.paired = true;
            return true;
        }
        return false;
    }

    public void printTopOrBottom() {
        System.out.print("-------\t\t\t");
    }

    public void printMiddleBlank() {
        System.out.print("|     |\t\t\t");
    }

    public void printCenter() {
        if (paired) {
            System.out.print("XXXXXXX\t\t\t");
        } else if (!revealed) {
            System.out.print("|  ?  |\t\t\t");
        } else {
            System.out.print("|  " + value + "  |\t\t\t");
        }
    }
    public void printID(){
        System.out.print("   " + id + "   \t\t\t");
    }
}


