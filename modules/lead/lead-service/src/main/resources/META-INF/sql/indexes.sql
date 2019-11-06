create index IX_A50F6DD0 on LEAD_BlackList (numero[$COLUMN_LENGTH:75$]);

create index IX_ED0BB1AD on LEAD_CallCenter (groupId, campaignId);
create index IX_F333D488 on LEAD_CallCenter (status, groupId);
create index IX_CA16C670 on LEAD_CallCenter (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_AA7E28F2 on LEAD_CallCenter (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_149AB11 on LEAD_Campaign (groupId);
create index IX_351F77EB on LEAD_Campaign (status, groupId);
create index IX_C59F8F6D on LEAD_Campaign (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_EEAF0D2F on LEAD_Campaign (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_C30EFE44 on LEAD_Lead (groupId, campaignId);
create index IX_E70B049F on LEAD_Lead (status, groupId);
create index IX_51259939 on LEAD_Lead (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_578519FB on LEAD_Lead (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_F6FC7254 on LEAD_LeadScoring (groupId);

create index IX_7D9A6692 on LEAD_Nir (serie[$COLUMN_LENGTH:75$]);