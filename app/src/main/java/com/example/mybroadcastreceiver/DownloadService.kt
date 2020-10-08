@file:Suppress("DEPRECATION")

package com.example.mybroadcastreceiver

import android.app.IntentService
import android.content.Intent
import android.util.Log

class DownloadService : IntentService("DownloadService") {

    companion object {
        val TAG: String = DownloadService::class.java.simpleName
    }

    override fun onHandleIntent(intent: Intent?) {
        Log.d(TAG, "Download Service Dijalankan")
        if (intent != null) {
            try {
                Thread.sleep(5000)
            } catch (e: InterruptedException) {
                e.printStackTrace()
            }

            val notifyFinishIntent = Intent(MainActivity.ACTION_DOWNLOAD_STATUS)
            sendBroadcast(notifyFinishIntent)

        }
    }

}
