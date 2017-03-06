package csd.starter;

import java.io.PrintStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        StringBuilder inputText = new StringBuilder();
        String line = s.nextLine();
        inputText.append(line);
        boolean reserve = false;
        try {
            String[] split = inputText.toString().split("-");
            reserve = reserve(split[0], split[1]);
        } catch (Exception e) {
            throw new Exception("parse time error");
        }
        PrintStream ps = new PrintStream(System.out);
        ps.print(reserve);
    }

    public static boolean reserve(String startTime, String endTime) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHH");
        Date startDate = format.parse(startTime);
        Date endDate = format.parse(endTime);
        if (startDate.after(endDate)) {
            return false;
        }
        return true;
    }

}
