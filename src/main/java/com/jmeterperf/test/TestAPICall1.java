package com.jmeterperf.test;

// com.jmeterperf.test.TestAPICall1

import java.io.Serializable;
import org.apache.jmeter.config.Arguments;
import org.apache.jmeter.protocol.java.sampler.AbstractJavaSamplerClient;
import org.apache.jmeter.protocol.java.sampler.JavaSamplerContext;
import org.apache.jmeter.samplers.SampleResult;


public class TestAPICall1  extends AbstractJavaSamplerClient implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;



	public TestAPICall1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(" - - - Begin - - -");
		TestAPICall1 s = new TestAPICall1();
        JavaSamplerContext context = new JavaSamplerContext(s.getDefaultParameters());
        s.setupTest(context);
        System.out.println(" - - - Run Test - - -");
        s.runTest(context);
        s.teardownTest(context);
        System.out.println(" - - - End - - -");
        
	}

	
	
	

    // set up default arguments for the JMeter GUI
    @Override
    public Arguments getDefaultParameters() {
        Arguments defaultParameters = new Arguments();
        defaultParameters.addArgument("SERVER_URL", "server-url");   // set from prop file
        defaultParameters.addArgument("CLIENT_ID", "client-id");
       
        return defaultParameters;
    }
    
    
    
	public SampleResult runTest(JavaSamplerContext context) {
		// TODO Auto-generated method stub
		
		String server_url = context.getParameter("SERVER_URL");
        System.out.println("Server URL: " + server_url);
        String clientid = context.getParameter("CLIENT_ID");
        System.out.println("Client ID: " + clientid);
		
		 SampleResult result = new SampleResult();
		 
		 result.sampleStart();
		 //   api call code here
		 System.out.println("Test for the Dymmy api call ---");
		 
		 String response = "Some response message from test api call ";
		 
		 //  emd api call 
		 result.sampleEnd(); // stop stopwatch
         result.setThreadName("Test-API-Call-1");
         result.setSuccessful(true);
         result.setResponseMessage(response);
         result.setResponseCodeOK();
		return null;
	}

	
}
