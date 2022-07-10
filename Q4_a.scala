import scala.io.StdIn.readInt;

object Question {
    def HourlySalary(hours:Int): Int = hours*250;
    def OTSalary(hours:Int) : Int = hours * 85;
    def TotalSalary(normalHours:Int,otHours:Int):Int= HourlySalary(normalHours) + OTSalary (otHours);
    def Tax(TotalSalary:Int):Double =TotalSalary * 0.12;
    def TakeHomeSalary(Normalh:Int,OTh:Int):Double =
    TotalSalary(Normalh,OTh)-Tax(TotalSalary(Normalh,OTh))

    def main(args: Array[String]): Unit = {
        printf("No of normal Hours: ")
        var Normalh = readInt()
        printf("No of OT hours: ")
        var OTh = readInt ()
        println(TakeHomeSalary(Normalh, OTh))
    }
}