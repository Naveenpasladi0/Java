package controlflowstatement;

public class branchingstatement {

    // 3 - return statement
    public int CompareNum()
    {
        int x = 3;
        int y = 8;
        System.out.println("x="+x+"\ny="+y);
        if(x>y)
        return x;
        else
            return y;
    }

    public static void main(String[] args) {
        // 1 - break statement
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println("i is " + i);
        }

        // 2 - continue statement
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println("i is " + i);
        }

        // 3 - return statement - Divider Code
        {
            branchingstatement obj = new branchingstatement();
            int result = obj.CompareNum();
            System.out.println("The greater number among x and y is " + result);
        }
    }
}
