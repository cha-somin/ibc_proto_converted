// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/circuit/v1/query.proto

package com.cosmos.circuit.v1;

/**
 * <pre>
 * AccountResponse is the response type for the Query/Account RPC method.
 * </pre>
 *
 * Protobuf type {@code cosmos.circuit.v1.AccountResponse}
 */
public final class AccountResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cosmos.circuit.v1.AccountResponse)
    AccountResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AccountResponse.newBuilder() to construct.
  private AccountResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AccountResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AccountResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.cosmos.circuit.v1.QueryProto.internal_static_cosmos_circuit_v1_AccountResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.cosmos.circuit.v1.QueryProto.internal_static_cosmos_circuit_v1_AccountResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.cosmos.circuit.v1.AccountResponse.class, com.cosmos.circuit.v1.AccountResponse.Builder.class);
  }

  public static final int PERMISSION_FIELD_NUMBER = 1;
  private com.cosmos.circuit.v1.Permissions permission_;
  /**
   * <code>.cosmos.circuit.v1.Permissions permission = 1 [json_name = "permission"];</code>
   * @return Whether the permission field is set.
   */
  @java.lang.Override
  public boolean hasPermission() {
    return permission_ != null;
  }
  /**
   * <code>.cosmos.circuit.v1.Permissions permission = 1 [json_name = "permission"];</code>
   * @return The permission.
   */
  @java.lang.Override
  public com.cosmos.circuit.v1.Permissions getPermission() {
    return permission_ == null ? com.cosmos.circuit.v1.Permissions.getDefaultInstance() : permission_;
  }
  /**
   * <code>.cosmos.circuit.v1.Permissions permission = 1 [json_name = "permission"];</code>
   */
  @java.lang.Override
  public com.cosmos.circuit.v1.PermissionsOrBuilder getPermissionOrBuilder() {
    return permission_ == null ? com.cosmos.circuit.v1.Permissions.getDefaultInstance() : permission_;
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
    if (permission_ != null) {
      output.writeMessage(1, getPermission());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (permission_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getPermission());
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
    if (!(obj instanceof com.cosmos.circuit.v1.AccountResponse)) {
      return super.equals(obj);
    }
    com.cosmos.circuit.v1.AccountResponse other = (com.cosmos.circuit.v1.AccountResponse) obj;

    if (hasPermission() != other.hasPermission()) return false;
    if (hasPermission()) {
      if (!getPermission()
          .equals(other.getPermission())) return false;
    }
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
    if (hasPermission()) {
      hash = (37 * hash) + PERMISSION_FIELD_NUMBER;
      hash = (53 * hash) + getPermission().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.cosmos.circuit.v1.AccountResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmos.circuit.v1.AccountResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmos.circuit.v1.AccountResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmos.circuit.v1.AccountResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmos.circuit.v1.AccountResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmos.circuit.v1.AccountResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmos.circuit.v1.AccountResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cosmos.circuit.v1.AccountResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.cosmos.circuit.v1.AccountResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.cosmos.circuit.v1.AccountResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.cosmos.circuit.v1.AccountResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cosmos.circuit.v1.AccountResponse parseFrom(
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
  public static Builder newBuilder(com.cosmos.circuit.v1.AccountResponse prototype) {
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
   * AccountResponse is the response type for the Query/Account RPC method.
   * </pre>
   *
   * Protobuf type {@code cosmos.circuit.v1.AccountResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cosmos.circuit.v1.AccountResponse)
      com.cosmos.circuit.v1.AccountResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.cosmos.circuit.v1.QueryProto.internal_static_cosmos_circuit_v1_AccountResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.cosmos.circuit.v1.QueryProto.internal_static_cosmos_circuit_v1_AccountResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.cosmos.circuit.v1.AccountResponse.class, com.cosmos.circuit.v1.AccountResponse.Builder.class);
    }

    // Construct using com.cosmos.circuit.v1.AccountResponse.newBuilder()
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
      permission_ = null;
      if (permissionBuilder_ != null) {
        permissionBuilder_.dispose();
        permissionBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.cosmos.circuit.v1.QueryProto.internal_static_cosmos_circuit_v1_AccountResponse_descriptor;
    }

    @java.lang.Override
    public com.cosmos.circuit.v1.AccountResponse getDefaultInstanceForType() {
      return com.cosmos.circuit.v1.AccountResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.cosmos.circuit.v1.AccountResponse build() {
      com.cosmos.circuit.v1.AccountResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.cosmos.circuit.v1.AccountResponse buildPartial() {
      com.cosmos.circuit.v1.AccountResponse result = new com.cosmos.circuit.v1.AccountResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.cosmos.circuit.v1.AccountResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.permission_ = permissionBuilder_ == null
            ? permission_
            : permissionBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.cosmos.circuit.v1.AccountResponse) {
        return mergeFrom((com.cosmos.circuit.v1.AccountResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.cosmos.circuit.v1.AccountResponse other) {
      if (other == com.cosmos.circuit.v1.AccountResponse.getDefaultInstance()) return this;
      if (other.hasPermission()) {
        mergePermission(other.getPermission());
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
              input.readMessage(
                  getPermissionFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
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

    private com.cosmos.circuit.v1.Permissions permission_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.circuit.v1.Permissions, com.cosmos.circuit.v1.Permissions.Builder, com.cosmos.circuit.v1.PermissionsOrBuilder> permissionBuilder_;
    /**
     * <code>.cosmos.circuit.v1.Permissions permission = 1 [json_name = "permission"];</code>
     * @return Whether the permission field is set.
     */
    public boolean hasPermission() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.cosmos.circuit.v1.Permissions permission = 1 [json_name = "permission"];</code>
     * @return The permission.
     */
    public com.cosmos.circuit.v1.Permissions getPermission() {
      if (permissionBuilder_ == null) {
        return permission_ == null ? com.cosmos.circuit.v1.Permissions.getDefaultInstance() : permission_;
      } else {
        return permissionBuilder_.getMessage();
      }
    }
    /**
     * <code>.cosmos.circuit.v1.Permissions permission = 1 [json_name = "permission"];</code>
     */
    public Builder setPermission(com.cosmos.circuit.v1.Permissions value) {
      if (permissionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        permission_ = value;
      } else {
        permissionBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.circuit.v1.Permissions permission = 1 [json_name = "permission"];</code>
     */
    public Builder setPermission(
        com.cosmos.circuit.v1.Permissions.Builder builderForValue) {
      if (permissionBuilder_ == null) {
        permission_ = builderForValue.build();
      } else {
        permissionBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.circuit.v1.Permissions permission = 1 [json_name = "permission"];</code>
     */
    public Builder mergePermission(com.cosmos.circuit.v1.Permissions value) {
      if (permissionBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          permission_ != null &&
          permission_ != com.cosmos.circuit.v1.Permissions.getDefaultInstance()) {
          getPermissionBuilder().mergeFrom(value);
        } else {
          permission_ = value;
        }
      } else {
        permissionBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.circuit.v1.Permissions permission = 1 [json_name = "permission"];</code>
     */
    public Builder clearPermission() {
      bitField0_ = (bitField0_ & ~0x00000001);
      permission_ = null;
      if (permissionBuilder_ != null) {
        permissionBuilder_.dispose();
        permissionBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.circuit.v1.Permissions permission = 1 [json_name = "permission"];</code>
     */
    public com.cosmos.circuit.v1.Permissions.Builder getPermissionBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getPermissionFieldBuilder().getBuilder();
    }
    /**
     * <code>.cosmos.circuit.v1.Permissions permission = 1 [json_name = "permission"];</code>
     */
    public com.cosmos.circuit.v1.PermissionsOrBuilder getPermissionOrBuilder() {
      if (permissionBuilder_ != null) {
        return permissionBuilder_.getMessageOrBuilder();
      } else {
        return permission_ == null ?
            com.cosmos.circuit.v1.Permissions.getDefaultInstance() : permission_;
      }
    }
    /**
     * <code>.cosmos.circuit.v1.Permissions permission = 1 [json_name = "permission"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.circuit.v1.Permissions, com.cosmos.circuit.v1.Permissions.Builder, com.cosmos.circuit.v1.PermissionsOrBuilder> 
        getPermissionFieldBuilder() {
      if (permissionBuilder_ == null) {
        permissionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.cosmos.circuit.v1.Permissions, com.cosmos.circuit.v1.Permissions.Builder, com.cosmos.circuit.v1.PermissionsOrBuilder>(
                getPermission(),
                getParentForChildren(),
                isClean());
        permission_ = null;
      }
      return permissionBuilder_;
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


    // @@protoc_insertion_point(builder_scope:cosmos.circuit.v1.AccountResponse)
  }

  // @@protoc_insertion_point(class_scope:cosmos.circuit.v1.AccountResponse)
  private static final com.cosmos.circuit.v1.AccountResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.cosmos.circuit.v1.AccountResponse();
  }

  public static com.cosmos.circuit.v1.AccountResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AccountResponse>
      PARSER = new com.google.protobuf.AbstractParser<AccountResponse>() {
    @java.lang.Override
    public AccountResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<AccountResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AccountResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.cosmos.circuit.v1.AccountResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

