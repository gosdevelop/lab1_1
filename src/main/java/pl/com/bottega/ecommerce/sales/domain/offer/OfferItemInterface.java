package pl.com.bottega.ecommerce.sales.domain.offer;

public interface OfferItemInterface {
	int hashCode();
	boolean equals(Object obj);
	boolean sameAs(OfferItem other, double delta);
	
}
