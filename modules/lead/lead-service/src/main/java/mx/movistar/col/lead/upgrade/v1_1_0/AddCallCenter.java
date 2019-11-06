package mx.movistar.col.lead.upgrade.v1_1_0;
import com.liferay.portal.kernel.upgrade.UpgradeProcess;

public class AddCallCenter extends UpgradeProcess {
	@Override
    protected void doUpgrade() throws Exception {
        runSQL("create table LEAD_CallCenter (\r\n" + 
        		"uuid_ VARCHAR(75) null,\r\n" + 
        		"callCenterId LONG not null primary key,\r\n" + 
        		"campaignId LONG,\r\n" + 
        		"groupId LONG,\r\n" + 
        		"companyId LONG,\r\n" + 
        		"userId LONG,\r\n" + 
        		"userName VARCHAR(75) null,\r\n" + 
        		"createDate DATE null,\r\n" + 
        		"modifiedDate DATE null,\r\n" + 
        		"dueDate DATE null,\r\n" + 
        		"status INTEGER,\r\n" + 
        		"statusByUserId LONG,\r\n" + 
        		"statusByUserName VARCHAR(75) null,\r\n" + 
        		"statusDate DATE null,\r\n" + 
        		"title STRING null,\r\n" + 
        		"description VARCHAR(75) null,\r\n" + 
        		"source VARCHAR(75) null,\r\n" + 
        		"type_ VARCHAR(75) null,\r\n" + 
        		"product VARCHAR(75) null,\r\n" + 
        		"hasEmail BOOLEAN,\r\n" + 
        		"hasPhone BOOLEAN,\r\n" + 
        		"hasName BOOLEAN,\r\n" + 
        		"extra1 BOOLEAN,\r\n" + 
        		"extra2 BOOLEAN,\r\n" + 
        		"extra3 BOOLEAN,\r\n" + 
        		"totalScoring INTEGER\r\n" + 
        		");");
    }
}
