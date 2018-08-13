package com.jproger.odometr;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

import java.util.Random;

public class OdometerService extends Service {
    public OdometerService() {
    }

    private final IBinder binder = new OdometerBinder();
    private final Random random = new Random();

    @Override
    public IBinder onBind(Intent intent) {
        return binder;
    }

    public class OdometerBinder extends Binder {
        OdometerService getOdometer() {
            return OdometerService.this;
        }
    }

    public double getDistance() {
        return random.nextDouble();
    }
}
