package pl.com.bottega.ecommerce.sales.domain.offer;

public interface OfferInterface {
	int hashCode();
	boolean equals(Object obj);
	boolean sameAs(Offer seenOffer, double delta);
}
