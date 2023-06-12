// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: provenance/marker/v1/marker.proto

package com.provenance.marker.v1;

/**
 * <pre>
 * EventDenomUnit denom units for set denom metadata event
 * </pre>
 *
 * Protobuf type {@code provenance.marker.v1.EventDenomUnit}
 */
public final class EventDenomUnit extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:provenance.marker.v1.EventDenomUnit)
    EventDenomUnitOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EventDenomUnit.newBuilder() to construct.
  private EventDenomUnit(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EventDenomUnit() {
    denom_ = "";
    exponent_ = "";
    aliases_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EventDenomUnit();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.provenance.marker.v1.MarkerProto.internal_static_provenance_marker_v1_EventDenomUnit_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.provenance.marker.v1.MarkerProto.internal_static_provenance_marker_v1_EventDenomUnit_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.provenance.marker.v1.EventDenomUnit.class, com.provenance.marker.v1.EventDenomUnit.Builder.class);
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

  public static final int EXPONENT_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object exponent_ = "";
  /**
   * <code>string exponent = 2 [json_name = "exponent"];</code>
   * @return The exponent.
   */
  @java.lang.Override
  public java.lang.String getExponent() {
    java.lang.Object ref = exponent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      exponent_ = s;
      return s;
    }
  }
  /**
   * <code>string exponent = 2 [json_name = "exponent"];</code>
   * @return The bytes for exponent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getExponentBytes() {
    java.lang.Object ref = exponent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      exponent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ALIASES_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList aliases_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <code>repeated string aliases = 3 [json_name = "aliases"];</code>
   * @return A list containing the aliases.
   */
  public com.google.protobuf.ProtocolStringList
      getAliasesList() {
    return aliases_;
  }
  /**
   * <code>repeated string aliases = 3 [json_name = "aliases"];</code>
   * @return The count of aliases.
   */
  public int getAliasesCount() {
    return aliases_.size();
  }
  /**
   * <code>repeated string aliases = 3 [json_name = "aliases"];</code>
   * @param index The index of the element to return.
   * @return The aliases at the given index.
   */
  public java.lang.String getAliases(int index) {
    return aliases_.get(index);
  }
  /**
   * <code>repeated string aliases = 3 [json_name = "aliases"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the aliases at the given index.
   */
  public com.google.protobuf.ByteString
      getAliasesBytes(int index) {
    return aliases_.getByteString(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(exponent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, exponent_);
    }
    for (int i = 0; i < aliases_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, aliases_.getRaw(i));
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(exponent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, exponent_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < aliases_.size(); i++) {
        dataSize += computeStringSizeNoTag(aliases_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getAliasesList().size();
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
    if (!(obj instanceof com.provenance.marker.v1.EventDenomUnit)) {
      return super.equals(obj);
    }
    com.provenance.marker.v1.EventDenomUnit other = (com.provenance.marker.v1.EventDenomUnit) obj;

    if (!getDenom()
        .equals(other.getDenom())) return false;
    if (!getExponent()
        .equals(other.getExponent())) return false;
    if (!getAliasesList()
        .equals(other.getAliasesList())) return false;
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
    hash = (37 * hash) + EXPONENT_FIELD_NUMBER;
    hash = (53 * hash) + getExponent().hashCode();
    if (getAliasesCount() > 0) {
      hash = (37 * hash) + ALIASES_FIELD_NUMBER;
      hash = (53 * hash) + getAliasesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.provenance.marker.v1.EventDenomUnit parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.provenance.marker.v1.EventDenomUnit parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.provenance.marker.v1.EventDenomUnit parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.provenance.marker.v1.EventDenomUnit parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.provenance.marker.v1.EventDenomUnit parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.provenance.marker.v1.EventDenomUnit parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.provenance.marker.v1.EventDenomUnit parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.provenance.marker.v1.EventDenomUnit parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.provenance.marker.v1.EventDenomUnit parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.provenance.marker.v1.EventDenomUnit parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.provenance.marker.v1.EventDenomUnit parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.provenance.marker.v1.EventDenomUnit parseFrom(
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
  public static Builder newBuilder(com.provenance.marker.v1.EventDenomUnit prototype) {
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
   * EventDenomUnit denom units for set denom metadata event
   * </pre>
   *
   * Protobuf type {@code provenance.marker.v1.EventDenomUnit}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:provenance.marker.v1.EventDenomUnit)
      com.provenance.marker.v1.EventDenomUnitOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.provenance.marker.v1.MarkerProto.internal_static_provenance_marker_v1_EventDenomUnit_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.provenance.marker.v1.MarkerProto.internal_static_provenance_marker_v1_EventDenomUnit_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.provenance.marker.v1.EventDenomUnit.class, com.provenance.marker.v1.EventDenomUnit.Builder.class);
    }

    // Construct using com.provenance.marker.v1.EventDenomUnit.newBuilder()
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
      exponent_ = "";
      aliases_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.provenance.marker.v1.MarkerProto.internal_static_provenance_marker_v1_EventDenomUnit_descriptor;
    }

    @java.lang.Override
    public com.provenance.marker.v1.EventDenomUnit getDefaultInstanceForType() {
      return com.provenance.marker.v1.EventDenomUnit.getDefaultInstance();
    }

    @java.lang.Override
    public com.provenance.marker.v1.EventDenomUnit build() {
      com.provenance.marker.v1.EventDenomUnit result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.provenance.marker.v1.EventDenomUnit buildPartial() {
      com.provenance.marker.v1.EventDenomUnit result = new com.provenance.marker.v1.EventDenomUnit(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.provenance.marker.v1.EventDenomUnit result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.denom_ = denom_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.exponent_ = exponent_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        aliases_.makeImmutable();
        result.aliases_ = aliases_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.provenance.marker.v1.EventDenomUnit) {
        return mergeFrom((com.provenance.marker.v1.EventDenomUnit)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.provenance.marker.v1.EventDenomUnit other) {
      if (other == com.provenance.marker.v1.EventDenomUnit.getDefaultInstance()) return this;
      if (!other.getDenom().isEmpty()) {
        denom_ = other.denom_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getExponent().isEmpty()) {
        exponent_ = other.exponent_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.aliases_.isEmpty()) {
        if (aliases_.isEmpty()) {
          aliases_ = other.aliases_;
          bitField0_ |= 0x00000004;
        } else {
          ensureAliasesIsMutable();
          aliases_.addAll(other.aliases_);
        }
        onChanged();
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
              exponent_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();
              ensureAliasesIsMutable();
              aliases_.add(s);
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

    private java.lang.Object exponent_ = "";
    /**
     * <code>string exponent = 2 [json_name = "exponent"];</code>
     * @return The exponent.
     */
    public java.lang.String getExponent() {
      java.lang.Object ref = exponent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        exponent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string exponent = 2 [json_name = "exponent"];</code>
     * @return The bytes for exponent.
     */
    public com.google.protobuf.ByteString
        getExponentBytes() {
      java.lang.Object ref = exponent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        exponent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string exponent = 2 [json_name = "exponent"];</code>
     * @param value The exponent to set.
     * @return This builder for chaining.
     */
    public Builder setExponent(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      exponent_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string exponent = 2 [json_name = "exponent"];</code>
     * @return This builder for chaining.
     */
    public Builder clearExponent() {
      exponent_ = getDefaultInstance().getExponent();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string exponent = 2 [json_name = "exponent"];</code>
     * @param value The bytes for exponent to set.
     * @return This builder for chaining.
     */
    public Builder setExponentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      exponent_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringArrayList aliases_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureAliasesIsMutable() {
      if (!aliases_.isModifiable()) {
        aliases_ = new com.google.protobuf.LazyStringArrayList(aliases_);
      }
      bitField0_ |= 0x00000004;
    }
    /**
     * <code>repeated string aliases = 3 [json_name = "aliases"];</code>
     * @return A list containing the aliases.
     */
    public com.google.protobuf.ProtocolStringList
        getAliasesList() {
      aliases_.makeImmutable();
      return aliases_;
    }
    /**
     * <code>repeated string aliases = 3 [json_name = "aliases"];</code>
     * @return The count of aliases.
     */
    public int getAliasesCount() {
      return aliases_.size();
    }
    /**
     * <code>repeated string aliases = 3 [json_name = "aliases"];</code>
     * @param index The index of the element to return.
     * @return The aliases at the given index.
     */
    public java.lang.String getAliases(int index) {
      return aliases_.get(index);
    }
    /**
     * <code>repeated string aliases = 3 [json_name = "aliases"];</code>
     * @param index The index of the value to return.
     * @return The bytes of the aliases at the given index.
     */
    public com.google.protobuf.ByteString
        getAliasesBytes(int index) {
      return aliases_.getByteString(index);
    }
    /**
     * <code>repeated string aliases = 3 [json_name = "aliases"];</code>
     * @param index The index to set the value at.
     * @param value The aliases to set.
     * @return This builder for chaining.
     */
    public Builder setAliases(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureAliasesIsMutable();
      aliases_.set(index, value);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string aliases = 3 [json_name = "aliases"];</code>
     * @param value The aliases to add.
     * @return This builder for chaining.
     */
    public Builder addAliases(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureAliasesIsMutable();
      aliases_.add(value);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string aliases = 3 [json_name = "aliases"];</code>
     * @param values The aliases to add.
     * @return This builder for chaining.
     */
    public Builder addAllAliases(
        java.lang.Iterable<java.lang.String> values) {
      ensureAliasesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, aliases_);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string aliases = 3 [json_name = "aliases"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAliases() {
      aliases_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000004);;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string aliases = 3 [json_name = "aliases"];</code>
     * @param value The bytes of the aliases to add.
     * @return This builder for chaining.
     */
    public Builder addAliasesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureAliasesIsMutable();
      aliases_.add(value);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:provenance.marker.v1.EventDenomUnit)
  }

  // @@protoc_insertion_point(class_scope:provenance.marker.v1.EventDenomUnit)
  private static final com.provenance.marker.v1.EventDenomUnit DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.provenance.marker.v1.EventDenomUnit();
  }

  public static com.provenance.marker.v1.EventDenomUnit getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EventDenomUnit>
      PARSER = new com.google.protobuf.AbstractParser<EventDenomUnit>() {
    @java.lang.Override
    public EventDenomUnit parsePartialFrom(
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

  public static com.google.protobuf.Parser<EventDenomUnit> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EventDenomUnit> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.provenance.marker.v1.EventDenomUnit getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

