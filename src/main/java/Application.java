import schema.PciSchema;
import schema.Schema;
import schema.SwitchSchema;

import java.io.BufferedReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cmdPercent = 0;
        int memPercent = 0;
        try {
            System.out.println("Enter percentage of commands without memory accessing: ");
            cmdPercent = scanner.nextInt();
            System.out.println("Enter percentage of commands from accessing their own memory: ");
            memPercent = scanner.nextInt();
        } catch (InputMismatchException e){
            System.out.println("Invalid data type");
            return;
        }

        Schema switchSchema = new SwitchSchema(cmdPercent, memPercent);
        Schema pciSchema = new PciSchema(cmdPercent, memPercent);

        //pciSchema.runSchema();
        switchSchema.runSchema();
    }
}
