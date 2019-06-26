/*
 * MIT License
 *
 * Copyright (c) 2019-present, iQIYI, Inc. All rights reserved.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.iqiyi.android.qigsaw.core.splitreport;

import android.content.Context;

import com.iqiyi.android.qigsaw.core.common.SplitLog;

import java.util.List;

public class DefaultSplitLoadReporter implements SplitLoadReporter {

    private static final String TAG = "SplitLoadReporter";

    protected final Context context;

    public DefaultSplitLoadReporter(Context context) {
        this.context = context;
    }

    @Override
    public void onLoadOKUnderProcessStarting(List<String> requestModuleNames, String processName, long cost) {
        SplitLog.i(TAG, "Success to load %s in process %s cost %d ms when process starting!", requestModuleNames, processName, cost);
    }

    @Override
    public void onLoadFailedUnderProcessStarting(List<String> requestModuleNames, String processName, List<SplitLoadError> errors, long cost) {
        SplitLog.w(TAG, "Failed to load %s in process %s cost %d ms when process starting!", errors.toString(), processName, cost);
    }

    @Override
    public void onLoadOKUnderUserTriggering(List<String> requestModuleNames, String processName, long cost) {
        SplitLog.i(TAG, "Success to load %s in process %s cost %d ms when user triggering!", requestModuleNames, processName, cost);
    }

    @Override
    public void onLoadFailedUnderUserTriggering(List<String> requestModuleNames, String processName, List<SplitLoadError> errors, long cost) {
        SplitLog.w(TAG, "Failed to load %s in process %s cost %d ms when user triggering!", errors.toString(), processName, cost);
    }
}