package com.example.bookstoreaccountservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@Entity
@Table(name = "oauth_client_details")
@Builder
@NoArgsConstructor
@AllArgsConstructor 
public class OAuthClient  {

	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	@Column(name = "CLIENT_ID", updatable = false, nullable = false)
	private String client_id;

	@Column(name = "CLIENT_SECRET", updatable = false, nullable = false)
	private String client_secret;
	private String authorized_grant_types;
	private String authorities;
	private String scope;
	private String resource_ids;
}
