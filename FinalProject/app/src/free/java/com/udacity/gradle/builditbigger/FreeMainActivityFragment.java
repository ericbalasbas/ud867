package com.udacity.gradle.builditbigger;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

// TODO: Fix having 2 launchers installed, see https://discussions.udacity.com/t/2-apps-are-getting-installed/198280/3

/**
 * A placeholder fragment containing a simple view.
 */
public class FreeMainActivityFragment extends Fragment {

    public FreeMainActivityFragment() {
    }

    private InterstitialAd mInterstitialAd;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.free_fragment_main, container, false);

        return root;
    }

    @Override
    public void onResume() {
        super.onResume();

        View root = getView();

        AdView mAdView = (AdView) root.findViewById(R.id.adView);
        // Create an ad request. Check logcat output for the hashed device ID to
        // get test ads on a physical device. e.g.
        // "Use AdRequest.Builder.addTestDevice("ABCDEF012345") to get test ads on this device."
        AdRequest adRequest = new AdRequest.Builder()
                .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                .build();
        mAdView.loadAd(adRequest);

        mInterstitialAd = new InterstitialAd(getContext());
        mInterstitialAd.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());

        final Button button = (Button) root.findViewById(R.id.joke_button_id);

        // Show interstitial ad before joke
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();

                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }
        });

        // Show joke when ad is closed
        mInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                new EndpointsAsyncTask().execute(getContext());
            }

        });

    }
}


