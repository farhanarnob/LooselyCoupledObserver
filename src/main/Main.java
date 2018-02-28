package main;

import want_to_observe.DisplayDataOne;
import want_to_observe.DisplayDataThree;
import want_to_observe.DisplayDataTwo;
import want_to_provide_data.DataProvider;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DisplayDataOne displayDataOne = new DisplayDataOne();
        DisplayDataTwo displayDataTwo = new DisplayDataTwo();
        DisplayDataThree displayDataThree = new DisplayDataThree();
        DataProvider dataProvider = new DataProvider();
        boolean continuing = true;
        while (continuing) {

            Scanner reader = new Scanner(System.in);  // Reading from System.in
            System.out.print("Inter 1 number to add observer to display one");
            System.out.print(", 2 for display two");
            System.out.println(", 3 for display two");
            System.out.print("Inter 4 number to remove observer to display one");
            System.out.print(", 5 for display two");
            System.out.println(", 6 for display three");
            System.out.print("inter 7 to show observed display's data");
            System.out.println(", 8 to update data");
            System.out.println("Other character to quit");
            System.out.print("Enter number: ");
            try {
                int n = reader.nextInt(); // Scans the next token of the input as an int.
                switch (n) {
                    case 1: {
                        dataProvider.addObserver(displayDataOne);
                        break;
                    }
                    case 2: {
                        dataProvider.addObserver(displayDataTwo);
                        break;
                    }
                    case 3: {
                        dataProvider.addObserver(displayDataThree);
                        break;
                    }
                    case 4: {
                        dataProvider.deleteObserver(displayDataOne);
                        break;
                    }
                    case 5: {
                        dataProvider.deleteObserver(displayDataTwo);
                        break;
                    }
                    case 6: {
                        dataProvider.deleteObserver(displayDataThree);
                        break;
                    }
                    case 7: {
                        dataProvider.dataModelChanged();
                        break;
                    }
                    case 8: {

                        System.out.print("input power name: ");
                        Scanner stringReader = new Scanner(System.in);
                        String powerName = stringReader.nextLine();

                        System.out.print("input power value: ");
                        Scanner readers = new Scanner(System.in);
                        int power = readers.nextInt();

                        dataProvider.getDataModel().setPower(power).setPowerName(powerName);
                        dataProvider.dataModelChanged();
                        break;
                    }
                    default: {
                        continuing = false;
                    }
                }
            } catch (Exception e) {
                continuing = false;
            }
        }
    }
}
