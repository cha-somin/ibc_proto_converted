// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: provenance/marker/v1/tx.proto

package com.provenance.marker.v1;

/**
 * <pre>
 * MsgAddAccessRequest defines the Msg/AddAccess request type
 * </pre>
 *
 * Protobuf type {@code provenance.marker.v1.MsgAddAccessRequest}
 */
public final class MsgAddAccessRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:provenance.marker.v1.MsgAddAccessRequest)
    MsgAddAccessRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgAddAccessRequest.newBuilder() to construct.
  private MsgAddAccessRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgAddAccessRequest() {
    denom_ = "";
    administrator_ = "";
    access_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MsgAddAccessRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.provenance.marker.v1.TxProto.internal_static_provenance_marker_v1_MsgAddAccessRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.provenance.marker.v1.TxProto.internal_static_provenance_marker_v1_MsgAddAccessRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.provenance.marker.v1.MsgAddAccessRequest.class, com.provenance.marker.v1.MsgAddAccessRequest.Builder.class);
  }

  public static final int DENOM_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object denom_ = "";
  /**
   * <code>string denom = 1 [json_name = "denom"];</code>
   * @return The denom.
   */
  @java.lang.Override
  public java.lang.String getDenom() {
    java.lang.Object ref = denom_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      denom_ = s;
      return s;
    }
  }
  /**
   * <code>string denom = 1 [json_name = "denom"];</code>
   * @return The bytes for denom.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDenomBytes() {
    java.lang.Object ref = denom_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      denom_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ADMINISTRATOR_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object administrator_ = "";
  /**
   * <code>string administrator = 2 [json_name = "administrator"];</code>
   * @return The administrator.
   */
  @java.lang.Override
  public java.lang.String getAdministrator() {
    java.lang.Object ref = administrator_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      administrator_ = s;
      return s;
    }
  }
  /**
   * <code>string administrator = 2 [json_name = "administrator"];</code>
   * @return The bytes for administrator.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAdministratorBytes() {
    java.lang.Object ref = administrator_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      administrator_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ACCESS_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private java.util.List<com.provenance.marker.v1.AccessGrant> access_;
  /**
   * <code>repeated .provenance.marker.v1.AccessGrant access = 3 [json_name = "access", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public java.util.List<com.provenance.marker.v1.AccessGrant> getAccessList() {
    return access_;
  }
  /**
   * <code>repeated .provenance.marker.v1.AccessGrant access = 3 [json_name = "access", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.provenance.marker.v1.AccessGrantOrBuilder> 
      getAccessOrBuilderList() {
    return access_;
  }
  /**
   * <code>repeated .provenance.marker.v1.AccessGrant access = 3 [json_name = "access", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public int getAccessCount() {
    return access_.size();
  }
  /**
   * <code>repeated .provenance.marker.v1.AccessGrant access = 3 [json_name = "access", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.provenance.marker.v1.AccessGrant getAccess(int index) {
    return access_.get(index);
  }
  /**
   * <code>repeated .provenance.marker.v1.AccessGrant access = 3 [json_name = "access", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.provenance.marker.v1.AccessGrantOrBuilder getAccessOrBuilder(
      int index) {
    return access_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(denom_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, denom_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(administrator_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, administrator_);
    }
    for (int i = 0; i < access_.size(); i++) {
      output.writeMessage(3, access_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(denom_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, denom_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(administrator_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, administrator_);
    }
    for (int i = 0; i < access_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, access_.get(i));
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.provenance.marker.v1.MsgAddAccessRequest)) {
      return super.equals(obj);
    }
    com.provenance.marker.v1.MsgAddAccessRequest other = (com.provenance.marker.v1.MsgAddAccessRequest) obj;

    if (!getDenom()
        .equals(other.getDenom())) return false;
    if (!getAdministrator()
        .equals(other.getAdministrator())) return false;
    if (!getAccessList()
        .equals(other.getAccessList())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + DENOM_FIELD_NUMBER;
    hash = (53 * hash) + getDenom().hashCode();
    hash = (37 * hash) + ADMINISTRATOR_FIELD_NUMBER;
    hash = (53 * hash) + getAdministrator().hashCode();
    if (getAccessCount() > 0) {
      hash = (37 * hash) + ACCESS_FIELD_NUMBER;
      hash = (53 * hash) + getAccessList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.provenance.marker.v1.MsgAddAccessRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.provenance.marker.v1.MsgAddAccessRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.provenance.marker.v1.MsgAddAccessRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.provenance.marker.v1.MsgAddAccessRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.provenance.marker.v1.MsgAddAccessRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.provenance.marker.v1.MsgAddAccessRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.provenance.marker.v1.MsgAddAccessRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.provenance.marker.v1.MsgAddAccessRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.provenance.marker.v1.MsgAddAccessRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.provenance.marker.v1.MsgAddAccessRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.provenance.marker.v1.MsgAddAccessRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.provenance.marker.v1.MsgAddAccessRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.provenance.marker.v1.MsgAddAccessRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * MsgAddAccessRequest defines the Msg/AddAccess request type
   * </pre>
   *
   * Protobuf type {@code provenance.marker.v1.MsgAddAccessRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:provenance.marker.v1.MsgAddAccessRequest)
      com.provenance.marker.v1.MsgAddAccessRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.provenance.marker.v1.TxProto.internal_static_provenance_marker_v1_MsgAddAccessRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.provenance.marker.v1.TxProto.internal_static_provenance_marker_v1_MsgAddAccessRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.provenance.marker.v1.MsgAddAccessRequest.class, com.provenance.marker.v1.MsgAddAccessRequest.Builder.class);
    }

    // Construct using com.provenance.marker.v1.MsgAddAccessRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      denom_ = "";
      administrator_ = "";
      if (accessBuilder_ == null) {
        access_ = java.util.Collections.emptyList();
      } else {
        access_ = null;
        accessBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.provenance.marker.v1.TxProto.internal_static_provenance_marker_v1_MsgAddAccessRequest_descriptor;
    }

    @java.lang.Override
    public com.provenance.marker.v1.MsgAddAccessRequest getDefaultInstanceForType() {
      return com.provenance.marker.v1.MsgAddAccessRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.provenance.marker.v1.MsgAddAccessRequest build() {
      com.provenance.marker.v1.MsgAddAccessRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.provenance.marker.v1.MsgAddAccessRequest buildPartial() {
      com.provenance.marker.v1.MsgAddAccessRequest result = new com.provenance.marker.v1.MsgAddAccessRequest(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.provenance.marker.v1.MsgAddAccessRequest result) {
      if (accessBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0)) {
          access_ = java.util.Collections.unmodifiableList(access_);
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.access_ = access_;
      } else {
        result.access_ = accessBuilder_.build();
      }
    }

    private void buildPartial0(com.provenance.marker.v1.MsgAddAccessRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.denom_ = denom_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.administrator_ = administrator_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.provenance.marker.v1.MsgAddAccessRequest) {
        return mergeFrom((com.provenance.marker.v1.MsgAddAccessRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.provenance.marker.v1.MsgAddAccessRequest other) {
      if (other == com.provenance.marker.v1.MsgAddAccessRequest.getDefaultInstance()) return this;
      if (!other.getDenom().isEmpty()) {
        denom_ = other.denom_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getAdministrator().isEmpty()) {
        administrator_ = other.administrator_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (accessBuilder_ == null) {
        if (!other.access_.isEmpty()) {
          if (access_.isEmpty()) {
            access_ = other.access_;
            bitField0_ = (bitField0_ & ~0x00000004);
          } else {
            ensureAccessIsMutable();
            access_.addAll(other.access_);
          }
          onChanged();
        }
      } else {
        if (!other.access_.isEmpty()) {
          if (accessBuilder_.isEmpty()) {
            accessBuilder_.dispose();
            accessBuilder_ = null;
            access_ = other.access_;
            bitField0_ = (bitField0_ & ~0x00000004);
            accessBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getAccessFieldBuilder() : null;
          } else {
            accessBuilder_.addAllMessages(other.access_);
          }
        }
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              denom_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              administrator_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              com.provenance.marker.v1.AccessGrant m =
                  input.readMessage(
                      com.provenance.marker.v1.AccessGrant.parser(),
                      extensionRegistry);
              if (accessBuilder_ == null) {
                ensureAccessIsMutable();
                access_.add(m);
              } else {
                accessBuilder_.addMessage(m);
              }
              break;
            } // case 26
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private java.lang.Object denom_ = "";
    /**
     * <code>string denom = 1 [json_name = "denom"];</code>
     * @return The denom.
     */
    public java.lang.String getDenom() {
      java.lang.Object ref = denom_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        denom_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string denom = 1 [json_name = "denom"];</code>
     * @return The bytes for denom.
     */
    public com.google.protobuf.ByteString
        getDenomBytes() {
      java.lang.Object ref = denom_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        denom_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string denom = 1 [json_name = "denom"];</code>
     * @param value The denom to set.
     * @return This builder for chaining.
     */
    public Builder setDenom(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      denom_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string denom = 1 [json_name = "denom"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDenom() {
      denom_ = getDefaultInstance().getDenom();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string denom = 1 [json_name = "denom"];</code>
     * @param value The bytes for denom to set.
     * @return This builder for chaining.
     */
    public Builder setDenomBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      denom_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object administrator_ = "";
    /**
     * <code>string administrator = 2 [json_name = "administrator"];</code>
     * @return The administrator.
     */
    public java.lang.String getAdministrator() {
      java.lang.Object ref = administrator_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        administrator_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string administrator = 2 [json_name = "administrator"];</code>
     * @return The bytes for administrator.
     */
    public com.google.protobuf.ByteString
        getAdministratorBytes() {
      java.lang.Object ref = administrator_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        administrator_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string administrator = 2 [json_name = "administrator"];</code>
     * @param value The administrator to set.
     * @return This builder for chaining.
     */
    public Builder setAdministrator(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      administrator_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string administrator = 2 [json_name = "administrator"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAdministrator() {
      administrator_ = getDefaultInstance().getAdministrator();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string administrator = 2 [json_name = "administrator"];</code>
     * @param value The bytes for administrator to set.
     * @return This builder for chaining.
     */
    public Builder setAdministratorBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      administrator_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.util.List<com.provenance.marker.v1.AccessGrant> access_ =
      java.util.Collections.emptyList();
    private void ensureAccessIsMutable() {
      if (!((bitField0_ & 0x00000004) != 0)) {
        access_ = new java.util.ArrayList<com.provenance.marker.v1.AccessGrant>(access_);
        bitField0_ |= 0x00000004;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.provenance.marker.v1.AccessGrant, com.provenance.marker.v1.AccessGrant.Builder, com.provenance.marker.v1.AccessGrantOrBuilder> accessBuilder_;

    /**
     * <code>repeated .provenance.marker.v1.AccessGrant access = 3 [json_name = "access", (.gogoproto.nullable) = false];</code>
     */
    public java.util.List<com.provenance.marker.v1.AccessGrant> getAccessList() {
      if (accessBuilder_ == null) {
        return java.util.Collections.unmodifiableList(access_);
      } else {
        return accessBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .provenance.marker.v1.AccessGrant access = 3 [json_name = "access", (.gogoproto.nullable) = false];</code>
     */
    public int getAccessCount() {
      if (accessBuilder_ == null) {
        return access_.size();
      } else {
        return accessBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .provenance.marker.v1.AccessGrant access = 3 [json_name = "access", (.gogoproto.nullable) = false];</code>
     */
    public com.provenance.marker.v1.AccessGrant getAccess(int index) {
      if (accessBuilder_ == null) {
        return access_.get(index);
      } else {
        return accessBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .provenance.marker.v1.AccessGrant access = 3 [json_name = "access", (.gogoproto.nullable) = false];</code>
     */
    public Builder setAccess(
        int index, com.provenance.marker.v1.AccessGrant value) {
      if (accessBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAccessIsMutable();
        access_.set(index, value);
        onChanged();
      } else {
        accessBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .provenance.marker.v1.AccessGrant access = 3 [json_name = "access", (.gogoproto.nullable) = false];</code>
     */
    public Builder setAccess(
        int index, com.provenance.marker.v1.AccessGrant.Builder builderForValue) {
      if (accessBuilder_ == null) {
        ensureAccessIsMutable();
        access_.set(index, builderForValue.build());
        onChanged();
      } else {
        accessBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .provenance.marker.v1.AccessGrant access = 3 [json_name = "access", (.gogoproto.nullable) = false];</code>
     */
    public Builder addAccess(com.provenance.marker.v1.AccessGrant value) {
      if (accessBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAccessIsMutable();
        access_.add(value);
        onChanged();
      } else {
        accessBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .provenance.marker.v1.AccessGrant access = 3 [json_name = "access", (.gogoproto.nullable) = false];</code>
     */
    public Builder addAccess(
        int index, com.provenance.marker.v1.AccessGrant value) {
      if (accessBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAccessIsMutable();
        access_.add(index, value);
        onChanged();
      } else {
        accessBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .provenance.marker.v1.AccessGrant access = 3 [json_name = "access", (.gogoproto.nullable) = false];</code>
     */
    public Builder addAccess(
        com.provenance.marker.v1.AccessGrant.Builder builderForValue) {
      if (accessBuilder_ == null) {
        ensureAccessIsMutable();
        access_.add(builderForValue.build());
        onChanged();
      } else {
        accessBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .provenance.marker.v1.AccessGrant access = 3 [json_name = "access", (.gogoproto.nullable) = false];</code>
     */
    public Builder addAccess(
        int index, com.provenance.marker.v1.AccessGrant.Builder builderForValue) {
      if (accessBuilder_ == null) {
        ensureAccessIsMutable();
        access_.add(index, builderForValue.build());
        onChanged();
      } else {
        accessBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .provenance.marker.v1.AccessGrant access = 3 [json_name = "access", (.gogoproto.nullable) = false];</code>
     */
    public Builder addAllAccess(
        java.lang.Iterable<? extends com.provenance.marker.v1.AccessGrant> values) {
      if (accessBuilder_ == null) {
        ensureAccessIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, access_);
        onChanged();
      } else {
        accessBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .provenance.marker.v1.AccessGrant access = 3 [json_name = "access", (.gogoproto.nullable) = false];</code>
     */
    public Builder clearAccess() {
      if (accessBuilder_ == null) {
        access_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
      } else {
        accessBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .provenance.marker.v1.AccessGrant access = 3 [json_name = "access", (.gogoproto.nullable) = false];</code>
     */
    public Builder removeAccess(int index) {
      if (accessBuilder_ == null) {
        ensureAccessIsMutable();
        access_.remove(index);
        onChanged();
      } else {
        accessBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .provenance.marker.v1.AccessGrant access = 3 [json_name = "access", (.gogoproto.nullable) = false];</code>
     */
    public com.provenance.marker.v1.AccessGrant.Builder getAccessBuilder(
        int index) {
      return getAccessFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .provenance.marker.v1.AccessGrant access = 3 [json_name = "access", (.gogoproto.nullable) = false];</code>
     */
    public com.provenance.marker.v1.AccessGrantOrBuilder getAccessOrBuilder(
        int index) {
      if (accessBuilder_ == null) {
        return access_.get(index);  } else {
        return accessBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .provenance.marker.v1.AccessGrant access = 3 [json_name = "access", (.gogoproto.nullable) = false];</code>
     */
    public java.util.List<? extends com.provenance.marker.v1.AccessGrantOrBuilder> 
         getAccessOrBuilderList() {
      if (accessBuilder_ != null) {
        return accessBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(access_);
      }
    }
    /**
     * <code>repeated .provenance.marker.v1.AccessGrant access = 3 [json_name = "access", (.gogoproto.nullable) = false];</code>
     */
    public com.provenance.marker.v1.AccessGrant.Builder addAccessBuilder() {
      return getAccessFieldBuilder().addBuilder(
          com.provenance.marker.v1.AccessGrant.getDefaultInstance());
    }
    /**
     * <code>repeated .provenance.marker.v1.AccessGrant access = 3 [json_name = "access", (.gogoproto.nullable) = false];</code>
     */
    public com.provenance.marker.v1.AccessGrant.Builder addAccessBuilder(
        int index) {
      return getAccessFieldBuilder().addBuilder(
          index, com.provenance.marker.v1.AccessGrant.getDefaultInstance());
    }
    /**
     * <code>repeated .provenance.marker.v1.AccessGrant access = 3 [json_name = "access", (.gogoproto.nullable) = false];</code>
     */
    public java.util.List<com.provenance.marker.v1.AccessGrant.Builder> 
         getAccessBuilderList() {
      return getAccessFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.provenance.marker.v1.AccessGrant, com.provenance.marker.v1.AccessGrant.Builder, com.provenance.marker.v1.AccessGrantOrBuilder> 
        getAccessFieldBuilder() {
      if (accessBuilder_ == null) {
        accessBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.provenance.marker.v1.AccessGrant, com.provenance.marker.v1.AccessGrant.Builder, com.provenance.marker.v1.AccessGrantOrBuilder>(
                access_,
                ((bitField0_ & 0x00000004) != 0),
                getParentForChildren(),
                isClean());
        access_ = null;
      }
      return accessBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:provenance.marker.v1.MsgAddAccessRequest)
  }

  // @@protoc_insertion_point(class_scope:provenance.marker.v1.MsgAddAccessRequest)
  private static final com.provenance.marker.v1.MsgAddAccessRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.provenance.marker.v1.MsgAddAccessRequest();
  }

  public static com.provenance.marker.v1.MsgAddAccessRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgAddAccessRequest>
      PARSER = new com.google.protobuf.AbstractParser<MsgAddAccessRequest>() {
    @java.lang.Override
    public MsgAddAccessRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<MsgAddAccessRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgAddAccessRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.provenance.marker.v1.MsgAddAccessRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

