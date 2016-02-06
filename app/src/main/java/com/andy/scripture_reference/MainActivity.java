package com.andy.scripture_reference;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public final static String EXTRA_BOOK = "com.example.andy.scripture_reference.BOOK";
    public final static String EXTRA_CHAPTER = "com.example.andy.scripture_reference.CHAPTER";
    public final static String EXTRA_VERSE = "com.example.andy.scripture_reference.VERSE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /** Called when the user clicks the book, chapter, or verse buttons */
    public void sendMessage(View v) {
        // Do something in response to button
        Intent intent = new Intent(this, DisplayMessage.class);
        EditText bookText = (EditText) findViewById(R.id.editTextBk);
        EditText chapterText = (EditText) findViewById(R.id.editTextCh);
        EditText verseText = (EditText) findViewById(R.id.editTextVs);
        String bookTxt = bookText.getText().toString();
        String chapterTxt = chapterText.getText().toString();
        String verseTxt = verseText.getText().toString();
        intent.putExtra(EXTRA_BOOK, bookTxt);
        intent.putExtra(EXTRA_CHAPTER, chapterTxt);
        intent.putExtra(EXTRA_VERSE, verseTxt);
        startActivity(intent);
    }
}
