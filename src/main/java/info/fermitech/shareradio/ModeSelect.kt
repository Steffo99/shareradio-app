package info.fermitech.shareradio

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ModeSelect : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mode_select)
    }

    fun onClientPress(view: View) {
        val intent = Intent(this, Client::class.java)
        startActivity(intent)
    }

    fun onServerPress(view: View) {
        val intent = Intent(this, Server::class.java)
        startActivity(intent)
    }
}
