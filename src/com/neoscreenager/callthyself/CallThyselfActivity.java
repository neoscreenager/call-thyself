package com.neoscreenager.callthyself;

import java.net.URI;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.TelephonyManager;

public class CallThyselfActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TelephonyManager telephonyManager =((TelephonyManager) this.getSystemService(this.TELEPHONY_SERVICE));
        String operatorName = telephonyManager.getNetworkOperatorName();
        String simOperatorName = telephonyManager.getSimOperatorName();
        
        //System.out.println("network operator name :"+)
        String callToSelf = "*140*1600"+Uri.encode("#");
        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel:" + callToSelf));
        //startActivity(intent);
        //finish();
        //setContentView(R.layout.main);
    }
}