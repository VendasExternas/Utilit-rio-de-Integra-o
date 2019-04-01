package br.com.alkord.utilitarioIntegracao;

import br.com.alkord.utilitarioIntegracao.integracaoViaArquivo.ImportProcessor;
import br.com.alkord.utilitarioIntegracao.requestMethods.DeleteRequest;
import br.com.alkord.utilitarioIntegracao.requestMethods.GetRequest;
import br.com.alkord.utilitarioIntegracao.requestMethods.PostRequest;
import br.com.alkord.utilitarioIntegracao.requestMethods.PutRequest;
import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;

@Singleton
@Module
public class AppModule {

	public AppModule() {

	}

	@Provides
	DatabaseHelper provideDatabaseHelper() {
		return new DatabaseHelper();
	}

	@Provides
	Configurations provideConfiguracoes() {
		return new Configurations();
	}

	@Provides
	GetRequest provideGetRequest(Configurations configurations) {
		return new GetRequest(configurations);
	}

	@Provides
	PostRequest providePostRequest(Configurations configurations) {
		return new PostRequest(configurations);
	}

	@Provides
	PutRequest providePutRequest(Configurations configurations) {
		return new PutRequest(configurations);
	}

	@Provides
	DeleteRequest provideDeleteRequest(Configurations configurations) {
		return new DeleteRequest(configurations);
	}

	@Provides
	ImportProcessor provideImportProcessor(DatabaseHelper databaseHelper, GetRequest getRequest, PutRequest putRequest,
			PostRequest postRequest) {
		return new ImportProcessor(databaseHelper, getRequest, putRequest, postRequest);
	}
}
