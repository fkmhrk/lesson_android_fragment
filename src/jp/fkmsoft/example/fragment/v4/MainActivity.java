package jp.fkmsoft.example.fragment.v4;

import jp.fkmsoft.example.fragment.v4.page.login.LoginFragment;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        if (savedInstanceState == null) {
            FragmentManager manager = getSupportFragmentManager();
            FragmentTransaction transaction = manager.beginTransaction();
            
            transaction.replace(R.id.main, LoginFragment.newInstance());
            
            transaction.commit();
        }
    }
}
