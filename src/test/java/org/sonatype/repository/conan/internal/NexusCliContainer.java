package org.sonatype.repository.conan.internal;

import java.io.IOException;

public interface NexusCliContainer
{
  String execute(String... commands) throws IOException, InterruptedException;

  String install(String resourceFilename) throws IOException, InterruptedException;
}