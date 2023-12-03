package com.cyber.myapplication;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.VpnService;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import com.cyber.myapplication.databinding.ActivityMainBinding;

import de.blinkt.openvpn.OpenVpnApi;
import de.blinkt.openvpn.core.OpenVPNService;
import de.blinkt.openvpn.core.OpenVPNThread;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "SampleVPN";
    private static final int REQUEST_VPN_PERMISSION = 10;

    private OpenVPNThread vpnThread = new OpenVPNThread();
    private OpenVPNService vpnService = new OpenVPNService();

    ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.btnConnect.setOnClickListener(v->{
            try {
                Intent prepareVpnIntent = VpnService.prepare(this);

                if (prepareVpnIntent != null) {
                    vpnPermissionLauncher.launch(prepareVpnIntent);
                } else {
                    // Permission already granted
                    // Perform your VPN-related operations here
                    startOrStopVpn();
                }
            } catch (Exception e){
                e.printStackTrace();
            }
        });

    }


    private ActivityResultLauncher<Intent> vpnPermissionLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), result -> {
        int resultCode = result.getResultCode();
        if (resultCode == Activity.RESULT_OK) {
            startOrStopVpn();

        } else if (resultCode == Activity.RESULT_CANCELED) {
            // User does not want us to start, so we just vanish

        }

    });



    private void startOrStopVpn(){
        try {
            OpenVpnApi.startVpn(getApplicationContext(), Constants.OVPN_CONFIG, "Some Country", null,null);
        }catch (Exception e){
            e.printStackTrace();
        }

    }



}