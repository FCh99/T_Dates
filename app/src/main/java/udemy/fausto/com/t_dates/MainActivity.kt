package udemy.fausto.com.t_dates

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        calendarViewID.setOnDateChangeListener { view, year, month, dayOfMonth ->
            var myDay = dayOfMonth.toString()
            var myMonth = month.toString()
            var myYear = year.toString()

            var fullDate =  "$myDay/$myMonth/$myYear"
            Toast.makeText(this, fullDate, Toast.LENGTH_LONG).show()

        }

        buttonID.setOnClickListener {
            var today = System.currentTimeMillis()
            calendarViewID.setDate(today, false, true)

            var todayString = SimpleDateFormat("dd/MM/yyyy").format(Date(today)).toString()

            Toast.makeText(this, todayString, Toast.LENGTH_LONG).show()

        }

    }
}
