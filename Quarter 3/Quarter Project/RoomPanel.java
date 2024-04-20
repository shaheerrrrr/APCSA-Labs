//Tom Li

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RoomPanel extends JPanel implements MouseListener
{
    private JPanel[][] grid;   //what is actually displayed
    private Person[][] people; //Encapsulated in the program and interacts with grid[][]
    private JLabel weeksDisplay, infectDisplay, infectionRatioDisplay, avgImmuneDisplay, statusDisplay;
    private JPanel gridPanel;  //Center panel
    private JButton StartEndRunButton;
    private int numCycles, numInfected;
    private int numRows, numCols; //number of rows and columns on grid[][]
    private int currRow, currCol; //row and column of the current block (the one the mouse hovers over); if mouse is not over any block, currRow==currCol==-1
    private int runState = 0;  //if runState==0, auto-run is off; if runState==1, auto-run is on
    private Timer timer = new Timer(120, new StepListener());   //A swing.Timer to run the program automatically with the StepListener, first argument is delay time in milliseconds

    public RoomPanel()
    {
        setLayout(new BorderLayout());

        initialize(50,50);   //initialized a grid board, or "room", of size 50 by 50 (or any other specified size, code is made to be versatile); each block is a person

        //The Top of the panel
        JPanel NORTH = new JPanel(new FlowLayout());
        weeksDisplay = new JLabel("Cycles: " + numCycles + "     ", SwingConstants.CENTER);
        infectDisplay = new JLabel("Infected: " + numInfected + "     ", SwingConstants.CENTER);
        infectionRatioDisplay = new JLabel("Infection Ratio: " + (1.0*numInfected/(numRows*numCols)) + "     ", SwingConstants.CENTER);
        avgImmuneDisplay = new JLabel("Average Immunity: " + ((int)(100*(1.0*Person.totalImmunity/(numRows*numCols)))/100.0) + "     ", SwingConstants.CENTER);  //Spread becomes limited and eventually stops as average immunity increases
        NORTH.add(weeksDisplay);
        NORTH.add(infectDisplay);
        NORTH.add(infectionRatioDisplay);
        NORTH.add(avgImmuneDisplay);
        add(NORTH, BorderLayout.NORTH);

        //The Bottom of the panel
        JPanel SOUTH = new JPanel(new FlowLayout());
        addButton(SOUTH, "Reset", new ResetListener());                //Reset Button
        addButton(SOUTH, "Random Infect", new RandomInfectListener()); //Random Infect Button
        addButton(SOUTH, "Step Cycle", new StepListener());            //Step Cycle Button
        StartEndRunButton = new JButton("Run");                        //Auto-Run Button
        StartEndRunButton.addActionListener(new StartEndRunListener());
        SOUTH.add(StartEndRunButton);
        add(SOUTH, BorderLayout.SOUTH);

        //The Right of the panel
        JPanel EAST = new JPanel(new BorderLayout());
        EAST.setPreferredSize(new Dimension(100,50));
        statusDisplay = new JLabel("<html>Row:---<br>Col:---<br>Status:---<br>Immune Rate:---<br>Infect Rate:---<br>Stage:---</html>");
        EAST.add(statusDisplay, BorderLayout.CENTER);
        add(EAST, BorderLayout.EAST);
    }



    /**
     * Initailize central grid display BEGIN
     * @param x number of rows on the grid
     * @param y number of columns on the grid
     */
    private void initialize(int x, int y)  //Method is not absolutely necessary, but I think it makes the initialization process more concise
    {
        /**
         * WRITE THIS METHOD:
         *
         * 1) Use parameters x and y to set instance variables numRows and numCols, respectively
         * 2) Instantiate both instance variables grid and people with dimensions numRows x numCols
         * 3) Instantiate gridPanel with this line:
         *      gridPanel = new JPanel(new GridLayout(numRows, numCols));
         * 4) Run nested for loops through the dimensions of the 2D arrays. Inside the inner loop:
         *      a) Instantiate the current element of the people array
         *      b) Instantiate the current element of the grid array (use JPanel's 0-arg constructor)
         *      c) Add the following lines (change loop variables if necessary):
         *                 grid[r][c].addMouseListener(this);               //adds MouseListener to every individual JPanel of grid[][]
         *                 grid[r][c].setBorder(BorderFactory.createLineBorder(Color.black));   //Add black border to separate each block
         *                 gridPanel.add(grid[r][c]);                       //add block at row=r and col=c to gridPanel(or center panel)
         *  5) Call the updateGridDisplay method below
         *  6) Add this line:
         *      add(gridPanel, BorderLayout.CENTER);   //add gridPanel(or center panel) to CENTER
         */

         numRows = x;
         numCols = y;
         grid = new JPanel[x][y];
         people = new Person[x][y];
         gridPanel = new JPanel(new GridLayout(numRows, numCols));
         for (int r = 0; r < x; r++)
         {
            for (int c = 0; c < y; c++)
            {
                people[r][c] = new Person();
                grid[r][c] = new JPanel();
                grid[r][c].addMouseListener(this);
                grid[r][c].setBorder(BorderFactory.createLineBorder(Color.BLACK));
                gridPanel.add(grid[r][c]);
            }
         }
         updateGridDisplay();
         add(gridPanel, BorderLayout.CENTER);
    }
    //Initialize central grid display END


    //UpdateGridDisplay BEGIN
    private void updateGridDisplay()    //updates the color of the entire grid for each step of a week; basically, updates color
    {
        /**
         * WRITE THIS METHOD
         *
         * 1) Run nested loops for your 2D array. Inside the inner loop:
         *      a) If the person is infected:
         *          set the grid cell to red
         *         Otherwise, set the grid cell to blue
         *
         *         Example to set color:
         *              grid[r][c].setBackground(Color.RED);
         */
        for (int r = 0; r < numRows; r++)
        {
            for (int c = 0; c < numCols; c++)
            {
                if(people[r][c].isInfected())
                {
                    grid[r][c].setBackground(new Color(200, 0, 55));
                }
                else
                {
                    grid[r][c].setBackground(new Color(55, 0, 200));
                }
            }
        }
    }
    //UpdateGridDisplay END


    //Minor methods BEGIN
    private void addButton(JPanel p, String s, ActionListener a)   //simple way to add a button with a specific text and ActionListener
    {
        JButton b = new JButton(s);
        b.addActionListener(a);
        p.add(b);
    }

    private void updateStatusDisplay(int r, int c, Person p, boolean reset)   //simple way to update status board, which is a pain to format
    {
        if(reset)   //if reset is true, disregard the three prior arguments and reset statusDisplay
            statusDisplay.setText("<html>Row:---<br>Col:---<br>Status:---<br>Immune Rate:---<br>Infect Rate:---<br>Stage:---</html>");
        else
            statusDisplay.setText("<html>Row: " + r + "<br>Col: " + c + "<br>" + p.toString() + "<br>Immune Rate: " + p.getImmuneRate() + "<br>Infect Rate: " + p.getInfectRate() + "<br>Stage: " + p.getSicknessStage() + "</html>");
    }

    private void updateTopDisplay()
    {
        weeksDisplay.setText("Cycles: " + numCycles + "     ");
        infectDisplay.setText("Infected: " + numInfected + "     ");
        infectionRatioDisplay.setText("Infection Ratio: " + (1.0*numInfected/(numRows*numCols)) + "     ");
        avgImmuneDisplay.setText("Average Immunity: " + ((int)(100*(1.0*Person.totalImmunity/(numRows*numCols)))/100.0));
    }

    /**
     * Counts the number of infected persons on the grid
     * @return the number of currently infected persons
     */
    private int countNumInfected()   //Count number of infected/red tiles
    {
        int count = 0;
        for (int r = 0; r < numRows; r++)
        {
            for (int c = 0; c < numCols; c++)
            {
                if (people[r][c].isInfected())
                    count++;
            }
        }
        return count;
    }
    //Minor methods END


    //All components of ResetListener BEGIN
    private class ResetListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            reset();             //reset central grid and set all Persons to healthy
            numCycles = 0;       //reset current run and cycle is set back to 0
            numInfected = 0;     //all Persons are healthy
            updateTopDisplay();  //Update the top display to show the correct values
        }
    }

    /**
     * Resets all people to the initial status as defined in Person
     */
    private void reset()    //Resets entire grid[][] to blue, all Persons of people[][] to healthy
    {
        /**
         * WRITE THIS METHOD
         *
         * 1) Loop through each element of people and call the resetStatus method
         * 2) Call updateGridDisplay method (written above)
         */
        for (Person[] row : people)
        {
            for (Person col : row)
            {
                col.resetStatus();
            }
        }
        updateGridDisplay();
    }
    //All components of ResetListener END


    //All components of RandomInfectListener BEGIN
    private class RandomInfectListener implements ActionListener
    {
        /**
         * Randomly infect 2 healthy individuals, if possible
         * @param e Random Infect button was clicked
         */
        public void actionPerformed(ActionEvent e)
        {
            /**
             * WRITE THIS METHOD
             *
             * Choose 2 random *healthy* people and infect them by calling the infect method below.
             * Skip if the entire grid is sick.
             * After generating 2 people, call updateTopDisplay and updateGridDisplay
             */
            if (countNumInfected() < numRows * numCols)
            {
                int i = 0;
                while (i < 2)
                {
                    int rand1 = (int)(Math.random() * (numRows));
                    int rand2 = (int)(Math.random() * (numCols));
                    if (!people[rand1][rand2].isInfected())
                    {
                        infect(rand1, rand2);
                        i++;
                    }
                }
            }
            updateGridDisplay();
        }
    }

    /**
     * Infects people[r][c]
     * @param r Row number of the person to be infected
     * @param c Column number of the person to be infected
     */
    private void infect(int r, int c)
    {
        /**
         * WRITE THIS METHOD
         *
         * Call the person's setInfected method and increment numInfected
         */
        people[r][c].setInfected();
        numInfected++;
        updateGridDisplay();
    }
    //All components of RandomInfectListener END


    //All components of StepListener BEGIN
    private class StepListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            spread();
            updateRates();    //update the rate of all Persons in people[][], including increase of immune and infect rate if infected; and the gradual decrease of immune rate if healthy
            numCycles++;
            numInfected = countNumInfected();
            updateTopDisplay();
            updateGridDisplay();
        }
    }

    /**
     * Updates immune/infect rates of all people
     */
    private void updateRates()
    {
        /**
         * WRITE THIS METHOD
         *
         * Loop through the people array and call each person's update method
         */
        for (Person[] row : people)
        {
            for (Person col : row)
            {
                col.update();
            }
        }
    }

    /**
     * Simulates the spread of the infection
     */
    private void spread()
    {
        /**
         * WRITE THIS METHOD
         *
         * 1) Create a temporary 2D array of ints, with the same dimensions as people
         *      Note: 1's are infected, 0's are healthy
         * 2) Create nested loops through people. Inside the inner loop:
         *      a) If the current person is infected, set the corresponding temp value to 1
         *      b) If the current person has a higher infect rate than the person above's immune rate, set the temp
         *          value above the current person to 1
         *          Note: Use Person's compareTo method to compare rates between people
         *          Note: Watch for out of bounds exceptions!
         *      c) If the current person has a higher infect rate than the person to the right's immune rate,
         *          set the temp value of the person to the right to 1
         *      d) If the current person has a higher infect rate than the person to the left's immune rate,
         *          set the temp value of the person to the left to 1
         *      e) If the current person has a higher infect rate than the person below's immune rate, set the temp
         *          value below the current person to 1
         *
         *  3) Create nested loops through temp. For every temp value of 1, infect the corresponding person
         */
        int[][] tempGrid = new int[numRows][numCols];
        for (int r = 0; r < numRows; r++)
        {
            for (int c = 0; c < numCols; c++)
            {
                if (people[r][c].isInfected())
                    tempGrid[r][c] = 1;
                if (r > 0 && people[r][c].compareTo(people[r-1][c]) > 0)
                    tempGrid[r-1][c] = 1;
                if (r < numRows - 1 && people[r][c].compareTo(people[r+1][c]) > 0)
                    tempGrid[r+1][c] = 1;
                if (c > 0 && people[r][c].compareTo(people[r][c-1]) > 0)
                    tempGrid[r][c-1] = 1;
                if (c < numCols - 1 && people[r][c].compareTo(people[r][c+1]) > 0)
                    tempGrid[r][c+1] = 1;
            }
        }

        for (int r = 0; r < numRows; r++)
        {
            for (int c = 0; c < numCols; c++)
            {
                if (tempGrid[r][c] == 1)
                    people[r][c].setInfected();
            }
        }
    }
    //All components of StepListener END


    //All components of StartEndRunListener BEGIN
    private class StartEndRunListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            if(runState==0)   //If auto-run is off
            {
                runState = 1;                       //runState is on
                StartEndRunButton.setText("Pause"); //set text of the button to Pause
                timer.start();                      //Start Timer for auto-run
            }
            else  //else auto-run is already on
            {
                runState = 0;                       //runState is off
                StartEndRunButton.setText("Run");   //set text of the button to Start
                timer.stop();                       //Pause Timer for auto-run
            }
        }
    }
    //All components of StartEndRunListener END


    //All Components of MouseListener BEGIN
    public void mouseClicked(MouseEvent e)    //Left-click to infect
    {
        if(currRow >= 0 && currCol >= 0)    //if currRow and currCol are valid indices
        {
            infect(currRow, currCol);                                                  //when clicked, infect Person at people[currRow, currCol]
            updateStatusDisplay(currRow, currCol, people[currRow][currCol], false);    //update right-hand status display
            updateTopDisplay();
            updateGridDisplay();                                                       //set grid[currRow, currCol] to RED; not efficient, but its only one line
        }
    }

    public void mouseEntered(MouseEvent e)    //Hover over grid block to check status
    {
        for(int r=0; r<grid.length; r++)
        {
            for(int c=0; c<grid[0].length; c++)
            {
                if (e.getSource() == grid[r][c])
                {
                    currRow = r;                                       //sets currRow to the row of the grid-block the mouse is currently hovering over
                    currCol = c;                                       //sets currCol to the col of the grid-block the mouse is currently hovering over
                    updateStatusDisplay(r, c, people[r][c], false);    //update the right-hand status display to show the status of the Person at grid[currRow][currCol]
                }
            }
        }
    }

    public void mouseExited(MouseEvent e)     //Resets status display to blank if mouse exits grid; this is to prevent unnecessary errors when the mouse is not hovering over any part of the grid
    {
        currRow = -1;
        currCol = -1;
        updateStatusDisplay(-1, -1, null, true);
    }

    //NOT USED
    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    //
    //All components of MouseListener END
}