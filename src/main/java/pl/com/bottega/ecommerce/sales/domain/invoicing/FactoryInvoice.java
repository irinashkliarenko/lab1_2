package pl.com.bottega.ecommerce.sales.domain.invoicing;

import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.ClientData;
import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.Id;

public class FactoryInvoice implements FactoryInvoiceInterface {
	
	public Invoice create(Id invoiceId, ClientData client) {
		return new Invoice(client);
	}
	
	public static FactoryInvoiceInterface getFactoryInvoiceInterface() {
		return new FactoryInvoice();
	}

}
