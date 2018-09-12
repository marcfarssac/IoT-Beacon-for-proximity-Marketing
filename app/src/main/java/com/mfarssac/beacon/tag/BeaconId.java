package com.mfarssac.beacon.tag;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;

public class BeaconId {

    private TypedArray beacons, products, brands, deals, urls;

    public BeaconId(Resources resources) {

        beacons = resources.obtainTypedArray(R.array.beacons);
        products = resources.obtainTypedArray(R.array.products);
        brands = resources.obtainTypedArray(R.array.brands);
        deals = resources.obtainTypedArray(R.array.deals);
        urls = resources.obtainTypedArray(R.array.urls);

    }

    public int getBeaconId(String beacon) {

        for (int i = 0; i < beacons.length(); i++)
            if (beacon.equals(beacons.getString(i)))
                return i;

        return 0;
    }


    public String getProduct(int index) {

        if (index < products.length()) return products.getString(index);
        else return products.getString(0);

    }

    public String getBrand(int index) {

        if (index < brands.length()) return brands.getString(index);
        else return brands.getString(0);

    }

    public String getDeal(int index) {

        if (index < deals.length()) return deals.getString(index);
        else return deals.getString(0);

    }

    public Uri getUrl(int index) {

        if (index < urls.length()) return Uri.parse(urls.getString(index));
        else return Uri.parse(urls.getString(0));

    }

}
