package com.mfarssac.beacon.tag;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;

public class BeaconId {

    private Resources mResources;

    public BeaconId(Resources resources) {

        mResources = resources;

    }

    public int getBeaconId(String beacon) {

        TypedArray beacons = mResources.obtainTypedArray(R.array.beacons);

        for (int i = 0; i < beacons.length(); i++)
            if (beacon.equals(beacons.getString(i)))
                return i;

        return 0;
    }


    public String getProduct(int index) {

        TypedArray products = mResources.obtainTypedArray(R.array.products);

        if (index < products.length()) return products.getString(index);
        else return products.getString(0);

    }

    public String getBrand(int index) {

        TypedArray brands = mResources.obtainTypedArray(R.array.brands);

        if (index < brands.length()) return brands.getString(index);
        else return brands.getString(0);

    }

    public String getDeal(int index) {

        TypedArray deals = mResources.obtainTypedArray(R.array.deals);

        if (index < deals.length()) return deals.getString(index);
        else return deals.getString(0);

    }

    public Uri getUrl(int index) {

        TypedArray urls = mResources.obtainTypedArray(R.array.urls);

        if (index < urls.length()) return Uri.parse(urls.getString(index));
        else return Uri.parse(urls.getString(0));

    }

}
