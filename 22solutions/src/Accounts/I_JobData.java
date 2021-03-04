package Accounts;

import Jobs.*;

public interface I_JobData {

	abstract Job newJob();

	abstract JobHistory[] getJobs();

}