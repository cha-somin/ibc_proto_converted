// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: comdex/esm/v1beta1/params.proto

package com.comdex.esm.v1beta1;

/**
 * Protobuf type {@code comdex.esm.v1beta1.Params}
 */
public final class Params extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:comdex.esm.v1beta1.Params)
    ParamsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Params.newBuilder() to construct.
  private Params(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Params() {
    admin_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Params();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.comdex.esm.v1beta1.ParamsProto.internal_static_comdex_esm_v1beta1_Params_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.comdex.esm.v1beta1.ParamsProto.internal_static_comdex_esm_v1beta1_Params_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.comdex.esm.v1beta1.Params.class, com.comdex.esm.v1beta1.Params.Builder.class);
  }

  public static final int ADMIN_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList admin_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <code>repeated string admin = 1 [json_name = "admin", (.gogoproto.moretags) = "yaml:&#92;"admin&#92;""];</code>
   * @return A list containing the admin.
   */
  public com.google.protobuf.ProtocolStringList
      getAdminList() {
    return admin_;
  }
  /**
   * <code>repeated string admin = 1 [json_name = "admin", (.gogoproto.moretags) = "yaml:&#92;"admin&#92;""];</code>
   * @return The count of admin.
   */
  public int getAdminCount() {
    return admin_.size();
  }
  /**
   * <code>repeated string admin = 1 [json_name = "admin", (.gogoproto.moretags) = "yaml:&#92;"admin&#92;""];</code>
   * @param index The index of the element to return.
   * @return The admin at the given index.
   */
  public java.lang.String getAdmin(int index) {
    return admin_.get(index);
  }
  /**
   * <code>repeated string admin = 1 [json_name = "admin", (.gogoproto.moretags) = "yaml:&#92;"admin&#92;""];</code>
   * @param index The index of the value to return.
   * @return The bytes of the admin at the given index.
   */
  public com.google.protobuf.ByteString
      getAdminBytes(int index) {
    return admin_.getByteString(index);
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
    for (int i = 0; i < admin_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, admin_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < admin_.size(); i++) {
        dataSize += computeStringSizeNoTag(admin_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getAdminList().size();
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
    if (!(obj instanceof com.comdex.esm.v1beta1.Params)) {
      return super.equals(obj);
    }
    com.comdex.esm.v1beta1.Params other = (com.comdex.esm.v1beta1.Params) obj;

    if (!getAdminList()
        .equals(other.getAdminList())) return false;
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
    if (getAdminCount() > 0) {
      hash = (37 * hash) + ADMIN_FIELD_NUMBER;
      hash = (53 * hash) + getAdminList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.comdex.esm.v1beta1.Params parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.comdex.esm.v1beta1.Params parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.comdex.esm.v1beta1.Params parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.comdex.esm.v1beta1.Params parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.comdex.esm.v1beta1.Params parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.comdex.esm.v1beta1.Params parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.comdex.esm.v1beta1.Params parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.comdex.esm.v1beta1.Params parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.comdex.esm.v1beta1.Params parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.comdex.esm.v1beta1.Params parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.comdex.esm.v1beta1.Params parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.comdex.esm.v1beta1.Params parseFrom(
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
  public static Builder newBuilder(com.comdex.esm.v1beta1.Params prototype) {
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
   * Protobuf type {@code comdex.esm.v1beta1.Params}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:comdex.esm.v1beta1.Params)
      com.comdex.esm.v1beta1.ParamsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.comdex.esm.v1beta1.ParamsProto.internal_static_comdex_esm_v1beta1_Params_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.comdex.esm.v1beta1.ParamsProto.internal_static_comdex_esm_v1beta1_Params_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.comdex.esm.v1beta1.Params.class, com.comdex.esm.v1beta1.Params.Builder.class);
    }

    // Construct using com.comdex.esm.v1beta1.Params.newBuilder()
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
      admin_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.comdex.esm.v1beta1.ParamsProto.internal_static_comdex_esm_v1beta1_Params_descriptor;
    }

    @java.lang.Override
    public com.comdex.esm.v1beta1.Params getDefaultInstanceForType() {
      return com.comdex.esm.v1beta1.Params.getDefaultInstance();
    }

    @java.lang.Override
    public com.comdex.esm.v1beta1.Params build() {
      com.comdex.esm.v1beta1.Params result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.comdex.esm.v1beta1.Params buildPartial() {
      com.comdex.esm.v1beta1.Params result = new com.comdex.esm.v1beta1.Params(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.comdex.esm.v1beta1.Params result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        admin_.makeImmutable();
        result.admin_ = admin_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.comdex.esm.v1beta1.Params) {
        return mergeFrom((com.comdex.esm.v1beta1.Params)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.comdex.esm.v1beta1.Params other) {
      if (other == com.comdex.esm.v1beta1.Params.getDefaultInstance()) return this;
      if (!other.admin_.isEmpty()) {
        if (admin_.isEmpty()) {
          admin_ = other.admin_;
          bitField0_ |= 0x00000001;
        } else {
          ensureAdminIsMutable();
          admin_.addAll(other.admin_);
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
              java.lang.String s = input.readStringRequireUtf8();
              ensureAdminIsMutable();
              admin_.add(s);
              break;
            } // case 10
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

    private com.google.protobuf.LazyStringArrayList admin_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureAdminIsMutable() {
      if (!admin_.isModifiable()) {
        admin_ = new com.google.protobuf.LazyStringArrayList(admin_);
      }
      bitField0_ |= 0x00000001;
    }
    /**
     * <code>repeated string admin = 1 [json_name = "admin", (.gogoproto.moretags) = "yaml:&#92;"admin&#92;""];</code>
     * @return A list containing the admin.
     */
    public com.google.protobuf.ProtocolStringList
        getAdminList() {
      admin_.makeImmutable();
      return admin_;
    }
    /**
     * <code>repeated string admin = 1 [json_name = "admin", (.gogoproto.moretags) = "yaml:&#92;"admin&#92;""];</code>
     * @return The count of admin.
     */
    public int getAdminCount() {
      return admin_.size();
    }
    /**
     * <code>repeated string admin = 1 [json_name = "admin", (.gogoproto.moretags) = "yaml:&#92;"admin&#92;""];</code>
     * @param index The index of the element to return.
     * @return The admin at the given index.
     */
    public java.lang.String getAdmin(int index) {
      return admin_.get(index);
    }
    /**
     * <code>repeated string admin = 1 [json_name = "admin", (.gogoproto.moretags) = "yaml:&#92;"admin&#92;""];</code>
     * @param index The index of the value to return.
     * @return The bytes of the admin at the given index.
     */
    public com.google.protobuf.ByteString
        getAdminBytes(int index) {
      return admin_.getByteString(index);
    }
    /**
     * <code>repeated string admin = 1 [json_name = "admin", (.gogoproto.moretags) = "yaml:&#92;"admin&#92;""];</code>
     * @param index The index to set the value at.
     * @param value The admin to set.
     * @return This builder for chaining.
     */
    public Builder setAdmin(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureAdminIsMutable();
      admin_.set(index, value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string admin = 1 [json_name = "admin", (.gogoproto.moretags) = "yaml:&#92;"admin&#92;""];</code>
     * @param value The admin to add.
     * @return This builder for chaining.
     */
    public Builder addAdmin(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureAdminIsMutable();
      admin_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string admin = 1 [json_name = "admin", (.gogoproto.moretags) = "yaml:&#92;"admin&#92;""];</code>
     * @param values The admin to add.
     * @return This builder for chaining.
     */
    public Builder addAllAdmin(
        java.lang.Iterable<java.lang.String> values) {
      ensureAdminIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, admin_);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string admin = 1 [json_name = "admin", (.gogoproto.moretags) = "yaml:&#92;"admin&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearAdmin() {
      admin_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string admin = 1 [json_name = "admin", (.gogoproto.moretags) = "yaml:&#92;"admin&#92;""];</code>
     * @param value The bytes of the admin to add.
     * @return This builder for chaining.
     */
    public Builder addAdminBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureAdminIsMutable();
      admin_.add(value);
      bitField0_ |= 0x00000001;
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


    // @@protoc_insertion_point(builder_scope:comdex.esm.v1beta1.Params)
  }

  // @@protoc_insertion_point(class_scope:comdex.esm.v1beta1.Params)
  private static final com.comdex.esm.v1beta1.Params DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.comdex.esm.v1beta1.Params();
  }

  public static com.comdex.esm.v1beta1.Params getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Params>
      PARSER = new com.google.protobuf.AbstractParser<Params>() {
    @java.lang.Override
    public Params parsePartialFrom(
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

  public static com.google.protobuf.Parser<Params> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Params> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.comdex.esm.v1beta1.Params getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

