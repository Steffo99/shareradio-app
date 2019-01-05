package info.fermitech.shareradio

import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.content.ServiceConnection
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.IBinder
import android.util.Log

class ServerActivity : AppCompatActivity() {

    private val radioserviceconnection = object : ServiceConnection {
        override fun onServiceConnected(name: ComponentName?, service: IBinder?) {
            Log.d("STEFFO", "Connected to RadioService.")
        }

        override fun onServiceDisconnected(name: ComponentName?) {
            Log.d("STEFFO", "Disconnected from RadioService.")
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_server)
        val intent = Intent(this, RadioService::class.java)
        startService(intent)
        bindService(intent, radioserviceconnection, Context.BIND_IMPORTANT)
    }
}
