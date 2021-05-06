package crisan.monicadiana.g1092.dp.registry;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class RegistryLogger {
	public String loggerName = "logger";
	private static File logFile;
	protected String env = System.getProperty("user.dir");

	private static HashMap<String, RegistryLogger> loggers = new HashMap<>();
	
	public static RegistryLogger getInstancesLoggers(String fileName){
		RegistryLogger logger = loggers.get(fileName);
		if(logger == null) {
			logger = new RegistryLogger(fileName);
			loggers.put(fileName, logger);
		}
		return logger;
	}

	private RegistryLogger(String fileName){
		loggerName =  loggerName + '-' +  fileName + ".log";
	
		RegistryLogger.logFile = new File(loggerName);
		try{
			if(logFile.createNewFile()){
				System.out.println("Creating new log file");	
			}
		}catch(IOException e){
			System.out.println("Cannot create log file");
			System.exit(1);
			}	
		}

	public void log(String message){
		try{
			FileWriter out = new FileWriter(RegistryLogger.logFile, true);
			out.write(message.toCharArray());
			out.close();
		}catch(IOException e){
			System.err.println("Could not write to log file");
		}
	}
}
