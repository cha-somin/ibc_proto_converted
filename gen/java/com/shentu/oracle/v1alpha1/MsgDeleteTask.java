// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: shentu/oracle/v1alpha1/tx.proto

package com.shentu.oracle.v1alpha1;

/**
 * Protobuf type {@code shentu.oracle.v1alpha1.MsgDeleteTask}
 */
public final class MsgDeleteTask extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:shentu.oracle.v1alpha1.MsgDeleteTask)
    MsgDeleteTaskOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgDeleteTask.newBuilder() to construct.
  private MsgDeleteTask(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgDeleteTask() {
    contract_ = "";
    function_ = "";
    from_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MsgDeleteTask();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.shentu.oracle.v1alpha1.TxProto.internal_static_shentu_oracle_v1alpha1_MsgDeleteTask_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.shentu.oracle.v1alpha1.TxProto.internal_static_shentu_oracle_v1alpha1_MsgDeleteTask_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.shentu.oracle.v1alpha1.MsgDeleteTask.class, com.shentu.oracle.v1alpha1.MsgDeleteTask.Builder.class);
  }

  public static final int CONTRACT_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object contract_ = "";
  /**
   * <code>string contract = 1 [json_name = "contract", (.gogoproto.moretags) = "yaml:&#92;"contract&#92;""];</code>
   * @return The contract.
   */
  @java.lang.Override
  public java.lang.String getContract() {
    java.lang.Object ref = contract_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      contract_ = s;
      return s;
    }
  }
  /**
   * <code>string contract = 1 [json_name = "contract", (.gogoproto.moretags) = "yaml:&#92;"contract&#92;""];</code>
   * @return The bytes for contract.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getContractBytes() {
    java.lang.Object ref = contract_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      contract_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FUNCTION_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object function_ = "";
  /**
   * <code>string function = 2 [json_name = "function", (.gogoproto.moretags) = "yaml:&#92;"function&#92;""];</code>
   * @return The function.
   */
  @java.lang.Override
  public java.lang.String getFunction() {
    java.lang.Object ref = function_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      function_ = s;
      return s;
    }
  }
  /**
   * <code>string function = 2 [json_name = "function", (.gogoproto.moretags) = "yaml:&#92;"function&#92;""];</code>
   * @return The bytes for function.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFunctionBytes() {
    java.lang.Object ref = function_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      function_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FORCE_FIELD_NUMBER = 3;
  private boolean force_ = false;
  /**
   * <code>bool force = 3 [json_name = "force", (.gogoproto.moretags) = "yaml:&#92;"force&#92;""];</code>
   * @return The force.
   */
  @java.lang.Override
  public boolean getForce() {
    return force_;
  }

  public static final int FROM_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object from_ = "";
  /**
   * <code>string from = 4 [json_name = "from", (.gogoproto.moretags) = "yaml:&#92;"from&#92;""];</code>
   * @return The from.
   */
  @java.lang.Override
  public java.lang.String getFrom() {
    java.lang.Object ref = from_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      from_ = s;
      return s;
    }
  }
  /**
   * <code>string from = 4 [json_name = "from", (.gogoproto.moretags) = "yaml:&#92;"from&#92;""];</code>
   * @return The bytes for from.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFromBytes() {
    java.lang.Object ref = from_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      from_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(contract_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, contract_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(function_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, function_);
    }
    if (force_ != false) {
      output.writeBool(3, force_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(from_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, from_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(contract_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, contract_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(function_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, function_);
    }
    if (force_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, force_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(from_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, from_);
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
    if (!(obj instanceof com.shentu.oracle.v1alpha1.MsgDeleteTask)) {
      return super.equals(obj);
    }
    com.shentu.oracle.v1alpha1.MsgDeleteTask other = (com.shentu.oracle.v1alpha1.MsgDeleteTask) obj;

    if (!getContract()
        .equals(other.getContract())) return false;
    if (!getFunction()
        .equals(other.getFunction())) return false;
    if (getForce()
        != other.getForce()) return false;
    if (!getFrom()
        .equals(other.getFrom())) return false;
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
    hash = (37 * hash) + CONTRACT_FIELD_NUMBER;
    hash = (53 * hash) + getContract().hashCode();
    hash = (37 * hash) + FUNCTION_FIELD_NUMBER;
    hash = (53 * hash) + getFunction().hashCode();
    hash = (37 * hash) + FORCE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getForce());
    hash = (37 * hash) + FROM_FIELD_NUMBER;
    hash = (53 * hash) + getFrom().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.shentu.oracle.v1alpha1.MsgDeleteTask parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.shentu.oracle.v1alpha1.MsgDeleteTask parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.shentu.oracle.v1alpha1.MsgDeleteTask parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.shentu.oracle.v1alpha1.MsgDeleteTask parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.shentu.oracle.v1alpha1.MsgDeleteTask parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.shentu.oracle.v1alpha1.MsgDeleteTask parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.shentu.oracle.v1alpha1.MsgDeleteTask parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.shentu.oracle.v1alpha1.MsgDeleteTask parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.shentu.oracle.v1alpha1.MsgDeleteTask parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.shentu.oracle.v1alpha1.MsgDeleteTask parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.shentu.oracle.v1alpha1.MsgDeleteTask parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.shentu.oracle.v1alpha1.MsgDeleteTask parseFrom(
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
  public static Builder newBuilder(com.shentu.oracle.v1alpha1.MsgDeleteTask prototype) {
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
   * Protobuf type {@code shentu.oracle.v1alpha1.MsgDeleteTask}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:shentu.oracle.v1alpha1.MsgDeleteTask)
      com.shentu.oracle.v1alpha1.MsgDeleteTaskOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.shentu.oracle.v1alpha1.TxProto.internal_static_shentu_oracle_v1alpha1_MsgDeleteTask_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.shentu.oracle.v1alpha1.TxProto.internal_static_shentu_oracle_v1alpha1_MsgDeleteTask_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.shentu.oracle.v1alpha1.MsgDeleteTask.class, com.shentu.oracle.v1alpha1.MsgDeleteTask.Builder.class);
    }

    // Construct using com.shentu.oracle.v1alpha1.MsgDeleteTask.newBuilder()
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
      contract_ = "";
      function_ = "";
      force_ = false;
      from_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.shentu.oracle.v1alpha1.TxProto.internal_static_shentu_oracle_v1alpha1_MsgDeleteTask_descriptor;
    }

    @java.lang.Override
    public com.shentu.oracle.v1alpha1.MsgDeleteTask getDefaultInstanceForType() {
      return com.shentu.oracle.v1alpha1.MsgDeleteTask.getDefaultInstance();
    }

    @java.lang.Override
    public com.shentu.oracle.v1alpha1.MsgDeleteTask build() {
      com.shentu.oracle.v1alpha1.MsgDeleteTask result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.shentu.oracle.v1alpha1.MsgDeleteTask buildPartial() {
      com.shentu.oracle.v1alpha1.MsgDeleteTask result = new com.shentu.oracle.v1alpha1.MsgDeleteTask(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.shentu.oracle.v1alpha1.MsgDeleteTask result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.contract_ = contract_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.function_ = function_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.force_ = force_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.from_ = from_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.shentu.oracle.v1alpha1.MsgDeleteTask) {
        return mergeFrom((com.shentu.oracle.v1alpha1.MsgDeleteTask)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.shentu.oracle.v1alpha1.MsgDeleteTask other) {
      if (other == com.shentu.oracle.v1alpha1.MsgDeleteTask.getDefaultInstance()) return this;
      if (!other.getContract().isEmpty()) {
        contract_ = other.contract_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getFunction().isEmpty()) {
        function_ = other.function_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.getForce() != false) {
        setForce(other.getForce());
      }
      if (!other.getFrom().isEmpty()) {
        from_ = other.from_;
        bitField0_ |= 0x00000008;
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
              contract_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              function_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              force_ = input.readBool();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 34: {
              from_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
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

    private java.lang.Object contract_ = "";
    /**
     * <code>string contract = 1 [json_name = "contract", (.gogoproto.moretags) = "yaml:&#92;"contract&#92;""];</code>
     * @return The contract.
     */
    public java.lang.String getContract() {
      java.lang.Object ref = contract_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        contract_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string contract = 1 [json_name = "contract", (.gogoproto.moretags) = "yaml:&#92;"contract&#92;""];</code>
     * @return The bytes for contract.
     */
    public com.google.protobuf.ByteString
        getContractBytes() {
      java.lang.Object ref = contract_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        contract_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string contract = 1 [json_name = "contract", (.gogoproto.moretags) = "yaml:&#92;"contract&#92;""];</code>
     * @param value The contract to set.
     * @return This builder for chaining.
     */
    public Builder setContract(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      contract_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string contract = 1 [json_name = "contract", (.gogoproto.moretags) = "yaml:&#92;"contract&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearContract() {
      contract_ = getDefaultInstance().getContract();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string contract = 1 [json_name = "contract", (.gogoproto.moretags) = "yaml:&#92;"contract&#92;""];</code>
     * @param value The bytes for contract to set.
     * @return This builder for chaining.
     */
    public Builder setContractBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      contract_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object function_ = "";
    /**
     * <code>string function = 2 [json_name = "function", (.gogoproto.moretags) = "yaml:&#92;"function&#92;""];</code>
     * @return The function.
     */
    public java.lang.String getFunction() {
      java.lang.Object ref = function_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        function_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string function = 2 [json_name = "function", (.gogoproto.moretags) = "yaml:&#92;"function&#92;""];</code>
     * @return The bytes for function.
     */
    public com.google.protobuf.ByteString
        getFunctionBytes() {
      java.lang.Object ref = function_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        function_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string function = 2 [json_name = "function", (.gogoproto.moretags) = "yaml:&#92;"function&#92;""];</code>
     * @param value The function to set.
     * @return This builder for chaining.
     */
    public Builder setFunction(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      function_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string function = 2 [json_name = "function", (.gogoproto.moretags) = "yaml:&#92;"function&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearFunction() {
      function_ = getDefaultInstance().getFunction();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string function = 2 [json_name = "function", (.gogoproto.moretags) = "yaml:&#92;"function&#92;""];</code>
     * @param value The bytes for function to set.
     * @return This builder for chaining.
     */
    public Builder setFunctionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      function_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private boolean force_ ;
    /**
     * <code>bool force = 3 [json_name = "force", (.gogoproto.moretags) = "yaml:&#92;"force&#92;""];</code>
     * @return The force.
     */
    @java.lang.Override
    public boolean getForce() {
      return force_;
    }
    /**
     * <code>bool force = 3 [json_name = "force", (.gogoproto.moretags) = "yaml:&#92;"force&#92;""];</code>
     * @param value The force to set.
     * @return This builder for chaining.
     */
    public Builder setForce(boolean value) {

      force_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>bool force = 3 [json_name = "force", (.gogoproto.moretags) = "yaml:&#92;"force&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearForce() {
      bitField0_ = (bitField0_ & ~0x00000004);
      force_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object from_ = "";
    /**
     * <code>string from = 4 [json_name = "from", (.gogoproto.moretags) = "yaml:&#92;"from&#92;""];</code>
     * @return The from.
     */
    public java.lang.String getFrom() {
      java.lang.Object ref = from_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        from_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string from = 4 [json_name = "from", (.gogoproto.moretags) = "yaml:&#92;"from&#92;""];</code>
     * @return The bytes for from.
     */
    public com.google.protobuf.ByteString
        getFromBytes() {
      java.lang.Object ref = from_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        from_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string from = 4 [json_name = "from", (.gogoproto.moretags) = "yaml:&#92;"from&#92;""];</code>
     * @param value The from to set.
     * @return This builder for chaining.
     */
    public Builder setFrom(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      from_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>string from = 4 [json_name = "from", (.gogoproto.moretags) = "yaml:&#92;"from&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearFrom() {
      from_ = getDefaultInstance().getFrom();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <code>string from = 4 [json_name = "from", (.gogoproto.moretags) = "yaml:&#92;"from&#92;""];</code>
     * @param value The bytes for from to set.
     * @return This builder for chaining.
     */
    public Builder setFromBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      from_ = value;
      bitField0_ |= 0x00000008;
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


    // @@protoc_insertion_point(builder_scope:shentu.oracle.v1alpha1.MsgDeleteTask)
  }

  // @@protoc_insertion_point(class_scope:shentu.oracle.v1alpha1.MsgDeleteTask)
  private static final com.shentu.oracle.v1alpha1.MsgDeleteTask DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.shentu.oracle.v1alpha1.MsgDeleteTask();
  }

  public static com.shentu.oracle.v1alpha1.MsgDeleteTask getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgDeleteTask>
      PARSER = new com.google.protobuf.AbstractParser<MsgDeleteTask>() {
    @java.lang.Override
    public MsgDeleteTask parsePartialFrom(
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

  public static com.google.protobuf.Parser<MsgDeleteTask> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgDeleteTask> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.shentu.oracle.v1alpha1.MsgDeleteTask getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

