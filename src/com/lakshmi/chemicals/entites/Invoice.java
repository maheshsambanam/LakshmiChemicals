package com.lakshmi.chemicals.entites;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "invoice")
public class Invoice {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;

	@ManyToOne
	@JoinColumn(name = "admin_user_id")
	private User adminUser;

	@ManyToOne
	@JoinColumn(name = "customer_id")
	private User customer;

	@Column(name = "billing_date")
	@Temporal(TemporalType.DATE)
	private Date billingDate;

	@Column(name = "customer_order_no")
	private String customerOrderNo;

	@Column(name = "customer_billing_date")
	@Temporal(TemporalType.DATE)
	private Date customerBillingDate;

	@Column(name = "despatched_through")
	private String despatchedThrough;

	@Column(name = "destination")
	private String destination;

	@Column(name = "date_time_issue_of_invoice")
	@Temporal(TemporalType.DATE)
	private Date dateTimeOfIssueOfInvoice;

	@Column(name = "motor_vehicle_no")
	private String motorVehicleNo;

	@Column(name = "dated_time_of_removal_of_goods")
	@Temporal(TemporalType.DATE)
	private Date dateTimeOfRemovalOfGoods;

	@Column(name = "delivery_address")
	private String deliveryAddress;

	@ElementCollection(fetch = FetchType.EAGER)
	@JoinTable(name = "ordered_product", joinColumns = @JoinColumn(name = "invoice_id"))
	private Collection<OrderedProduct> orderedProduct = new ArrayList<OrderedProduct>();

	@ManyToOne
	@JoinColumn(name = "tax_id")
	private Tax tax;

	@Column(name = "ex_duty")
	private int exDuty;

	@Column(name = "edn_cess")
	private int ednCess;

	@Column(name = "sh_edn_cess")
	private int shEdnCesss;

	@Column(name = "sub_total")
	private int subTotal;

	@Column(name = "tn_vat")
	private int tnVatTin;

	@Column(name = "grand_total")
	private int grandTotal;

	// getters and setters

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getAdminUser() {
		return adminUser;
	}

	public void setAdminUser(User adminUser) {
		this.adminUser = adminUser;
	}

	public User getCustomer() {
		return customer;
	}

	public void setCustomer(User customer) {
		this.customer = customer;
	}

	public Date getBillingDate() {
		return billingDate;
	}

	public void setBillingDate(Date billingDate) {
		this.billingDate = billingDate;
	}

	public String getCustomerOrderNo() {
		return customerOrderNo;
	}

	public void setCustomerOrderNo(String customerOrderNo) {
		this.customerOrderNo = customerOrderNo;
	}

	public Date getCustomerBillingDate() {
		return customerBillingDate;
	}

	public void setCustomerBillingDate(Date customerBillingDate) {
		this.customerBillingDate = customerBillingDate;
	}

	public String getDespatchedThrough() {
		return despatchedThrough;
	}

	public void setDespatchedThrough(String despatchedThrough) {
		this.despatchedThrough = despatchedThrough;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public Date getDateTimeOfIssueOfInvoice() {
		return dateTimeOfIssueOfInvoice;
	}

	public void setDateTimeOfIssueOfInvoice(Date dateTimeOfIssueOfInvoice) {
		this.dateTimeOfIssueOfInvoice = dateTimeOfIssueOfInvoice;
	}

	public String getMotorVehicleNo() {
		return motorVehicleNo;
	}

	public void setMotorVehicleNo(String motorVehicleNo) {
		this.motorVehicleNo = motorVehicleNo;
	}

	public Date getDateTimeOfRemovalOfGoods() {
		return dateTimeOfRemovalOfGoods;
	}

	public void setDateTimeOfRemovalOfGoods(Date dateTimeOfRemovalOfGoods) {
		this.dateTimeOfRemovalOfGoods = dateTimeOfRemovalOfGoods;
	}

	public String getDeliveryAddress() {
		return deliveryAddress;
	}

	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

	public Tax getTax() {
		return tax;
	}

	public void setTax(Tax tax) {
		this.tax = tax;
	}

	public int getExDuty() {
		return exDuty;
	}

	public void setExDuty(int exDuty) {
		this.exDuty = exDuty;
	}

	public int getEdnCess() {
		return ednCess;
	}

	public void setEdnCess(int ednCess) {
		this.ednCess = ednCess;
	}

	public int getShEdnCesss() {
		return shEdnCesss;
	}

	public void setShEdnCesss(int shEdnCesss) {
		this.shEdnCesss = shEdnCesss;
	}

	public int getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(int subTotal) {
		this.subTotal = subTotal;
	}

	public int getTnVatTin() {
		return tnVatTin;
	}

	public void setTnVatTin(int tnVatTin) {
		this.tnVatTin = tnVatTin;
	}

	public int getGrandTotal() {
		return grandTotal;
	}

	public void setGrandTotal(int grandTotal) {
		this.grandTotal = grandTotal;
	}

	public Collection<OrderedProduct> getOrderedProduct() {
		return orderedProduct;
	}

	public void setOrderedProduct(Collection<OrderedProduct> orderedProduct) {
		this.orderedProduct = orderedProduct;
	}

	@Override
	public String toString() {
		return "Invoice [id=" + id + ", adminUser=" + adminUser + ", customer="
				+ customer + ", billingDate=" + billingDate
				+ ", customerOrderNo=" + customerOrderNo
				+ ", customerBillingDate=" + customerBillingDate
				+ ", despatchedThrough=" + despatchedThrough + ", destination="
				+ destination + ", dateTimeOfIssueOfInvoice="
				+ dateTimeOfIssueOfInvoice + ", motorVehicleNo="
				+ motorVehicleNo + ", dateTimeOfRemovalOfGoods="
				+ dateTimeOfRemovalOfGoods + ", deliveryAddress="
				+ deliveryAddress + ", orderedProduct=" + orderedProduct
				+ ", tax=" + tax + ", exDuty=" + exDuty + ", ednCess="
				+ ednCess + ", shEdnCesss=" + shEdnCesss + ", subTotal="
				+ subTotal + ", tnVatTin=" + tnVatTin + ", grandTotal="
				+ grandTotal + "]";
	}

}
