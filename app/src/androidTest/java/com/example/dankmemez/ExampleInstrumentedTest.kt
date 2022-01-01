package com.example.dankmemez

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.example.dankmemez", appContext.packageName)
    }
}
google()  // Google's Maven repository
classpath 'com.google.gms:google-services:4.3.10'
google()  // Google's Maven repository
apply plugin: 'com.android.application'
apply plugin: 'com.google.gms.google-services'
implementation platform('com.google.firebase:firebase-bom:29.0.2')
implementation 'com.google.firebase:firebase-analytics'
