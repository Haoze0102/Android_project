package com.example.final_project;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.VideoView;

public class information extends AppCompatActivity {
    private ScrollView sv_base;
    private TextView tv_name,tv_grader,tv_timer,tv_date,tv_dire,tv_acto,tv_publ,tv_cont;
    private VideoView vv_movie;
    private ImageView img_show;
    private String[] name={"冰雪奇緣2","紫羅蘭永恆花園外傳–永遠與自動手記人偶","小丑","血腥萬聖節","HELLO WORLD","返校"};
    private String[] grader={"普遍級","普遍級","輔導級","限制級","保護級","輔導級"};
    private String[] date={"2019/11/21","2019/11/1","2019/10/03","2019/11/15","2019/11/15","2019/09/20"};
    private String[] time={"103分鐘","91分鐘","124分鐘","99分鐘","98分鐘","103分鐘"};
    private String[] director={"Chris Buck","藤田春香","扥德菲利普","派屈克路西爾","伊藤智彥","徐漢強"};
    private String[] actor={"Kristen Bell","石川由依","勞勃狄尼洛","歐瑪艾普","濱邊美波","王淨"};
    private String[] publish={"華特迪士尼","京都動畫","海樂影業","DC影業","Graphinica"," 影一製作所股份有限公司"};
    private String[] content={"席捲全球票房的《冰雪奇緣》又回來了！續集《冰雪奇緣2》艾莎一夥人深入遙遠的神秘森林，展開冒險。",
            "為了守護重要的事物，我把我的未來給賣了…",
            "由《醉後大丈夫》導演陶德菲利浦斯擔任製片、編劇與導演。",
            "小鎮每到萬聖節就會有神秘男子發動攻擊，殺戮無辜民眾，警探佈線蒐索，暗中追緝連續殺人魔，卻不料掉入兇猛殺人魔陷阱中…",
            "本片以2027年的京都為舞臺，描述一名高中生直實的面前，突然出現一位自稱是來自10年後的自己的青年…",
            "1962年寂寥而肅殺的時代，翠華中學高三生方芮欣 在鬼魅橫行的異域，他們被迫面對可怖的真相…"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);

        sv_base=findViewById(R.id.sv_base);
        tv_name=findViewById(R.id.tv_name);
        tv_grader=findViewById(R.id.tv_grader);
        tv_timer=findViewById(R.id.tv_timer);
        tv_date=findViewById(R.id.tv_date);
        tv_dire=findViewById(R.id.tv_dire);
        tv_acto=findViewById(R.id.tv_acto);
        tv_publ=findViewById(R.id.tv_publ);
        tv_cont=findViewById(R.id.tv_cont);
        vv_movie=findViewById(R.id.vv_movie);
        img_show=findViewById(R.id.img_show);


    }
}
