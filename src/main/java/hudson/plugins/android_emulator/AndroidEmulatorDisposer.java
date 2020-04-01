package hudson.plugins.android_emulator;

import java.io.IOException;
import java.util.HashMap;

import hudson.FilePath;
import hudson.Launcher;
import hudson.model.Run;
import hudson.model.TaskListener;
import jenkins.tasks.SimpleBuildWrapper.Disposer;

public class AndroidEmulatorDisposer extends Disposer {

    private static final long serialVersionUID = 1L;

    @Override
    public void tearDown(Run<?, ?> build, FilePath workspace, Launcher launcher, TaskListener listener)
            throws IOException, InterruptedException {

        //launcher.kill(modelEnvVars);
        build.getArtifactManager().archive(workspace, launcher, null, new HashMap<>());

    }

}
