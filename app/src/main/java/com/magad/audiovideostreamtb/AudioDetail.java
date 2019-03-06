package com.magad.audiovideostreamtb;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import java.io.IOException;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class AudioDetail extends AppCompatActivity {

    @BindView(R.id.btnstart)
    ImageButton btnstart;
    @BindView(R.id.btnstop)
    ImageButton btnstop;

    MediaPlayer player;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audio_detail);
        ButterKnife.bind(this);
    }

    private void setPlaying() {
        player = new MediaPlayer();
        try {
            player.setDataSource(getIntent().getStringExtra("link"));
        } catch (IOException e) {
            e.printStackTrace();
        }catch (IllegalStateException e){
            e.printStackTrace();
        }
        try {
            player.prepare();
        } catch (IOException e) {
            e.printStackTrace();
        }
        player.start();
    }

    @OnClick({R.id.btnstart, R.id.btnstop})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btnstart:
                setPlaying();
                try {
                    player.prepareAsync();
                }catch (IllegalStateException e){
                    e.printStackTrace();
                }
                player.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mp) {
                        mp.start();
                    }
                });
                break;
            case R.id.btnstop:
                player.stop();
                player.release();
                setPlaying();
                break;
        }
    }
}
