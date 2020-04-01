package hudson.plugins.android_emulator;

import java.io.IOException;

import hudson.model.Cause;
import hudson.model.Item;
import hudson.model.ItemGroup;
import hudson.model.Project;

public class FakeConfiguration extends Project<FakeConfiguration,FakeRun> {

	public FakeConfiguration(ItemGroup<? extends Item> parent, String name) {
		super(parent, name);
		// TODO Auto-generated constructor stub
	}

	@Override
    public int assignBuildNumber() throws IOException {
        return 1;
    }

	@Override
	public boolean scheduleBuild(Cause c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean scheduleBuild(int quietPeriod, Cause c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected Class<FakeRun> getBuildClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
