// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: akash/deployment/v1beta3/deployment.proto

package com.akash.deployment.v1beta3;

/**
 * <pre>
 * Deployment stores deploymentID, state and version details
 * </pre>
 *
 * Protobuf type {@code akash.deployment.v1beta3.Deployment}
 */
public final class Deployment extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:akash.deployment.v1beta3.Deployment)
    DeploymentOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Deployment.newBuilder() to construct.
  private Deployment(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Deployment() {
    state_ = 0;
    version_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Deployment();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.akash.deployment.v1beta3.DeploymentProto.internal_static_akash_deployment_v1beta3_Deployment_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.akash.deployment.v1beta3.DeploymentProto.internal_static_akash_deployment_v1beta3_Deployment_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.akash.deployment.v1beta3.Deployment.class, com.akash.deployment.v1beta3.Deployment.Builder.class);
  }

  /**
   * <pre>
   * State is an enum which refers to state of deployment
   * </pre>
   *
   * Protobuf enum {@code akash.deployment.v1beta3.Deployment.State}
   */
  public enum State
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Prefix should start with 0 in enum. So declaring dummy state
     * </pre>
     *
     * <code>invalid = 0 [(.gogoproto.enumvalue_customname) = "DeploymentStateInvalid"];</code>
     */
    invalid(0),
    /**
     * <pre>
     * DeploymentActive denotes state for deployment active
     * </pre>
     *
     * <code>active = 1 [(.gogoproto.enumvalue_customname) = "DeploymentActive"];</code>
     */
    active(1),
    /**
     * <pre>
     * DeploymentClosed denotes state for deployment closed
     * </pre>
     *
     * <code>closed = 2 [(.gogoproto.enumvalue_customname) = "DeploymentClosed"];</code>
     */
    closed(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Prefix should start with 0 in enum. So declaring dummy state
     * </pre>
     *
     * <code>invalid = 0 [(.gogoproto.enumvalue_customname) = "DeploymentStateInvalid"];</code>
     */
    public static final int invalid_VALUE = 0;
    /**
     * <pre>
     * DeploymentActive denotes state for deployment active
     * </pre>
     *
     * <code>active = 1 [(.gogoproto.enumvalue_customname) = "DeploymentActive"];</code>
     */
    public static final int active_VALUE = 1;
    /**
     * <pre>
     * DeploymentClosed denotes state for deployment closed
     * </pre>
     *
     * <code>closed = 2 [(.gogoproto.enumvalue_customname) = "DeploymentClosed"];</code>
     */
    public static final int closed_VALUE = 2;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static State valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static State forNumber(int value) {
      switch (value) {
        case 0: return invalid;
        case 1: return active;
        case 2: return closed;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<State>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        State> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<State>() {
            public State findValueByNumber(int number) {
              return State.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.akash.deployment.v1beta3.Deployment.getDescriptor().getEnumTypes().get(0);
    }

    private static final State[] VALUES = values();

    public static State valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private State(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:akash.deployment.v1beta3.Deployment.State)
  }

  public static final int DEPLOYMENT_ID_FIELD_NUMBER = 1;
  private com.akash.deployment.v1beta3.DeploymentID deploymentId_;
  /**
   * <code>.akash.deployment.v1beta3.DeploymentID deployment_id = 1 [json_name = "deploymentId", (.gogoproto.nullable) = false, (.gogoproto.customname) = "DeploymentID", (.gogoproto.jsontag) = "id", (.gogoproto.moretags) = "yaml:&#92;"id&#92;""];</code>
   * @return Whether the deploymentId field is set.
   */
  @java.lang.Override
  public boolean hasDeploymentId() {
    return deploymentId_ != null;
  }
  /**
   * <code>.akash.deployment.v1beta3.DeploymentID deployment_id = 1 [json_name = "deploymentId", (.gogoproto.nullable) = false, (.gogoproto.customname) = "DeploymentID", (.gogoproto.jsontag) = "id", (.gogoproto.moretags) = "yaml:&#92;"id&#92;""];</code>
   * @return The deploymentId.
   */
  @java.lang.Override
  public com.akash.deployment.v1beta3.DeploymentID getDeploymentId() {
    return deploymentId_ == null ? com.akash.deployment.v1beta3.DeploymentID.getDefaultInstance() : deploymentId_;
  }
  /**
   * <code>.akash.deployment.v1beta3.DeploymentID deployment_id = 1 [json_name = "deploymentId", (.gogoproto.nullable) = false, (.gogoproto.customname) = "DeploymentID", (.gogoproto.jsontag) = "id", (.gogoproto.moretags) = "yaml:&#92;"id&#92;""];</code>
   */
  @java.lang.Override
  public com.akash.deployment.v1beta3.DeploymentIDOrBuilder getDeploymentIdOrBuilder() {
    return deploymentId_ == null ? com.akash.deployment.v1beta3.DeploymentID.getDefaultInstance() : deploymentId_;
  }

  public static final int STATE_FIELD_NUMBER = 2;
  private int state_ = 0;
  /**
   * <code>.akash.deployment.v1beta3.Deployment.State state = 2 [json_name = "state", (.gogoproto.jsontag) = "state", (.gogoproto.moretags) = "yaml:&#92;"state&#92;""];</code>
   * @return The enum numeric value on the wire for state.
   */
  @java.lang.Override public int getStateValue() {
    return state_;
  }
  /**
   * <code>.akash.deployment.v1beta3.Deployment.State state = 2 [json_name = "state", (.gogoproto.jsontag) = "state", (.gogoproto.moretags) = "yaml:&#92;"state&#92;""];</code>
   * @return The state.
   */
  @java.lang.Override public com.akash.deployment.v1beta3.Deployment.State getState() {
    com.akash.deployment.v1beta3.Deployment.State result = com.akash.deployment.v1beta3.Deployment.State.forNumber(state_);
    return result == null ? com.akash.deployment.v1beta3.Deployment.State.UNRECOGNIZED : result;
  }

  public static final int VERSION_FIELD_NUMBER = 3;
  private com.google.protobuf.ByteString version_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <code>bytes version = 3 [json_name = "version", (.gogoproto.jsontag) = "version", (.gogoproto.moretags) = "yaml:&#92;"version&#92;""];</code>
   * @return The version.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getVersion() {
    return version_;
  }

  public static final int CREATED_AT_FIELD_NUMBER = 4;
  private long createdAt_ = 0L;
  /**
   * <code>int64 created_at = 4 [json_name = "createdAt"];</code>
   * @return The createdAt.
   */
  @java.lang.Override
  public long getCreatedAt() {
    return createdAt_;
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
    if (deploymentId_ != null) {
      output.writeMessage(1, getDeploymentId());
    }
    if (state_ != com.akash.deployment.v1beta3.Deployment.State.invalid.getNumber()) {
      output.writeEnum(2, state_);
    }
    if (!version_.isEmpty()) {
      output.writeBytes(3, version_);
    }
    if (createdAt_ != 0L) {
      output.writeInt64(4, createdAt_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (deploymentId_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getDeploymentId());
    }
    if (state_ != com.akash.deployment.v1beta3.Deployment.State.invalid.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, state_);
    }
    if (!version_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(3, version_);
    }
    if (createdAt_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, createdAt_);
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
    if (!(obj instanceof com.akash.deployment.v1beta3.Deployment)) {
      return super.equals(obj);
    }
    com.akash.deployment.v1beta3.Deployment other = (com.akash.deployment.v1beta3.Deployment) obj;

    if (hasDeploymentId() != other.hasDeploymentId()) return false;
    if (hasDeploymentId()) {
      if (!getDeploymentId()
          .equals(other.getDeploymentId())) return false;
    }
    if (state_ != other.state_) return false;
    if (!getVersion()
        .equals(other.getVersion())) return false;
    if (getCreatedAt()
        != other.getCreatedAt()) return false;
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
    if (hasDeploymentId()) {
      hash = (37 * hash) + DEPLOYMENT_ID_FIELD_NUMBER;
      hash = (53 * hash) + getDeploymentId().hashCode();
    }
    hash = (37 * hash) + STATE_FIELD_NUMBER;
    hash = (53 * hash) + state_;
    hash = (37 * hash) + VERSION_FIELD_NUMBER;
    hash = (53 * hash) + getVersion().hashCode();
    hash = (37 * hash) + CREATED_AT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getCreatedAt());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.akash.deployment.v1beta3.Deployment parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.akash.deployment.v1beta3.Deployment parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.akash.deployment.v1beta3.Deployment parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.akash.deployment.v1beta3.Deployment parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.akash.deployment.v1beta3.Deployment parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.akash.deployment.v1beta3.Deployment parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.akash.deployment.v1beta3.Deployment parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.akash.deployment.v1beta3.Deployment parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.akash.deployment.v1beta3.Deployment parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.akash.deployment.v1beta3.Deployment parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.akash.deployment.v1beta3.Deployment parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.akash.deployment.v1beta3.Deployment parseFrom(
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
  public static Builder newBuilder(com.akash.deployment.v1beta3.Deployment prototype) {
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
   * Deployment stores deploymentID, state and version details
   * </pre>
   *
   * Protobuf type {@code akash.deployment.v1beta3.Deployment}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:akash.deployment.v1beta3.Deployment)
      com.akash.deployment.v1beta3.DeploymentOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.akash.deployment.v1beta3.DeploymentProto.internal_static_akash_deployment_v1beta3_Deployment_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.akash.deployment.v1beta3.DeploymentProto.internal_static_akash_deployment_v1beta3_Deployment_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.akash.deployment.v1beta3.Deployment.class, com.akash.deployment.v1beta3.Deployment.Builder.class);
    }

    // Construct using com.akash.deployment.v1beta3.Deployment.newBuilder()
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
      deploymentId_ = null;
      if (deploymentIdBuilder_ != null) {
        deploymentIdBuilder_.dispose();
        deploymentIdBuilder_ = null;
      }
      state_ = 0;
      version_ = com.google.protobuf.ByteString.EMPTY;
      createdAt_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.akash.deployment.v1beta3.DeploymentProto.internal_static_akash_deployment_v1beta3_Deployment_descriptor;
    }

    @java.lang.Override
    public com.akash.deployment.v1beta3.Deployment getDefaultInstanceForType() {
      return com.akash.deployment.v1beta3.Deployment.getDefaultInstance();
    }

    @java.lang.Override
    public com.akash.deployment.v1beta3.Deployment build() {
      com.akash.deployment.v1beta3.Deployment result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.akash.deployment.v1beta3.Deployment buildPartial() {
      com.akash.deployment.v1beta3.Deployment result = new com.akash.deployment.v1beta3.Deployment(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.akash.deployment.v1beta3.Deployment result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.deploymentId_ = deploymentIdBuilder_ == null
            ? deploymentId_
            : deploymentIdBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.state_ = state_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.version_ = version_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.createdAt_ = createdAt_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.akash.deployment.v1beta3.Deployment) {
        return mergeFrom((com.akash.deployment.v1beta3.Deployment)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.akash.deployment.v1beta3.Deployment other) {
      if (other == com.akash.deployment.v1beta3.Deployment.getDefaultInstance()) return this;
      if (other.hasDeploymentId()) {
        mergeDeploymentId(other.getDeploymentId());
      }
      if (other.state_ != 0) {
        setStateValue(other.getStateValue());
      }
      if (other.getVersion() != com.google.protobuf.ByteString.EMPTY) {
        setVersion(other.getVersion());
      }
      if (other.getCreatedAt() != 0L) {
        setCreatedAt(other.getCreatedAt());
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
                  getDeploymentIdFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              state_ = input.readEnum();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              version_ = input.readBytes();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 32: {
              createdAt_ = input.readInt64();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
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

    private com.akash.deployment.v1beta3.DeploymentID deploymentId_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.akash.deployment.v1beta3.DeploymentID, com.akash.deployment.v1beta3.DeploymentID.Builder, com.akash.deployment.v1beta3.DeploymentIDOrBuilder> deploymentIdBuilder_;
    /**
     * <code>.akash.deployment.v1beta3.DeploymentID deployment_id = 1 [json_name = "deploymentId", (.gogoproto.nullable) = false, (.gogoproto.customname) = "DeploymentID", (.gogoproto.jsontag) = "id", (.gogoproto.moretags) = "yaml:&#92;"id&#92;""];</code>
     * @return Whether the deploymentId field is set.
     */
    public boolean hasDeploymentId() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.akash.deployment.v1beta3.DeploymentID deployment_id = 1 [json_name = "deploymentId", (.gogoproto.nullable) = false, (.gogoproto.customname) = "DeploymentID", (.gogoproto.jsontag) = "id", (.gogoproto.moretags) = "yaml:&#92;"id&#92;""];</code>
     * @return The deploymentId.
     */
    public com.akash.deployment.v1beta3.DeploymentID getDeploymentId() {
      if (deploymentIdBuilder_ == null) {
        return deploymentId_ == null ? com.akash.deployment.v1beta3.DeploymentID.getDefaultInstance() : deploymentId_;
      } else {
        return deploymentIdBuilder_.getMessage();
      }
    }
    /**
     * <code>.akash.deployment.v1beta3.DeploymentID deployment_id = 1 [json_name = "deploymentId", (.gogoproto.nullable) = false, (.gogoproto.customname) = "DeploymentID", (.gogoproto.jsontag) = "id", (.gogoproto.moretags) = "yaml:&#92;"id&#92;""];</code>
     */
    public Builder setDeploymentId(com.akash.deployment.v1beta3.DeploymentID value) {
      if (deploymentIdBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        deploymentId_ = value;
      } else {
        deploymentIdBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.akash.deployment.v1beta3.DeploymentID deployment_id = 1 [json_name = "deploymentId", (.gogoproto.nullable) = false, (.gogoproto.customname) = "DeploymentID", (.gogoproto.jsontag) = "id", (.gogoproto.moretags) = "yaml:&#92;"id&#92;""];</code>
     */
    public Builder setDeploymentId(
        com.akash.deployment.v1beta3.DeploymentID.Builder builderForValue) {
      if (deploymentIdBuilder_ == null) {
        deploymentId_ = builderForValue.build();
      } else {
        deploymentIdBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.akash.deployment.v1beta3.DeploymentID deployment_id = 1 [json_name = "deploymentId", (.gogoproto.nullable) = false, (.gogoproto.customname) = "DeploymentID", (.gogoproto.jsontag) = "id", (.gogoproto.moretags) = "yaml:&#92;"id&#92;""];</code>
     */
    public Builder mergeDeploymentId(com.akash.deployment.v1beta3.DeploymentID value) {
      if (deploymentIdBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          deploymentId_ != null &&
          deploymentId_ != com.akash.deployment.v1beta3.DeploymentID.getDefaultInstance()) {
          getDeploymentIdBuilder().mergeFrom(value);
        } else {
          deploymentId_ = value;
        }
      } else {
        deploymentIdBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.akash.deployment.v1beta3.DeploymentID deployment_id = 1 [json_name = "deploymentId", (.gogoproto.nullable) = false, (.gogoproto.customname) = "DeploymentID", (.gogoproto.jsontag) = "id", (.gogoproto.moretags) = "yaml:&#92;"id&#92;""];</code>
     */
    public Builder clearDeploymentId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      deploymentId_ = null;
      if (deploymentIdBuilder_ != null) {
        deploymentIdBuilder_.dispose();
        deploymentIdBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.akash.deployment.v1beta3.DeploymentID deployment_id = 1 [json_name = "deploymentId", (.gogoproto.nullable) = false, (.gogoproto.customname) = "DeploymentID", (.gogoproto.jsontag) = "id", (.gogoproto.moretags) = "yaml:&#92;"id&#92;""];</code>
     */
    public com.akash.deployment.v1beta3.DeploymentID.Builder getDeploymentIdBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getDeploymentIdFieldBuilder().getBuilder();
    }
    /**
     * <code>.akash.deployment.v1beta3.DeploymentID deployment_id = 1 [json_name = "deploymentId", (.gogoproto.nullable) = false, (.gogoproto.customname) = "DeploymentID", (.gogoproto.jsontag) = "id", (.gogoproto.moretags) = "yaml:&#92;"id&#92;""];</code>
     */
    public com.akash.deployment.v1beta3.DeploymentIDOrBuilder getDeploymentIdOrBuilder() {
      if (deploymentIdBuilder_ != null) {
        return deploymentIdBuilder_.getMessageOrBuilder();
      } else {
        return deploymentId_ == null ?
            com.akash.deployment.v1beta3.DeploymentID.getDefaultInstance() : deploymentId_;
      }
    }
    /**
     * <code>.akash.deployment.v1beta3.DeploymentID deployment_id = 1 [json_name = "deploymentId", (.gogoproto.nullable) = false, (.gogoproto.customname) = "DeploymentID", (.gogoproto.jsontag) = "id", (.gogoproto.moretags) = "yaml:&#92;"id&#92;""];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.akash.deployment.v1beta3.DeploymentID, com.akash.deployment.v1beta3.DeploymentID.Builder, com.akash.deployment.v1beta3.DeploymentIDOrBuilder> 
        getDeploymentIdFieldBuilder() {
      if (deploymentIdBuilder_ == null) {
        deploymentIdBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.akash.deployment.v1beta3.DeploymentID, com.akash.deployment.v1beta3.DeploymentID.Builder, com.akash.deployment.v1beta3.DeploymentIDOrBuilder>(
                getDeploymentId(),
                getParentForChildren(),
                isClean());
        deploymentId_ = null;
      }
      return deploymentIdBuilder_;
    }

    private int state_ = 0;
    /**
     * <code>.akash.deployment.v1beta3.Deployment.State state = 2 [json_name = "state", (.gogoproto.jsontag) = "state", (.gogoproto.moretags) = "yaml:&#92;"state&#92;""];</code>
     * @return The enum numeric value on the wire for state.
     */
    @java.lang.Override public int getStateValue() {
      return state_;
    }
    /**
     * <code>.akash.deployment.v1beta3.Deployment.State state = 2 [json_name = "state", (.gogoproto.jsontag) = "state", (.gogoproto.moretags) = "yaml:&#92;"state&#92;""];</code>
     * @param value The enum numeric value on the wire for state to set.
     * @return This builder for chaining.
     */
    public Builder setStateValue(int value) {
      state_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.akash.deployment.v1beta3.Deployment.State state = 2 [json_name = "state", (.gogoproto.jsontag) = "state", (.gogoproto.moretags) = "yaml:&#92;"state&#92;""];</code>
     * @return The state.
     */
    @java.lang.Override
    public com.akash.deployment.v1beta3.Deployment.State getState() {
      com.akash.deployment.v1beta3.Deployment.State result = com.akash.deployment.v1beta3.Deployment.State.forNumber(state_);
      return result == null ? com.akash.deployment.v1beta3.Deployment.State.UNRECOGNIZED : result;
    }
    /**
     * <code>.akash.deployment.v1beta3.Deployment.State state = 2 [json_name = "state", (.gogoproto.jsontag) = "state", (.gogoproto.moretags) = "yaml:&#92;"state&#92;""];</code>
     * @param value The state to set.
     * @return This builder for chaining.
     */
    public Builder setState(com.akash.deployment.v1beta3.Deployment.State value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      state_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.akash.deployment.v1beta3.Deployment.State state = 2 [json_name = "state", (.gogoproto.jsontag) = "state", (.gogoproto.moretags) = "yaml:&#92;"state&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearState() {
      bitField0_ = (bitField0_ & ~0x00000002);
      state_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString version_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes version = 3 [json_name = "version", (.gogoproto.jsontag) = "version", (.gogoproto.moretags) = "yaml:&#92;"version&#92;""];</code>
     * @return The version.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getVersion() {
      return version_;
    }
    /**
     * <code>bytes version = 3 [json_name = "version", (.gogoproto.jsontag) = "version", (.gogoproto.moretags) = "yaml:&#92;"version&#92;""];</code>
     * @param value The version to set.
     * @return This builder for chaining.
     */
    public Builder setVersion(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      version_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>bytes version = 3 [json_name = "version", (.gogoproto.jsontag) = "version", (.gogoproto.moretags) = "yaml:&#92;"version&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearVersion() {
      bitField0_ = (bitField0_ & ~0x00000004);
      version_ = getDefaultInstance().getVersion();
      onChanged();
      return this;
    }

    private long createdAt_ ;
    /**
     * <code>int64 created_at = 4 [json_name = "createdAt"];</code>
     * @return The createdAt.
     */
    @java.lang.Override
    public long getCreatedAt() {
      return createdAt_;
    }
    /**
     * <code>int64 created_at = 4 [json_name = "createdAt"];</code>
     * @param value The createdAt to set.
     * @return This builder for chaining.
     */
    public Builder setCreatedAt(long value) {

      createdAt_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>int64 created_at = 4 [json_name = "createdAt"];</code>
     * @return This builder for chaining.
     */
    public Builder clearCreatedAt() {
      bitField0_ = (bitField0_ & ~0x00000008);
      createdAt_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:akash.deployment.v1beta3.Deployment)
  }

  // @@protoc_insertion_point(class_scope:akash.deployment.v1beta3.Deployment)
  private static final com.akash.deployment.v1beta3.Deployment DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.akash.deployment.v1beta3.Deployment();
  }

  public static com.akash.deployment.v1beta3.Deployment getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Deployment>
      PARSER = new com.google.protobuf.AbstractParser<Deployment>() {
    @java.lang.Override
    public Deployment parsePartialFrom(
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

  public static com.google.protobuf.Parser<Deployment> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Deployment> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.akash.deployment.v1beta3.Deployment getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

