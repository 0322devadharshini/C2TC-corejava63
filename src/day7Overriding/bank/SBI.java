package day7Overriding.bank;

//sub class of parent
	public class SBI extends RBI {
		@Override
		public float getRateOfInterest() {
			return 7.0f;
		}

		public SBI getObject() {
			return this;
		}
	}

