import java.util.Scanner;
public class StonesGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("___Stones Game___");

        System.out.println("Enter the number of stones");

        int numberOfStones = sc.nextInt();
        while(numberOfStones%2==0){
            System.out.println("You have entered an even number of stones.\n Enter an odd number of stones to continue this game.");
            numberOfStones = sc.nextInt();
        }
        int limit = numberOfStones/2;
        int storage1=0, storage2=0;
        int firstPlayerStone,secondPlayerStone;

        System.out.println("Enter the name of the first player");
        String firstName=sc.next();
        System.out.println("Enter the name of the second player");
        String secondName=sc.next();

        System.out.println(firstName+" has 0 stones");
        System.out.println(secondName+" has 0 stones");
        System.out.println("There are "+numberOfStones+" stones left");

        //First Player
        System.out.println(firstName+", choose from 1 to "+limit+" stones");
        firstPlayerStone = sc.nextInt();

        while(firstPlayerStone <1 || firstPlayerStone>limit){
            if(firstPlayerStone < 1) {
                System.out.println("You have entered a number less than 1.\n Enter a number between 1 and "+limit+" to continue this game.");
            } else{
                System.out.println("You have entered a number greater than "+limit+".\n You cannot pick more than half of the initial number of stones.");
            System.out.println(firstName+", choose from 1 to "+limit+" stones");
            firstPlayerStone = sc.nextInt();
            }
        }

        storage1 = storage1 + firstPlayerStone;
        numberOfStones = numberOfStones - firstPlayerStone;
        System.out.println(firstName+" has "+storage1+" stones");
        System.out.println(secondName+" has "+storage2+" stones");
        System.out.println("There are "+numberOfStones+" stones left");

        //Second Player
        if (numberOfStones<2*firstPlayerStone){
            System.out.println(secondName+", choose from 1 to "+numberOfStones+" stones");
        }
        else {
            System.out.println(secondName+", choose from 1 to "+2*firstPlayerStone+" stones");}

        secondPlayerStone = sc.nextInt();

        while(secondPlayerStone <1 || secondPlayerStone>2*firstPlayerStone || secondPlayerStone>numberOfStones){
            if(secondPlayerStone<1) {
                System.out.println("You have entered a number less than 1.\n Enter a number between 1 and " + 2 * firstPlayerStone + " to continue this game.");
            }
            else {
                if (secondPlayerStone > numberOfStones)
                    System.out.println("You have entered a number greater than " + numberOfStones + ".\n You cannot pick more than the number of stones left.");
                else
                    System.out.println("You have entered a number greater than " + 2 * firstPlayerStone + ".\n You cannot pick more than twice the number of stones picked by the first player.");
            }
            secondPlayerStone = sc.nextInt();
        }
        storage2 = storage2 + secondPlayerStone;
        numberOfStones = numberOfStones - secondPlayerStone;

        System.out.println(firstName+" has "+storage1+" stones");
        System.out.println(secondName+" has "+storage2+" stones");

        //loop
        while (numberOfStones>0){
            if (numberOfStones==1){
                System.out.println("There is 1 stone left");
                firstPlayerStone = sc.nextInt();
                while (firstPlayerStone !=1) {
                    System.out.println(firstName+" choose the last stone.");
                    firstPlayerStone = sc.nextInt();
                }
                storage1 = storage1 + firstPlayerStone;
                numberOfStones--;
                System.out.println(firstName+" has "+storage1+" stones");
                System.out.println(secondName+" has "+storage2+" stones");
            }
            else{
            System.out.println("There are "+numberOfStones+" stones left");}
            if (numberOfStones <2*firstPlayerStone) {
                System.out.println(firstName + ", choose from 1 to " + numberOfStones + " stones");
            }
            else{
                System.out.println(firstName+", choose from 1 to "+2*firstPlayerStone+" stones");
            }
            firstPlayerStone = sc.nextInt();

            while(firstPlayerStone <1 || firstPlayerStone>2*firstPlayerStone || firstPlayerStone>numberOfStones){
                if(firstPlayerStone<1)
                    System.out.println("You have entered a number less than 1.\n Enter a number between 1 and "+2*firstPlayerStone+" to continue this game.");
                else if(firstPlayerStone>numberOfStones){
                    System.out.println("You cannot pick more than the number of stones left.");
                System.out.println(firstName+", choose from 1 to "+numberOfStones+" stones");}
                    else{
                System.out.println("You cannot pick more than twice the number of stones picked by the last player.");
                System.out.println(firstName+", choose from 1 to "+2*firstPlayerStone+" stones");
                    }
                    firstPlayerStone = sc.nextInt();
            }
            storage1 = storage1 + firstPlayerStone;

            System.out.println(firstName+" has "+storage1+" stones");
            System.out.println(secondName+" has "+storage2+" stones");
            numberOfStones = numberOfStones - firstPlayerStone;

            if (numberOfStones==0){
                secondPlayerStone = 0;
                System.out.println(firstName+" has "+storage1+" stones");
                System.out.println(secondName+" has "+storage2+" stones");
            }
            else if (numberOfStones==1){
                System.out.println("There is 1 stone left");
                while (secondPlayerStone !=1){
                    System.out.println(secondName+" choose the last stone.");
                    secondPlayerStone = sc.nextInt();
                }
                storage2 = storage2 + secondPlayerStone;
                numberOfStones--;
                System.out.println(firstName+" has "+storage1+" stones");
                System.out.println(secondName+" has "+storage2+" stones");
            }
            else {
                if (numberOfStones < 2 * secondPlayerStone) {
                    System.out.println(secondName + ", choose from 1 to " + numberOfStones + " stones");
                } else {
                    System.out.println(secondName + ", choose from 1 to " + 2 * secondPlayerStone + " stones");
                    secondPlayerStone = sc.nextInt();
                }

                while (secondPlayerStone < 1 || secondPlayerStone > 2 * secondPlayerStone || secondPlayerStone > numberOfStones) {
                    if (secondPlayerStone < 1)
                        System.out.println("You have entered a number less than 1.\n Enter a number between 1 and " + 2 * secondPlayerStone + " to continue this game.");
                    else if (secondPlayerStone > numberOfStones)
                        System.out.println("You have entered a number greater than " + numberOfStones + ".\n You cannot pick more than the number of stones left.");
                    else
                        System.out.println("You have entered a number greater than " + 2 * secondPlayerStone + ".\n You cannot pick more than twice the number of stones picked by the last player.");
                    System.out.println(secondName + ", choose from 1 to " + 2 * secondPlayerStone + " stones");
                    secondPlayerStone = sc.nextInt();
                }
                storage2 = storage2 + secondPlayerStone;
                System.out.println(firstName+" has "+storage1+" stones");
                System.out.println(secondName+" has "+storage2+" stones");
                numberOfStones = numberOfStones - secondPlayerStone;
            }

            }


        System.out.println("There are no stones left");
        if (storage2%2 == 0) {
            System.out.println(firstName + " wins");}
        else{
            System.out.println(secondName + " wins");}

        }
    }

