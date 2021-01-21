package com.cdac.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="orders")
public class Order {
	@Id
	@GeneratedValue
	@Column(name="orderid")
	private int orderId;
	@Column(name="rid")
	private int requesterId;
	@Column(name="rname")
	private String requesterName;
	@Column(name="remail")
	private String requesterEmail;
	@Column(name="raddress")
	private String requesterAddress;
	@Column(name="rpincode")
	private long requesterPincode;
	@Column(name="rmobileno")
	private long requesterMobileNo;
	@Column(name="rbookid")
	private long requesterBookId;
	@Column(name="rtitle")
	private String requesterTitle;
	@Column(name="rauthor")
	private String requesterAuthor;
	@Column(name="rpublisher")
	private String requesterPublisher;
	@Column(name="rrequesterCost")
	private int requestercost;
	//
	@Column(name="gid")
	private int granterId;
	@Column(name="gname")
	private String granterName;
	@Column(name="gemail")
	private String granterEmail;
	@Column(name="gaddress")
	private String granterAddress;
	@Column(name="gpincode")
	private long granterPincode;
	@Column(name="gmobileno")
	private long granterMobileNo;
	@Column(name="gbookid")
	private long granterBookId;
	@Column(name="gtitle")
	private String granterTitle;
	@Column(name="gauthor")
	private String granterAuthor;
	@Column(name="gpublisher")
	private String granterPublisher;
	@Column(name="gcost")
	private int granterCost;
	//no para cnstr
	public Order() {
		
	}
	//para cnstr
	
	
	//getter setter
	public int getOrderId() {
		return orderId;
	}
	public Order(int orderId, int requesterId, String requesterName, String requesterEmail, String requesterAddress,
			long requesterPincode, long requesterMobileNo, long requesterBookId, String requesterTitle,
			String requesterAuthor, String requesterPublisher, int requestercost, int granterId, String granterName,
			String granterEmail, String granterAddress, long granterPincode, long granterMobileNo, long granterBookId,
			String granterTitle, String granterAuthor, String granterPublisher, int granterCost) {
		this.orderId = orderId;
		this.requesterId = requesterId;
		this.requesterName = requesterName;
		this.requesterEmail = requesterEmail;
		this.requesterAddress = requesterAddress;
		this.requesterPincode = requesterPincode;
		this.requesterMobileNo = requesterMobileNo;
		this.requesterBookId = requesterBookId;
		this.requesterTitle = requesterTitle;
		this.requesterAuthor = requesterAuthor;
		this.requesterPublisher = requesterPublisher;
		this.requestercost = requestercost;
		this.granterId = granterId;
		this.granterName = granterName;
		this.granterEmail = granterEmail;
		this.granterAddress = granterAddress;
		this.granterPincode = granterPincode;
		this.granterMobileNo = granterMobileNo;
		this.granterBookId = granterBookId;
		this.granterTitle = granterTitle;
		this.granterAuthor = granterAuthor;
		this.granterPublisher = granterPublisher;
		this.granterCost = granterCost;
	}


	public int getRequesterId() {
		return requesterId;
	}


	public void setRequesterId(int requesterId) {
		this.requesterId = requesterId;
	}


	public String getRequesterName() {
		return requesterName;
	}


	public void setRequesterName(String requesterName) {
		this.requesterName = requesterName;
	}


	public String getRequesterEmail() {
		return requesterEmail;
	}


	public void setRequesterEmail(String requesterEmail) {
		this.requesterEmail = requesterEmail;
	}


	public String getRequesterAddress() {
		return requesterAddress;
	}


	public void setRequesterAddress(String requesterAddress) {
		this.requesterAddress = requesterAddress;
	}


	public long getRequesterPincode() {
		return requesterPincode;
	}


	public void setRequesterPincode(long requesterPincode) {
		this.requesterPincode = requesterPincode;
	}


	public long getRequesterMobileNo() {
		return requesterMobileNo;
	}


	public void setRequesterMobileNo(long requesterMobileNo) {
		this.requesterMobileNo = requesterMobileNo;
	}


	public long getRequesterBookId() {
		return requesterBookId;
	}


	public void setRequesterBookId(long requesterBookId) {
		this.requesterBookId = requesterBookId;
	}


	public String getRequesterTitle() {
		return requesterTitle;
	}


	public void setRequesterTitle(String requesterTitle) {
		this.requesterTitle = requesterTitle;
	}


	public String getRequesterAuthor() {
		return requesterAuthor;
	}


	public void setRequesterAuthor(String requesterAuthor) {
		this.requesterAuthor = requesterAuthor;
	}


	public String getRequesterPublisher() {
		return requesterPublisher;
	}


	public void setRequesterPublisher(String requesterPublisher) {
		this.requesterPublisher = requesterPublisher;
	}


	public int getRequestercost() {
		return requestercost;
	}


	public void setRequestercost(int requestercost) {
		this.requestercost = requestercost;
	}


	public int getGranterId() {
		return granterId;
	}


	public void setGranterId(int granterId) {
		this.granterId = granterId;
	}


	public String getGranterName() {
		return granterName;
	}


	public void setGranterName(String granterName) {
		this.granterName = granterName;
	}


	public String getGranterEmail() {
		return granterEmail;
	}


	public void setGranterEmail(String granterEmail) {
		this.granterEmail = granterEmail;
	}


	public String getGranterAddress() {
		return granterAddress;
	}


	public void setGranterAddress(String granterAddress) {
		this.granterAddress = granterAddress;
	}


	public long getGranterPincode() {
		return granterPincode;
	}


	public void setGranterPincode(long granterPincode) {
		this.granterPincode = granterPincode;
	}


	public long getGranterMobileNo() {
		return granterMobileNo;
	}


	public void setGranterMobileNo(long granterMobileNo) {
		this.granterMobileNo = granterMobileNo;
	}


	public long getGranterBookId() {
		return granterBookId;
	}


	public void setGranterBookId(long granterBookId) {
		this.granterBookId = granterBookId;
	}


	public String getGranterTitle() {
		return granterTitle;
	}


	public void setGranterTitle(String granterTitle) {
		this.granterTitle = granterTitle;
	}


	public String getGranterAuthor() {
		return granterAuthor;
	}


	public void setGranterAuthor(String granterAuthor) {
		this.granterAuthor = granterAuthor;
	}


	public String getGranterPublisher() {
		return granterPublisher;
	}


	public void setGranterPublisher(String granterPublisher) {
		this.granterPublisher = granterPublisher;
	}


	public int getGranterCost() {
		return granterCost;
	}


	public void setGranterCost(int granterCost) {
		this.granterCost = granterCost;
	}


	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}


	
}
