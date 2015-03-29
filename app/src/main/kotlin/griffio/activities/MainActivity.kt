package griffio.activities

import android.os.Bundle
import android.support.v7.app.ActionBarActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.EditText
import android.widget.TextView
import griffio.application.R
import butterknife.bindView

open class MainActivity : ActionBarActivity() {

    val title : TextView by bindView(R.id.title)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title.setText("Efficiently unleash cross-media information without cross-media value. Quickly maximize timely deliverables for real-time schemas. Dramatically maintain clicks-and-mortar solutions without functional solutions.")
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        getMenuInflater()?.inflate(R.menu.menu_main, menu)
        return true
    }

}