package com.example.final_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private ImageView img_show;
    private Button bt_pre,bt_next,bt_view;
    private TextView tv_info;
    private RatingBar rb_rating;
    private ScrollView sv_info;
    private Integer[] Photo = {R.drawable.ice, R.drawable.violet, R.drawable.droll, R.drawable.blood, R.drawable.hello, R.drawable.back};

    private String[] str_instruction={"席捲全球票房的《冰雪奇緣》又回來了！續集《冰雪奇緣2》艾莎一夥人深入遙遠的神秘森林，展開冒險。",
                                "為了守護重要的事物，我把我的未來給賣了…",
                                "由《醉後大丈夫》導演陶德菲利浦斯擔任製片、編劇與導演。",
                                "小鎮每到萬聖節就會有神秘男子發動攻擊，殺戮無辜民眾，警探佈線蒐索，暗中追緝連續殺人魔，卻不料掉入兇猛殺人魔陷阱中…",
                                "本片以2027年的京都為舞臺，描述一名高中生直實的面前，突然出現一位自稱是來自10年後的自己的青年…",
                                "1962年寂寥而肅殺的時代，翠華中學高三生方芮欣 在鬼魅橫行的異域，他們被迫面對可怖的真相…"};
    int photo=0;
    private Integer[] star={3,3,5,4,4,6};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img_show=findViewById(R.id.img_show);
        bt_pre=findViewById(R.id.bt_pre);
        bt_next=findViewById(R.id.bt_next);
        bt_view=findViewById(R.id.bt_view);
        tv_info=findViewById(R.id.tv_info);
        sv_info=findViewById(R.id.sv_info);
        rb_rating=findViewById(R.id.rb_rating);
        rb_rating.setNumStars(6);
        if(photo==0){
            tv_info.setText("席捲全球票房的《冰雪奇緣》又回來了！續集《冰雪奇緣2》艾莎一夥人深入遙遠的神秘森林，展開冒險。");
            rb_rating.setRating(3);
            rb_rating.setEnabled(false);
        }
        bt_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(photo >= 5){
                    photo = 0;
                }else {
                    photo += 1;
                }
                tv_info.setText("");
                tv_info.setText(str_instruction[photo]);
                rb_rating.setRating(star[photo]);
                rb_rating.setEnabled(false);
                img_show.setImageResource(Photo[photo]);
            }
        });
        bt_pre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(photo <= 0){
                    photo = 5;
                }else {
                    photo -= 1;
                }
                tv_info.setText("");
                tv_info.setText(str_instruction[photo]);
                rb_rating.setRating(star[photo]);
                rb_rating.setEnabled(false);
                img_show.setImageResource(Photo[photo]);
            }
        });
        bt_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
               intent.setClass(MainActivity.this,information.class);
               Bundle bundle =new Bundle();
               startActivity(intent);

            }
        });
    }
}
