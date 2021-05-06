package crisan.monicadiana.g1092.dp.singleton;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public final class Logger {
	
	public String loggerName = "logger";
	private static File logFile;

	private static Logger instanceLogger = null;

	public static Logger getInstance(){
		if(instanceLogger == null) {
			instanceLogger = new Logger();
		}
		return instanceLogger;
	}

	private Logger(){
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Calendar cal = Calendar.getInstance();
			   	
		loggerName =  loggerName + '-' +  dateFormat.format(cal.getTime()) + ".log";
	
		Logger.logFile = new File(loggerName);
		try{
			if(logFile.createNewFile()){
				System.out.println("Creating new log file");	
			}
		}catch(IOException e){
			System.out.println("Cannot create log file");
			}	
		}

	public void log(String message){
		try{
			FileWriter out = new FileWriter(Logger.logFile, true);
			out.write(message.toCharArray());
			out.close();
			System.out.println("Logger file created.");
		}catch(IOException e){
			System.err.println("Could not write to log file");
		}
	}
}
