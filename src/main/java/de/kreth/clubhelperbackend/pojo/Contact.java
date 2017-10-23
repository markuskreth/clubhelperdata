package de.kreth.clubhelperbackend.pojo;

import java.util.Locale;

import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.google.i18n.phonenumbers.Phonenumber;

/**
 * Entity mapped to table "CONTACT".
 */
public class Contact implements Data {

	private static final long serialVersionUID = 9210368716677650420L;
	private Long id;
	private String type;
	private String value;
	private long personId;
	private java.util.Date changed;
	private java.util.Date created;

	public Contact() {
	}

	public Contact(Long id) {
		this.id = id;
	}

	public Contact(Long id, String type, String value, long personId, java.util.Date changed, java.util.Date created) {
		this.id = id;
		this.type = type;
		this.value = value;
		this.personId = personId;
		this.changed = changed;
		this.created = created;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public long getPersonId() {
		return personId;
	}

	public void setPersonId(long personId) {
		this.personId = personId;
	}

	public java.util.Date getChanged() {
		return changed;
	}

	public void setChanged(java.util.Date changed) {
		this.changed = changed;
	}

	public java.util.Date getCreated() {
		return created;
	}

	public void setCreated(java.util.Date created) {
		this.created = created;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {
		if (type.toLowerCase(Locale.getDefault()).startsWith("tele")
				|| type.toLowerCase(Locale.getDefault()).matches("mobile")) {

			PhoneNumberUtil phoneUtil = PhoneNumberUtil.getInstance();

			try {
				Phonenumber.PhoneNumber phoneNumber = phoneUtil.parse(value, Locale.getDefault().getCountry());
				if (phoneUtil.isValidNumber(phoneNumber))
					return type + ": " + phoneUtil.format(phoneNumber, PhoneNumberUtil.PhoneNumberFormat.NATIONAL);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return type + ": " + value;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		Contact contact = (Contact) o;

		if (personId != contact.personId)
			return false;
		if (id != null ? !id.equals(contact.id) : contact.id != null)
			return false;
		if (type != null ? !type.equals(contact.type) : contact.type != null)
			return false;
		if (value != null ? !value.equals(contact.value) : contact.value != null)
			return false;
		if (changed != null ? !changed.equals(contact.changed) : contact.changed != null)
			return false;
		if (created != null ? !created.equals(contact.created) : contact.created != null)
			return false;
		return true;

	}

	@Override
	public int hashCode() {
		int result = id != null ? id.hashCode() : 0;
		result = 31 * result + (type != null ? type.hashCode() : 0);
		result = 31 * result + (value != null ? value.hashCode() : 0);
		result = 31 * result + (int) (personId ^ (personId >>> 32));
		result = 31 * result + (changed != null ? changed.hashCode() : 0);
		result = 31 * result + (created != null ? created.hashCode() : 0);
		return result;
	}

}
