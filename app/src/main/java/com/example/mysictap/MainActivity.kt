@file:Suppress("DEPRECATION")

package com.example.mysictap

import android.media.AudioManager
import android.media.SoundPool
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity


 class MainActivity : AppCompatActivity() {


     // Helpful Constants
     private val NR_OF_SIMULTANEOUS_SOUNDS = 7
     private val LEFT_VOLUME = 1.0f
     private val RIGHT_VOLUME = 1.0f
     private val NO_LOOP = 0
//     private val PRIORITY = 0
     private val NORMAL_PLAY_RATE = 1.0f


     // Member Variables
     var mSoundPool: SoundPool? = null
     var mCSoundId = 0
     var mDSoundId = 0
     var mESoundId = 0
     var mFSoundId = 0
     var mGSoundId = 0
     var mASoundId = 0
     var mBSoundId = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        mSoundPool = SoundPool(NR_OF_SIMULTANEOUS_SOUNDS, AudioManager.STREAM_MUSIC, 0)


        // Get the resource IDs to identify the sounds and store them in variables
        mCSoundId = mSoundPool!!.load(getApplicationContext(), R.raw.note1_c, 1)
        mDSoundId = mSoundPool!!.load(getApplicationContext(), R.raw.note2_d, 1)
        mESoundId = mSoundPool!!.load(getApplicationContext(), R.raw.note3_e, 1)
        mFSoundId = mSoundPool!!.load(getApplicationContext(), R.raw.note4_f, 1)
        mGSoundId = mSoundPool!!.load(getApplicationContext(), R.raw.note5_g, 1)
        mASoundId = mSoundPool!!.load(getApplicationContext(), R.raw.note6_a, 1)
        mBSoundId = mSoundPool!!.load(getApplicationContext(), R.raw.note7_b, 1)
    }

     fun playC(view: View) {
         mSoundPool?.play(mCSoundId, LEFT_VOLUME, RIGHT_VOLUME, 0, NO_LOOP, NORMAL_PLAY_RATE)
     }
     fun playD(view: View) {
         mSoundPool?.play(mDSoundId, LEFT_VOLUME, RIGHT_VOLUME, 0, NO_LOOP, NORMAL_PLAY_RATE)

     }
     fun playE(view: View) {
         mSoundPool?.play(mESoundId, LEFT_VOLUME, RIGHT_VOLUME, 0, NO_LOOP, NORMAL_PLAY_RATE)

     }
     fun playF(view: View) {
         mSoundPool?.play(mFSoundId, LEFT_VOLUME, RIGHT_VOLUME, 0, NO_LOOP, NORMAL_PLAY_RATE)

     }
     fun playG(view: View) {
         mSoundPool?.play(mGSoundId, LEFT_VOLUME, RIGHT_VOLUME, 0, NO_LOOP, NORMAL_PLAY_RATE)

     }
     fun playA(view: View) {
         mSoundPool?.play(mASoundId, LEFT_VOLUME, RIGHT_VOLUME, 0, NO_LOOP, NORMAL_PLAY_RATE)

     }
     fun playB(view: View) {
         mSoundPool?.play(mASoundId, LEFT_VOLUME, RIGHT_VOLUME, 0, NO_LOOP, NORMAL_PLAY_RATE)

     }
 }
