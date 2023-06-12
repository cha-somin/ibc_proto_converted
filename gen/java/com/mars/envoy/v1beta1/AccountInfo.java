// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mars/envoy/v1beta1/query.proto

package com.mars.envoy.v1beta1;

/**
 * <pre>
 * AccountInfo describes an interchain account, including its address and info
 * of the controller and host chains.
 * </pre>
 *
 * Protobuf type {@code mars.envoy.v1beta1.AccountInfo}
 */
public final class AccountInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:mars.envoy.v1beta1.AccountInfo)
    AccountInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AccountInfo.newBuilder() to construct.
  private AccountInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AccountInfo() {
    address_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AccountInfo();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.mars.envoy.v1beta1.QueryProto.internal_static_mars_envoy_v1beta1_AccountInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.mars.envoy.v1beta1.QueryProto.internal_static_mars_envoy_v1beta1_AccountInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.mars.envoy.v1beta1.AccountInfo.class, com.mars.envoy.v1beta1.AccountInfo.Builder.class);
  }

  public static final int CONTROLLER_FIELD_NUMBER = 1;
  private com.mars.envoy.v1beta1.ChainInfo controller_;
  /**
   * <code>.mars.envoy.v1beta1.ChainInfo controller = 1 [json_name = "controller"];</code>
   * @return Whether the controller field is set.
   */
  @java.lang.Override
  public boolean hasController() {
    return controller_ != null;
  }
  /**
   * <code>.mars.envoy.v1beta1.ChainInfo controller = 1 [json_name = "controller"];</code>
   * @return The controller.
   */
  @java.lang.Override
  public com.mars.envoy.v1beta1.ChainInfo getController() {
    return controller_ == null ? com.mars.envoy.v1beta1.ChainInfo.getDefaultInstance() : controller_;
  }
  /**
   * <code>.mars.envoy.v1beta1.ChainInfo controller = 1 [json_name = "controller"];</code>
   */
  @java.lang.Override
  public com.mars.envoy.v1beta1.ChainInfoOrBuilder getControllerOrBuilder() {
    return controller_ == null ? com.mars.envoy.v1beta1.ChainInfo.getDefaultInstance() : controller_;
  }

  public static final int HOST_FIELD_NUMBER = 2;
  private com.mars.envoy.v1beta1.ChainInfo host_;
  /**
   * <code>.mars.envoy.v1beta1.ChainInfo host = 2 [json_name = "host"];</code>
   * @return Whether the host field is set.
   */
  @java.lang.Override
  public boolean hasHost() {
    return host_ != null;
  }
  /**
   * <code>.mars.envoy.v1beta1.ChainInfo host = 2 [json_name = "host"];</code>
   * @return The host.
   */
  @java.lang.Override
  public com.mars.envoy.v1beta1.ChainInfo getHost() {
    return host_ == null ? com.mars.envoy.v1beta1.ChainInfo.getDefaultInstance() : host_;
  }
  /**
   * <code>.mars.envoy.v1beta1.ChainInfo host = 2 [json_name = "host"];</code>
   */
  @java.lang.Override
  public com.mars.envoy.v1beta1.ChainInfoOrBuilder getHostOrBuilder() {
    return host_ == null ? com.mars.envoy.v1beta1.ChainInfo.getDefaultInstance() : host_;
  }

  public static final int ADDRESS_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object address_ = "";
  /**
   * <code>string address = 3 [json_name = "address"];</code>
   * @return The address.
   */
  @java.lang.Override
  public java.lang.String getAddress() {
    java.lang.Object ref = address_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      address_ = s;
      return s;
    }
  }
  /**
   * <code>string address = 3 [json_name = "address"];</code>
   * @return The bytes for address.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAddressBytes() {
    java.lang.Object ref = address_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      address_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (controller_ != null) {
      output.writeMessage(1, getController());
    }
    if (host_ != null) {
      output.writeMessage(2, getHost());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(address_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, address_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (controller_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getController());
    }
    if (host_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getHost());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(address_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, address_);
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
    if (!(obj instanceof com.mars.envoy.v1beta1.AccountInfo)) {
      return super.equals(obj);
    }
    com.mars.envoy.v1beta1.AccountInfo other = (com.mars.envoy.v1beta1.AccountInfo) obj;

    if (hasController() != other.hasController()) return false;
    if (hasController()) {
      if (!getController()
          .equals(other.getController())) return false;
    }
    if (hasHost() != other.hasHost()) return false;
    if (hasHost()) {
      if (!getHost()
          .equals(other.getHost())) return false;
    }
    if (!getAddress()
        .equals(other.getAddress())) return false;
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
    if (hasController()) {
      hash = (37 * hash) + CONTROLLER_FIELD_NUMBER;
      hash = (53 * hash) + getController().hashCode();
    }
    if (hasHost()) {
      hash = (37 * hash) + HOST_FIELD_NUMBER;
      hash = (53 * hash) + getHost().hashCode();
    }
    hash = (37 * hash) + ADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getAddress().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.mars.envoy.v1beta1.AccountInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.mars.envoy.v1beta1.AccountInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.mars.envoy.v1beta1.AccountInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.mars.envoy.v1beta1.AccountInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.mars.envoy.v1beta1.AccountInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.mars.envoy.v1beta1.AccountInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.mars.envoy.v1beta1.AccountInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.mars.envoy.v1beta1.AccountInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.mars.envoy.v1beta1.AccountInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.mars.envoy.v1beta1.AccountInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.mars.envoy.v1beta1.AccountInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.mars.envoy.v1beta1.AccountInfo parseFrom(
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
  public static Builder newBuilder(com.mars.envoy.v1beta1.AccountInfo prototype) {
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
   * AccountInfo describes an interchain account, including its address and info
   * of the controller and host chains.
   * </pre>
   *
   * Protobuf type {@code mars.envoy.v1beta1.AccountInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:mars.envoy.v1beta1.AccountInfo)
      com.mars.envoy.v1beta1.AccountInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.mars.envoy.v1beta1.QueryProto.internal_static_mars_envoy_v1beta1_AccountInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.mars.envoy.v1beta1.QueryProto.internal_static_mars_envoy_v1beta1_AccountInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.mars.envoy.v1beta1.AccountInfo.class, com.mars.envoy.v1beta1.AccountInfo.Builder.class);
    }

    // Construct using com.mars.envoy.v1beta1.AccountInfo.newBuilder()
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
      controller_ = null;
      if (controllerBuilder_ != null) {
        controllerBuilder_.dispose();
        controllerBuilder_ = null;
      }
      host_ = null;
      if (hostBuilder_ != null) {
        hostBuilder_.dispose();
        hostBuilder_ = null;
      }
      address_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.mars.envoy.v1beta1.QueryProto.internal_static_mars_envoy_v1beta1_AccountInfo_descriptor;
    }

    @java.lang.Override
    public com.mars.envoy.v1beta1.AccountInfo getDefaultInstanceForType() {
      return com.mars.envoy.v1beta1.AccountInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.mars.envoy.v1beta1.AccountInfo build() {
      com.mars.envoy.v1beta1.AccountInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.mars.envoy.v1beta1.AccountInfo buildPartial() {
      com.mars.envoy.v1beta1.AccountInfo result = new com.mars.envoy.v1beta1.AccountInfo(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.mars.envoy.v1beta1.AccountInfo result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.controller_ = controllerBuilder_ == null
            ? controller_
            : controllerBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.host_ = hostBuilder_ == null
            ? host_
            : hostBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.address_ = address_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.mars.envoy.v1beta1.AccountInfo) {
        return mergeFrom((com.mars.envoy.v1beta1.AccountInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.mars.envoy.v1beta1.AccountInfo other) {
      if (other == com.mars.envoy.v1beta1.AccountInfo.getDefaultInstance()) return this;
      if (other.hasController()) {
        mergeController(other.getController());
      }
      if (other.hasHost()) {
        mergeHost(other.getHost());
      }
      if (!other.getAddress().isEmpty()) {
        address_ = other.address_;
        bitField0_ |= 0x00000004;
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
              input.readMessage(
                  getControllerFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getHostFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              address_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
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

    private com.mars.envoy.v1beta1.ChainInfo controller_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.mars.envoy.v1beta1.ChainInfo, com.mars.envoy.v1beta1.ChainInfo.Builder, com.mars.envoy.v1beta1.ChainInfoOrBuilder> controllerBuilder_;
    /**
     * <code>.mars.envoy.v1beta1.ChainInfo controller = 1 [json_name = "controller"];</code>
     * @return Whether the controller field is set.
     */
    public boolean hasController() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.mars.envoy.v1beta1.ChainInfo controller = 1 [json_name = "controller"];</code>
     * @return The controller.
     */
    public com.mars.envoy.v1beta1.ChainInfo getController() {
      if (controllerBuilder_ == null) {
        return controller_ == null ? com.mars.envoy.v1beta1.ChainInfo.getDefaultInstance() : controller_;
      } else {
        return controllerBuilder_.getMessage();
      }
    }
    /**
     * <code>.mars.envoy.v1beta1.ChainInfo controller = 1 [json_name = "controller"];</code>
     */
    public Builder setController(com.mars.envoy.v1beta1.ChainInfo value) {
      if (controllerBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        controller_ = value;
      } else {
        controllerBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.mars.envoy.v1beta1.ChainInfo controller = 1 [json_name = "controller"];</code>
     */
    public Builder setController(
        com.mars.envoy.v1beta1.ChainInfo.Builder builderForValue) {
      if (controllerBuilder_ == null) {
        controller_ = builderForValue.build();
      } else {
        controllerBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.mars.envoy.v1beta1.ChainInfo controller = 1 [json_name = "controller"];</code>
     */
    public Builder mergeController(com.mars.envoy.v1beta1.ChainInfo value) {
      if (controllerBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          controller_ != null &&
          controller_ != com.mars.envoy.v1beta1.ChainInfo.getDefaultInstance()) {
          getControllerBuilder().mergeFrom(value);
        } else {
          controller_ = value;
        }
      } else {
        controllerBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.mars.envoy.v1beta1.ChainInfo controller = 1 [json_name = "controller"];</code>
     */
    public Builder clearController() {
      bitField0_ = (bitField0_ & ~0x00000001);
      controller_ = null;
      if (controllerBuilder_ != null) {
        controllerBuilder_.dispose();
        controllerBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.mars.envoy.v1beta1.ChainInfo controller = 1 [json_name = "controller"];</code>
     */
    public com.mars.envoy.v1beta1.ChainInfo.Builder getControllerBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getControllerFieldBuilder().getBuilder();
    }
    /**
     * <code>.mars.envoy.v1beta1.ChainInfo controller = 1 [json_name = "controller"];</code>
     */
    public com.mars.envoy.v1beta1.ChainInfoOrBuilder getControllerOrBuilder() {
      if (controllerBuilder_ != null) {
        return controllerBuilder_.getMessageOrBuilder();
      } else {
        return controller_ == null ?
            com.mars.envoy.v1beta1.ChainInfo.getDefaultInstance() : controller_;
      }
    }
    /**
     * <code>.mars.envoy.v1beta1.ChainInfo controller = 1 [json_name = "controller"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.mars.envoy.v1beta1.ChainInfo, com.mars.envoy.v1beta1.ChainInfo.Builder, com.mars.envoy.v1beta1.ChainInfoOrBuilder> 
        getControllerFieldBuilder() {
      if (controllerBuilder_ == null) {
        controllerBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.mars.envoy.v1beta1.ChainInfo, com.mars.envoy.v1beta1.ChainInfo.Builder, com.mars.envoy.v1beta1.ChainInfoOrBuilder>(
                getController(),
                getParentForChildren(),
                isClean());
        controller_ = null;
      }
      return controllerBuilder_;
    }

    private com.mars.envoy.v1beta1.ChainInfo host_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.mars.envoy.v1beta1.ChainInfo, com.mars.envoy.v1beta1.ChainInfo.Builder, com.mars.envoy.v1beta1.ChainInfoOrBuilder> hostBuilder_;
    /**
     * <code>.mars.envoy.v1beta1.ChainInfo host = 2 [json_name = "host"];</code>
     * @return Whether the host field is set.
     */
    public boolean hasHost() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.mars.envoy.v1beta1.ChainInfo host = 2 [json_name = "host"];</code>
     * @return The host.
     */
    public com.mars.envoy.v1beta1.ChainInfo getHost() {
      if (hostBuilder_ == null) {
        return host_ == null ? com.mars.envoy.v1beta1.ChainInfo.getDefaultInstance() : host_;
      } else {
        return hostBuilder_.getMessage();
      }
    }
    /**
     * <code>.mars.envoy.v1beta1.ChainInfo host = 2 [json_name = "host"];</code>
     */
    public Builder setHost(com.mars.envoy.v1beta1.ChainInfo value) {
      if (hostBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        host_ = value;
      } else {
        hostBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.mars.envoy.v1beta1.ChainInfo host = 2 [json_name = "host"];</code>
     */
    public Builder setHost(
        com.mars.envoy.v1beta1.ChainInfo.Builder builderForValue) {
      if (hostBuilder_ == null) {
        host_ = builderForValue.build();
      } else {
        hostBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.mars.envoy.v1beta1.ChainInfo host = 2 [json_name = "host"];</code>
     */
    public Builder mergeHost(com.mars.envoy.v1beta1.ChainInfo value) {
      if (hostBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          host_ != null &&
          host_ != com.mars.envoy.v1beta1.ChainInfo.getDefaultInstance()) {
          getHostBuilder().mergeFrom(value);
        } else {
          host_ = value;
        }
      } else {
        hostBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.mars.envoy.v1beta1.ChainInfo host = 2 [json_name = "host"];</code>
     */
    public Builder clearHost() {
      bitField0_ = (bitField0_ & ~0x00000002);
      host_ = null;
      if (hostBuilder_ != null) {
        hostBuilder_.dispose();
        hostBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.mars.envoy.v1beta1.ChainInfo host = 2 [json_name = "host"];</code>
     */
    public com.mars.envoy.v1beta1.ChainInfo.Builder getHostBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getHostFieldBuilder().getBuilder();
    }
    /**
     * <code>.mars.envoy.v1beta1.ChainInfo host = 2 [json_name = "host"];</code>
     */
    public com.mars.envoy.v1beta1.ChainInfoOrBuilder getHostOrBuilder() {
      if (hostBuilder_ != null) {
        return hostBuilder_.getMessageOrBuilder();
      } else {
        return host_ == null ?
            com.mars.envoy.v1beta1.ChainInfo.getDefaultInstance() : host_;
      }
    }
    /**
     * <code>.mars.envoy.v1beta1.ChainInfo host = 2 [json_name = "host"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.mars.envoy.v1beta1.ChainInfo, com.mars.envoy.v1beta1.ChainInfo.Builder, com.mars.envoy.v1beta1.ChainInfoOrBuilder> 
        getHostFieldBuilder() {
      if (hostBuilder_ == null) {
        hostBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.mars.envoy.v1beta1.ChainInfo, com.mars.envoy.v1beta1.ChainInfo.Builder, com.mars.envoy.v1beta1.ChainInfoOrBuilder>(
                getHost(),
                getParentForChildren(),
                isClean());
        host_ = null;
      }
      return hostBuilder_;
    }

    private java.lang.Object address_ = "";
    /**
     * <code>string address = 3 [json_name = "address"];</code>
     * @return The address.
     */
    public java.lang.String getAddress() {
      java.lang.Object ref = address_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        address_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string address = 3 [json_name = "address"];</code>
     * @return The bytes for address.
     */
    public com.google.protobuf.ByteString
        getAddressBytes() {
      java.lang.Object ref = address_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        address_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string address = 3 [json_name = "address"];</code>
     * @param value The address to set.
     * @return This builder for chaining.
     */
    public Builder setAddress(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      address_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string address = 3 [json_name = "address"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAddress() {
      address_ = getDefaultInstance().getAddress();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string address = 3 [json_name = "address"];</code>
     * @param value The bytes for address to set.
     * @return This builder for chaining.
     */
    public Builder setAddressBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      address_ = value;
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


    // @@protoc_insertion_point(builder_scope:mars.envoy.v1beta1.AccountInfo)
  }

  // @@protoc_insertion_point(class_scope:mars.envoy.v1beta1.AccountInfo)
  private static final com.mars.envoy.v1beta1.AccountInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.mars.envoy.v1beta1.AccountInfo();
  }

  public static com.mars.envoy.v1beta1.AccountInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AccountInfo>
      PARSER = new com.google.protobuf.AbstractParser<AccountInfo>() {
    @java.lang.Override
    public AccountInfo parsePartialFrom(
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

  public static com.google.protobuf.Parser<AccountInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AccountInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.mars.envoy.v1beta1.AccountInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

