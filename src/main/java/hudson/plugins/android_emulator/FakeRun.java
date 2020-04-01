package hudson.plugins.android_emulator;

import java.io.IOException;

import hudson.model.Build;

public class FakeRun extends Build<FakeConfiguration,FakeRun> {
	public FakeRun(FakeConfiguration job) throws IOException {
        super(job);
    }
}
