package com.kyleduo.rabbits;

import android.net.Uri;

/**
 * Rule for Path.
 *
 * Created by kyle on 11/02/2018.
 */

@SuppressWarnings("unused")
public class PathRule extends RuleImpl {
    PathRule() {
    }

    @Override
    public boolean verify(Uri uri) {
        return verify(uri.getPath());
    }

    @Override
    public String toString() {
        return "(Path " + super.toString();
    }
}
