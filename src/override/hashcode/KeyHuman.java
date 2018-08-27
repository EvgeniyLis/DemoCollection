package override.hashcode;

public class KeyHuman {
	
	private String keyPart1;
	private String keyPart2;
	private String keyPart3;
	
	public KeyHuman(String keyPart1, String keyPart2, String keyPart3) {
		super();
		this.keyPart1 = keyPart1;
		this.keyPart2 = keyPart2;
		this.keyPart3 = keyPart3;
	}

	public String getKeyPart1() {
		return keyPart1;
	}

	public void setKeyPart1(String keyPart1) {
		this.keyPart1 = keyPart1;
	}

	public String getKeyPart2() {
		return keyPart2;
	}

	public void setKeyPart2(String keyPart2) {
		this.keyPart2 = keyPart2;
	}

	public String getKeyPart3() {
		return keyPart3;
	}

	public void setKeyPart3(String keyPart3) {
		this.keyPart3 = keyPart3;
	}

	/*@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((keyPart1 == null) ? 0 : keyPart1.hashCode());
		result = prime * result + ((keyPart2 == null) ? 0 : keyPart2.hashCode());
		result = prime * result + ((keyPart3 == null) ? 0 : keyPart3.hashCode());
		return result;
	}*/

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		KeyHuman other = (KeyHuman) obj;
		if (keyPart1 == null) {
			if (other.keyPart1 != null)
				return false;
		} else if (!keyPart1.equals(other.keyPart1))
			return false;
		if (keyPart2 == null) {
			if (other.keyPart2 != null)
				return false;
		} else if (!keyPart2.equals(other.keyPart2))
			return false;
		if (keyPart3 == null) {
			if (other.keyPart3 != null)
				return false;
		} else if (!keyPart3.equals(other.keyPart3))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "KeyHuman [keyPart1=" + keyPart1 + ", keyPart2=" + keyPart2 + ", keyPart3=" + keyPart3 + "]";
	}
	
	

}
