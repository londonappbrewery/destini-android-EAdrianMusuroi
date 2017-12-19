package com.londonappbrewery.destini;

/**
 * Created by Adi on 12/19/2017.
 */

public class StoryStep {

    private String story;
    private String topAnswerOption;
    private String bottomAnswerOption;

    private StoryStep nextStoryStep_top;
    private StoryStep nextStoryStep_bottom;

    public StoryStep(String story, String topAnswerOption, String bottomAnswerOption, StoryStep nextStoryStep_top, StoryStep nextStoryStep_bottom) {

        this.story = story;
        this.topAnswerOption = topAnswerOption;
        this.bottomAnswerOption = bottomAnswerOption;
        this.nextStoryStep_top = nextStoryStep_top;
        this.nextStoryStep_bottom = nextStoryStep_bottom;
    }

    public String getStory() {
        return story;
    }

    public String getTopAnswerOption() {
        return topAnswerOption;
    }

    public String getBottomAnswerOption() {
        return bottomAnswerOption;
    }

    public StoryStep getNextStoryStep_top() {
        return nextStoryStep_top;
    }

    public StoryStep getNextStoryStep_bottom() {
        return nextStoryStep_bottom;
    }
}
