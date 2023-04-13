package sem2;
import java.util.logging.Logger;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class task6 {
    private static Scanner scan = new Scanner(System.in);
    private static final Logger logger = Logger.getLogger(task6.class.getName());
    public static void main(String[] args) {
        logger.info("program start");

        String myByteStr = scan.nextLine();
        Byte myByte = 0;
        try {
            Byte.parseByte(myByteStr);
        } catch (Exception e) {
            logger.warning(e.getMessage());
        }
        
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("byte.txt"));
            writer.write(myByte);
            logger.info("write OK!");
            writer.close();
        } catch (Exception e) {
            logger.warning(e.getMessage());
        }

        logger.info("program end");
    }
}
