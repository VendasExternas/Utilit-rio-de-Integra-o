package br.com.alkord.utilitarioIntegracao;

import dagger.Component;

import javax.inject.Singleton;

@Singleton
@Component(modules = {AppModule.class})
public interface AppInjector {

	Configurations configurations();

	UtilitarioIntegracaoHandler utilitarioIntegracaoHandler();
}