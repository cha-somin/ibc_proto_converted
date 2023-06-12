// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: akash/deployment/v1beta3/genesis.proto

package com.akash.deployment.v1beta3;

/**
 * <pre>
 * GenesisDeployment defines the basic genesis state used by deployment module
 * </pre>
 *
 * Protobuf type {@code akash.deployment.v1beta3.GenesisDeployment}
 */
public final class GenesisDeployment extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:akash.deployment.v1beta3.GenesisDeployment)
    GenesisDeploymentOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GenesisDeployment.newBuilder() to construct.
  private GenesisDeployment(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GenesisDeployment() {
    groups_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GenesisDeployment();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.akash.deployment.v1beta3.GenesisProto.internal_static_akash_deployment_v1beta3_GenesisDeployment_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.akash.deployment.v1beta3.GenesisProto.internal_static_akash_deployment_v1beta3_GenesisDeployment_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.akash.deployment.v1beta3.GenesisDeployment.class, com.akash.deployment.v1beta3.GenesisDeployment.Builder.class);
  }

  public static final int DEPLOYMENT_FIELD_NUMBER = 1;
  private com.akash.deployment.v1beta3.Deployment deployment_;
  /**
   * <code>.akash.deployment.v1beta3.Deployment deployment = 1 [json_name = "deployment", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "deployment", (.gogoproto.moretags) = "yaml:&#92;"deployment&#92;""];</code>
   * @return Whether the deployment field is set.
   */
  @java.lang.Override
  public boolean hasDeployment() {
    return deployment_ != null;
  }
  /**
   * <code>.akash.deployment.v1beta3.Deployment deployment = 1 [json_name = "deployment", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "deployment", (.gogoproto.moretags) = "yaml:&#92;"deployment&#92;""];</code>
   * @return The deployment.
   */
  @java.lang.Override
  public com.akash.deployment.v1beta3.Deployment getDeployment() {
    return deployment_ == null ? com.akash.deployment.v1beta3.Deployment.getDefaultInstance() : deployment_;
  }
  /**
   * <code>.akash.deployment.v1beta3.Deployment deployment = 1 [json_name = "deployment", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "deployment", (.gogoproto.moretags) = "yaml:&#92;"deployment&#92;""];</code>
   */
  @java.lang.Override
  public com.akash.deployment.v1beta3.DeploymentOrBuilder getDeploymentOrBuilder() {
    return deployment_ == null ? com.akash.deployment.v1beta3.Deployment.getDefaultInstance() : deployment_;
  }

  public static final int GROUPS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<com.akash.deployment.v1beta3.Group> groups_;
  /**
   * <code>repeated .akash.deployment.v1beta3.Group groups = 2 [json_name = "groups", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "groups", (.gogoproto.moretags) = "yaml:&#92;"groups&#92;""];</code>
   */
  @java.lang.Override
  public java.util.List<com.akash.deployment.v1beta3.Group> getGroupsList() {
    return groups_;
  }
  /**
   * <code>repeated .akash.deployment.v1beta3.Group groups = 2 [json_name = "groups", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "groups", (.gogoproto.moretags) = "yaml:&#92;"groups&#92;""];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.akash.deployment.v1beta3.GroupOrBuilder> 
      getGroupsOrBuilderList() {
    return groups_;
  }
  /**
   * <code>repeated .akash.deployment.v1beta3.Group groups = 2 [json_name = "groups", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "groups", (.gogoproto.moretags) = "yaml:&#92;"groups&#92;""];</code>
   */
  @java.lang.Override
  public int getGroupsCount() {
    return groups_.size();
  }
  /**
   * <code>repeated .akash.deployment.v1beta3.Group groups = 2 [json_name = "groups", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "groups", (.gogoproto.moretags) = "yaml:&#92;"groups&#92;""];</code>
   */
  @java.lang.Override
  public com.akash.deployment.v1beta3.Group getGroups(int index) {
    return groups_.get(index);
  }
  /**
   * <code>repeated .akash.deployment.v1beta3.Group groups = 2 [json_name = "groups", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "groups", (.gogoproto.moretags) = "yaml:&#92;"groups&#92;""];</code>
   */
  @java.lang.Override
  public com.akash.deployment.v1beta3.GroupOrBuilder getGroupsOrBuilder(
      int index) {
    return groups_.get(index);
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
    if (deployment_ != null) {
      output.writeMessage(1, getDeployment());
    }
    for (int i = 0; i < groups_.size(); i++) {
      output.writeMessage(2, groups_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (deployment_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getDeployment());
    }
    for (int i = 0; i < groups_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, groups_.get(i));
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
    if (!(obj instanceof com.akash.deployment.v1beta3.GenesisDeployment)) {
      return super.equals(obj);
    }
    com.akash.deployment.v1beta3.GenesisDeployment other = (com.akash.deployment.v1beta3.GenesisDeployment) obj;

    if (hasDeployment() != other.hasDeployment()) return false;
    if (hasDeployment()) {
      if (!getDeployment()
          .equals(other.getDeployment())) return false;
    }
    if (!getGroupsList()
        .equals(other.getGroupsList())) return false;
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
    if (hasDeployment()) {
      hash = (37 * hash) + DEPLOYMENT_FIELD_NUMBER;
      hash = (53 * hash) + getDeployment().hashCode();
    }
    if (getGroupsCount() > 0) {
      hash = (37 * hash) + GROUPS_FIELD_NUMBER;
      hash = (53 * hash) + getGroupsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.akash.deployment.v1beta3.GenesisDeployment parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.akash.deployment.v1beta3.GenesisDeployment parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.akash.deployment.v1beta3.GenesisDeployment parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.akash.deployment.v1beta3.GenesisDeployment parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.akash.deployment.v1beta3.GenesisDeployment parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.akash.deployment.v1beta3.GenesisDeployment parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.akash.deployment.v1beta3.GenesisDeployment parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.akash.deployment.v1beta3.GenesisDeployment parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.akash.deployment.v1beta3.GenesisDeployment parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.akash.deployment.v1beta3.GenesisDeployment parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.akash.deployment.v1beta3.GenesisDeployment parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.akash.deployment.v1beta3.GenesisDeployment parseFrom(
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
  public static Builder newBuilder(com.akash.deployment.v1beta3.GenesisDeployment prototype) {
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
   * GenesisDeployment defines the basic genesis state used by deployment module
   * </pre>
   *
   * Protobuf type {@code akash.deployment.v1beta3.GenesisDeployment}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:akash.deployment.v1beta3.GenesisDeployment)
      com.akash.deployment.v1beta3.GenesisDeploymentOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.akash.deployment.v1beta3.GenesisProto.internal_static_akash_deployment_v1beta3_GenesisDeployment_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.akash.deployment.v1beta3.GenesisProto.internal_static_akash_deployment_v1beta3_GenesisDeployment_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.akash.deployment.v1beta3.GenesisDeployment.class, com.akash.deployment.v1beta3.GenesisDeployment.Builder.class);
    }

    // Construct using com.akash.deployment.v1beta3.GenesisDeployment.newBuilder()
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
      deployment_ = null;
      if (deploymentBuilder_ != null) {
        deploymentBuilder_.dispose();
        deploymentBuilder_ = null;
      }
      if (groupsBuilder_ == null) {
        groups_ = java.util.Collections.emptyList();
      } else {
        groups_ = null;
        groupsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.akash.deployment.v1beta3.GenesisProto.internal_static_akash_deployment_v1beta3_GenesisDeployment_descriptor;
    }

    @java.lang.Override
    public com.akash.deployment.v1beta3.GenesisDeployment getDefaultInstanceForType() {
      return com.akash.deployment.v1beta3.GenesisDeployment.getDefaultInstance();
    }

    @java.lang.Override
    public com.akash.deployment.v1beta3.GenesisDeployment build() {
      com.akash.deployment.v1beta3.GenesisDeployment result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.akash.deployment.v1beta3.GenesisDeployment buildPartial() {
      com.akash.deployment.v1beta3.GenesisDeployment result = new com.akash.deployment.v1beta3.GenesisDeployment(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.akash.deployment.v1beta3.GenesisDeployment result) {
      if (groupsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          groups_ = java.util.Collections.unmodifiableList(groups_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.groups_ = groups_;
      } else {
        result.groups_ = groupsBuilder_.build();
      }
    }

    private void buildPartial0(com.akash.deployment.v1beta3.GenesisDeployment result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.deployment_ = deploymentBuilder_ == null
            ? deployment_
            : deploymentBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.akash.deployment.v1beta3.GenesisDeployment) {
        return mergeFrom((com.akash.deployment.v1beta3.GenesisDeployment)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.akash.deployment.v1beta3.GenesisDeployment other) {
      if (other == com.akash.deployment.v1beta3.GenesisDeployment.getDefaultInstance()) return this;
      if (other.hasDeployment()) {
        mergeDeployment(other.getDeployment());
      }
      if (groupsBuilder_ == null) {
        if (!other.groups_.isEmpty()) {
          if (groups_.isEmpty()) {
            groups_ = other.groups_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureGroupsIsMutable();
            groups_.addAll(other.groups_);
          }
          onChanged();
        }
      } else {
        if (!other.groups_.isEmpty()) {
          if (groupsBuilder_.isEmpty()) {
            groupsBuilder_.dispose();
            groupsBuilder_ = null;
            groups_ = other.groups_;
            bitField0_ = (bitField0_ & ~0x00000002);
            groupsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getGroupsFieldBuilder() : null;
          } else {
            groupsBuilder_.addAllMessages(other.groups_);
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
              input.readMessage(
                  getDeploymentFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              com.akash.deployment.v1beta3.Group m =
                  input.readMessage(
                      com.akash.deployment.v1beta3.Group.parser(),
                      extensionRegistry);
              if (groupsBuilder_ == null) {
                ensureGroupsIsMutable();
                groups_.add(m);
              } else {
                groupsBuilder_.addMessage(m);
              }
              break;
            } // case 18
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

    private com.akash.deployment.v1beta3.Deployment deployment_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.akash.deployment.v1beta3.Deployment, com.akash.deployment.v1beta3.Deployment.Builder, com.akash.deployment.v1beta3.DeploymentOrBuilder> deploymentBuilder_;
    /**
     * <code>.akash.deployment.v1beta3.Deployment deployment = 1 [json_name = "deployment", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "deployment", (.gogoproto.moretags) = "yaml:&#92;"deployment&#92;""];</code>
     * @return Whether the deployment field is set.
     */
    public boolean hasDeployment() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.akash.deployment.v1beta3.Deployment deployment = 1 [json_name = "deployment", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "deployment", (.gogoproto.moretags) = "yaml:&#92;"deployment&#92;""];</code>
     * @return The deployment.
     */
    public com.akash.deployment.v1beta3.Deployment getDeployment() {
      if (deploymentBuilder_ == null) {
        return deployment_ == null ? com.akash.deployment.v1beta3.Deployment.getDefaultInstance() : deployment_;
      } else {
        return deploymentBuilder_.getMessage();
      }
    }
    /**
     * <code>.akash.deployment.v1beta3.Deployment deployment = 1 [json_name = "deployment", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "deployment", (.gogoproto.moretags) = "yaml:&#92;"deployment&#92;""];</code>
     */
    public Builder setDeployment(com.akash.deployment.v1beta3.Deployment value) {
      if (deploymentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        deployment_ = value;
      } else {
        deploymentBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.akash.deployment.v1beta3.Deployment deployment = 1 [json_name = "deployment", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "deployment", (.gogoproto.moretags) = "yaml:&#92;"deployment&#92;""];</code>
     */
    public Builder setDeployment(
        com.akash.deployment.v1beta3.Deployment.Builder builderForValue) {
      if (deploymentBuilder_ == null) {
        deployment_ = builderForValue.build();
      } else {
        deploymentBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.akash.deployment.v1beta3.Deployment deployment = 1 [json_name = "deployment", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "deployment", (.gogoproto.moretags) = "yaml:&#92;"deployment&#92;""];</code>
     */
    public Builder mergeDeployment(com.akash.deployment.v1beta3.Deployment value) {
      if (deploymentBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          deployment_ != null &&
          deployment_ != com.akash.deployment.v1beta3.Deployment.getDefaultInstance()) {
          getDeploymentBuilder().mergeFrom(value);
        } else {
          deployment_ = value;
        }
      } else {
        deploymentBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.akash.deployment.v1beta3.Deployment deployment = 1 [json_name = "deployment", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "deployment", (.gogoproto.moretags) = "yaml:&#92;"deployment&#92;""];</code>
     */
    public Builder clearDeployment() {
      bitField0_ = (bitField0_ & ~0x00000001);
      deployment_ = null;
      if (deploymentBuilder_ != null) {
        deploymentBuilder_.dispose();
        deploymentBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.akash.deployment.v1beta3.Deployment deployment = 1 [json_name = "deployment", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "deployment", (.gogoproto.moretags) = "yaml:&#92;"deployment&#92;""];</code>
     */
    public com.akash.deployment.v1beta3.Deployment.Builder getDeploymentBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getDeploymentFieldBuilder().getBuilder();
    }
    /**
     * <code>.akash.deployment.v1beta3.Deployment deployment = 1 [json_name = "deployment", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "deployment", (.gogoproto.moretags) = "yaml:&#92;"deployment&#92;""];</code>
     */
    public com.akash.deployment.v1beta3.DeploymentOrBuilder getDeploymentOrBuilder() {
      if (deploymentBuilder_ != null) {
        return deploymentBuilder_.getMessageOrBuilder();
      } else {
        return deployment_ == null ?
            com.akash.deployment.v1beta3.Deployment.getDefaultInstance() : deployment_;
      }
    }
    /**
     * <code>.akash.deployment.v1beta3.Deployment deployment = 1 [json_name = "deployment", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "deployment", (.gogoproto.moretags) = "yaml:&#92;"deployment&#92;""];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.akash.deployment.v1beta3.Deployment, com.akash.deployment.v1beta3.Deployment.Builder, com.akash.deployment.v1beta3.DeploymentOrBuilder> 
        getDeploymentFieldBuilder() {
      if (deploymentBuilder_ == null) {
        deploymentBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.akash.deployment.v1beta3.Deployment, com.akash.deployment.v1beta3.Deployment.Builder, com.akash.deployment.v1beta3.DeploymentOrBuilder>(
                getDeployment(),
                getParentForChildren(),
                isClean());
        deployment_ = null;
      }
      return deploymentBuilder_;
    }

    private java.util.List<com.akash.deployment.v1beta3.Group> groups_ =
      java.util.Collections.emptyList();
    private void ensureGroupsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        groups_ = new java.util.ArrayList<com.akash.deployment.v1beta3.Group>(groups_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.akash.deployment.v1beta3.Group, com.akash.deployment.v1beta3.Group.Builder, com.akash.deployment.v1beta3.GroupOrBuilder> groupsBuilder_;

    /**
     * <code>repeated .akash.deployment.v1beta3.Group groups = 2 [json_name = "groups", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "groups", (.gogoproto.moretags) = "yaml:&#92;"groups&#92;""];</code>
     */
    public java.util.List<com.akash.deployment.v1beta3.Group> getGroupsList() {
      if (groupsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(groups_);
      } else {
        return groupsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .akash.deployment.v1beta3.Group groups = 2 [json_name = "groups", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "groups", (.gogoproto.moretags) = "yaml:&#92;"groups&#92;""];</code>
     */
    public int getGroupsCount() {
      if (groupsBuilder_ == null) {
        return groups_.size();
      } else {
        return groupsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .akash.deployment.v1beta3.Group groups = 2 [json_name = "groups", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "groups", (.gogoproto.moretags) = "yaml:&#92;"groups&#92;""];</code>
     */
    public com.akash.deployment.v1beta3.Group getGroups(int index) {
      if (groupsBuilder_ == null) {
        return groups_.get(index);
      } else {
        return groupsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .akash.deployment.v1beta3.Group groups = 2 [json_name = "groups", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "groups", (.gogoproto.moretags) = "yaml:&#92;"groups&#92;""];</code>
     */
    public Builder setGroups(
        int index, com.akash.deployment.v1beta3.Group value) {
      if (groupsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureGroupsIsMutable();
        groups_.set(index, value);
        onChanged();
      } else {
        groupsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .akash.deployment.v1beta3.Group groups = 2 [json_name = "groups", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "groups", (.gogoproto.moretags) = "yaml:&#92;"groups&#92;""];</code>
     */
    public Builder setGroups(
        int index, com.akash.deployment.v1beta3.Group.Builder builderForValue) {
      if (groupsBuilder_ == null) {
        ensureGroupsIsMutable();
        groups_.set(index, builderForValue.build());
        onChanged();
      } else {
        groupsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .akash.deployment.v1beta3.Group groups = 2 [json_name = "groups", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "groups", (.gogoproto.moretags) = "yaml:&#92;"groups&#92;""];</code>
     */
    public Builder addGroups(com.akash.deployment.v1beta3.Group value) {
      if (groupsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureGroupsIsMutable();
        groups_.add(value);
        onChanged();
      } else {
        groupsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .akash.deployment.v1beta3.Group groups = 2 [json_name = "groups", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "groups", (.gogoproto.moretags) = "yaml:&#92;"groups&#92;""];</code>
     */
    public Builder addGroups(
        int index, com.akash.deployment.v1beta3.Group value) {
      if (groupsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureGroupsIsMutable();
        groups_.add(index, value);
        onChanged();
      } else {
        groupsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .akash.deployment.v1beta3.Group groups = 2 [json_name = "groups", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "groups", (.gogoproto.moretags) = "yaml:&#92;"groups&#92;""];</code>
     */
    public Builder addGroups(
        com.akash.deployment.v1beta3.Group.Builder builderForValue) {
      if (groupsBuilder_ == null) {
        ensureGroupsIsMutable();
        groups_.add(builderForValue.build());
        onChanged();
      } else {
        groupsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .akash.deployment.v1beta3.Group groups = 2 [json_name = "groups", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "groups", (.gogoproto.moretags) = "yaml:&#92;"groups&#92;""];</code>
     */
    public Builder addGroups(
        int index, com.akash.deployment.v1beta3.Group.Builder builderForValue) {
      if (groupsBuilder_ == null) {
        ensureGroupsIsMutable();
        groups_.add(index, builderForValue.build());
        onChanged();
      } else {
        groupsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .akash.deployment.v1beta3.Group groups = 2 [json_name = "groups", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "groups", (.gogoproto.moretags) = "yaml:&#92;"groups&#92;""];</code>
     */
    public Builder addAllGroups(
        java.lang.Iterable<? extends com.akash.deployment.v1beta3.Group> values) {
      if (groupsBuilder_ == null) {
        ensureGroupsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, groups_);
        onChanged();
      } else {
        groupsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .akash.deployment.v1beta3.Group groups = 2 [json_name = "groups", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "groups", (.gogoproto.moretags) = "yaml:&#92;"groups&#92;""];</code>
     */
    public Builder clearGroups() {
      if (groupsBuilder_ == null) {
        groups_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        groupsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .akash.deployment.v1beta3.Group groups = 2 [json_name = "groups", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "groups", (.gogoproto.moretags) = "yaml:&#92;"groups&#92;""];</code>
     */
    public Builder removeGroups(int index) {
      if (groupsBuilder_ == null) {
        ensureGroupsIsMutable();
        groups_.remove(index);
        onChanged();
      } else {
        groupsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .akash.deployment.v1beta3.Group groups = 2 [json_name = "groups", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "groups", (.gogoproto.moretags) = "yaml:&#92;"groups&#92;""];</code>
     */
    public com.akash.deployment.v1beta3.Group.Builder getGroupsBuilder(
        int index) {
      return getGroupsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .akash.deployment.v1beta3.Group groups = 2 [json_name = "groups", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "groups", (.gogoproto.moretags) = "yaml:&#92;"groups&#92;""];</code>
     */
    public com.akash.deployment.v1beta3.GroupOrBuilder getGroupsOrBuilder(
        int index) {
      if (groupsBuilder_ == null) {
        return groups_.get(index);  } else {
        return groupsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .akash.deployment.v1beta3.Group groups = 2 [json_name = "groups", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "groups", (.gogoproto.moretags) = "yaml:&#92;"groups&#92;""];</code>
     */
    public java.util.List<? extends com.akash.deployment.v1beta3.GroupOrBuilder> 
         getGroupsOrBuilderList() {
      if (groupsBuilder_ != null) {
        return groupsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(groups_);
      }
    }
    /**
     * <code>repeated .akash.deployment.v1beta3.Group groups = 2 [json_name = "groups", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "groups", (.gogoproto.moretags) = "yaml:&#92;"groups&#92;""];</code>
     */
    public com.akash.deployment.v1beta3.Group.Builder addGroupsBuilder() {
      return getGroupsFieldBuilder().addBuilder(
          com.akash.deployment.v1beta3.Group.getDefaultInstance());
    }
    /**
     * <code>repeated .akash.deployment.v1beta3.Group groups = 2 [json_name = "groups", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "groups", (.gogoproto.moretags) = "yaml:&#92;"groups&#92;""];</code>
     */
    public com.akash.deployment.v1beta3.Group.Builder addGroupsBuilder(
        int index) {
      return getGroupsFieldBuilder().addBuilder(
          index, com.akash.deployment.v1beta3.Group.getDefaultInstance());
    }
    /**
     * <code>repeated .akash.deployment.v1beta3.Group groups = 2 [json_name = "groups", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "groups", (.gogoproto.moretags) = "yaml:&#92;"groups&#92;""];</code>
     */
    public java.util.List<com.akash.deployment.v1beta3.Group.Builder> 
         getGroupsBuilderList() {
      return getGroupsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.akash.deployment.v1beta3.Group, com.akash.deployment.v1beta3.Group.Builder, com.akash.deployment.v1beta3.GroupOrBuilder> 
        getGroupsFieldBuilder() {
      if (groupsBuilder_ == null) {
        groupsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.akash.deployment.v1beta3.Group, com.akash.deployment.v1beta3.Group.Builder, com.akash.deployment.v1beta3.GroupOrBuilder>(
                groups_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        groups_ = null;
      }
      return groupsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:akash.deployment.v1beta3.GenesisDeployment)
  }

  // @@protoc_insertion_point(class_scope:akash.deployment.v1beta3.GenesisDeployment)
  private static final com.akash.deployment.v1beta3.GenesisDeployment DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.akash.deployment.v1beta3.GenesisDeployment();
  }

  public static com.akash.deployment.v1beta3.GenesisDeployment getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GenesisDeployment>
      PARSER = new com.google.protobuf.AbstractParser<GenesisDeployment>() {
    @java.lang.Override
    public GenesisDeployment parsePartialFrom(
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

  public static com.google.protobuf.Parser<GenesisDeployment> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GenesisDeployment> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.akash.deployment.v1beta3.GenesisDeployment getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

