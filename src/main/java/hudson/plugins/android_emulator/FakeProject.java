package hudson.plugins.android_emulator;

import java.io.File;
import java.io.IOException;
import java.util.Collection;

import org.acegisecurity.AccessDeniedException;

import hudson.model.AbstractProject;
import hudson.model.Cause;
import hudson.model.Descriptor;
import hudson.model.Item;
import hudson.model.ItemGroup;
import hudson.model.TopLevelItem;
import hudson.model.TopLevelItemDescriptor;
import hudson.tasks.Publisher;
import hudson.util.DescribableList;

public class FakeProject extends AbstractProject<FakeProject,FakeBuild> implements  TopLevelItem, ItemGroup<FakeConfiguration> {

	protected FakeProject(ItemGroup<? extends Item> parent, String name) {
		super(parent, name);
		// TODO Auto-generated constructor stub
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
	public Collection<FakeConfiguration> getItems() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getUrlChildPrefix() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FakeConfiguration getItem(String name) throws AccessDeniedException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public File getRootDirFor(FakeConfiguration child) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void onDeleted(FakeConfiguration item) throws IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public DescribableList<Publisher, Descriptor<Publisher>> getPublishersList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<FakeBuild> getBuildClass() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isFingerprintConfigured() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public TopLevelItemDescriptor getDescriptor() {
		// TODO Auto-generated method stub
		return null;
	}


}
