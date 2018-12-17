package com.piggymetrics.statistics.client;

import com.piggymetrics.statistics.domain.Currency;
import com.piggymetrics.statistics.domain.ExchangeRatesContainer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Collections;

@Component
public class ExchangeRatesClientFallback implements ExchangeRatesClient {

	private static final Logger LOGGER = LoggerFactory.getLogger(ExchangeRatesClientFallback.class);
	
    @Override
    public ExchangeRatesContainer getRates(Currency base) {
    	LOGGER.debug("=== ExchangeRatesFallback --- ");
        ExchangeRatesContainer container = new ExchangeRatesContainer();
        container.setBase(Currency.getBase());
        container.setRates(Collections.emptyMap());
        return container;
    }
}
