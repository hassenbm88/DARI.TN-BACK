package com.bezkoder.springjwt.models;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

@Entity
@Table(	name = "users", 
		uniqueConstraints = { 
			@UniqueConstraint(columnNames = "username"),
			@UniqueConstraint(columnNames = "email") 
		})
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank
	@Size(max = 20)
	private String username;

	@NotBlank
	@Size(max = 50)
	@Email
	private String email;

	@NotBlank
	@Size(max = 120)
	private String password;
	
	 
	 private String nameOnCard;

	 private String cardNumber;
	    
	 private int cvv;

	 private String address;
	
	//attribut hazem
	
	
	

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(	name = "user_roles", 
				joinColumns = @JoinColumn(name = "user_id"), 
				inverseJoinColumns = @JoinColumn(name = "role_id"))
	private Set<Role> roles = new HashSet<>();

	public User() {
	}

	public User(@NotBlank @Size(max = 20) String username, @NotBlank @Size(max = 50) @Email String email,
			@NotBlank @Size(max = 120) String password, Set<Role> roles) {
		super();
		this.username = username;
		this.email = email;
		this.password = password;
		this.roles = roles;
	}

	public User(String username, String email, String password) {
		this.username = username;
		this.email = email;
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
	
	
	public String getNameOnCard() {
		return nameOnCard;
	}

	public void setNameOnCard(String nameOnCard) {
		this.nameOnCard = nameOnCard;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public int getCvv() {
		return cvv;
	}

	public void setCvv(int cvv) {
		this.cvv = cvv;
	}


	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Category> getCategories() {
		return categories;
	}

	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}
	
	
	public List<Cart> getCarts() {
		return carts;
	}

	public void setCarts(List<Cart> carts) {
		this.carts = carts;
	}

	public void addCategoryToUser(Category category) {
		if (getCategories()==null) {
			this.categories = new ArrayList<>();
		}
		getCategories().add(category);
		category.setUser(this);
	}
   
	public void addCartToUser(Cart cart) {
		if(getCarts()==null) {
			this.carts = new ArrayList<>();	
		}
		getCarts().add(cart);
		cart.setUser(this);
	}
	public void removeFromCart(Cart cart) {
		if (getCarts()!=null) {
			getCarts().remove(cart);
		}
	}
	 
	
	/*@OneToMany(mappedBy="user", cascade = CascadeType.ALL)
	private Set<Proprety>propreties ;	
	
	@OneToMany(mappedBy="user", cascade = CascadeType.ALL)
	private Set<Report>Reports ;
	@OneToMany(mappedBy="user", cascade = CascadeType.ALL)
	private Set<Recrutement>Recrutements ;
	@OneToMany(mappedBy="user", cascade = CascadeType.ALL)
	private Set<Annonce>annonces ;
	@OneToMany(mappedBy="user", cascade = CascadeType.ALL)
	private Set<SousTraitance> traitances;
	@OneToMany(mappedBy="user", cascade = CascadeType.ALL)
	private Set<Aide> aides*/
	
	
	//annotation hazem
	
	
	 @JsonProperty(access = Access.AUTO)
	 @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
	 private List<Category> categories;
	 
	 @JsonProperty(access = Access.AUTO)
	 @OneToMany(cascade = CascadeType.MERGE, mappedBy = "user")
	 private List<Cart> carts;

	 
	 
}

