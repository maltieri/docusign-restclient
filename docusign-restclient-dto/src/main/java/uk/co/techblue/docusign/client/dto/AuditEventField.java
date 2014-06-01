package uk.co.techblue.docusign.client.dto;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

public class AuditEventField {
	/** The name of the field. */
	@JsonProperty
	private String name;

	/** The value of the field. */
	@JsonProperty
	private String value;

	public String getName() {
		return name;
	}

	public String getValue() {
		return value;
	}
}
