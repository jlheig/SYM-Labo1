package ch.heigvd.iict.sym.labo1.utils;

import android.content.Context;
import android.widget.Toast;

import ch.heigvd.iict.sym.labo1.R;

public class Utils {
    public static boolean checkEmailFormat(String email){
        return email.contains("@");
    }
    public static void sendEmailError(Context applicationContext) {
        String errorMessage = applicationContext.getString(R.string.email_format_error);
        Integer duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(applicationContext, errorMessage, duration);
        toast.show();
    }
}
