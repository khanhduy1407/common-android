package com.nkduy.lib.commons.dialogs

import android.app.Activity
import androidx.appcompat.app.AlertDialog
import com.nkduy.lib.commons.R
import com.nkduy.lib.commons.extensions.launchUpgradeToProIntent
import com.nkduy.lib.commons.extensions.launchViewIntent
import com.nkduy.lib.commons.extensions.setupDialogStuff
import kotlinx.android.synthetic.main.dialog_upgrade_to_pro.view.*

class UpgradeToProDialog(val activity: Activity) {

    init {
        val view = activity.layoutInflater.inflate(R.layout.dialog_upgrade_to_pro, null).apply {
            upgrade_to_pro.text = activity.getString(R.string.upgrade_to_pro_long)
        }

        AlertDialog.Builder(activity)
            .setPositiveButton(R.string.upgrade) { dialog, which -> upgradeApp() }
            .setNegativeButton(R.string.cancel, null)
            .create().apply {
                activity.setupDialogStuff(view, this, cancelOnTouchOutside = false)
            }
    }

    private fun upgradeApp() {
        activity.launchUpgradeToProIntent()
    }
}
