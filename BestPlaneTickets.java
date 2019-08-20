import java.util.Scanner;

public class BestPlaneTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lowestMinsStay = Integer.MAX_VALUE;
        String bestTicketNumber = "";
        double bestTicketNoTransferPrice = Double.MAX_VALUE;

        String ticketNumber = scanner.nextLine();
        while (!ticketNumber.equals("End")) {
            double ticketPrice = Double.parseDouble(scanner.nextLine());
            int minutesStay = Integer.parseInt(scanner.nextLine());

            ticketPrice = ticketPrice * 1.96;
            if (minutesStay < lowestMinsStay) {
                bestTicketNoTransferPrice = ticketPrice;
                bestTicketNumber = ticketNumber;
                lowestMinsStay = minutesStay;
            }

            ticketNumber = scanner.nextLine();
        }

        System.out.printf("Ticket found for flight %s costs %.2f leva with %dh %dm stay",
                bestTicketNumber,
                bestTicketNoTransferPrice,
                lowestMinsStay / 60,
                lowestMinsStay % 60);
    }
}
