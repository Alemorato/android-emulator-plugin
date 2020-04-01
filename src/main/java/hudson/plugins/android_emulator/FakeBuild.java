package hudson.plugins.android_emulator;

import java.io.File;
import java.io.IOException;

import hudson.model.AbstractBuild;

/**
 * @author Alessandro Morato
 */
public class FakeBuild extends AbstractBuild<FakeProject,FakeBuild> {
    public FakeBuild(FakeProject project) throws IOException {
        super(project);
    }

    public FakeBuild(FakeProject project, File buildDir) throws IOException {
        super(project, buildDir);
    }

    @Override
    public void run() {
        //execute(new BuildExecution());
    }
}