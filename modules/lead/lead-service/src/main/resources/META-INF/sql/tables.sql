create table LEAD_BlackList (
	blackListId LONG not null primary key,
	numero VARCHAR(75) null
);

create table LEAD_CallCenter (
	uuid_ VARCHAR(75) null,
	callCenterId LONG not null primary key,
	campaignId LONG,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	dueDate DATE null,
	status INTEGER,
	statusByUserId LONG,
	statusByUserName VARCHAR(75) null,
	statusDate DATE null,
	title STRING null,
	description VARCHAR(75) null,
	source VARCHAR(75) null,
	type_ VARCHAR(75) null,
	product VARCHAR(75) null,
	hasEmail BOOLEAN,
	hasPhone BOOLEAN,
	hasName BOOLEAN,
	extra1 BOOLEAN,
	extra2 BOOLEAN,
	extra3 BOOLEAN,
	totalScoring INTEGER
);

create table LEAD_Campaign (
	uuid_ VARCHAR(75) null,
	campaignId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	dueDate DATE null,
	status INTEGER,
	statusByUserId LONG,
	statusByUserName VARCHAR(75) null,
	statusDate DATE null,
	title STRING null,
	description VARCHAR(75) null
);

create table LEAD_Lead (
	uuid_ VARCHAR(75) null,
	leadId LONG not null primary key,
	campaignId LONG,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	dueDate DATE null,
	status INTEGER,
	statusByUserId LONG,
	statusByUserName VARCHAR(75) null,
	statusDate DATE null,
	title STRING null,
	description VARCHAR(75) null,
	source VARCHAR(75) null,
	type_ VARCHAR(75) null,
	product VARCHAR(75) null,
	hasEmail BOOLEAN,
	hasPhone BOOLEAN,
	hasName BOOLEAN,
	extra1 BOOLEAN,
	extra2 BOOLEAN,
	extra3 BOOLEAN,
	totalScoring INTEGER
);

create table LEAD_LeadScoring (
	leadScoringId LONG not null primary key,
	groupId LONG,
	leadId LONG,
	createDate DATE null,
	msisdn VARCHAR(75) null,
	email VARCHAR(75) null,
	name VARCHAR(75) null,
	surname VARCHAR(75) null,
	extra1 VARCHAR(75) null,
	extra2 VARCHAR(75) null,
	extra3 VARCHAR(75) null,
	dateSchedule DATE null,
	url VARCHAR(500) null,
	utmSource VARCHAR(75) null,
	utmMedium VARCHAR(75) null,
	utmContent VARCHAR(75) null,
	utmCampaign VARCHAR(75) null,
	utmTerm VARCHAR(75) null,
	otherSource VARCHAR(75) null,
	responseWS VARCHAR(75) null,
	idCCWS VARCHAR(75) null,
	reTryDate DATE null,
	ipCliente VARCHAR(75) null,
	origen VARCHAR(75) null
);

create table LEAD_Nir (
	lada VARCHAR(75) not null,
	serie VARCHAR(75) not null,
	primary key (lada, serie)
);