package nickgao.com.viewpagerswitchexample;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.ProgressBar;

import java.util.ArrayList;
import java.util.List;

import nickgao.com.viewpagerswitchexample.view.WaveHelper;
import nickgao.com.viewpagerswitchexample.view.WaveView;

public class WaveActivity extends AppCompatActivity {

    private ViewPager mViewPager;
    private List<QuestionInfo> mHistoryList = new ArrayList<>();
    private WaveView mRateWave;
    private ProgressBar mLoadingProgress;
    private WaveHelper mWaveHelper;

    public static void startActivity(Context context) {
        Intent intent = new Intent();
        intent.setClass(context,WaveActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WaveView mRateWave = (WaveView)findViewById(R.id.wave_view);

        mRateWave.setWaveColor(getResources().getColor(R.color.color_9ff0f0), getResources().getColor(R.color.color_5ad3d3));
        mRateWave.setBorder(DensityUtil.dp2px(this, 2), getResources().getColor(R.color.color_9ff0f0));
        mWaveHelper = new WaveHelper(mRateWave);

        mRateWave.setShowWave(true);
        mRateWave.setWaveLengthRatio(1f);
        mWaveHelper.start(0.7f);
    }



}
