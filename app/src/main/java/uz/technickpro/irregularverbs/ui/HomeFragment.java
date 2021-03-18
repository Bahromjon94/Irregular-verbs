package uz.technickpro.irregularverbs.ui;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import uz.technickpro.irregularverbs.FullInfoActivity;
import uz.technickpro.irregularverbs.R;
import uz.technickpro.irregularverbs.Verb;
import uz.technickpro.irregularverbs.adapter.VerbRecyclerAdapter;

public class HomeFragment extends Fragment {


    private static final String TAG = "HomeFragment";

    private RecyclerView rView;

    private VerbRecyclerAdapter rAdapter;
    private List<Verb> verbs;
    private Context context;
    private VerbRecyclerAdapter.OnClickListener listener;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_home, container, false);

        rView = root.findViewById(R.id.rView);

        rView.setHasFixedSize(true);
        verbs = new ArrayList<>();

        listener = new VerbRecyclerAdapter.OnClickListener() {
            @Override
            public void onItemClick(Verb verb) {

                Intent intent = new Intent(context, FullInfoActivity.class);
                intent.putExtra("word", verb.getWord());
                intent.putExtra("v1", verb.getV1());
                intent.putExtra("v2", verb.getV2());
                intent.putExtra("v3", verb.getV3());

                startActivity(intent);
                Toast.makeText(context, "Clicked", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFavClick(Verb verb) {

                Toast.makeText(context, "Added", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onDelClick(Verb verb) {

                Toast.makeText(context, "Deleted", Toast.LENGTH_SHORT).show();

            }
        };

        GridLayoutManager layoutManager = new GridLayoutManager(context, 2);
        layoutManager.setOrientation(RecyclerView.VERTICAL);

        rView.setLayoutManager(layoutManager);
        rAdapter = new VerbRecyclerAdapter(context, verbs, listener);
        rView.setAdapter(rAdapter);

        verbList();

        return root;
    }


    public void verbList() {

        verbs.add(new Verb(getResources().getString(R.string.abide), "abide", "abode ", "abode"));
        verbs.add(new Verb(getResources().getString(R.string.arise), "arise", "arose ", "arisen"));
        verbs.add(new Verb(getResources().getString(R.string.awake), "awake", "awoke ", "awoken"));
        verbs.add(new Verb(getResources().getString(R.string.be), "be", "was / were", "been"));
        verbs.add(new Verb(getResources().getString(R.string.bear), "bear", "bore ", "borne/born"));
        verbs.add(new Verb(getResources().getString(R.string.beat), "beat", "beat ", "beaten"));
        verbs.add(new Verb(getResources().getString(R.string.become), "become", "became ", "become"));
        verbs.add(new Verb(getResources().getString(R.string.beget), "beget", "begot ", "begotten"));
        verbs.add(new Verb(getResources().getString(R.string.begin), "begin", "began ", "begun"));
        verbs.add(new Verb(getResources().getString(R.string.bend), "bend", "bent ", "bent"));
        verbs.add(new Verb(getResources().getString(R.string.bet), "bet", "bet ", "bet"));
        verbs.add(new Verb(getResources().getString(R.string.bite), "bite", "bit ", "bitten"));
        verbs.add(new Verb(getResources().getString(R.string.bleed), "bleed", "bled ", "bled"));
        verbs.add(new Verb(getResources().getString(R.string.blow), "blow", "blew ", "blown"));
        verbs.add(new Verb(getResources().getString(R.string.break_), "break", "broke ", "broken"));
        verbs.add(new Verb(getResources().getString(R.string.bring), "bring", "brought ", "brought"));
        verbs.add(new Verb(getResources().getString(R.string.broadcast), "broadcast", "broadcast ", "broadcast"));
        verbs.add(new Verb(getResources().getString(R.string.build), "build", "built ", "built"));
        verbs.add(new Verb(getResources().getString(R.string.burn), "burn", "burnt / burned ", "burnt / burned"));
        verbs.add(new Verb(getResources().getString(R.string.burst), "burst", "burst ", "burst"));
        verbs.add(new Verb(getResources().getString(R.string.buy), "buy", "bought ", "bought"));
        verbs.add(new Verb(getResources().getString(R.string.can), "can", "could ", "could"));
        verbs.add(new Verb(getResources().getString(R.string.cast), "cast", "cast ", "cast"));
        verbs.add(new Verb(getResources().getString(R.string.catch_), "catch", "caught", "caught"));
        verbs.add(new Verb(getResources().getString(R.string.choose), "choose", "chose ", "chosen"));
        verbs.add(new Verb(getResources().getString(R.string.cling), "cling", "clung ", "clung"));
        verbs.add(new Verb(getResources().getString(R.string.clothe), "clothe", "clad / clothed ", "clad / clothed"));
        verbs.add(new Verb(getResources().getString(R.string.come), "come", "came ", "come"));
        verbs.add(new Verb(getResources().getString(R.string.cost), "cost", "cost ", "cost"));
        verbs.add(new Verb(getResources().getString(R.string.creep), "creep", "crept ", "crept"));
        verbs.add(new Verb(getResources().getString(R.string.cut), "cut", "cut ", "cut"));
        verbs.add(new Verb(getResources().getString(R.string.deal), "deal", "dealt ", "dealt"));
        verbs.add(new Verb(getResources().getString(R.string.dig), "dig", "dug ", "dug"));
        verbs.add(new Verb(getResources().getString(R.string.dive), "dive", "dived ", "dived / dove"));
        verbs.add(new Verb(getResources().getString(R.string.dwell), "dwell", "dwelt ", "dwelt"));
        verbs.add(new Verb(getResources().getString(R.string.eat), "eat", "ate ", "eaten"));
        verbs.add(new Verb(getResources().getString(R.string.fall), "fall", "fell ", "fallen"));
        verbs.add(new Verb(getResources().getString(R.string.feed), "feed", "fed ", "fed"));
        verbs.add(new Verb(getResources().getString(R.string.feel), "feel", "felt ", "felt"));
        verbs.add(new Verb(getResources().getString(R.string.fight), "fight", "fought ", "fought"));
        verbs.add(new Verb(getResources().getString(R.string.find), "find", "found ", "found"));
        verbs.add(new Verb(getResources().getString(R.string.flee), "flee", "fled ", "fled"));
        verbs.add(new Verb(getResources().getString(R.string.fling), "fling", "flung ", "flung"));
        verbs.add(new Verb(getResources().getString(R.string.fly), "fly", "flew ", "flown"));
        verbs.add(new Verb(getResources().getString(R.string.forbid), "forbid", "forbade ", "forbidden"));
        verbs.add(new Verb(getResources().getString(R.string.forecast), "forecast", "forecast ", "forecast"));
        verbs.add(new Verb(getResources().getString(R.string.foresee), "foresee", "foresaw ", "foreseen"));
        verbs.add(new Verb(getResources().getString(R.string.forget), "forget", "forgot ", "forgotten"));
        verbs.add(new Verb(getResources().getString(R.string.forgive), "forgive", "forgave ", "forgiven"));
        verbs.add(new Verb(getResources().getString(R.string.forsake), "forsake", "forsook ", "forsaken"));
        verbs.add(new Verb(getResources().getString(R.string.freeze), "freeze", "froze ", "frozen"));
        verbs.add(new Verb(getResources().getString(R.string.get), "get", "got ", "gotten / got"));
        verbs.add(new Verb(getResources().getString(R.string.give), "give", "gave ", "given"));
        verbs.add(new Verb(getResources().getString(R.string.go), "go", "went ", "gone"));
        verbs.add(new Verb(getResources().getString(R.string.grind), "grind", "ground ", "ground"));
        verbs.add(new Verb(getResources().getString(R.string.grow), "grow", "grew ", "grown"));
        verbs.add(new Verb(getResources().getString(R.string.hang), "hang", "hung ", "hung"));
        verbs.add(new Verb(getResources().getString(R.string.have), "have", "had ", "had"));
        verbs.add(new Verb(getResources().getString(R.string.hear), "hear", "heard ", "heard"));
        verbs.add(new Verb(getResources().getString(R.string.hide), "hide", "hid ", "hidden"));
        verbs.add(new Verb(getResources().getString(R.string.hit), "hit", "hit ", "hit"));
        verbs.add(new Verb(getResources().getString(R.string.hold), "hold", "held ", "held"));
        verbs.add(new Verb(getResources().getString(R.string.hurt), "hurt", "hurt ", "hurt"));
        verbs.add(new Verb(getResources().getString(R.string.keep), "keep", "kept ", "kept"));
        verbs.add(new Verb(getResources().getString(R.string.keep), "keep", "kept ", "kept"));
        verbs.add(new Verb(getResources().getString(R.string.kneel), "kneel", "knelt / knelled ", "knelt / knelled"));
        verbs.add(new Verb(getResources().getString(R.string.know), "know", "knew ", "known"));
        verbs.add(new Verb(getResources().getString(R.string.lay), "lay", "laid ", "laid"));
        verbs.add(new Verb(getResources().getString(R.string.lead), "lead", "led ", "led"));
        verbs.add(new Verb(getResources().getString(R.string.lean), "lean", "leant / leaned ", "leant / leaned"));
        verbs.add(new Verb(getResources().getString(R.string.leap), "leap", "leapt / leaped ", "leapt / leaped"));
        verbs.add(new Verb(getResources().getString(R.string.learn), "learn", "learnt ", "learnt"));
        verbs.add(new Verb(getResources().getString(R.string.leave), "leave", "left ", "left"));
        verbs.add(new Verb(getResources().getString(R.string.lend), "lend", "lent ", "lent"));
        verbs.add(new Verb(getResources().getString(R.string.let), "let", "let ", "let"));
        verbs.add(new Verb(getResources().getString(R.string.lie), "lie", "lay ", "lain"));
        verbs.add(new Verb(getResources().getString(R.string.light), "light", "lit / lighted ", "lit / lighted"));
        verbs.add(new Verb(getResources().getString(R.string.lose), "lose", "lost ", "lost"));
        verbs.add(new Verb(getResources().getString(R.string.make), "make", "made ", "made"));
        verbs.add(new Verb(getResources().getString(R.string.mean), "mean", "meant ", "meant"));
        verbs.add(new Verb(getResources().getString(R.string.meet), "meet", "met ", "met"));
        verbs.add(new Verb(getResources().getString(R.string.mow), "mow", "mowed ", "mowed"));
        verbs.add(new Verb(getResources().getString(R.string.offset), "offset", "offset ", "offset"));
        verbs.add(new Verb(getResources().getString(R.string.overcome), "overcome", "overcame ", "overcome"));
        verbs.add(new Verb(getResources().getString(R.string.partake), "partake", "partook ", "partaken"));
        verbs.add(new Verb(getResources().getString(R.string.pay), "pay", "paid ", "paid"));
        verbs.add(new Verb(getResources().getString(R.string.plead), "plead", "pleaded ", "pleaded"));
        verbs.add(new Verb(getResources().getString(R.string.preset), "preset", "preset ", "preset"));
        verbs.add(new Verb(getResources().getString(R.string.prove), "prove", "proved ", "proved"));
        verbs.add(new Verb(getResources().getString(R.string.put), "put", "put ", "put"));
        verbs.add(new Verb(getResources().getString(R.string.quit), "quit", "quit ", "quit"));
        verbs.add(new Verb(getResources().getString(R.string.read), "read", "read ", "read"));
        verbs.add(new Verb(getResources().getString(R.string.relay), "relay", "relaid ", "relaid"));
        verbs.add(new Verb(getResources().getString(R.string.rend), "rend", "rent ", "rent"));
        verbs.add(new Verb(getResources().getString(R.string.rid), "rid", "rid ", "rid"));
        verbs.add(new Verb(getResources().getString(R.string.ring), "ring", "rang ", "rung"));
        verbs.add(new Verb(getResources().getString(R.string.rise), "rise", "rose ", "risen"));
        verbs.add(new Verb(getResources().getString(R.string.run), "run", "run ", "run"));
        verbs.add(new Verb(getResources().getString(R.string.saw), "saw", "sawed ", "sawed"));
        verbs.add(new Verb(getResources().getString(R.string.say), "say", "said ", "said"));
        verbs.add(new Verb(getResources().getString(R.string.see), "see", "saw ", "seen"));
        verbs.add(new Verb(getResources().getString(R.string.seek), "seek", "sought", "sought"));
        verbs.add(new Verb(getResources().getString(R.string.sell), "sell", "sold", "sold"));
        verbs.add(new Verb(getResources().getString(R.string.send), "send", "sent", "sent"));
        verbs.add(new Verb(getResources().getString(R.string.set), "set", "set", "set"));
        verbs.add(new Verb(getResources().getString(R.string.shake), "shake", "shook", "shaken"));
        verbs.add(new Verb(getResources().getString(R.string.shed), "shed", "shed", "shed"));
        verbs.add(new Verb(getResources().getString(R.string.shine), "shine", "shone", "shone"));
        verbs.add(new Verb(getResources().getString(R.string.shoe), "shoe", "shod", "shod"));
        verbs.add(new Verb(getResources().getString(R.string.shoot), "shoot", "shot", "shot"));
        verbs.add(new Verb(getResources().getString(R.string.show), "show", "showed", "shown"));
        verbs.add(new Verb(getResources().getString(R.string.shut), "shut", "shut", "shut"));
        verbs.add(new Verb(getResources().getString(R.string.sing), "sing", "sang", "sung"));
        verbs.add(new Verb(getResources().getString(R.string.sink), "sink", "sank / sunk", "sunk / sunken"));
        verbs.add(new Verb(getResources().getString(R.string.sit), "sit", "sat", "sat"));
        verbs.add(new Verb(getResources().getString(R.string.slay), "slay", "slew", "slain"));
        verbs.add(new Verb(getResources().getString(R.string.sleep), "sleep", "slept", "slept"));
        verbs.add(new Verb(getResources().getString(R.string.slide), "slide", "slid", "slid"));
        verbs.add(new Verb(getResources().getString(R.string.slit), "slit", "slit", "slit"));
        verbs.add(new Verb(getResources().getString(R.string.smell), "smell", "smelt", "smelt"));
        verbs.add(new Verb(getResources().getString(R.string.saw), "saw", "sowed", "sown / sowed"));
        verbs.add(new Verb(getResources().getString(R.string.sow), "sow", "sowed", "sown / sowed"));
        verbs.add(new Verb(getResources().getString(R.string.speak), "speak", "spoke", "spoken"));
        verbs.add(new Verb(getResources().getString(R.string.speed), "speed", "sped", "sped"));
        verbs.add(new Verb(getResources().getString(R.string.spell), "spell", "spelt", "spelt"));
        verbs.add(new Verb(getResources().getString(R.string.spend), "spend", "spent", "spent"));
        verbs.add(new Verb(getResources().getString(R.string.spill), "spill", "spilt / spilled", "spilt / spilled"));
        verbs.add(new Verb(getResources().getString(R.string.spin), "spin", "spun", "spun"));
        verbs.add(new Verb(getResources().getString(R.string.spit), "spit", "spat / spit", "spat / spit"));
        verbs.add(new Verb(getResources().getString(R.string.split), "split", "split ", "split"));
        verbs.add(new Verb(getResources().getString(R.string.spoil), "spoil", "spoilt ", "spoilt"));
        verbs.add(new Verb(getResources().getString(R.string.spread), "spread", "spread ", "spread"));
        verbs.add(new Verb(getResources().getString(R.string.spring), "spring", "sprang ", "sprung"));
        verbs.add(new Verb(getResources().getString(R.string.stand), "stand", "stood ", "stood"));
        verbs.add(new Verb(getResources().getString(R.string.steal), "steal", "stole ", "stolen"));
        verbs.add(new Verb(getResources().getString(R.string.stick), "stick", "stuck ", "stuck"));
        verbs.add(new Verb(getResources().getString(R.string.sting), "sting", "stung ", "stung"));
        verbs.add(new Verb(getResources().getString(R.string.stink), "stink", "stank ", "stunk"));
        verbs.add(new Verb(getResources().getString(R.string.strew), "strew", "strewed ", "strewn / strewed"));
        verbs.add(new Verb(getResources().getString(R.string.strike), "strike", "struck ", "stricken / struck"));
        verbs.add(new Verb(getResources().getString(R.string.strew), "strew", "strewed ", "strewn / strewed"));
        verbs.add(new Verb(getResources().getString(R.string.strive), "strive", "strove ", "striven"));
        verbs.add(new Verb(getResources().getString(R.string.swear), "swear", "swore ", "sworn"));
        verbs.add(new Verb(getResources().getString(R.string.sweep), "sweep", "swept ", "swept"));
        verbs.add(new Verb(getResources().getString(R.string.swim), "swim", "swam ", "swum"));
        verbs.add(new Verb(getResources().getString(R.string.swing), "swing", "swung ", "swung"));
        verbs.add(new Verb(getResources().getString(R.string.take), "take", "took ", "taken"));
        verbs.add(new Verb(getResources().getString(R.string.teach), "teach", "taught ", "taught"));
        verbs.add(new Verb(getResources().getString(R.string.tear), "tear", "tore ", "torn"));
        verbs.add(new Verb(getResources().getString(R.string.tell), "tell", "told ", "told"));
        verbs.add(new Verb(getResources().getString(R.string.think), "think", "thought ", "thought"));
        verbs.add(new Verb(getResources().getString(R.string.thrive), "thrive", "thrived ", "thrived"));
        verbs.add(new Verb(getResources().getString(R.string.throw_), "throw", "threw ", "thrown"));
        verbs.add(new Verb(getResources().getString(R.string.thrust), "thrust", "thrust ", "thrust"));
        verbs.add(new Verb(getResources().getString(R.string.typeset), "typeset", "typeset ", "typeset"));
        verbs.add(new Verb(getResources().getString(R.string.undergo), "undergo", "underwent ", "undergone"));
        verbs.add(new Verb(getResources().getString(R.string.understand), "understand", "understood ", "understanding"));
        verbs.add(new Verb(getResources().getString(R.string.wake), "wake", "woke ", "woken"));
        verbs.add(new Verb(getResources().getString(R.string.wear), "wear", "wore ", "worn"));
        verbs.add(new Verb(getResources().getString(R.string.weep), "weep", "wept ", "wept"));
        verbs.add(new Verb(getResources().getString(R.string.win), "win", "won ", "won"));
        verbs.add(new Verb(getResources().getString(R.string.wind), "wind", "wound ", "wound"));
        verbs.add(new Verb(getResources().getString(R.string.withdraw), "withdraw", "withdrew ", "withdrawn"));
        verbs.add(new Verb(getResources().getString(R.string.wring), "wring", "wrung ", "wrung"));
        verbs.add(new Verb(getResources().getString(R.string.write), "write", "wrote ", "written"));

    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        this.context = context;
        Log.d(TAG, "onAttach: was worked");
    }

}