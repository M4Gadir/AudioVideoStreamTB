package com.magad.audiovideostreamtb;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

class Audiodapter extends RecyclerView.Adapter<Inisialisasi> {
    Context context;
    String[] audioNama ={"song1","song2","song3","song4","song5","song6","lagu7","lagu8","lagu9","lagu10","lagu11","lagu12"};
    String[] audioLink ={"http://live2.radiorodja.com/;stream.mp3",
            "https://translate.google.com/translate_tts?ie=UTF-8&client=tw-ob&q=What%20is%20that%3F%20it%27s%20a%20bicycle&tl=en&total=1&idx=0&textlen=28",
            "https://translate.google.com/translate_tts?ie=UTF-8&q=I%20LIKE%20HOT%20DOG&tl=ja&total=1&idx=0&textlen=14&tk=811612.717241&client=webapp&prev=input&ttsspeed=0.24",
            "https://translate.google.com/translate_tts?ie=UTF-8&q=%D9%83%D9%84%20%D9%85%D8%A7%20%D9%8A%D8%AD%D8%AF%D8%AB%20%D9%84%D9%8A%20%D9%87%D9%88%20%D8%AF%D8%A7%D8%A6%D9%85%D8%A7%20%D8%A8%D8%A7%D9%84%D9%86%D8%B3%D8%A8%D8%A9%20%D9%84%D9%83&tl=ar&total=1&idx=0&textlen=33&tk=702133.795984&client=webapp",
            "https://translate.google.com/translate_tts?ie=UTF-8&q=ARIGATO%20GOZAIMASU&tl=ja&total=1&idx=0&textlen=17&tk=989189.625632&client=webapp&prev=input",
            "https://translate.google.com/translate_tts?ie=UTF-8&q=WHAT%20ARE%20YOU%20DOING&tl=en&total=1&idx=0&textlen=18&tk=103795.460438&client=webapp&prev=input",
            "https://translate.google.com/translate_tts?ie=UTF-8&q=JUST%20DO%20IT!&tl=en&total=1&idx=0&textlen=11&tk=582568.946253&client=webapp&prev=input",
            "https://translate.google.com/translate_tts?ie=UTF-8&q=uh%20she%20up&tl=en&total=1&idx=0&textlen=9&tk=718695.812162&client=webapp&prev=input",
            "https://translate.google.com/translate_tts?ie=UTF-8&q=ana%20habib&tl=ar&total=1&idx=0&textlen=9&tk=67347.496886&client=webapp&prev=input",
            "https://translate.google.com/translate_tts?ie=UTF-8&q=%D9%85%D9%82%D8%A7%D8%AF%D9%8A%D8%B1&tl=ar&total=1&idx=0&textlen=6&tk=780184.881789&client=webapp&prev=input&ttsspeed=0.24",
            "https://translate.google.com/translate_tts?ie=UTF-8&q=apapun%20yang%20terjadi%20ku%20kan%20slalu%20ada%20untukmu&tl=id&total=1&idx=0&textlen=44&tk=127471.483850&client=webapp&prev=input",
            "https://translate.google.com/translate_tts?ie=UTF-8&q=kenapa%20aaaaaaaa&tl=id&total=1&idx=0&textlen=15&tk=625733.991136&client=webapp&prev=input",};
    int[] audioGambar ={R.drawable.ic_audiotrack_black_24dp,R.drawable.ic_audiotrack_black_24dp,R.drawable.ic_audiotrack_black_24dp,R.drawable.ic_audiotrack_black_24dp,R.drawable.ic_audiotrack_black_24dp,R.drawable.ic_audiotrack_black_24dp,R.drawable.ic_audiotrack_black_24dp,R.drawable.ic_audiotrack_black_24dp,R.drawable.ic_audiotrack_black_24dp,R.drawable.ic_audiotrack_black_24dp,R.drawable.ic_audiotrack_black_24dp,R.drawable.ic_audiotrack_black_24dp};

    public Audiodapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public Inisialisasi onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(context).inflate(R.layout.isireyclernya, null);
        return new Inisialisasi(v,context);
    }

    @Override
    public void onBindViewHolder(@NonNull Inisialisasi inisialisasi, final int i) {
    inisialisasi.tv.setText(audioNama[i]);
    inisialisasi.iv.setImageResource(audioGambar[i]);
    inisialisasi.itemView.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            context.startActivity(new Intent(context,AudioDetail.class).putExtra("link", audioLink[i]));
        }
    });
    }

    @Override
    public int getItemCount() {
        return audioNama.length;
    }
}
