package com.my.designpatterns.creational.prototype;

public class NDAgreement extends PrototypeCapableDocument {

	private AuthorizeSignature signature;

	public AuthorizeSignature getSignature() {
		return signature;
	}

	public void setSignature(AuthorizeSignature signature) {
		this.signature = signature;
	}

	@Override
	public PrototypeCapableDocument cloneDocument() throws CloneNotSupportedException {
		/* clone with deep copy */
		NDAgreement ndAgreement = (NDAgreement) super.clone();
		AuthorizeSignature signature = (AuthorizeSignature) this.getSignature().clone();
		ndAgreement.setSignature(signature);
		return ndAgreement;
	}
	
	@Override
	public String toString() {
		return "[NDAgreement: Vendor Name - " + getVendor() + ", Content - " + getContent() + ", Authorization - " + getSignature() + "]";
	}

}
