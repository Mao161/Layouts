1.LinearLayout线性布局

xml代码:

```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="#000000"
    android:orientation="vertical"
    tools:context=".MainActivity">

    <LinearLayout
        android:id="@+id/one"
        android:layout_width="match_parent"
        android:layout_height="60dp"
        android:orientation="horizontal">

        <TextView
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:gravity="center"
            android:text="one,one"
            android:textColor="#ffffff" />

        <TextView
            android:layout_width="30dp"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:gravity="center"
            android:text="one,two"
            android:textColor="#ffffff" />

        <TextView
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:gravity="center"
            android:text="one,three"
            android:textColor="#ffffff" />

        <TextView
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:gravity="center"
            android:text="one,four"
            android:textColor="#ffffff" />
    </LinearLayout>

    <LinearLayout
        android:id="@+id/two"
        android:layout_width="match_parent"
        android:layout_height="60dp"
        android:orientation="horizontal">

        <TextView
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:gravity="center"
            android:text="two,one"
            android:textColor="#ffffff" />

        <TextView
            android:layout_width="30dp"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:gravity="center"
            android:text="two,two"
            android:textColor="#ffffff" />

        <TextView
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:gravity="center"
            android:text="two,three"
            android:textColor="#ffffff" />

        <TextView
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:gravity="center"
            android:text="two,four"
            android:textColor="#ffffff" />
    </LinearLayout>

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="60dp"
        android:orientation="horizontal">

        <TextView
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:gravity="center"
            android:text="three,one"
            android:textColor="#ffffff" />

        <TextView
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:gravity="center"
            android:text="three,two"
            android:textColor="#ffffff" />

        <TextView
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:gravity="center"
            android:text="three,three"
            android:textColor="#ffffff" />

        <TextView
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:gravity="center"
            android:text="three,four"
            android:textColor="#ffffff" />
    </LinearLayout>

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="60dp"
        android:orientation="horizontal">

        <TextView
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:gravity="center"
            android:text="four,one"
            android:textColor="#ffffff" />

        <TextView
            android:layout_width="30dp"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:gravity="center"
            android:text="four,two"
            android:textColor="#ffffff" />

        <TextView
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:gravity="center"
            android:text="four,three"
            android:textColor="#ffffff" />

        <TextView
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:gravity="center"
            android:text="four,four"
            android:textColor="#ffffff" />
    </LinearLayout>


</LinearLayout>

```



运行截图:

![线性布局](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\1552932439392.png)

2.ConstrainLayout 约束布局

xml代码:

```
<?xml version="1.0" encoding="utf-8"?>
<android.support.constraint.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".Hello"
    tools:layout_editor_absoluteY="73dp">

    <Button
        android:id="@+id/button5"
        android:layout_width="94dp"
        android:layout_height="51dp"
        android:layout_marginStart="8dp"
        android:layout_marginLeft="8dp"
        android:layout_marginTop="136dp"
        android:layout_marginEnd="8dp"
        android:layout_marginRight="8dp"
        android:layout_marginBottom="8dp"
        android:background="@android:color/holo_purple"
        android:text="Indigo"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.612"
        app:layout_constraintStart_toEndOf="@+id/button4"
        app:layout_constraintTop_toTopOf="@+id/button2"
        app:layout_constraintVertical_bias="0.196" />

    <Button
        android:id="@+id/button6"
        android:layout_width="95dp"
        android:layout_height="57dp"
        android:layout_marginStart="8dp"
        android:layout_marginLeft="8dp"
        android:layout_marginTop="136dp"
        android:layout_marginEnd="8dp"
        android:layout_marginRight="8dp"
        android:layout_marginBottom="8dp"
        android:background="@android:color/holo_green_dark"
        android:text="Green"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toStartOf="@+id/button4"
        app:layout_constraintHorizontal_bias="0.578"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="@+id/button2"
        app:layout_constraintVertical_bias="0.184" />

    <Button
        android:id="@+id/button"
        android:layout_width="119dp"
        android:layout_height="97dp"
        android:layout_marginEnd="8dp"
        android:layout_marginRight="8dp"
        android:background="@android:color/holo_red_dark"
        android:text="Red"
        app:layout_constraintEnd_toStartOf="@+id/button2"
        app:layout_constraintHorizontal_bias="0.0"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <Button
        android:id="@+id/button2"
        android:layout_width="122dp"
        android:layout_height="98dp"
        android:layout_marginStart="8dp"
        android:layout_marginLeft="8dp"
        android:layout_marginEnd="8dp"
        android:layout_marginRight="8dp"
        android:background="@android:color/holo_orange_dark"
        android:text="Orange"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.513"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <Button
        android:id="@+id/button3"
        android:layout_width="114dp"
        android:layout_height="98dp"
        android:layout_marginStart="8dp"
        android:layout_marginLeft="8dp"
        android:background="@android:color/holo_orange_light"
        android:text="Yellow"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="1.0"
        app:layout_constraintStart_toEndOf="@+id/button2"
        app:layout_constraintTop_toTopOf="parent" />

    <Button
        android:id="@+id/button4"
        android:layout_width="95dp"
        android:layout_height="55dp"
        android:layout_marginStart="8dp"
        android:layout_marginLeft="8dp"
        android:layout_marginTop="136dp"
        android:layout_marginEnd="8dp"
        android:layout_marginRight="8dp"
        android:layout_marginBottom="8dp"
        android:background="@android:color/holo_blue_dark"
        android:text="Blue"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.533"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="@+id/button2"
        app:layout_constraintVertical_bias="0.188" />

    <Button
        android:id="@+id/button7"
        android:layout_width="1069dp"
        android:layout_height="70dp"
        android:background="@android:color/holo_red_light"
        android:text="Violet"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        tools:layout_editor_absoluteY="360dp" />
</android.support.constraint.ConstraintLayout>
```

