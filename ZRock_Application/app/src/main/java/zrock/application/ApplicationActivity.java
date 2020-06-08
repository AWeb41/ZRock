package zrock.application;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;

public class ApplicationActivity extends AppCompatActivity
{
	@Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		// TODO: Implement this methodl
		getMenuInflater().inflate(R.menu.actions_menu_application, menu);
		return super.onCreateOptionsMenu(menu);
	}
	
}
