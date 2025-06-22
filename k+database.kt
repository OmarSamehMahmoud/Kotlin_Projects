import java.sql.DriverManager
import java.sql.ResultSet
import java.sql.SQLException

object Test {

    @JvmStatic
    fun connection(){
        try {
            val c = DriverManager.getConnection(
                    "jdbc:mysql://localhost/student?serverTimezone=UTC",
                    "hassan",
                    "hassan12345"
            )
            println("OK !")
            val s = c.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE)
            val r = s.executeQuery("SELECT `id`, `firstName`, `lastName`, `city` FROM `info`")
            val rm = r.metaData

            //r.next() r.previous() r.absolute(4) r.relative(-1)
            //r.first() r.beforeFirst() r.last() r.afterLast()
            //r.isFirst r.isBeforeFirst r.isLast r.isAfterLast

            //if (r.isBeforeFirst) {r.next()}
            //if (r.isAfterLast) {r.previous()}

            for (i in 1..4){
                print(String.format("%-15s", rm.getColumnName(i)))
            }
            print("\n")

            for (i in 1..4){
                print(String.format(
                        "%-15s", rm.getColumnTypeName(i)+" "+rm.getColumnType(i)
                ))
            }
            print("\n")
            
            /*
            r.moveToInsertRow()
            r.updateInt("id", 90)
            r.updateString("firstName", "Ali")
            r.updateString("lastName", "Ali")
            r.updateString("city", "Basra")
            r.insertRow()
            */

            var i=0
            while (r.next()){
                i=r.row   //i++

                /*
                if (r.row==3){
                    r.updateInt("id", 15)
                    r.updateString("firstName", "Hameed")
                    r.updateString("lastName", "Zaid")
                    r.updateRow()
                }
                */

                if (r.row==6){
                    r.deleteRow()
                    continue
                }

                println(String.format(
                    "%-15s%-15s%-15s%-15s",
                    //r.row.toString()
                    r.getString("id"),
                    r.getString("firstName"),
                    r.getString("lastName"),
                    r.getString("city")
                ))
            }
            println("Number of Rows = $i")
            println("Number of Columns = ${rm.columnCount}")
        }
        catch (e: SQLException){
            e.printStackTrace()
        }
    }
}