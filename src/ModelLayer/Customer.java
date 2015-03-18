package ModelLayer;
import ModelLayer.Enums.CustomerType;



public class Customer {

	private int id;
	private String lname;
	private String fname;
	private String address;
	private String zipcode;
	private String phonenumber;
	private String email;
	private CustomerType customertype;
	
	   public Customer(int id, String lname, String fname, String address, String zipcode, String phonenumber, String email, CustomerType customertype) {
	       this.id = id; 
	       this.lname = lname;
	       this.address = address;
	       this.zipcode = zipcode;
	       this.phonenumber = phonenumber;
	       this.email = email;
	       this.customertype = customertype;
		   
	    }
	   
		/**  Gets the id
		 * @return id
		 */
	   public int getId() {
			return id;
		}

		//public void setId(int id) {
			//this.id = id;
		//}

	   
		/**  Gets the lname
		 * @return lname
		 */
		public String getLname() {
			return lname;
		}
		/**  sets the lname
		 */
		public void setLname(String lname) {
			this.lname = lname;
		}

		/**  Gets the fname
		 * @return fname
		 */
		public String getFname() {
			return fname;
		}

		/**  sets the fname
		 */
		public void setFname(String fname) {
			this.fname = fname;
		}

		/**  Gets the address
		 * @return address
		 */
		public String getAddress() {
			return address;
		}

		/**  sets the address
		 */
		public void setAddress(String address) {
			this.address = address;
		}

		/**  Gets the zipcode
		 * @return zipcode
		 */
		public String getZipcode() {
			return zipcode;
		}

		/**  sets the zipcode
		 */
		public void setZipcode(String zipcode) {
			this.zipcode = zipcode;
		}

		/**  Gets the phonenumber
		 * @return phonenumber
		 */
		public String getPhonenumber() {
			return phonenumber;
		}

		/**  sets the phonenumber
		 */
		public void setPhonenumber(String phonenumber) {
			this.phonenumber = phonenumber;
		}

		/**  Gets the email
		 * @return email
		 */
		public String getEmail() {
			return email;
		}

		/**  sets the email
		 */
		public void setEmail(String email) {
			this.email = email;
		}

		/**  Gets the customertype
		 * @return customertype
		 */
		public CustomerType getCustomertype() {
			return customertype;
		}

		/**  sets the customertype
		 */
		public void setCustomertype(CustomerType customertype) {
			this.customertype = customertype;
		}
	
}
