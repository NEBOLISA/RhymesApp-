package com.hfad.rhymes;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.text.method.ScrollingMovementMethod;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.MediaController.MediaPlayerControl;
import android.widget.SeekBar;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.concurrent.TimeUnit;

public class RhymesActivity extends AppCompatActivity implements View.OnClickListener {
    private MediaPlayer player;
    private ImageButton button;
    private TextView songText,tv3,tv4;
    private int id;
    private int i = 0;
    private String[] Title;
    private int[] SongId;
    private int resumePosition;
    private SeekBar seekBar;
    private double startTime =0;
    private double finalTime =0;
    private Handler myHandler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rhymes);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        button = (ImageButton) findViewById(R.id.sing);
        button.setOnClickListener(this);
        TextView tv = (TextView) findViewById(R.id.textView);
        TextView tv1 = (TextView) findViewById(R.id.textView7);
        tv3 =(TextView)findViewById(R.id.textView3);
        tv4 =(TextView)findViewById(R.id.textView4);
        seekBar =(SeekBar)findViewById(R.id.seekBar);
        seekBar.setClickable(false);
        Intent intent = getIntent();
         id = intent.getIntExtra("position", 0);
        String[] Text = new String[RhymeClass.rhymes.length];
        for (int i = 0; i < RhymeClass.rhymes.length; i++) {
            Text[i] = RhymeClass.rhymes[i].getText();
        }
        Title = new String[RhymeClass.rhymes.length];
        for (int i = 0; i < RhymeClass.rhymes.length; i++) {
            Title[i] = RhymeClass.rhymes[i].getTitle();
        }
        tv1.setText(Title[id]);
        tv.setText(Text[id]);
        tv.setMovementMethod(new ScrollingMovementMethod());
        songText = (TextView)findViewById(R.id.songText);
        songText.setText(id + "." + Title[id]);
        SongId = new int[RhymeClass.rhymes.length];
        for(int a = 0; a<RhymeClass.rhymes.length; a++) {
            SongId[a] = RhymeClass.rhymes[a].getSongId();
        }

    }

    @Override
    public void onClick(View v) {

if(i == 0){

    Drawable drawable = ContextCompat.getDrawable(RhymesActivity.this, android.R.drawable.ic_media_pause);
    button.setImageDrawable(drawable);

    player.start();
    finalTime=player.getDuration();
    startTime=player.getCurrentPosition();
        seekBar.setMax((int)finalTime);
    tv4.setText(String.format("%d:%2d", TimeUnit.MILLISECONDS.toMinutes((long)finalTime),
            TimeUnit.MILLISECONDS.toSeconds((long) finalTime) -
                    TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes((long)finalTime))));
    tv3.setText(String.format("%d:%2d", TimeUnit.MILLISECONDS.toMinutes((long)startTime),
            TimeUnit.MILLISECONDS.toSeconds((long) startTime) -
                    TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes((long)startTime))));
    seekBar.setProgress((int)startTime);
    myHandler.postDelayed(UpdateSongTime,100);
    i++;
}
else if (i == 1){
    if(player.isPlaying()){
    Drawable drawable = ContextCompat.getDrawable(RhymesActivity.this, android.R.drawable.ic_media_play);
    button.setImageDrawable(drawable);
    player.pause();
    resumePosition=player.getCurrentPosition();
    i=1;
    }
    else if(!player.isPlaying()){
        Drawable drawable = ContextCompat.getDrawable(RhymesActivity.this, android.R.drawable.ic_media_pause);
        button.setImageDrawable(drawable);
        player.seekTo(resumePosition);
        player.start();
i=1;

    }

}
player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
    @Override
    public void onCompletion(MediaPlayer mp) {
seekBar.setProgress(0);
overridePendingTransition(0,0);
recreate();
overridePendingTransition(0,0);
    }
});
    }



private Runnable UpdateSongTime = new Runnable() {
    @Override
    public void run() {
        startTime = player.getCurrentPosition();
        tv3.setText(String.format("%d:%02d", TimeUnit.MILLISECONDS.toMinutes((long)startTime),
                TimeUnit.MILLISECONDS.toSeconds((long) startTime) -
                        TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes((long)startTime))));
        seekBar.setProgress((int)startTime);
        myHandler.postDelayed(this,100);

    }
};
    @Override
protected void onStop(){
        super.onStop();
        player.stop();
    }
}