运行截图:

![1552932362289](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\1552932362289.png)

3.TableLayout表格布局

```
<?xml version="1.0" encoding="utf-8"?>
<android.support.constraint.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="#000000"
    tools:context=".Main3Activity">

    <TableLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:stretchColumns="0">

        <TableRow>
            <TextView
                android:text="Open..."
                android:layout_marginLeft="30dp"
                android:textColor="#FFFFFF"
                />
            <TextView
                android:text="Ctrl-O"
                android:layout_marginRight="30dp"
                android:textColor="#FFFFFF"
                />
        </TableRow>
        <TableRow>
            <TextView
                android:text="Save..."
                android:layout_marginLeft="30dp"
                android:textColor="#FFFFFF"
                />
            <TextView
                android:text="Ctrl-S"
                android:layout_marginRight="30dp"
                android:textColor="#FFFFFF"
                />
        </TableRow>
        <TableRow>
            <TextView
                android:text="Save As..."
                android:textColor="#FFFFFF"
                android:layout_marginLeft="30dp"
                />
            <TextView
                android:text="Ctrl-Shift-S"
                android:textColor="#FFFFFF"
                android:layout_marginRight="30dp"
                />
        </TableRow>
        <View  android:layout_height="5px"
            android:layout_width="match_parent"
            android:background="#ffffff"

            />
        <TableRow>
            <TextView
                android:text="X-Import"
                android:layout_marginLeft="30dp"
                android:textColor="#FFFFFF"
                />

        </TableRow>
        <TableRow>
            <TextView
                android:text="X-Export"
                android:layout_marginLeft="30dp"
                android:textColor="#FFFFFF"
                />
            <TextView
                android:text="Ctrl-E"
                android:layout_marginRight="30dp"
                android:textColor="#FFFFFF"
                />
        </TableRow>
        <View  android:layout_height="5px"
            android:layout_width="match_parent"
            android:background="#ffffff"

            />
        <TableRow>
            <TextView
                android:text="Quit"
                android:layout_marginLeft="30dp"
                android:textColor="#FFFFFF"
                />
        </TableRow>
    </TableLayout>





</android.support.constraint.ConstraintLayout>
```

运行截图:

![1552933354140](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\1552933354140.png)

4.Activity的几种状态切换:

```
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivityLife","调用onCreate");
    }
    @Override
    protected void onStart(){
        super.onStart();
        Log.d("MainActivityLife","调用onStart");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.d("MainActivityLife","调用onResume");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.d("MainActivityLife","调用onPause");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.d("MainActivityLife","调用onStop");

    }
    protected void onDestroy(){
        super.onDestroy();
        Log.d("MainActivityLife","调用onDestroy");

    }
    protected void onRestart(){
        super.onRestart();
        Log.d("MainActivityLife","调用onRestart");

    }

}
```

![1552935263310](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\1552935263310.png)

![1552935272365](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\1552935272365.png)

![1552935282907](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\1552935282907.png)

