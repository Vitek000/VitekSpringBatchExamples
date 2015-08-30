import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

/**
 * Created by aleksandrov on 28.08.2015.
 */
public class HelloWorld2TaskStepsApplicationRunner {

    public static void main(String[] args) throws JobParametersInvalidException, JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("helloWorld.xml");
        JobLauncher launcher = (JobLauncher) context.getBean("jobLauncher");

        Job helloWorldJob2 = (Job) context.getBean("simpleTaskletStepJob2");

        System.out.println("Before running!");

        launcher.run(helloWorldJob2, new JobParametersBuilder().addDate("start", new Date()).toJobParameters());

        launcher.run(helloWorldJob2, new JobParametersBuilder().addDate("start", new Date()).toJobParameters());


        System.out.println("After running!");

    }
}
