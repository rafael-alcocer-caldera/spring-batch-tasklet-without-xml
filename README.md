## Synopsis

The project is a Spring Boot Application that uses Spring Batch without an XML configuration file.

It uses HSQLDB as a repository.

The way to process a Step is Tasklet Oriented Processing.

This application only reads a String array of lowercase letters ("a", "b", "c", "d", "e", "f", "g", "h", "i", "j").

Converts the letters to uppercase.

Prints the result.

## Motivation

I wanted to have an easy example about Spring Batch using Tasklet Oriented Processing with an XML configuration file.

## Tests

In Eclipse use: 

Run As -> Spring Boot App

or

Run As -> Java Application

## Output Log Example

2019-01-11 12:22:38.636  INFO 5480 --- [           main] .SpringBatchTaskletWithoutXmlApplication : Started SpringBatchTaskletWithoutXmlApplication in 4.332 seconds (JVM running for 5.639)

2019-01-11 12:22:38.639  INFO 5480 --- [           main] o.s.b.a.b.JobLauncherCommandLineRunner   : Running default command line with: []

2019-01-11 12:22:38.786  INFO 5480 --- [           main] o.s.b.c.l.support.SimpleJobLauncher      : Job: [FlowJob: [name=job]] launched with the following parameters: [{run.id=1}]

2019-01-11 12:22:38.857  INFO 5480 --- [           main] o.s.batch.core.job.SimpleStepHandler     : Executing step: [step1]

2019-01-11 12:22:38.872  INFO 5480 --- [           main] r.a.c.s.tasklet.step.MyTasklet           : ##### Result: ABCDEFGHIJ

2019-01-11 12:22:38.883  INFO 5480 --- [           main] o.s.b.c.l.support.SimpleJobLauncher      : Job: [FlowJob: [name=job]] completed with the following parameters: [{run.id=1}] and the following status: [COMPLETED]

2019-01-11 12:22:38.903  INFO 5480 --- [       Thread-2] s.c.a.AnnotationConfigApplicationContext : Closing org.springframework.context.annotation.AnnotationConfigApplicationContext@45dd4eda: startup date [Fri Jan 11 12:22:34 CST 2019]; root of context hierarchy

## Notes

If you Download ZIP, you'll get the file: "spring-batch-tasklet-without-xml-master.zip".
If you have 7-Zip, choose extract here and you'll get the folder: "spring-batch-tasklet-without-xml-master".

Within Eclipse you can choose Import... -> General -> Existing Projects into Workspace
Select root directory and browse the directory where you extracted the zip file.
Select "Copy projects into workspace".
You'll have the project imported with a lot of errors. Don't worry.
Go to menu and select Project -> Clean...
After select the project and clic to right button of the mouse to see the menu and select Maven -> Update Project...
Don't forget to have selected:
- Force Update of Snapshots/Releases
- Update project configuration from pom.xml
- Refresh workspace resources from local filesystem
- Clean projects
And clic OK.

Or

Within Eclipse you can choose Import... -> Maven -> Existing Maven Projects 
Root directory and browse.
If you have your folder in a different location of your workspace and
Select "Add project(s) to working set" -> spring-batch-tasklet-without-xml (this will be the name of your project).
But if your folder is in your workspace the name will be: spring-batch-without-xml-master
This is cleaner that the other. No need to do other things.
But remember that you are not copying this folder into your workspace.

Or

Copy the folder into your workspace and change the name to  from spring-batch-tasklet-without-xml-master to spring-batch-without-xml
Within Eclipse you can choose Import... -> Maven -> Existing Maven Projects 
Root directory and browse.
That's all.

## License

All work is under Apache 2.0 license
