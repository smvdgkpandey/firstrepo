package FirstPacakage;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.testng.annotations.Test;

public class First1 {
	
	
	@Test
	public void classAfirstMethod() {
	
		LocalDateTime currentTime = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss.SSS");
        String formattedTime = currentTime.format(formatter);

        System.out.println("Thread: " + Thread.currentThread().getId()
                + " | Current Time: " + formattedTime+" first method");
	}
	@Test
	public void classAsecondMethod() {
		LocalDateTime currentTime = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss.SSS");
        String formattedTime = currentTime.format(formatter);

        System.out.println("Thread: " + Thread.currentThread().getId()
                + " | Current Time: " + formattedTime+" second method");
	}
	@Test
	public void classAthirdMethod() {
		LocalDateTime currentTime = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss.SSS");
        String formattedTime = currentTime.format(formatter);

        System.out.println("Thread: " + Thread.currentThread().getId()
                + " | Current Time: " + formattedTime+" third method");
	}

}
