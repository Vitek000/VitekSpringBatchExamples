import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.core.step.tasklet.TaskletStep;
import org.springframework.batch.repeat.RepeatStatus;

import java.util.Date;

/**
 * Created by aleksandrov on 28.08.2015.
 */
public class HelloWorldTasklet2 implements Tasklet {

    public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {

        System.out.println("HelloWorldTasklet2!!!" + new Date());

        return RepeatStatus.FINISHED;
    }
}
