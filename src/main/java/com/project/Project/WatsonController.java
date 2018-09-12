package com.project.Project;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ibm.watson.developer_cloud.natural_language_understanding.v1.NaturalLanguageUnderstanding;
import com.ibm.watson.developer_cloud.natural_language_understanding.v1.model.AnalysisResults;
import com.ibm.watson.developer_cloud.natural_language_understanding.v1.model.AnalyzeOptions;
import com.ibm.watson.developer_cloud.natural_language_understanding.v1.model.EntitiesOptions;
import com.ibm.watson.developer_cloud.natural_language_understanding.v1.model.Features;
import com.ibm.watson.developer_cloud.natural_language_understanding.v1.model.KeywordsOptions;
import com.ibm.watson.developer_cloud.service.security.IamOptions;

@Controller
public class WatsonController {

	@Value("${watsonapikey}")
	private String watsonapikey;

	@RequestMapping("/watson")
	public ModelAndView WatsonKeyword() {
//		System.out.println("Please Work");
//		
//		NaturalLanguageUnderstanding service = new NaturalLanguageUnderstanding("2017-02-27");
//		service.setApiKey("ROL_zkeMlylSOvTnli6WlmiNkhgS-MpAn5kZYEEfUzKz");
////		service.setUsernameAndPassword("<username>", "<password>");
//
//		EntitiesOptions entities = new EntitiesOptions.Builder()
//		  .sentiment(true)
//		  .limit(1)
//		  .build();
//		Features features = new Features.Builder()
//		  .entities(entities)
//		  .build();
//		AnalyzeOptions parameters = new AnalyzeOptions.Builder()
//		  .url("www.cnn.com")
//		  .features(features)
//		  .build();
//
//		AnalysisResults results = service.analyze(parameters).execute();
//		System.out.println(results);
//		
//		return new ModelAndView("index");

//		CloseableHttpClient httpClient = HttpClients.custom().setSSLHostnameVerifier(new NoopHostnameVerifier())
//				.build();
//		HttpComponentsClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactory();
//		requestFactory.setHttpClient(httpClient);

		IamOptions options = new IamOptions.Builder().apiKey(watsonapikey).build();

		NaturalLanguageUnderstanding service = new NaturalLanguageUnderstanding("2018-03-16", options);
		service.setEndPoint("https://gateway-wdc.watsonplatform.net/natural-language-understanding/api");

		String text = "Turbonomic, the global leader in Workload Automation for Hybrid Cloud, an Inc Fastest Growing Company for three years and a Forbes Cloud 100 company is growing our cloud team to meet our customers journey to digital transformation. Did you know that Gartner predicts 83% of enterprise workloads will be in the cloud by 2020?  As part of our world-class engineering team, you will design/build features and enhancements for the Turbonomic Platform which is the control system to manage workload performance, costs, and efficiency in the public cloud.\r\n" + 
				" \r\n" + 
				"As a Senior Cloud Software Engineer, you will have the opportunity to make a massive impact and will be directly responsible for developing some of the most integral parts of the Turbonomic Platform that has already enabled over 2,000 customers to transform their businesses for the digital age.  We are continuously thinking about the future of IT and constantly innovating to address trends in emerging technology.  If you have a passion for cloud technologies, let’s talk!\r\n" + 
				"What you’ll do:\r\n" + 
				"Accelerate the delivery of new features and enhancements in to the Turbonomic platform\r\n" + 
				"Design and build upcoming functionality around controlling cloud-based applications\r\n" + 
				"Collaborate with product management and the rest of our R&D team to design, develop and release new cloud-centric functionality\r\n" + 
				"Produce high quality, well-documented code as part of our agile process\r\n" + 
				"What we look for:\r\n" + 
				"3+ years’ experience in one of the following:  \r\n" + 
				"(1)   Cloud providers (Google, AWS, Azure)\r\n" + 
				"(2)   Pure cloud software player/startup\r\n" + 
				"(3)   Developing software that runs ONLY in the public cloud\r\n" + 
				"(4)   Re-architecting legacy applications for the public cloud\r\n" + 
				"Experience in one of these areas:\r\n" + 
				"(1)   Public Cloud APIs for IaaS (AWS, Azure, Google) or PaaS (Cloudfoundry, Openshift)\r\n" + 
				"(2)   Cloud-Native (for example: Kubernetes, Mesos, Docker, Deis)\r\n" + 
				"Background in Java, C++, Go or modern development.\r\n" + 
				"o   Our tech stack is:  java, docker, kubernetes, kafka, protobuf, REST, angular\r\n" + 
				"Familiar with cloud DevOps practices\r\n" + 
				"Background in developing microservices for distributed systems\r\n" + 
				"Background in microservice architectures or distributed systems based in AWS, Azure or GCP\r\n" + 
				"Cloud-based distributed application development and scaling\r\n" + 
				"BS or higher in Computer Science or related field.\r\n" + 
				"Agile development methodology\r\n" + 
				"Bonus Points if you have:\r\n" + 
				"Certifications:  AWS Solution Architect, AWS Cloud Practitioner, Azure DevOps or any similar\r\n" + 
				"Experience with Machine Learning Solutions";

		EntitiesOptions entitiesOptions = new EntitiesOptions.Builder().emotion(true).sentiment(true).limit(2).build();

		KeywordsOptions keywordsOptions = new KeywordsOptions.Builder().emotion(true).sentiment(true).limit(2).build();

		Features features = new Features.Builder().entities(entitiesOptions).keywords(keywordsOptions).build();

		AnalyzeOptions parameters = new AnalyzeOptions.Builder().text(text).features(features).build();
		
		AnalysisResults response = service.analyze(parameters).execute();
		System.out.println(response);
		
		System.out.println(response.getKeywords());
		return new ModelAndView("index", "keyword", response);
//				

	}
}
