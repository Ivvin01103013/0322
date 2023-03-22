package tw.edu.pu.gm.o1103013

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var txv : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txv = findViewById(R.id.txv)
        txv.text = "Brook"
        txv.setOnClickListener({
            if (txv.text == "yohohoho"){
                txv.text = "Golden Panties"
            }else{
                txv.text = "yohohoho"
            }
        })
    }
}