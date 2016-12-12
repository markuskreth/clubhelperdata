package de.kreth.clubhelperbackend.pojo;

/**
 * Entity mapped to table "RELATIVE".
 */
public class Relative implements Data {

	private static final long serialVersionUID = -8260891911558054631L;
	private Long id;
	private long person1;
	private long person2;
	private String toPerson2Relation;
	private String toPerson1Relation;
	private java.util.Date changed;
	private java.util.Date created;

	public Relative() {
	}

	public Relative(Long id) {
		this.id = id;
	}

	public Relative(Long id, long person1, long person2, String toPerson2Relation, String toPerson1Relation,
			java.util.Date changed, java.util.Date created) {
		this.id = id;
		this.person1 = person1;
		this.person2 = person2;
		this.toPerson2Relation = toPerson2Relation;
		this.toPerson1Relation = toPerson1Relation;
		this.changed = changed;
		this.created = created;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public long getPerson1() {
		return person1;
	}

	public void setPerson1(long person1) {
		this.person1 = person1;
	}

	public long getPerson2() {
		return person2;
	}

	public void setPerson2(long person2) {
		this.person2 = person2;
	}

	public String getToPerson2Relation() {
		return toPerson2Relation;
	}

	public void setToPerson2Relation(String toPerson2Relation) {
		this.toPerson2Relation = toPerson2Relation;
	}

	public String getToPerson1Relation() {
		return toPerson1Relation;
	}

	public void setToPerson1Relation(String toPerson1Relation) {
		this.toPerson1Relation = toPerson1Relation;
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
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		Relative relative = (Relative) o;

		if (person1 != relative.person1)
			return false;
		if (person2 != relative.person2)
			return false;
		if (id != null ? !id.equals(relative.id) : relative.id != null)
			return false;
		if (toPerson2Relation != null ? !toPerson2Relation.equals(relative.toPerson2Relation)
				: relative.toPerson2Relation != null)
			return false;
		if (toPerson1Relation != null ? !toPerson1Relation.equals(relative.toPerson1Relation)
				: relative.toPerson1Relation != null)
			return false;
		if (changed != null ? !changed.equals(relative.changed) : relative.changed != null)
			return false;
		if (created != null ? !created.equals(relative.created) : relative.created != null)
			return false;
		return true;

	}

	@Override
	public int hashCode() {
		int result = id != null ? id.hashCode() : 0;
		result = 31 * result + (int) (person1 ^ (person1 >>> 32));
		result = 31 * result + (int) (person2 ^ (person2 >>> 32));
		result = 31 * result + (toPerson2Relation != null ? toPerson2Relation.hashCode() : 0);
		result = 31 * result + (toPerson1Relation != null ? toPerson1Relation.hashCode() : 0);
		result = 31 * result + (changed != null ? changed.hashCode() : 0);
		result = 31 * result + (created != null ? created.hashCode() : 0);
		return result;
	}

}
