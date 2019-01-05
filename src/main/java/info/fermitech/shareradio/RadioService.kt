package info.fermitech.shareradio

import android.app.Service
import android.content.Intent
import android.os.Binder
import android.os.IBinder
import android.util.Log

class RadioService : Service() {

    inner class RadioBinder : Binder() {
        fun getService() : RadioService {
            return this@RadioService
        }
    }

    override fun onBind(intent: Intent?): IBinder? {
        Log.d("STEFFO", "RadioService bound.")
        return RadioBinder()
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Log.d("STEFFO", "RadioService started.")
        return super.onStartCommand(intent, flags, startId)
    }
}
