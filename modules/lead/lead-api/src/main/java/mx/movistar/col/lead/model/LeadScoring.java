/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package mx.movistar.col.lead.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the LeadScoring service. Represents a row in the &quot;LEAD_LeadScoring&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see LeadScoringModel
 * @generated
 */
@ImplementationClassName("mx.movistar.col.lead.model.impl.LeadScoringImpl")
@ProviderType
public interface LeadScoring extends LeadScoringModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>mx.movistar.col.lead.model.impl.LeadScoringImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<LeadScoring, Long> LEAD_SCORING_ID_ACCESSOR =
		new Accessor<LeadScoring, Long>() {

			@Override
			public Long get(LeadScoring leadScoring) {
				return leadScoring.getLeadScoringId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<LeadScoring> getTypeClass() {
				return LeadScoring.class;
			}

		};

}