//Tom Li
//There probably could have been a better name for this class...
//Also, to keep it friendly, there are no deaths, for now...

public class Person
{
    public static int totalImmunity;                         //Sum of immunity of all existing Person; used to calculate average immunity
    private int immuneRate;                                  //immunity of a specific person, ranges from 20(lowest) -> 90(highest), initially randomized
    private int infectRate;                                  //0 if isInfected==false, ranges from 50 -> 100; depends on sicknessStage (direct relationship)
    private int sicknessStage;                               //10 stages, 0 -> 9, 0==healthy, infectRate increase if stage increases
    private boolean isInfected;                              //Specify whether this person is infected

    /*
     *  No-arg constructor
     *  Initialize all private instance variables
     */
    public Person()
    {
        resetStatus();
    }

    /*
     *  Accessor method for immuneRate
     */
    public int getImmuneRate()
    {
        return immuneRate;
    }

    /*
     *  Accessor method for infectRate
     */
    public int getInfectRate()
    {
        return infectRate;
    }

    /*
     *  Sets the person to be infected and their infect rate to 50
     */
    public void setInfected()
    {
        isInfected = true;
        infectRate = 50;
    }

    /*
     *  "Cures" the person by removing infection; sets their infect rate to 0
     */
    public void setHealthy()
    {
        infectRate = 0;
        isInfected = false;
    }

    /*
     *  boolean check to see whether this.Person is infected
     */
    public boolean isInfected()
    {
        return isInfected;
    }

    /*
     *  Accessor for sicknessStage of this.Person
     */
    public int getSicknessStage()
    {
        return sicknessStage;
    }

    /*
     *  reset this.Person to initial state like that of constructor
     */
    public void resetStatus()
    {
        /**
         * WRITE THIS METHOD
         *
         * 1) Subtract immuneRate from totalImmunity
         * 2) Set immuneRate to a random number between 40 and 90, inclusive
         * 3) Reset infectRate and sicknessRate to 0, and set the person to not infected
         * 4) Add immuneRate to totalImmunity
         */

         totalImmunity -= immuneRate;
         immuneRate = (int)(Math.random() * 51) + 40;
         infectRate = 0;
         isInfected = false;
         sicknessStage = 0;
         totalImmunity += immuneRate;
    }

    /*
     *  Overall update method of Person; updates infect status, sicknessStage, and all the rates; occurs for every Person every cycle
     */
    public void update()
    {
        /**
         * WRITE THIS MEHTOD
         *
         * 1) Subtract the immuneRate from the totalImmunity
         * 2) If the person is infected:
         *      a) Increment their sickness stage by 1
         *      b) Increment their immune rate by a random number between 1 and 10
         *          Note: Immune rate is capped at 90
         *      c) Increment their infect rate by a random number between 1 and 10
         *      d) If the person has reached sickness stage 10:
         *          i) They are no longer infected
         *          ii) Their sickness stage and infect rate go to 0
         *
         *     If the person was NOT infected:
         *      a) There is a 20% chance that their immuneRate drops by a random number between 1 and 3
         *          Note: Immune rate is floored at 40
         *
         * 3) Increment totalImmunity by the newly calculated immune rate.
         */
        totalImmunity -= immuneRate;
        if (isInfected)
        {
            sicknessStage++;
            immuneRate += (int)(Math.random() * 10 + 1);
            if (immuneRate > 90)
                immuneRate = 90;
            infectRate += (int)(Math.random() * 10 + 1);
            if (sicknessStage == 10)
            {
                setHealthy();
                sicknessStage = 0;
            }
        }
        else
        {
            if (Math.random() < .2)
            {
                immuneRate -= (int)(Math.random() * 3) + 1;
                if (immuneRate < 40)
                    immuneRate = 40;
            }
        }

        totalImmunity += immuneRate;
    }

    /*
     *  return > 0 if infectRate of this.Person is greater than immuneRate of p; if return > 0, this.Person will infect p (this is handled in RoomPanel)
     *  return <= 0 if infectRate of this.Person is less than or equal to immuneRate of p; if return < 0, infection will not spread
     */
    public int compareTo(Person p)
    {
        return infectRate - p.getImmuneRate();
    }

    /*
     *  return a String with this.Person's status
     */
    public String toString()
    {
        String temp = "Status: ";
        if(isInfected)
        {
            temp += "infected";
        }
        else
        {
            temp += "healthy";
        }
        return temp;
    }
}