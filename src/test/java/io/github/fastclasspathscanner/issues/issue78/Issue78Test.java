package io.github.fastclasspathscanner.issues.issue78;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import io.github.fastclasspathscanner.FastClasspathScanner;

public class Issue78Test {
    @Test
    public void issue78() {
        assertThat(new FastClasspathScanner().whitelistClasses(Issue78Test.class.getName()).scan().getAllClasses()
                .getNames()).containsOnly(Issue78Test.class.getName());
    }
}