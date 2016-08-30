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

package org.liferay.jukebox.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.StagedAuditedModel;
import com.liferay.portal.kernel.model.TrashedModel;
import com.liferay.portal.kernel.model.WorkflowedModel;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.trash.TrashHandler;

import com.liferay.trash.kernel.model.TrashEntry;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Artist service. Represents a row in the &quot;jukebox_Artist&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link org.liferay.jukebox.model.impl.ArtistModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link org.liferay.jukebox.model.impl.ArtistImpl}.
 * </p>
 *
 * @author Julio Camarero
 * @see Artist
 * @see org.liferay.jukebox.model.impl.ArtistImpl
 * @see org.liferay.jukebox.model.impl.ArtistModelImpl
 * @generated
 */
@ProviderType
public interface ArtistModel extends BaseModel<Artist>, GroupedModel,
	ShardedModel, StagedAuditedModel, TrashedModel, WorkflowedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a artist model instance should use the {@link Artist} interface instead.
	 */

	/**
	 * Returns the primary key of this artist.
	 *
	 * @return the primary key of this artist
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this artist.
	 *
	 * @param primaryKey the primary key of this artist
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this artist.
	 *
	 * @return the uuid of this artist
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this artist.
	 *
	 * @param uuid the uuid of this artist
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the artist ID of this artist.
	 *
	 * @return the artist ID of this artist
	 */
	public long getArtistId();

	/**
	 * Sets the artist ID of this artist.
	 *
	 * @param artistId the artist ID of this artist
	 */
	public void setArtistId(long artistId);

	/**
	 * Returns the company ID of this artist.
	 *
	 * @return the company ID of this artist
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this artist.
	 *
	 * @param companyId the company ID of this artist
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the group ID of this artist.
	 *
	 * @return the group ID of this artist
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this artist.
	 *
	 * @param groupId the group ID of this artist
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the user ID of this artist.
	 *
	 * @return the user ID of this artist
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this artist.
	 *
	 * @param userId the user ID of this artist
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this artist.
	 *
	 * @return the user uuid of this artist
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this artist.
	 *
	 * @param userUuid the user uuid of this artist
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this artist.
	 *
	 * @return the user name of this artist
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this artist.
	 *
	 * @param userName the user name of this artist
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this artist.
	 *
	 * @return the create date of this artist
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this artist.
	 *
	 * @param createDate the create date of this artist
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this artist.
	 *
	 * @return the modified date of this artist
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this artist.
	 *
	 * @param modifiedDate the modified date of this artist
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the status of this artist.
	 *
	 * @return the status of this artist
	 */
	@Override
	public int getStatus();

	/**
	 * Sets the status of this artist.
	 *
	 * @param status the status of this artist
	 */
	@Override
	public void setStatus(int status);

	/**
	 * Returns the status by user ID of this artist.
	 *
	 * @return the status by user ID of this artist
	 */
	@Override
	public long getStatusByUserId();

	/**
	 * Sets the status by user ID of this artist.
	 *
	 * @param statusByUserId the status by user ID of this artist
	 */
	@Override
	public void setStatusByUserId(long statusByUserId);

	/**
	 * Returns the status by user uuid of this artist.
	 *
	 * @return the status by user uuid of this artist
	 */
	@Override
	public String getStatusByUserUuid();

	/**
	 * Sets the status by user uuid of this artist.
	 *
	 * @param statusByUserUuid the status by user uuid of this artist
	 */
	@Override
	public void setStatusByUserUuid(String statusByUserUuid);

	/**
	 * Returns the status by user name of this artist.
	 *
	 * @return the status by user name of this artist
	 */
	@AutoEscape
	@Override
	public String getStatusByUserName();

	/**
	 * Sets the status by user name of this artist.
	 *
	 * @param statusByUserName the status by user name of this artist
	 */
	@Override
	public void setStatusByUserName(String statusByUserName);

	/**
	 * Returns the status date of this artist.
	 *
	 * @return the status date of this artist
	 */
	@Override
	public Date getStatusDate();

	/**
	 * Sets the status date of this artist.
	 *
	 * @param statusDate the status date of this artist
	 */
	@Override
	public void setStatusDate(Date statusDate);

	/**
	 * Returns the name of this artist.
	 *
	 * @return the name of this artist
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this artist.
	 *
	 * @param name the name of this artist
	 */
	public void setName(String name);

	/**
	 * Returns the bio of this artist.
	 *
	 * @return the bio of this artist
	 */
	@AutoEscape
	public String getBio();

	/**
	 * Sets the bio of this artist.
	 *
	 * @param bio the bio of this artist
	 */
	public void setBio(String bio);

	/**
	 * Returns the trash entry created when this artist was moved to the Recycle Bin. The trash entry may belong to one of the ancestors of this artist.
	 *
	 * @return the trash entry created when this artist was moved to the Recycle Bin
	 */
	@Override
	public TrashEntry getTrashEntry() throws PortalException;

	/**
	 * Returns the class primary key of the trash entry for this artist.
	 *
	 * @return the class primary key of the trash entry for this artist
	 */
	@Override
	public long getTrashEntryClassPK();

	/**
	 * Returns the trash handler for this artist.
	 *
	 * @return the trash handler for this artist
	 */
	@Override
	public TrashHandler getTrashHandler();

	/**
	 * Returns <code>true</code> if this artist is in the Recycle Bin.
	 *
	 * @return <code>true</code> if this artist is in the Recycle Bin; <code>false</code> otherwise
	 */
	@Override
	public boolean isInTrash();

	/**
	 * Returns <code>true</code> if the parent of this artist is in the Recycle Bin.
	 *
	 * @return <code>true</code> if the parent of this artist is in the Recycle Bin; <code>false</code> otherwise
	 */
	@Override
	public boolean isInTrashContainer();

	@Override
	public boolean isInTrashExplicitly();

	@Override
	public boolean isInTrashImplicitly();

	/**
	 * Returns <code>true</code> if this artist is approved.
	 *
	 * @return <code>true</code> if this artist is approved; <code>false</code> otherwise
	 */
	@Override
	public boolean isApproved();

	/**
	 * Returns <code>true</code> if this artist is denied.
	 *
	 * @return <code>true</code> if this artist is denied; <code>false</code> otherwise
	 */
	@Override
	public boolean isDenied();

	/**
	 * Returns <code>true</code> if this artist is a draft.
	 *
	 * @return <code>true</code> if this artist is a draft; <code>false</code> otherwise
	 */
	@Override
	public boolean isDraft();

	/**
	 * Returns <code>true</code> if this artist is expired.
	 *
	 * @return <code>true</code> if this artist is expired; <code>false</code> otherwise
	 */
	@Override
	public boolean isExpired();

	/**
	 * Returns <code>true</code> if this artist is inactive.
	 *
	 * @return <code>true</code> if this artist is inactive; <code>false</code> otherwise
	 */
	@Override
	public boolean isInactive();

	/**
	 * Returns <code>true</code> if this artist is incomplete.
	 *
	 * @return <code>true</code> if this artist is incomplete; <code>false</code> otherwise
	 */
	@Override
	public boolean isIncomplete();

	/**
	 * Returns <code>true</code> if this artist is pending.
	 *
	 * @return <code>true</code> if this artist is pending; <code>false</code> otherwise
	 */
	@Override
	public boolean isPending();

	/**
	 * Returns <code>true</code> if this artist is scheduled.
	 *
	 * @return <code>true</code> if this artist is scheduled; <code>false</code> otherwise
	 */
	@Override
	public boolean isScheduled();

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(Artist artist);

	@Override
	public int hashCode();

	@Override
	public CacheModel<Artist> toCacheModel();

	@Override
	public Artist toEscapedModel();

	@Override
	public Artist toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}