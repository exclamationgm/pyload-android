/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package org.pyload.thrift;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.apache.thrift.*;
import org.apache.thrift.async.*;
import org.apache.thrift.meta_data.*;
import org.apache.thrift.transport.*;
import org.apache.thrift.protocol.*;

public class PackageData implements TBase<PackageData, PackageData._Fields>, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("PackageData");

  private static final TField PID_FIELD_DESC = new TField("pid", TType.I32, (short)1);
  private static final TField NAME_FIELD_DESC = new TField("name", TType.STRING, (short)2);
  private static final TField FOLDER_FIELD_DESC = new TField("folder", TType.STRING, (short)3);
  private static final TField SITE_FIELD_DESC = new TField("site", TType.STRING, (short)4);
  private static final TField PASSWORD_FIELD_DESC = new TField("password", TType.STRING, (short)5);
  private static final TField DEST_FIELD_DESC = new TField("dest", TType.I32, (short)6);
  private static final TField ORDER_FIELD_DESC = new TField("order", TType.I16, (short)7);
  private static final TField LINKSDONE_FIELD_DESC = new TField("linksdone", TType.I16, (short)8);
  private static final TField SIZEDONE_FIELD_DESC = new TField("sizedone", TType.I64, (short)9);
  private static final TField SIZETOTAL_FIELD_DESC = new TField("sizetotal", TType.I64, (short)10);
  private static final TField LINKSTOTAL_FIELD_DESC = new TField("linkstotal", TType.I16, (short)11);
  private static final TField LINKS_FIELD_DESC = new TField("links", TType.LIST, (short)12);
  private static final TField FIDS_FIELD_DESC = new TField("fids", TType.LIST, (short)13);

  public int pid;
  public String name;
  public String folder;
  public String site;
  public String password;
  /**
   * 
   * @see Destination
   */
  public Destination dest;
  public short order;
  public short linksdone;
  public long sizedone;
  public long sizetotal;
  public short linkstotal;
  public List<FileData> links;
  public List<Integer> fids;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements TFieldIdEnum {
    PID((short)1, "pid"),
    NAME((short)2, "name"),
    FOLDER((short)3, "folder"),
    SITE((short)4, "site"),
    PASSWORD((short)5, "password"),
    /**
     * 
     * @see Destination
     */
    DEST((short)6, "dest"),
    ORDER((short)7, "order"),
    LINKSDONE((short)8, "linksdone"),
    SIZEDONE((short)9, "sizedone"),
    SIZETOTAL((short)10, "sizetotal"),
    LINKSTOTAL((short)11, "linkstotal"),
    LINKS((short)12, "links"),
    FIDS((short)13, "fids");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // PID
          return PID;
        case 2: // NAME
          return NAME;
        case 3: // FOLDER
          return FOLDER;
        case 4: // SITE
          return SITE;
        case 5: // PASSWORD
          return PASSWORD;
        case 6: // DEST
          return DEST;
        case 7: // ORDER
          return ORDER;
        case 8: // LINKSDONE
          return LINKSDONE;
        case 9: // SIZEDONE
          return SIZEDONE;
        case 10: // SIZETOTAL
          return SIZETOTAL;
        case 11: // LINKSTOTAL
          return LINKSTOTAL;
        case 12: // LINKS
          return LINKS;
        case 13: // FIDS
          return FIDS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __PID_ISSET_ID = 0;
  private static final int __ORDER_ISSET_ID = 1;
  private static final int __LINKSDONE_ISSET_ID = 2;
  private static final int __SIZEDONE_ISSET_ID = 3;
  private static final int __SIZETOTAL_ISSET_ID = 4;
  private static final int __LINKSTOTAL_ISSET_ID = 5;
  private BitSet __isset_bit_vector = new BitSet(6);

  public static final Map<_Fields, FieldMetaData> metaDataMap;
  static {
    Map<_Fields, FieldMetaData> tmpMap = new EnumMap<_Fields, FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PID, new FieldMetaData("pid", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I32        , "PackageID")));
    tmpMap.put(_Fields.NAME, new FieldMetaData("name", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.FOLDER, new FieldMetaData("folder", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.SITE, new FieldMetaData("site", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.PASSWORD, new FieldMetaData("password", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.DEST, new FieldMetaData("dest", TFieldRequirementType.DEFAULT, 
        new EnumMetaData(TType.ENUM, Destination.class)));
    tmpMap.put(_Fields.ORDER, new FieldMetaData("order", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I16)));
    tmpMap.put(_Fields.LINKSDONE, new FieldMetaData("linksdone", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.I16)));
    tmpMap.put(_Fields.SIZEDONE, new FieldMetaData("sizedone", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.I64)));
    tmpMap.put(_Fields.SIZETOTAL, new FieldMetaData("sizetotal", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.I64)));
    tmpMap.put(_Fields.LINKSTOTAL, new FieldMetaData("linkstotal", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.I16)));
    tmpMap.put(_Fields.LINKS, new FieldMetaData("links", TFieldRequirementType.OPTIONAL, 
        new ListMetaData(TType.LIST, 
            new StructMetaData(TType.STRUCT, FileData.class))));
    tmpMap.put(_Fields.FIDS, new FieldMetaData("fids", TFieldRequirementType.OPTIONAL, 
        new ListMetaData(TType.LIST, 
            new FieldValueMetaData(TType.I32            , "FileID"))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    FieldMetaData.addStructMetaDataMap(PackageData.class, metaDataMap);
  }

  public PackageData() {
  }

  public PackageData(
    int pid,
    String name,
    String folder,
    String site,
    String password,
    Destination dest,
    short order)
  {
    this();
    this.pid = pid;
    setPidIsSet(true);
    this.name = name;
    this.folder = folder;
    this.site = site;
    this.password = password;
    this.dest = dest;
    this.order = order;
    setOrderIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public PackageData(PackageData other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.pid = other.pid;
    if (other.isSetName()) {
      this.name = other.name;
    }
    if (other.isSetFolder()) {
      this.folder = other.folder;
    }
    if (other.isSetSite()) {
      this.site = other.site;
    }
    if (other.isSetPassword()) {
      this.password = other.password;
    }
    if (other.isSetDest()) {
      this.dest = other.dest;
    }
    this.order = other.order;
    this.linksdone = other.linksdone;
    this.sizedone = other.sizedone;
    this.sizetotal = other.sizetotal;
    this.linkstotal = other.linkstotal;
    if (other.isSetLinks()) {
      List<FileData> __this__links = new ArrayList<FileData>();
      for (FileData other_element : other.links) {
        __this__links.add(new FileData(other_element));
      }
      this.links = __this__links;
    }
    if (other.isSetFids()) {
      List<Integer> __this__fids = new ArrayList<Integer>();
      for (Integer other_element : other.fids) {
        __this__fids.add(other_element);
      }
      this.fids = __this__fids;
    }
  }

  public PackageData deepCopy() {
    return new PackageData(this);
  }

  
  public void clear() {
    setPidIsSet(false);
    this.pid = 0;
    this.name = null;
    this.folder = null;
    this.site = null;
    this.password = null;
    this.dest = null;
    setOrderIsSet(false);
    this.order = 0;
    setLinksdoneIsSet(false);
    this.linksdone = 0;
    setSizedoneIsSet(false);
    this.sizedone = 0;
    setSizetotalIsSet(false);
    this.sizetotal = 0;
    setLinkstotalIsSet(false);
    this.linkstotal = 0;
    this.links = null;
    this.fids = null;
  }

  public int getPid() {
    return this.pid;
  }

  public PackageData setPid(int pid) {
    this.pid = pid;
    setPidIsSet(true);
    return this;
  }

  public void unsetPid() {
    __isset_bit_vector.clear(__PID_ISSET_ID);
  }

  /** Returns true if field pid is set (has been asigned a value) and false otherwise */
  public boolean isSetPid() {
    return __isset_bit_vector.get(__PID_ISSET_ID);
  }

  public void setPidIsSet(boolean value) {
    __isset_bit_vector.set(__PID_ISSET_ID, value);
  }

  public String getName() {
    return this.name;
  }

  public PackageData setName(String name) {
    this.name = name;
    return this;
  }

  public void unsetName() {
    this.name = null;
  }

  /** Returns true if field name is set (has been asigned a value) and false otherwise */
  public boolean isSetName() {
    return this.name != null;
  }

  public void setNameIsSet(boolean value) {
    if (!value) {
      this.name = null;
    }
  }

  public String getFolder() {
    return this.folder;
  }

  public PackageData setFolder(String folder) {
    this.folder = folder;
    return this;
  }

  public void unsetFolder() {
    this.folder = null;
  }

  /** Returns true if field folder is set (has been asigned a value) and false otherwise */
  public boolean isSetFolder() {
    return this.folder != null;
  }

  public void setFolderIsSet(boolean value) {
    if (!value) {
      this.folder = null;
    }
  }

  public String getSite() {
    return this.site;
  }

  public PackageData setSite(String site) {
    this.site = site;
    return this;
  }

  public void unsetSite() {
    this.site = null;
  }

  /** Returns true if field site is set (has been asigned a value) and false otherwise */
  public boolean isSetSite() {
    return this.site != null;
  }

  public void setSiteIsSet(boolean value) {
    if (!value) {
      this.site = null;
    }
  }

  public String getPassword() {
    return this.password;
  }

  public PackageData setPassword(String password) {
    this.password = password;
    return this;
  }

  public void unsetPassword() {
    this.password = null;
  }

  /** Returns true if field password is set (has been asigned a value) and false otherwise */
  public boolean isSetPassword() {
    return this.password != null;
  }

  public void setPasswordIsSet(boolean value) {
    if (!value) {
      this.password = null;
    }
  }

  /**
   * 
   * @see Destination
   */
  public Destination getDest() {
    return this.dest;
  }

  /**
   * 
   * @see Destination
   */
  public PackageData setDest(Destination dest) {
    this.dest = dest;
    return this;
  }

  public void unsetDest() {
    this.dest = null;
  }

  /** Returns true if field dest is set (has been asigned a value) and false otherwise */
  public boolean isSetDest() {
    return this.dest != null;
  }

  public void setDestIsSet(boolean value) {
    if (!value) {
      this.dest = null;
    }
  }

  public short getOrder() {
    return this.order;
  }

  public PackageData setOrder(short order) {
    this.order = order;
    setOrderIsSet(true);
    return this;
  }

  public void unsetOrder() {
    __isset_bit_vector.clear(__ORDER_ISSET_ID);
  }

  /** Returns true if field order is set (has been asigned a value) and false otherwise */
  public boolean isSetOrder() {
    return __isset_bit_vector.get(__ORDER_ISSET_ID);
  }

  public void setOrderIsSet(boolean value) {
    __isset_bit_vector.set(__ORDER_ISSET_ID, value);
  }

  public short getLinksdone() {
    return this.linksdone;
  }

  public PackageData setLinksdone(short linksdone) {
    this.linksdone = linksdone;
    setLinksdoneIsSet(true);
    return this;
  }

  public void unsetLinksdone() {
    __isset_bit_vector.clear(__LINKSDONE_ISSET_ID);
  }

  /** Returns true if field linksdone is set (has been asigned a value) and false otherwise */
  public boolean isSetLinksdone() {
    return __isset_bit_vector.get(__LINKSDONE_ISSET_ID);
  }

  public void setLinksdoneIsSet(boolean value) {
    __isset_bit_vector.set(__LINKSDONE_ISSET_ID, value);
  }

  public long getSizedone() {
    return this.sizedone;
  }

  public PackageData setSizedone(long sizedone) {
    this.sizedone = sizedone;
    setSizedoneIsSet(true);
    return this;
  }

  public void unsetSizedone() {
    __isset_bit_vector.clear(__SIZEDONE_ISSET_ID);
  }

  /** Returns true if field sizedone is set (has been asigned a value) and false otherwise */
  public boolean isSetSizedone() {
    return __isset_bit_vector.get(__SIZEDONE_ISSET_ID);
  }

  public void setSizedoneIsSet(boolean value) {
    __isset_bit_vector.set(__SIZEDONE_ISSET_ID, value);
  }

  public long getSizetotal() {
    return this.sizetotal;
  }

  public PackageData setSizetotal(long sizetotal) {
    this.sizetotal = sizetotal;
    setSizetotalIsSet(true);
    return this;
  }

  public void unsetSizetotal() {
    __isset_bit_vector.clear(__SIZETOTAL_ISSET_ID);
  }

  /** Returns true if field sizetotal is set (has been asigned a value) and false otherwise */
  public boolean isSetSizetotal() {
    return __isset_bit_vector.get(__SIZETOTAL_ISSET_ID);
  }

  public void setSizetotalIsSet(boolean value) {
    __isset_bit_vector.set(__SIZETOTAL_ISSET_ID, value);
  }

  public short getLinkstotal() {
    return this.linkstotal;
  }

  public PackageData setLinkstotal(short linkstotal) {
    this.linkstotal = linkstotal;
    setLinkstotalIsSet(true);
    return this;
  }

  public void unsetLinkstotal() {
    __isset_bit_vector.clear(__LINKSTOTAL_ISSET_ID);
  }

  /** Returns true if field linkstotal is set (has been asigned a value) and false otherwise */
  public boolean isSetLinkstotal() {
    return __isset_bit_vector.get(__LINKSTOTAL_ISSET_ID);
  }

  public void setLinkstotalIsSet(boolean value) {
    __isset_bit_vector.set(__LINKSTOTAL_ISSET_ID, value);
  }

  public int getLinksSize() {
    return (this.links == null) ? 0 : this.links.size();
  }

  public java.util.Iterator<FileData> getLinksIterator() {
    return (this.links == null) ? null : this.links.iterator();
  }

  public void addToLinks(FileData elem) {
    if (this.links == null) {
      this.links = new ArrayList<FileData>();
    }
    this.links.add(elem);
  }

  public List<FileData> getLinks() {
    return this.links;
  }

  public PackageData setLinks(List<FileData> links) {
    this.links = links;
    return this;
  }

  public void unsetLinks() {
    this.links = null;
  }

  /** Returns true if field links is set (has been asigned a value) and false otherwise */
  public boolean isSetLinks() {
    return this.links != null;
  }

  public void setLinksIsSet(boolean value) {
    if (!value) {
      this.links = null;
    }
  }

  public int getFidsSize() {
    return (this.fids == null) ? 0 : this.fids.size();
  }

  public java.util.Iterator<Integer> getFidsIterator() {
    return (this.fids == null) ? null : this.fids.iterator();
  }

  public void addToFids(int elem) {
    if (this.fids == null) {
      this.fids = new ArrayList<Integer>();
    }
    this.fids.add(elem);
  }

  public List<Integer> getFids() {
    return this.fids;
  }

  public PackageData setFids(List<Integer> fids) {
    this.fids = fids;
    return this;
  }

  public void unsetFids() {
    this.fids = null;
  }

  /** Returns true if field fids is set (has been asigned a value) and false otherwise */
  public boolean isSetFids() {
    return this.fids != null;
  }

  public void setFidsIsSet(boolean value) {
    if (!value) {
      this.fids = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case PID:
      if (value == null) {
        unsetPid();
      } else {
        setPid((Integer)value);
      }
      break;

    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((String)value);
      }
      break;

    case FOLDER:
      if (value == null) {
        unsetFolder();
      } else {
        setFolder((String)value);
      }
      break;

    case SITE:
      if (value == null) {
        unsetSite();
      } else {
        setSite((String)value);
      }
      break;

    case PASSWORD:
      if (value == null) {
        unsetPassword();
      } else {
        setPassword((String)value);
      }
      break;

    case DEST:
      if (value == null) {
        unsetDest();
      } else {
        setDest((Destination)value);
      }
      break;

    case ORDER:
      if (value == null) {
        unsetOrder();
      } else {
        setOrder((Short)value);
      }
      break;

    case LINKSDONE:
      if (value == null) {
        unsetLinksdone();
      } else {
        setLinksdone((Short)value);
      }
      break;

    case SIZEDONE:
      if (value == null) {
        unsetSizedone();
      } else {
        setSizedone((Long)value);
      }
      break;

    case SIZETOTAL:
      if (value == null) {
        unsetSizetotal();
      } else {
        setSizetotal((Long)value);
      }
      break;

    case LINKSTOTAL:
      if (value == null) {
        unsetLinkstotal();
      } else {
        setLinkstotal((Short)value);
      }
      break;

    case LINKS:
      if (value == null) {
        unsetLinks();
      } else {
        setLinks((List<FileData>)value);
      }
      break;

    case FIDS:
      if (value == null) {
        unsetFids();
      } else {
        setFids((List<Integer>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case PID:
      return new Integer(getPid());

    case NAME:
      return getName();

    case FOLDER:
      return getFolder();

    case SITE:
      return getSite();

    case PASSWORD:
      return getPassword();

    case DEST:
      return getDest();

    case ORDER:
      return new Short(getOrder());

    case LINKSDONE:
      return new Short(getLinksdone());

    case SIZEDONE:
      return new Long(getSizedone());

    case SIZETOTAL:
      return new Long(getSizetotal());

    case LINKSTOTAL:
      return new Short(getLinkstotal());

    case LINKS:
      return getLinks();

    case FIDS:
      return getFids();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been asigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case PID:
      return isSetPid();
    case NAME:
      return isSetName();
    case FOLDER:
      return isSetFolder();
    case SITE:
      return isSetSite();
    case PASSWORD:
      return isSetPassword();
    case DEST:
      return isSetDest();
    case ORDER:
      return isSetOrder();
    case LINKSDONE:
      return isSetLinksdone();
    case SIZEDONE:
      return isSetSizedone();
    case SIZETOTAL:
      return isSetSizetotal();
    case LINKSTOTAL:
      return isSetLinkstotal();
    case LINKS:
      return isSetLinks();
    case FIDS:
      return isSetFids();
    }
    throw new IllegalStateException();
  }

  
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof PackageData)
      return this.equals((PackageData)that);
    return false;
  }

  public boolean equals(PackageData that) {
    if (that == null)
      return false;

    boolean this_present_pid = true;
    boolean that_present_pid = true;
    if (this_present_pid || that_present_pid) {
      if (!(this_present_pid && that_present_pid))
        return false;
      if (this.pid != that.pid)
        return false;
    }

    boolean this_present_name = true && this.isSetName();
    boolean that_present_name = true && that.isSetName();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!this.name.equals(that.name))
        return false;
    }

    boolean this_present_folder = true && this.isSetFolder();
    boolean that_present_folder = true && that.isSetFolder();
    if (this_present_folder || that_present_folder) {
      if (!(this_present_folder && that_present_folder))
        return false;
      if (!this.folder.equals(that.folder))
        return false;
    }

    boolean this_present_site = true && this.isSetSite();
    boolean that_present_site = true && that.isSetSite();
    if (this_present_site || that_present_site) {
      if (!(this_present_site && that_present_site))
        return false;
      if (!this.site.equals(that.site))
        return false;
    }

    boolean this_present_password = true && this.isSetPassword();
    boolean that_present_password = true && that.isSetPassword();
    if (this_present_password || that_present_password) {
      if (!(this_present_password && that_present_password))
        return false;
      if (!this.password.equals(that.password))
        return false;
    }

    boolean this_present_dest = true && this.isSetDest();
    boolean that_present_dest = true && that.isSetDest();
    if (this_present_dest || that_present_dest) {
      if (!(this_present_dest && that_present_dest))
        return false;
      if (!this.dest.equals(that.dest))
        return false;
    }

    boolean this_present_order = true;
    boolean that_present_order = true;
    if (this_present_order || that_present_order) {
      if (!(this_present_order && that_present_order))
        return false;
      if (this.order != that.order)
        return false;
    }

    boolean this_present_linksdone = true && this.isSetLinksdone();
    boolean that_present_linksdone = true && that.isSetLinksdone();
    if (this_present_linksdone || that_present_linksdone) {
      if (!(this_present_linksdone && that_present_linksdone))
        return false;
      if (this.linksdone != that.linksdone)
        return false;
    }

    boolean this_present_sizedone = true && this.isSetSizedone();
    boolean that_present_sizedone = true && that.isSetSizedone();
    if (this_present_sizedone || that_present_sizedone) {
      if (!(this_present_sizedone && that_present_sizedone))
        return false;
      if (this.sizedone != that.sizedone)
        return false;
    }

    boolean this_present_sizetotal = true && this.isSetSizetotal();
    boolean that_present_sizetotal = true && that.isSetSizetotal();
    if (this_present_sizetotal || that_present_sizetotal) {
      if (!(this_present_sizetotal && that_present_sizetotal))
        return false;
      if (this.sizetotal != that.sizetotal)
        return false;
    }

    boolean this_present_linkstotal = true && this.isSetLinkstotal();
    boolean that_present_linkstotal = true && that.isSetLinkstotal();
    if (this_present_linkstotal || that_present_linkstotal) {
      if (!(this_present_linkstotal && that_present_linkstotal))
        return false;
      if (this.linkstotal != that.linkstotal)
        return false;
    }

    boolean this_present_links = true && this.isSetLinks();
    boolean that_present_links = true && that.isSetLinks();
    if (this_present_links || that_present_links) {
      if (!(this_present_links && that_present_links))
        return false;
      if (!this.links.equals(that.links))
        return false;
    }

    boolean this_present_fids = true && this.isSetFids();
    boolean that_present_fids = true && that.isSetFids();
    if (this_present_fids || that_present_fids) {
      if (!(this_present_fids && that_present_fids))
        return false;
      if (!this.fids.equals(that.fids))
        return false;
    }

    return true;
  }

  
  public int hashCode() {
    return 0;
  }

  public int compareTo(PackageData other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    PackageData typedOther = (PackageData)other;

    lastComparison = Boolean.valueOf(isSetPid()).compareTo(typedOther.isSetPid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPid()) {
      lastComparison = TBaseHelper.compareTo(this.pid, typedOther.pid);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetName()).compareTo(typedOther.isSetName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetName()) {
      lastComparison = TBaseHelper.compareTo(this.name, typedOther.name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFolder()).compareTo(typedOther.isSetFolder());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFolder()) {
      lastComparison = TBaseHelper.compareTo(this.folder, typedOther.folder);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSite()).compareTo(typedOther.isSetSite());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSite()) {
      lastComparison = TBaseHelper.compareTo(this.site, typedOther.site);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPassword()).compareTo(typedOther.isSetPassword());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPassword()) {
      lastComparison = TBaseHelper.compareTo(this.password, typedOther.password);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDest()).compareTo(typedOther.isSetDest());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDest()) {
      lastComparison = TBaseHelper.compareTo(this.dest, typedOther.dest);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetOrder()).compareTo(typedOther.isSetOrder());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOrder()) {
      lastComparison = TBaseHelper.compareTo(this.order, typedOther.order);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLinksdone()).compareTo(typedOther.isSetLinksdone());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLinksdone()) {
      lastComparison = TBaseHelper.compareTo(this.linksdone, typedOther.linksdone);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSizedone()).compareTo(typedOther.isSetSizedone());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSizedone()) {
      lastComparison = TBaseHelper.compareTo(this.sizedone, typedOther.sizedone);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSizetotal()).compareTo(typedOther.isSetSizetotal());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSizetotal()) {
      lastComparison = TBaseHelper.compareTo(this.sizetotal, typedOther.sizetotal);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLinkstotal()).compareTo(typedOther.isSetLinkstotal());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLinkstotal()) {
      lastComparison = TBaseHelper.compareTo(this.linkstotal, typedOther.linkstotal);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLinks()).compareTo(typedOther.isSetLinks());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLinks()) {
      lastComparison = TBaseHelper.compareTo(this.links, typedOther.links);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFids()).compareTo(typedOther.isSetFids());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFids()) {
      lastComparison = TBaseHelper.compareTo(this.fids, typedOther.fids);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) { 
        break;
      }
      switch (field.id) {
        case 1: // PID
          if (field.type == TType.I32) {
            this.pid = iprot.readI32();
            setPidIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // NAME
          if (field.type == TType.STRING) {
            this.name = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // FOLDER
          if (field.type == TType.STRING) {
            this.folder = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 4: // SITE
          if (field.type == TType.STRING) {
            this.site = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 5: // PASSWORD
          if (field.type == TType.STRING) {
            this.password = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 6: // DEST
          if (field.type == TType.I32) {
            this.dest = Destination.findByValue(iprot.readI32());
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 7: // ORDER
          if (field.type == TType.I16) {
            this.order = iprot.readI16();
            setOrderIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 8: // LINKSDONE
          if (field.type == TType.I16) {
            this.linksdone = iprot.readI16();
            setLinksdoneIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 9: // SIZEDONE
          if (field.type == TType.I64) {
            this.sizedone = iprot.readI64();
            setSizedoneIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 10: // SIZETOTAL
          if (field.type == TType.I64) {
            this.sizetotal = iprot.readI64();
            setSizetotalIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 11: // LINKSTOTAL
          if (field.type == TType.I16) {
            this.linkstotal = iprot.readI16();
            setLinkstotalIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 12: // LINKS
          if (field.type == TType.LIST) {
            {
              TList _list4 = iprot.readListBegin();
              this.links = new ArrayList<FileData>(_list4.size);
              for (int _i5 = 0; _i5 < _list4.size; ++_i5)
              {
                FileData _elem6;
                _elem6 = new FileData();
                _elem6.read(iprot);
                this.links.add(_elem6);
              }
              iprot.readListEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 13: // FIDS
          if (field.type == TType.LIST) {
            {
              TList _list7 = iprot.readListBegin();
              this.fids = new ArrayList<Integer>(_list7.size);
              for (int _i8 = 0; _i8 < _list7.size; ++_i8)
              {
                int _elem9;
                _elem9 = iprot.readI32();
                this.fids.add(_elem9);
              }
              iprot.readListEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();

    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    oprot.writeFieldBegin(PID_FIELD_DESC);
    oprot.writeI32(this.pid);
    oprot.writeFieldEnd();
    if (this.name != null) {
      oprot.writeFieldBegin(NAME_FIELD_DESC);
      oprot.writeString(this.name);
      oprot.writeFieldEnd();
    }
    if (this.folder != null) {
      oprot.writeFieldBegin(FOLDER_FIELD_DESC);
      oprot.writeString(this.folder);
      oprot.writeFieldEnd();
    }
    if (this.site != null) {
      oprot.writeFieldBegin(SITE_FIELD_DESC);
      oprot.writeString(this.site);
      oprot.writeFieldEnd();
    }
    if (this.password != null) {
      oprot.writeFieldBegin(PASSWORD_FIELD_DESC);
      oprot.writeString(this.password);
      oprot.writeFieldEnd();
    }
    if (this.dest != null) {
      oprot.writeFieldBegin(DEST_FIELD_DESC);
      oprot.writeI32(this.dest.getValue());
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(ORDER_FIELD_DESC);
    oprot.writeI16(this.order);
    oprot.writeFieldEnd();
    if (isSetLinksdone()) {
      oprot.writeFieldBegin(LINKSDONE_FIELD_DESC);
      oprot.writeI16(this.linksdone);
      oprot.writeFieldEnd();
    }
    if (isSetSizedone()) {
      oprot.writeFieldBegin(SIZEDONE_FIELD_DESC);
      oprot.writeI64(this.sizedone);
      oprot.writeFieldEnd();
    }
    if (isSetSizetotal()) {
      oprot.writeFieldBegin(SIZETOTAL_FIELD_DESC);
      oprot.writeI64(this.sizetotal);
      oprot.writeFieldEnd();
    }
    if (isSetLinkstotal()) {
      oprot.writeFieldBegin(LINKSTOTAL_FIELD_DESC);
      oprot.writeI16(this.linkstotal);
      oprot.writeFieldEnd();
    }
    if (this.links != null) {
      if (isSetLinks()) {
        oprot.writeFieldBegin(LINKS_FIELD_DESC);
        {
          oprot.writeListBegin(new TList(TType.STRUCT, this.links.size()));
          for (FileData _iter10 : this.links)
          {
            _iter10.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
    }
    if (this.fids != null) {
      if (isSetFids()) {
        oprot.writeFieldBegin(FIDS_FIELD_DESC);
        {
          oprot.writeListBegin(new TList(TType.I32, this.fids.size()));
          for (int _iter11 : this.fids)
          {
            oprot.writeI32(_iter11);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  
  public String toString() {
    StringBuilder sb = new StringBuilder("PackageData(");
    boolean first = true;

    sb.append("pid:");
    sb.append(this.pid);
    first = false;
    if (!first) sb.append(", ");
    sb.append("name:");
    if (this.name == null) {
      sb.append("null");
    } else {
      sb.append(this.name);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("folder:");
    if (this.folder == null) {
      sb.append("null");
    } else {
      sb.append(this.folder);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("site:");
    if (this.site == null) {
      sb.append("null");
    } else {
      sb.append(this.site);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("password:");
    if (this.password == null) {
      sb.append("null");
    } else {
      sb.append(this.password);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("dest:");
    if (this.dest == null) {
      sb.append("null");
    } else {
      sb.append(this.dest);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("order:");
    sb.append(this.order);
    first = false;
    if (isSetLinksdone()) {
      if (!first) sb.append(", ");
      sb.append("linksdone:");
      sb.append(this.linksdone);
      first = false;
    }
    if (isSetSizedone()) {
      if (!first) sb.append(", ");
      sb.append("sizedone:");
      sb.append(this.sizedone);
      first = false;
    }
    if (isSetSizetotal()) {
      if (!first) sb.append(", ");
      sb.append("sizetotal:");
      sb.append(this.sizetotal);
      first = false;
    }
    if (isSetLinkstotal()) {
      if (!first) sb.append(", ");
      sb.append("linkstotal:");
      sb.append(this.linkstotal);
      first = false;
    }
    if (isSetLinks()) {
      if (!first) sb.append(", ");
      sb.append("links:");
      if (this.links == null) {
        sb.append("null");
      } else {
        sb.append(this.links);
      }
      first = false;
    }
    if (isSetFids()) {
      if (!first) sb.append(", ");
      sb.append("fids:");
      if (this.fids == null) {
        sb.append("null");
      } else {
        sb.append(this.fids);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

