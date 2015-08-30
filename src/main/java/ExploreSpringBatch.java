import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;
import org.springframework.batch.core.JobParametersIncrementer;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.explore.support.JobExplorerFactoryBean;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.scope.context.StepContext;
import org.springframework.batch.core.step.item.ChunkOrientedTasklet;
import org.springframework.batch.core.step.tasklet.CallableTaskletAdapter;
import org.springframework.batch.core.step.tasklet.MethodInvokingTaskletAdapter;
import org.springframework.batch.core.step.tasklet.SystemProcessExitCodeMapper;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.item.ExecutionContext;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.repeat.CompletionPolicy;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.batch.repeat.policy.SimpleCompletionPolicy;

import java.util.Date;

/**
 * Created by aleksandrov on 29.08.2015.
 */
public class ExploreSpringBatch {

    public static void main(String[] args) {
        RunIdIncrementer runIdIncrementer;
        JobExplorerFactoryBean jobExplorerFactoryBean;
        JobParametersIncrementer jobParametersIncrementer;
        JobExecutionListener jobExecutionListener;
        JobExecution jobExecution;
        ExecutionContext executionContext;
        StepExecution stepExecution;
        ChunkContext chunkContext;
        Tasklet tasklet;
        StepContribution stepContribution;
        StepContext stepContext;
        RepeatStatus repeatStatus;
        new Date();
        ChunkOrientedTasklet chunkOrientedTasklet;
        ItemReader itemReader;
        ItemWriter itemWriter;
        CallableTaskletAdapter callableTaskletAdapter;
        MethodInvokingTaskletAdapter methodInvokingTaskletAdapter;
        SystemProcessExitCodeMapper systemProcessExitCodeMapper;
        CompletionPolicy completionPolicy;
        SimpleCompletionPolicy simpleCompletionPolicy;



    }
}
