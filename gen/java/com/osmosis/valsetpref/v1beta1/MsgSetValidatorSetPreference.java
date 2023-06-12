// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: osmosis/valset-pref/v1beta1/tx.proto

package com.osmosis.valsetpref.v1beta1;

/**
 * <pre>
 * MsgCreateValidatorSetPreference is a list that holds validator-set.
 * </pre>
 *
 * Protobuf type {@code osmosis.valsetpref.v1beta1.MsgSetValidatorSetPreference}
 */
public final class MsgSetValidatorSetPreference extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:osmosis.valsetpref.v1beta1.MsgSetValidatorSetPreference)
    MsgSetValidatorSetPreferenceOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgSetValidatorSetPreference.newBuilder() to construct.
  private MsgSetValidatorSetPreference(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgSetValidatorSetPreference() {
    delegator_ = "";
    preferences_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MsgSetValidatorSetPreference();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.osmosis.valsetpref.v1beta1.TxProto.internal_static_osmosis_valsetpref_v1beta1_MsgSetValidatorSetPreference_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.osmosis.valsetpref.v1beta1.TxProto.internal_static_osmosis_valsetpref_v1beta1_MsgSetValidatorSetPreference_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.osmosis.valsetpref.v1beta1.MsgSetValidatorSetPreference.class, com.osmosis.valsetpref.v1beta1.MsgSetValidatorSetPreference.Builder.class);
  }

  public static final int DELEGATOR_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object delegator_ = "";
  /**
   * <pre>
   * delegator is the user who is trying to create a validator-set.
   * </pre>
   *
   * <code>string delegator = 1 [json_name = "delegator", (.gogoproto.moretags) = "yaml:&#92;"delegator&#92;""];</code>
   * @return The delegator.
   */
  @java.lang.Override
  public java.lang.String getDelegator() {
    java.lang.Object ref = delegator_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      delegator_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * delegator is the user who is trying to create a validator-set.
   * </pre>
   *
   * <code>string delegator = 1 [json_name = "delegator", (.gogoproto.moretags) = "yaml:&#92;"delegator&#92;""];</code>
   * @return The bytes for delegator.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDelegatorBytes() {
    java.lang.Object ref = delegator_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      delegator_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PREFERENCES_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<com.osmosis.valsetpref.v1beta1.ValidatorPreference> preferences_;
  /**
   * <pre>
   * list of {valAddr, weight} to delegate to
   * </pre>
   *
   * <code>repeated .osmosis.valsetpref.v1beta1.ValidatorPreference preferences = 2 [json_name = "preferences", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"preferences&#92;""];</code>
   */
  @java.lang.Override
  public java.util.List<com.osmosis.valsetpref.v1beta1.ValidatorPreference> getPreferencesList() {
    return preferences_;
  }
  /**
   * <pre>
   * list of {valAddr, weight} to delegate to
   * </pre>
   *
   * <code>repeated .osmosis.valsetpref.v1beta1.ValidatorPreference preferences = 2 [json_name = "preferences", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"preferences&#92;""];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.osmosis.valsetpref.v1beta1.ValidatorPreferenceOrBuilder> 
      getPreferencesOrBuilderList() {
    return preferences_;
  }
  /**
   * <pre>
   * list of {valAddr, weight} to delegate to
   * </pre>
   *
   * <code>repeated .osmosis.valsetpref.v1beta1.ValidatorPreference preferences = 2 [json_name = "preferences", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"preferences&#92;""];</code>
   */
  @java.lang.Override
  public int getPreferencesCount() {
    return preferences_.size();
  }
  /**
   * <pre>
   * list of {valAddr, weight} to delegate to
   * </pre>
   *
   * <code>repeated .osmosis.valsetpref.v1beta1.ValidatorPreference preferences = 2 [json_name = "preferences", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"preferences&#92;""];</code>
   */
  @java.lang.Override
  public com.osmosis.valsetpref.v1beta1.ValidatorPreference getPreferences(int index) {
    return preferences_.get(index);
  }
  /**
   * <pre>
   * list of {valAddr, weight} to delegate to
   * </pre>
   *
   * <code>repeated .osmosis.valsetpref.v1beta1.ValidatorPreference preferences = 2 [json_name = "preferences", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"preferences&#92;""];</code>
   */
  @java.lang.Override
  public com.osmosis.valsetpref.v1beta1.ValidatorPreferenceOrBuilder getPreferencesOrBuilder(
      int index) {
    return preferences_.get(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(delegator_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, delegator_);
    }
    for (int i = 0; i < preferences_.size(); i++) {
      output.writeMessage(2, preferences_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(delegator_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, delegator_);
    }
    for (int i = 0; i < preferences_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, preferences_.get(i));
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
    if (!(obj instanceof com.osmosis.valsetpref.v1beta1.MsgSetValidatorSetPreference)) {
      return super.equals(obj);
    }
    com.osmosis.valsetpref.v1beta1.MsgSetValidatorSetPreference other = (com.osmosis.valsetpref.v1beta1.MsgSetValidatorSetPreference) obj;

    if (!getDelegator()
        .equals(other.getDelegator())) return false;
    if (!getPreferencesList()
        .equals(other.getPreferencesList())) return false;
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
    hash = (37 * hash) + DELEGATOR_FIELD_NUMBER;
    hash = (53 * hash) + getDelegator().hashCode();
    if (getPreferencesCount() > 0) {
      hash = (37 * hash) + PREFERENCES_FIELD_NUMBER;
      hash = (53 * hash) + getPreferencesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.osmosis.valsetpref.v1beta1.MsgSetValidatorSetPreference parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.osmosis.valsetpref.v1beta1.MsgSetValidatorSetPreference parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.osmosis.valsetpref.v1beta1.MsgSetValidatorSetPreference parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.osmosis.valsetpref.v1beta1.MsgSetValidatorSetPreference parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.osmosis.valsetpref.v1beta1.MsgSetValidatorSetPreference parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.osmosis.valsetpref.v1beta1.MsgSetValidatorSetPreference parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.osmosis.valsetpref.v1beta1.MsgSetValidatorSetPreference parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.osmosis.valsetpref.v1beta1.MsgSetValidatorSetPreference parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.osmosis.valsetpref.v1beta1.MsgSetValidatorSetPreference parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.osmosis.valsetpref.v1beta1.MsgSetValidatorSetPreference parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.osmosis.valsetpref.v1beta1.MsgSetValidatorSetPreference parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.osmosis.valsetpref.v1beta1.MsgSetValidatorSetPreference parseFrom(
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
  public static Builder newBuilder(com.osmosis.valsetpref.v1beta1.MsgSetValidatorSetPreference prototype) {
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
   * MsgCreateValidatorSetPreference is a list that holds validator-set.
   * </pre>
   *
   * Protobuf type {@code osmosis.valsetpref.v1beta1.MsgSetValidatorSetPreference}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:osmosis.valsetpref.v1beta1.MsgSetValidatorSetPreference)
      com.osmosis.valsetpref.v1beta1.MsgSetValidatorSetPreferenceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.osmosis.valsetpref.v1beta1.TxProto.internal_static_osmosis_valsetpref_v1beta1_MsgSetValidatorSetPreference_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.osmosis.valsetpref.v1beta1.TxProto.internal_static_osmosis_valsetpref_v1beta1_MsgSetValidatorSetPreference_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.osmosis.valsetpref.v1beta1.MsgSetValidatorSetPreference.class, com.osmosis.valsetpref.v1beta1.MsgSetValidatorSetPreference.Builder.class);
    }

    // Construct using com.osmosis.valsetpref.v1beta1.MsgSetValidatorSetPreference.newBuilder()
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
      delegator_ = "";
      if (preferencesBuilder_ == null) {
        preferences_ = java.util.Collections.emptyList();
      } else {
        preferences_ = null;
        preferencesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.osmosis.valsetpref.v1beta1.TxProto.internal_static_osmosis_valsetpref_v1beta1_MsgSetValidatorSetPreference_descriptor;
    }

    @java.lang.Override
    public com.osmosis.valsetpref.v1beta1.MsgSetValidatorSetPreference getDefaultInstanceForType() {
      return com.osmosis.valsetpref.v1beta1.MsgSetValidatorSetPreference.getDefaultInstance();
    }

    @java.lang.Override
    public com.osmosis.valsetpref.v1beta1.MsgSetValidatorSetPreference build() {
      com.osmosis.valsetpref.v1beta1.MsgSetValidatorSetPreference result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.osmosis.valsetpref.v1beta1.MsgSetValidatorSetPreference buildPartial() {
      com.osmosis.valsetpref.v1beta1.MsgSetValidatorSetPreference result = new com.osmosis.valsetpref.v1beta1.MsgSetValidatorSetPreference(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.osmosis.valsetpref.v1beta1.MsgSetValidatorSetPreference result) {
      if (preferencesBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          preferences_ = java.util.Collections.unmodifiableList(preferences_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.preferences_ = preferences_;
      } else {
        result.preferences_ = preferencesBuilder_.build();
      }
    }

    private void buildPartial0(com.osmosis.valsetpref.v1beta1.MsgSetValidatorSetPreference result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.delegator_ = delegator_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.osmosis.valsetpref.v1beta1.MsgSetValidatorSetPreference) {
        return mergeFrom((com.osmosis.valsetpref.v1beta1.MsgSetValidatorSetPreference)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.osmosis.valsetpref.v1beta1.MsgSetValidatorSetPreference other) {
      if (other == com.osmosis.valsetpref.v1beta1.MsgSetValidatorSetPreference.getDefaultInstance()) return this;
      if (!other.getDelegator().isEmpty()) {
        delegator_ = other.delegator_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (preferencesBuilder_ == null) {
        if (!other.preferences_.isEmpty()) {
          if (preferences_.isEmpty()) {
            preferences_ = other.preferences_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensurePreferencesIsMutable();
            preferences_.addAll(other.preferences_);
          }
          onChanged();
        }
      } else {
        if (!other.preferences_.isEmpty()) {
          if (preferencesBuilder_.isEmpty()) {
            preferencesBuilder_.dispose();
            preferencesBuilder_ = null;
            preferences_ = other.preferences_;
            bitField0_ = (bitField0_ & ~0x00000002);
            preferencesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getPreferencesFieldBuilder() : null;
          } else {
            preferencesBuilder_.addAllMessages(other.preferences_);
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
              delegator_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              com.osmosis.valsetpref.v1beta1.ValidatorPreference m =
                  input.readMessage(
                      com.osmosis.valsetpref.v1beta1.ValidatorPreference.parser(),
                      extensionRegistry);
              if (preferencesBuilder_ == null) {
                ensurePreferencesIsMutable();
                preferences_.add(m);
              } else {
                preferencesBuilder_.addMessage(m);
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

    private java.lang.Object delegator_ = "";
    /**
     * <pre>
     * delegator is the user who is trying to create a validator-set.
     * </pre>
     *
     * <code>string delegator = 1 [json_name = "delegator", (.gogoproto.moretags) = "yaml:&#92;"delegator&#92;""];</code>
     * @return The delegator.
     */
    public java.lang.String getDelegator() {
      java.lang.Object ref = delegator_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        delegator_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * delegator is the user who is trying to create a validator-set.
     * </pre>
     *
     * <code>string delegator = 1 [json_name = "delegator", (.gogoproto.moretags) = "yaml:&#92;"delegator&#92;""];</code>
     * @return The bytes for delegator.
     */
    public com.google.protobuf.ByteString
        getDelegatorBytes() {
      java.lang.Object ref = delegator_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        delegator_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * delegator is the user who is trying to create a validator-set.
     * </pre>
     *
     * <code>string delegator = 1 [json_name = "delegator", (.gogoproto.moretags) = "yaml:&#92;"delegator&#92;""];</code>
     * @param value The delegator to set.
     * @return This builder for chaining.
     */
    public Builder setDelegator(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      delegator_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * delegator is the user who is trying to create a validator-set.
     * </pre>
     *
     * <code>string delegator = 1 [json_name = "delegator", (.gogoproto.moretags) = "yaml:&#92;"delegator&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearDelegator() {
      delegator_ = getDefaultInstance().getDelegator();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * delegator is the user who is trying to create a validator-set.
     * </pre>
     *
     * <code>string delegator = 1 [json_name = "delegator", (.gogoproto.moretags) = "yaml:&#92;"delegator&#92;""];</code>
     * @param value The bytes for delegator to set.
     * @return This builder for chaining.
     */
    public Builder setDelegatorBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      delegator_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.util.List<com.osmosis.valsetpref.v1beta1.ValidatorPreference> preferences_ =
      java.util.Collections.emptyList();
    private void ensurePreferencesIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        preferences_ = new java.util.ArrayList<com.osmosis.valsetpref.v1beta1.ValidatorPreference>(preferences_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.osmosis.valsetpref.v1beta1.ValidatorPreference, com.osmosis.valsetpref.v1beta1.ValidatorPreference.Builder, com.osmosis.valsetpref.v1beta1.ValidatorPreferenceOrBuilder> preferencesBuilder_;

    /**
     * <pre>
     * list of {valAddr, weight} to delegate to
     * </pre>
     *
     * <code>repeated .osmosis.valsetpref.v1beta1.ValidatorPreference preferences = 2 [json_name = "preferences", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"preferences&#92;""];</code>
     */
    public java.util.List<com.osmosis.valsetpref.v1beta1.ValidatorPreference> getPreferencesList() {
      if (preferencesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(preferences_);
      } else {
        return preferencesBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * list of {valAddr, weight} to delegate to
     * </pre>
     *
     * <code>repeated .osmosis.valsetpref.v1beta1.ValidatorPreference preferences = 2 [json_name = "preferences", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"preferences&#92;""];</code>
     */
    public int getPreferencesCount() {
      if (preferencesBuilder_ == null) {
        return preferences_.size();
      } else {
        return preferencesBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * list of {valAddr, weight} to delegate to
     * </pre>
     *
     * <code>repeated .osmosis.valsetpref.v1beta1.ValidatorPreference preferences = 2 [json_name = "preferences", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"preferences&#92;""];</code>
     */
    public com.osmosis.valsetpref.v1beta1.ValidatorPreference getPreferences(int index) {
      if (preferencesBuilder_ == null) {
        return preferences_.get(index);
      } else {
        return preferencesBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * list of {valAddr, weight} to delegate to
     * </pre>
     *
     * <code>repeated .osmosis.valsetpref.v1beta1.ValidatorPreference preferences = 2 [json_name = "preferences", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"preferences&#92;""];</code>
     */
    public Builder setPreferences(
        int index, com.osmosis.valsetpref.v1beta1.ValidatorPreference value) {
      if (preferencesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePreferencesIsMutable();
        preferences_.set(index, value);
        onChanged();
      } else {
        preferencesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * list of {valAddr, weight} to delegate to
     * </pre>
     *
     * <code>repeated .osmosis.valsetpref.v1beta1.ValidatorPreference preferences = 2 [json_name = "preferences", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"preferences&#92;""];</code>
     */
    public Builder setPreferences(
        int index, com.osmosis.valsetpref.v1beta1.ValidatorPreference.Builder builderForValue) {
      if (preferencesBuilder_ == null) {
        ensurePreferencesIsMutable();
        preferences_.set(index, builderForValue.build());
        onChanged();
      } else {
        preferencesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * list of {valAddr, weight} to delegate to
     * </pre>
     *
     * <code>repeated .osmosis.valsetpref.v1beta1.ValidatorPreference preferences = 2 [json_name = "preferences", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"preferences&#92;""];</code>
     */
    public Builder addPreferences(com.osmosis.valsetpref.v1beta1.ValidatorPreference value) {
      if (preferencesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePreferencesIsMutable();
        preferences_.add(value);
        onChanged();
      } else {
        preferencesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * list of {valAddr, weight} to delegate to
     * </pre>
     *
     * <code>repeated .osmosis.valsetpref.v1beta1.ValidatorPreference preferences = 2 [json_name = "preferences", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"preferences&#92;""];</code>
     */
    public Builder addPreferences(
        int index, com.osmosis.valsetpref.v1beta1.ValidatorPreference value) {
      if (preferencesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePreferencesIsMutable();
        preferences_.add(index, value);
        onChanged();
      } else {
        preferencesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * list of {valAddr, weight} to delegate to
     * </pre>
     *
     * <code>repeated .osmosis.valsetpref.v1beta1.ValidatorPreference preferences = 2 [json_name = "preferences", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"preferences&#92;""];</code>
     */
    public Builder addPreferences(
        com.osmosis.valsetpref.v1beta1.ValidatorPreference.Builder builderForValue) {
      if (preferencesBuilder_ == null) {
        ensurePreferencesIsMutable();
        preferences_.add(builderForValue.build());
        onChanged();
      } else {
        preferencesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * list of {valAddr, weight} to delegate to
     * </pre>
     *
     * <code>repeated .osmosis.valsetpref.v1beta1.ValidatorPreference preferences = 2 [json_name = "preferences", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"preferences&#92;""];</code>
     */
    public Builder addPreferences(
        int index, com.osmosis.valsetpref.v1beta1.ValidatorPreference.Builder builderForValue) {
      if (preferencesBuilder_ == null) {
        ensurePreferencesIsMutable();
        preferences_.add(index, builderForValue.build());
        onChanged();
      } else {
        preferencesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * list of {valAddr, weight} to delegate to
     * </pre>
     *
     * <code>repeated .osmosis.valsetpref.v1beta1.ValidatorPreference preferences = 2 [json_name = "preferences", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"preferences&#92;""];</code>
     */
    public Builder addAllPreferences(
        java.lang.Iterable<? extends com.osmosis.valsetpref.v1beta1.ValidatorPreference> values) {
      if (preferencesBuilder_ == null) {
        ensurePreferencesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, preferences_);
        onChanged();
      } else {
        preferencesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * list of {valAddr, weight} to delegate to
     * </pre>
     *
     * <code>repeated .osmosis.valsetpref.v1beta1.ValidatorPreference preferences = 2 [json_name = "preferences", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"preferences&#92;""];</code>
     */
    public Builder clearPreferences() {
      if (preferencesBuilder_ == null) {
        preferences_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        preferencesBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * list of {valAddr, weight} to delegate to
     * </pre>
     *
     * <code>repeated .osmosis.valsetpref.v1beta1.ValidatorPreference preferences = 2 [json_name = "preferences", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"preferences&#92;""];</code>
     */
    public Builder removePreferences(int index) {
      if (preferencesBuilder_ == null) {
        ensurePreferencesIsMutable();
        preferences_.remove(index);
        onChanged();
      } else {
        preferencesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * list of {valAddr, weight} to delegate to
     * </pre>
     *
     * <code>repeated .osmosis.valsetpref.v1beta1.ValidatorPreference preferences = 2 [json_name = "preferences", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"preferences&#92;""];</code>
     */
    public com.osmosis.valsetpref.v1beta1.ValidatorPreference.Builder getPreferencesBuilder(
        int index) {
      return getPreferencesFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * list of {valAddr, weight} to delegate to
     * </pre>
     *
     * <code>repeated .osmosis.valsetpref.v1beta1.ValidatorPreference preferences = 2 [json_name = "preferences", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"preferences&#92;""];</code>
     */
    public com.osmosis.valsetpref.v1beta1.ValidatorPreferenceOrBuilder getPreferencesOrBuilder(
        int index) {
      if (preferencesBuilder_ == null) {
        return preferences_.get(index);  } else {
        return preferencesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * list of {valAddr, weight} to delegate to
     * </pre>
     *
     * <code>repeated .osmosis.valsetpref.v1beta1.ValidatorPreference preferences = 2 [json_name = "preferences", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"preferences&#92;""];</code>
     */
    public java.util.List<? extends com.osmosis.valsetpref.v1beta1.ValidatorPreferenceOrBuilder> 
         getPreferencesOrBuilderList() {
      if (preferencesBuilder_ != null) {
        return preferencesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(preferences_);
      }
    }
    /**
     * <pre>
     * list of {valAddr, weight} to delegate to
     * </pre>
     *
     * <code>repeated .osmosis.valsetpref.v1beta1.ValidatorPreference preferences = 2 [json_name = "preferences", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"preferences&#92;""];</code>
     */
    public com.osmosis.valsetpref.v1beta1.ValidatorPreference.Builder addPreferencesBuilder() {
      return getPreferencesFieldBuilder().addBuilder(
          com.osmosis.valsetpref.v1beta1.ValidatorPreference.getDefaultInstance());
    }
    /**
     * <pre>
     * list of {valAddr, weight} to delegate to
     * </pre>
     *
     * <code>repeated .osmosis.valsetpref.v1beta1.ValidatorPreference preferences = 2 [json_name = "preferences", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"preferences&#92;""];</code>
     */
    public com.osmosis.valsetpref.v1beta1.ValidatorPreference.Builder addPreferencesBuilder(
        int index) {
      return getPreferencesFieldBuilder().addBuilder(
          index, com.osmosis.valsetpref.v1beta1.ValidatorPreference.getDefaultInstance());
    }
    /**
     * <pre>
     * list of {valAddr, weight} to delegate to
     * </pre>
     *
     * <code>repeated .osmosis.valsetpref.v1beta1.ValidatorPreference preferences = 2 [json_name = "preferences", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"preferences&#92;""];</code>
     */
    public java.util.List<com.osmosis.valsetpref.v1beta1.ValidatorPreference.Builder> 
         getPreferencesBuilderList() {
      return getPreferencesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.osmosis.valsetpref.v1beta1.ValidatorPreference, com.osmosis.valsetpref.v1beta1.ValidatorPreference.Builder, com.osmosis.valsetpref.v1beta1.ValidatorPreferenceOrBuilder> 
        getPreferencesFieldBuilder() {
      if (preferencesBuilder_ == null) {
        preferencesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.osmosis.valsetpref.v1beta1.ValidatorPreference, com.osmosis.valsetpref.v1beta1.ValidatorPreference.Builder, com.osmosis.valsetpref.v1beta1.ValidatorPreferenceOrBuilder>(
                preferences_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        preferences_ = null;
      }
      return preferencesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:osmosis.valsetpref.v1beta1.MsgSetValidatorSetPreference)
  }

  // @@protoc_insertion_point(class_scope:osmosis.valsetpref.v1beta1.MsgSetValidatorSetPreference)
  private static final com.osmosis.valsetpref.v1beta1.MsgSetValidatorSetPreference DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.osmosis.valsetpref.v1beta1.MsgSetValidatorSetPreference();
  }

  public static com.osmosis.valsetpref.v1beta1.MsgSetValidatorSetPreference getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgSetValidatorSetPreference>
      PARSER = new com.google.protobuf.AbstractParser<MsgSetValidatorSetPreference>() {
    @java.lang.Override
    public MsgSetValidatorSetPreference parsePartialFrom(
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

  public static com.google.protobuf.Parser<MsgSetValidatorSetPreference> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgSetValidatorSetPreference> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.osmosis.valsetpref.v1beta1.MsgSetValidatorSetPreference getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

