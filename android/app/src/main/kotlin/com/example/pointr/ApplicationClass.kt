package com.example.pointr

import android.app.Application
import com.pointrlabs.core.management.Pointr
import com.pointrlabs.core.management.models.LicenseKeyMap
import com.pointrlabs.core.management.models.PointrEnvironment
import com.pointrlabs.core.nativecore.wrappers.Plog
import java.util.*

class ApplicationClass : Application() {
    override fun onCreate() {
        super.onCreate()
        val licenseKeys: MutableMap<PointrEnvironment, String> =
            EnumMap(PointrEnvironment::class.java)
        licenseKeys[PointrEnvironment.PROD] = "b6d85c06-0cfe-4057-bcdf-ce23581f30ad"
//                readLicenseKey("", "b6d85c06-0cfe-4057-bcdf-ce23581f30ad")

        val licenseKeyMap = LicenseKeyMap(licenseKeys)
        Pointr.with(
            applicationContext,
            licenseKeyMap,
            PointrEnvironment.PROD,
            Plog.LogLevel.VERBOSE
        )

    }
}