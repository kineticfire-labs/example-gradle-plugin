/*
 * (c) Copyright 2023-2025 example-gradle-plugin Contributors. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/*
 * KineticFire Labs: https://labs.kineticfire.com/
 *     project site: https://github.com/kineticfire-labs/example-gradle-plugin/
 */
package com.kineticfire.gradle.example_gradle_plugin

import spock.lang.Specification
import spock.lang.TempDir
import org.gradle.testkit.runner.GradleRunner


/**
 * A simple functional test for the plugin.
 */
class ExampleGradlePluginFunctionalTest extends Specification {

    @TempDir
    private File projectDir

    private getBuildFile( ) {
        new File( projectDir, 'build.gradle' )
    }

    private getSettingsFile() {
        new File( projectDir, 'settings.gradle' )
    }

    def "can run 'exampleTask' task"( ) {
        given:
        settingsFile << ""
        buildFile << """
plugins {
    id( 'com.kineticfire.gradle.example-gradle-plugin' )
}
"""

        when:
        def runner = GradleRunner.create( )
        runner.forwardOutput( )
        runner.withPluginClasspath( )
        runner.withArguments( 'exampleTask' )
        runner.withProjectDir( projectDir )
        def result = runner.build( )

        then:
        result.output.contains( 'ExampleTask: running example task!' )
    }

    def "can run 'sampleTask' task"( ) {
        given:
        settingsFile << ""
        buildFile << """
plugins {
    id( 'com.kineticfire.gradle.example-gradle-plugin' )
}
"""

        when:
        def runner = GradleRunner.create( )
        runner.forwardOutput( )
        runner.withPluginClasspath( )
        runner.withArguments( 'sampleTask' )
        runner.withProjectDir( projectDir )
        def result = runner.build( )

        then:
        result.output.contains( 'SampleTask: running sample task!' )
    }

}
