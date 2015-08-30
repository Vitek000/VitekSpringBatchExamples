import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;

/**
 * Created by aleksandrov on 30.08.2015.
 */
public class HelloJobListener implements JobExecutionListener {
    public void beforeJob(JobExecution jobExecution) {
        System.out.println("before job " + jobExecution.getJobId());
    }

    public void afterJob(JobExecution jobExecution) {
        System.out.println("after job " + jobExecution.getJobId());

    }
}
