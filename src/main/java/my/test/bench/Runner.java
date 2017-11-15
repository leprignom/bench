package my.test.bench;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

@BenchmarkMode(Mode.SampleTime)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
public class Runner {

    @Benchmark
    public void testString() {

    }

    public static void main(String[] args) throws IOException, RunnerException {
        Options options = new OptionsBuilder()
                .include(Runner.class.getSimpleName())
                .forks(1)
                .warmupIterations(5)
                .measurementIterations(10)
                .build();
        new org.openjdk.jmh.runner.Runner(options).run();
//        Main.main(args);
    }
}
