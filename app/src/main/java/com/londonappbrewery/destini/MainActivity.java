package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    private TextView storyTextView;
    private Button topButton;
    private Button bottomButton;

    private StoryStep T1 = null;
    private StoryStep T2 = null;
    private StoryStep T3 = null;
    private StoryStep T4 = null;
    private StoryStep T5 = null;
    private StoryStep T6 = null;

    private StoryStep currentStep = null;


    private void displayCurrentStory() {

        storyTextView.setText(currentStep.getStory());

        if(currentStep.getTopAnswerOption() == null && currentStep.getTopAnswerOption() == null) {
            topButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                }
            });
            bottomButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                }
            });
        }

        topButton.setText(currentStep.getTopAnswerOption());
        bottomButton.setText(currentStep.getBottomAnswerOption());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        storyTextView = (TextView) findViewById(R.id.storyTextView);
        topButton = (Button) findViewById(R.id.buttonTop);
        bottomButton = (Button) findViewById(R.id.buttonBottom);

        // TODO: create story steps
        T4 = new StoryStep(getString(R.string.T4_End), "", "", null, null);
        T5 = new StoryStep(getString(R.string.T5_End), "", "", null, null);
        T6 = new StoryStep(getString(R.string.T6_End), "", "", null, null);
        T3 = new StoryStep(getString(R.string.T3_Story), getString(R.string.T3_Ans1), getString(R.string.T3_Ans2), T6, T5);
        T2 = new StoryStep(getString(R.string.T2_Story), getString(R.string.T2_Ans1), getString(R.string.T2_Ans2), T3, T4);
        T1 = new StoryStep(getString(R.string.T1_Story), getString(R.string.T1_Ans1), getString(R.string.T1_Ans2), T3, T2);

        currentStep = T1;
        displayCurrentStory();

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        topButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                StoryStep aux = currentStep.getNextStoryStep_top();

                if (aux != null) {
                    currentStep = aux;
                    displayCurrentStory();
                }
            }
        });

        bottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                StoryStep aux = currentStep.getNextStoryStep_top();

                if(aux != null) {
                    currentStep = aux;
                    displayCurrentStory();
                }
            }
        });


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:


    }
}
