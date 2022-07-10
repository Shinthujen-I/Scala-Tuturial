import scala.io.StdIn.readInt;

object Question {

    def NoOfAttendees (TicketPrice : Int): Int = 120 + (15 - TicketPrice)  / 5 * 20;
    def Revenue (TicketPrice: Int) : Int = NoOfAttendees(TicketPrice) * TicketPrice;
    def TotalCost (TicketPrice: Int) : Int = 500 + 3 * NoOfAttendees(TicketPrice) ;
    def Profit (TicketPrice: Int) : Int = Revenue(TicketPrice) - TotalCost(TicketPrice);


    def main(args: Array[String]): Unit = {
        printf("Enter the Ticket Price: ");
        var TicketPrice = readInt();
        println(Profit(TicketPrice));

        printf("%d %d %d",Profit(10),Profit(15),Profit(20));
    }
}