package id.co.wemppywp.mycustomtoast

import android.content.Context
import android.widget.Toast

object MyToast {

    fun show(context: Context){
        Toast.makeText(context, "warning", Toast.LENGTH_LONG).show()
    }
}