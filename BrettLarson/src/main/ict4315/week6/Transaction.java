
package main.ict4315.week6;

/**The Transaction class represents one transaction
 * @author Brett Larson
 * @version 1.0
 */
public class Transaction {
	
	private String transactionId;
	private String date;
	private String description;
	private double amount;
	private TransactionType type;
	//public Object toString;
	
	/**
	 * Constructor that takes no variables
	 */
	public Transaction() {
	}

	/**Constructor that takes all variables
	 * @param id
	 * @param date
	 * @param description
	 * @param amount
	 * @param transaction
	 */
	public Transaction(String transactionId, String date, String description, double amount, String type) {
		this.transactionId = transactionId;
		this.date = date;
		this.description = description;
		this.amount = amount;
		
		//Logic to set the enum value to debit or credit based on input
		if(type.contentEquals("CREDIT")) {
			this.type = TransactionType.CREDIT;
		} else if (type.contentEquals("DEBIT")) {
			this.type = TransactionType.DEBIT;
		}
	}

	/**
	 * @return the transactionId
	 */
	public String getTransactionId() {
		return transactionId;
	}

	/**
	 * @param id the id to set
	 */
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	/**
	 * @return the date
	 */
	public String getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(String date) {
		this.date = date;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the amount
	 */
	public double getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(double amount) {
		this.amount = amount;
	}

	/**
	 * @return the transaction
	 */
	public TransactionType getType() {
		return type;
	}

	/**
	 * @param transaction the transaction to set
	 */
	public void setTransactionType(String type) {
		
		//Logic to set the enum value to debit or credit based on input
		if(type.contentEquals("CREDIT")) {
			this.type = TransactionType.CREDIT;
		} else if (type.contentEquals("DEBIT")) {
			this.type = TransactionType.DEBIT;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Transaction other = (Transaction) obj;
		if (Double.doubleToLongBits(amount) != Double.doubleToLongBits(other.amount))
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (transactionId == null) {
			if (other.transactionId != null)
				return false;
		} else if (!transactionId.equals(other.transactionId))
			return false;
		if (type != other.type)
			return false;
		return true;
	}
	
	

	@Override
	public String toString() {
		return "Transaction [transactionId=" + transactionId + ", date=" + date + ", description=" + description
				+ ", amount=" + amount + ", type=" + type + "]";
	}

	/**The isAmountValid method validates the amount is less than $100,000.00.
	 * @return boolean value returns true if amount is greater than 0 and less than 100,000. Otherwise returns false.
	 */
	public boolean isAmountValid() {
		
		//Setting the boolean value for retValue to true.
		boolean retValue = true;
		
		//Set the retValue to false if amount < 0.00 or > 99,999.99
		if (amount >= 100000.00) {
			retValue = false;
		} else if (amount <= 0.00) {
			retValue = false;
		}
		
		return retValue;
	
	}

}
