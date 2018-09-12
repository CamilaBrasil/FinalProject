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

		String text = "Java HTML the difficult Cheese was stolen by a mouse from inside Google's SQL Databases";

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
