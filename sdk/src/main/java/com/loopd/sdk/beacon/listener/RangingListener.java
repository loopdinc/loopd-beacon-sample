package com.loopd.sdk.beacon.listener;

import com.loopd.sdk.beacon.model.Beacon;

public interface RangingListener {

    void onBeaconDiscoverd(Beacon beacon);
}
