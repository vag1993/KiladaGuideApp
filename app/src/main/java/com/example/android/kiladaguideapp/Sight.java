package com.example.android.kiladaguideapp;

class Sight {
    private int mDefaultPhrase;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    Sight(int defaultPhraseId, int imageResourceId) {
        mDefaultPhrase = defaultPhraseId;
        mImageResourceId = imageResourceId;
    }
    int getdefaultPhraseId() {
        return mDefaultPhrase;
    }
    int getimageResourceId() {
        return mImageResourceId;
    }
    boolean hasImage() { return mImageResourceId != NO_IMAGE_PROVIDED; }
}
